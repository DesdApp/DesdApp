/*
*sql = Sentencia sql, permite manejar los registros en mi base de datos
*/
package dao;

import interfaces.InterfaceDtComVent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.DtComVent;

//Implementamos la interface de la clase DtComVent = InterfaceDtComVent
public class DaoDtComVent implements InterfaceDtComVent{

//Instanciamos clases
private ConexionDB cn = new ConexionDB();//cn = Objeto de conexion con la Base de Datos
private ResultSet rs;//rs = Objeto ResultSet, permite visualizar los datos de las consultas a la Base de Datos
private PreparedStatement jc;//jc = objeto PreparedStatement, encargado de enviar las sentencias SQL al driver
private DtComVent datoCv;//datosneg = Objeto de la clase DtComVent, sera utilizada en metodo select

//Atributos
private String sql = "";

    @Override
    public void insertDtComVent(DtComVent dcv) {
        try {
            cn.conectar();//Realizamos la conexion con la base de datos
            sql = "insert into detalles_compras_ventas values (?,?,?)";//Asignamos la consulta al sql
            
            jc = cn.getconexionDB().prepareStatement(sql);//Asignamos la consulta al PreparedStatement
            jc.setInt(1, dcv.getNegId());//Asignamos valores a la consulta 
            jc.setDate(2, dcv.getDateEstVenta());
            jc.setString(3,dcv.getObserv());
            jc.executeUpdate();//Realizamos las cunsulta y actualizamos la base de datos
            
        } catch (Exception e) {
            System.out.println("Error no se pudo insertar datos de Detalles de Compra y Venta");//Si la consulta es incorrecta se muestra este mensaje
        }
        finally{
            cn.desconectar();//Desconectamos la conexion a la conexion a la Base de datos
        }
    }

    @Override
    /*
    *Este metodo se encarga de realizar modificaciones a registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos.
    *Cerramos la Base de Datos.
    */
    public void updateDtComVent(DtComVent dcv) {
        try {
            cn.conectar();
            sql = "update detalles_compras_ventas set fecha_establecida_venta=?,observaciones=? where negocio_id=?";
            
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setDate(1, dcv.getDateEstVenta());
            jc.setString(2, dcv.getObserv());
            jc.setInt(3, dcv.getNegId());
            jc.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error no se pudo modificar Detalle de Compra y Venta");
        }
        cn.desconectar();
    }

    @Override
    /*
    *Este metodo se encarga de eliminar registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
    */
    public void deleteDtComVent(DtComVent dcv) {
        try {
            cn.conectar();
            sql = "delete from detalles_compras_ventas where negocio_id=?";
            
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1, dcv.getNegId());
            jc.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error no se pudo eliminar Detalle de Compara y Venta");
        }
        finally{
            cn.desconectar();
        }
    }

    @Override
    /**
    * @return registros de la tabla 
    */
    
    /*
    *Este metodo se encarga de llamar a los registros de la Base de Datos para porteriormente listarlos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
    */
    public List<DtComVent> listaDtComVent() {
        
     List<DtComVent> lista = new ArrayList();//Creamos un objeto de tipo List<DtComVent> para obtener todos los registros almacenados.
     DtComVent d;//Creamos un objeto de mi clase DtComVent para llamar a los registros.
     
        try {
            cn.conectar();
            sql = "select * from detalles_compras_ventas";
            
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();//Se utiliza el executeQuery para obtener los resultados de la consulta y posteriormente los asigna al resultSet para luego acceder a ellos
            
            while (rs.next())//Verifica que haya mas registros 
            {                
                d = new DtComVent();//Inicializamos el objeto d
                d.setNegId(rs.getInt("negocio_id"));//Asignamos los valores al resultSet
                d.setDateEstVenta(rs.getDate("fecha_establecida_venta"));
                d.setObserv(rs.getString("observaciones"));
                lista.add(d);//Asignamos los registros obtenidos por el objeto "d" al ArrayList
            }
            rs.close();//Finalizamos la consulta
        } catch (Exception e) {
            System.out.println("Error no se pudo listar Detalles de Compras y Ventas");
        }
        finally{
            cn.desconectar();
        }
        return lista;
    }

    @Override
    /**
    * @return registro que se selecciono
    */
    
     /*
    *Este metodo se encarga de llamar a registros de la Base de Datos y mostralos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
    */
    public DtComVent selectDtComVent(DtComVent dcv) {
        try {
         cn.conectar();
         sql = "select * from detalles_compras_ventas where negocio_id=?";
         
         jc = cn.getconexionDB().prepareStatement(sql);
         rs = jc.executeQuery();
         
         rs.next();
          datoCv.setNegId(rs.getInt("negocio_id"));
          datoCv.setDateEstVenta(rs.getDate("fecha_establecida_venta"));
          datoCv.setObserv(rs.getString("observaciones"));
         rs.close();
         
        } catch (Exception e) {
            System.out.println("Error no se pudo seleccionar Detalle de Compra Venta");
        }
        finally{
            cn.desconectar();
        }
        return datoCv;
    }


}
