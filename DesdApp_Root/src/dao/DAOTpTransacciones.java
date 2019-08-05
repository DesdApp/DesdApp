/*
*sql = Sentencia sql, permite manejar los datos en la Base de Datos
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import modelo.TpTransacciones;
import interfaces.InterfaceTpTransacciones;

//Se implementa la interface de mi clase TpTrans = InterfaceTpTrans
public class DAOTpTransacciones implements InterfaceTpTransacciones {

//Instanciamos clases
    private ConexionDB cn = new ConexionDB();//cn = objeto para  hacer conexion con la Base de Datos
    private ResultSet rs;//rs = Objeto ResultSet, permite visualizar los datos de las consultas a la Base de Datos
    private PreparedStatement jc;//jc = objeto PreparedStatement, encargado de enviar las sentencias SQL al driver
    private TpTransacciones datosTp;//datosTp = Objeto de la clase TpTrans, se utilizara en metodo select

//Atributos
    private String sql = "";
    String mensaje;
/**
 * 
 * @param tp   el ingreso de nuevos registros, el id es autoincrementable
 * @return 
 */
    @Override
    /*
    *Este metodo se encarga de insertar registros a la Base de Datos
     */
    public String insertTpTrans(TpTransacciones tp) {
        try {
            cn.conectar();//Realizamos la conexion con la base de datos
            sql = "INSERT INTO tipos_transacciones VALUES(?,?)";//Asignamos la consulta al sql

            jc = cn.getconexionDB().prepareStatement(sql);//Asignamos la consulta al PreparedStatement
            jc.setInt(1, tp.getTpTransId());//Asignamos valores a la consulta
            jc.setString(2, tp.getName());
            jc.executeUpdate();//Realizamos las cunsulta y actualizamos la base de datos
        } catch (SQLException e) {
            mensaje = "No se ingresó el registro correctamente";
            System.out.println("Error no se pudo insertar Tipo Transaccion : " + e.getMessage());//Si, la consulta es incorrecta se muestra este mensaje
        } finally {
            cn.desconectar();//Desconectamos la conexion a la conexion a la Base de datos
        }
    return mensaje;
    }

    /**
     * 
     * @param tp    actualizará un registro por medio de su id
     * @return  retornará un mensaje en caso de tener una falla
     */
    @Override
    /*
    *Este metodo se encarga de realizar modificaciones registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos.
    *Cerramos la Base de Datos.
     */
    public String updateTpTrans(TpTransacciones tp) {
        try {
            cn.conectar();
            sql = "UPDATE tipos_transacciones SET nombre=? WHERE tipo_transaccion_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setString(1, tp.getName());
            jc.setInt(2, tp.getTpTransId());
            jc.executeUpdate();
        } catch (SQLException e) { 
            mensaje = "No se actualizó el registro";
            System.out.println("Error no se pudo modificar Tipo Transaccion : " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return mensaje;
    }

    /**
     * 
     * @param tp  Eliminará el registro por medio de su id
     * @return  retornará un mensaje en caso de falla
     */
    @Override
    /*
    *Este metodo se encarga de eliminar registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    public String deleteTpTrans(TpTransacciones tp) {
        try {
            cn.conectar();
            sql = "DELETE FROM tipos_transacciones WHERE tipo_transaccion_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1, tp.getTpTransId());
            jc.executeUpdate();
        } catch (SQLException e) {
            mensaje = "No se ha eliminado el registro";
            System.out.println("Error no se pudo eliminar Tipo Transaccion : " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return mensaje;
    }

    /**
     * 
     * @return retornará la lista de registros de la tabla  
     */
    @Override
    /*
    *Este metodo se encarga de llamar a los registros de la Base de Datos para porteriormente listarlos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    public ArrayList<TpTransacciones> listaTpTrans() {
        ArrayList<TpTransacciones> lista = new ArrayList();//Creamos un objeto de tipo List<TpTrans> para obtener todos los registros almacenados
        TpTransacciones dato;//Creamos un objeto de mi clase TpTrans para llamar a los registros.

        try {
            cn.conectar();
            sql = "SELECT * FROM tipos_transacciones";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();//Se utiliza el executeQuery para obtener los resultados de la consulta y posteriormente los asigna al resultSet para luego acceder a ellos

            while (rs.next())//Verifica que haya mas registros
            {
                dato = new TpTransacciones();//Inicializamos el objeto dato
                dato.setTpTransId(rs.getInt("tipo_transaccion_id"));
                dato.setName(rs.getString("nombre"));
                lista.add(dato);//Asignamos los registros obtenidos por el objeto "dato" al ArrayList
            }
            rs.close();//Finalizamos la consulta
        } catch (SQLException e) {
            System.out.println("Error en DAOSelect: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return lista;
    }

    /**
     * 
     * @param tp    con el id buscará el registro y lo mostrará
     * @return   retornará los datos del registro 
     */
    @Override
    /**
     * @return registro que se selecciono
     */

    /*
    *Este metodo se encarga de llamar registros de la Base de Datos y mostralos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    public TpTransacciones selecTpTrans(TpTransacciones tp) {
        try {
            cn.conectar();
            sql = "SELECT * FROM tipos_transacciones WHERE tipo_transaccion_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();

            rs.next();
            datosTp.setTpTransId(rs.getInt("tipo_transaccion_id"));
            datosTp.setName(rs.getString("nombre"));
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error no se pudo buscar Tipos de Transaccion : " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return datosTp;
    }

}
