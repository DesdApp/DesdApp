/*
*sql = Sentencia sql, permite manejar los registros en mi base de datos
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import modelo.DtCompraVenta;
import interfaces.InterfaceDtCompraVenta;

//Implementamos la interface de la clase DtComVent = InterfaceDtComVent
public class DAODtCompraVenta implements InterfaceDtCompraVenta {

//Instanciamos clases
    private ConexionDB cn = new ConexionDB();//cn = Objeto de conexion con la Base de Datos
    private ResultSet rs;//rs = Objeto ResultSet, permite visualizar los datos de las consultas a la Base de Datos
    private PreparedStatement jc;//jc = objeto PreparedStatement, encargado de enviar las sentencias SQL al driver
    private DtCompraVenta datoCv;//datosneg = Objeto de la clase DtComVent, sera utilizada en metodo select

//Atributos
    private String sql = "";
    String mensaje;
    
    /**
     * 
     * @param dcv     Ingresará registro a la base de datos
     * @return         retornará mensaje en caso de una falla
     */
    @Override
    public String insertDtComVent(DtCompraVenta dcv) {
        try {
            cn.conectar();//Realizamos la conexion con la base de datos
            sql = "INSERT INTO detalles_compras_ventas VALUES(?,?,?)";//Asignamos la consulta al sql

            jc = cn.getconexionDB().prepareStatement(sql);//Asignamos la consulta al PreparedStatement
            jc.setInt(1, dcv.getNegId());//Asignamos valores a la consulta
            jc.setDate(2, dcv.getDateEstVenta());
            jc.setString(3, dcv.getObserv());
            jc.executeUpdate();//Realizamos las cunsulta y actualizamos la base de datos

        } catch (SQLException e) {
            mensaje = "No se ha ingresado registro";
            System.out.println("Error no se pudo insertar datos de Detalles de Compra y Venta" + e.getMessage());//Si la consulta es incorrecta se muestra este mensaje
        } finally {
            cn.desconectar();//Desconectamos la conexion a la conexion a la Base de datos
        }
        return mensaje;
    }

    /**
     * 
     * @param dcv    actualizará un registro por medio del id
     * @return  reotrnará mensaje en caso de falla
     */
    @Override
    /*
    *Este metodo se encarga de realizar modificaciones a registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos.
    *Cerramos la Base de Datos.
     */
    public String updateDtComVent(DtCompraVenta dcv) {
        try {
            cn.conectar();
            sql = "UPDATE detalles_compras_ventas SET fecha_establecida_venta=?,observaciones=? WHERE negocio_id=?";

            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setDate(1, dcv.getDateEstVenta());
            jc.setString(2, dcv.getObserv());
            jc.setInt(3, dcv.getNegId());
            jc.executeUpdate();

        } catch (SQLException e) {
            mensaje = "No se actualizó el registro";
            System.out.println("Error no se pudo modificar Detalle de Compra y Venta" + e.getMessage());
        }finally{
            cn.desconectar();
        }
        return mensaje;
    }

    /**
     * 
     * @param dcv     eliminará registro por medio del id
     * @return    retornará mensaje en caso de falla
     */
    @Override
    /*
    *Este metodo se encarga de eliminar registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    public String deleteDtComVent(DtCompraVenta dcv) {
        try {
            cn.conectar();
            sql = "DELETE FROM detalles_compras_ventas WHERE negocio_id=?";

            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1, dcv.getNegId());
            jc.executeUpdate();

        } catch (SQLException e) {
            mensaje = "No se eliminó el registro";
            System.out.println("Error no se pudo eliminar Detalle de Compara y Venta" + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return mensaje;
    }

    /**
     * 
     * @return retornará una lista de los registros de la tabla
     */
    @Override
    /**
     * @return registros de la tabla
     */

    /*
    *Este metodo se encarga de llamar a los registros de la Base de Datos para porteriormente listarlos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    public ArrayList<DtCompraVenta> listaDtComVent() {

        ArrayList<DtCompraVenta> lista = new ArrayList();//Creamos un objeto de tipo List<DtComVent> para obtener todos los registros almacenados.
        DtCompraVenta d;//Creamos un objeto de mi clase DtComVent para llamar a los registros.

        try {
            cn.conectar();
            sql = "SELECT * FROM detalles_compras_ventas";

            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();//Se utiliza el executeQuery para obtener los resultados de la consulta y posteriormente los asigna al resultSet para luego acceder a ellos

            while (rs.next())//Verifica que haya mas registros
            {
                d = new DtCompraVenta();//Inicializamos el objeto d
                d.setNegId(rs.getInt("negocio_id"));//Asignamos los valores al resultSet
                d.setDateEstVenta(rs.getDate("fecha_establecida_venta"));
                d.setObserv(rs.getString("observaciones"));
                lista.add(d);//Asignamos los registros obtenidos por el objeto "d" al ArrayList
            }
            rs.close();//Finalizamos la consulta
        } catch (SQLException e) {
            System.out.println("Error no se pudo listar Detalles de Compras y Ventas" + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return lista;
    }

    
    /**
     * @return registro que se selecciono
     */
    @Override

    /*
    *Este metodo se encarga de llamar a registros de la Base de Datos y mostralos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    public DtCompraVenta selectDtComVent(DtCompraVenta dcv) {
        try {
            cn.conectar();
            sql = "SELECT * FROM detalles_compras_ventas WHERE negocio_id=?";

            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();

            rs.next();
            datoCv.setNegId(rs.getInt("negocio_id"));
            datoCv.setDateEstVenta(rs.getDate("fecha_establecida_venta"));
            datoCv.setObserv(rs.getString("observaciones"));
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error no se pudo seleccionar Detalle de Compra Venta" + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return datoCv;
    }

}
