/*
*sql = Sentencia sql, permite manejar los datos en la Base de Datos
*/
package dao;

import interfaces.InterfaceTpTrans;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.TpTrans;

//Se implementa la interface de mi clase TpTrans = InterfaceTpTrans
public class DAOTpTrans implements InterfaceTpTrans{

//Instanciamos clases
private ConexionDB cn = new ConexionDB();//cn = objeto para  hacer conexion con la Base de Datos
private ResultSet rs;//rs = Objeto ResultSet, permite visualizar los datos de las consultas a la Base de Datos
private PreparedStatement jc;//jc = objeto PreparedStatement, encargado de enviar las sentencias SQL al driver
private TpTrans datosTp;//datosTp = Objeto de la clase TpTrans, se utilizara en metodo select

//Atributos
private String sql = "";


    @Override
    /*
    *Este metodo se encarga de insertar registros a la Base de Datos
    */
    public void insertTpTrans(TpTrans tp) {
        try {
            cn.conectar();//Realizamos la conexion con la base de datos
            sql = "INSERT INTO tipos_transacciones VALUES(?,?)";//Asignamos la consulta al sql
            
            jc = cn.getconexionDB().prepareStatement(sql);//Asignamos la consulta al PreparedStatement
            jc.setInt(1,tp.getTpTransId());//Asignamos valores a la consulta 
            jc.setString(2,tp.getName());
            jc.executeUpdate();//Realizamos las cunsulta y actualizamos la base de datos
        } catch (Exception e) {
            System.out.println("Error no se pudo insertar Tipo Transaccion : " + e);//Si, la consulta es incorrecta se muestra este mensaje
        }
        finally{
            cn.desconectar();//Desconectamos la conexion a la conexion a la Base de datos
        }
    }
    
    @Override
    /*
    *Este metodo se encarga de realizar modificaciones registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos.
    *Cerramos la Base de Datos.
    */
    public void updateTpTrans(TpTrans tp) {
        try {
            cn.conectar();
            sql= "UPDATE tipos_transacciones SET nombre=? WHERE tipo_transaccion_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setString(1,tp.getName());
            jc.setInt(2,tp.getTpTransId());
            jc.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error no se pudo modificar Tipo Transaccion : " + e);
        }
        finally{
            cn.desconectar();
        }
    
    }

    @Override
    /*
    *Este metodo se encarga de eliminar registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
    */
    public void deleteTpTrans(TpTrans tp) {
        try {
            cn.conectar();
            sql = "DELETE FROM tipos_transacciones WHERE tipo_transaccion_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1,tp.getTpTransId());
            jc.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error no se pudo eliminar Tipo Transaccion : " + e);
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
    public List<TpTrans> listaTpTrans() {
        List<TpTrans> lista = new ArrayList();//Creamos un objeto de tipo List<TpTrans> para obtener todos los registros almacenados
        TpTrans dato;//Creamos un objeto de mi clase TpTrans para llamar a los registros.
        
        try {
            cn.conectar();
            sql = "SELECT * FROM tipos_transacciones";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();//Se utiliza el executeQuery para obtener los resultados de la consulta y posteriormente los asigna al resultSet para luego acceder a ellos
            
            while (rs.next())//Verifica que haya mas registros
            {  
              dato = new TpTrans();//Inicializamos el objeto dato
              dato.setTpTransId(rs.getInt("tipo_transaccion_id"));
              dato.setName(rs.getString("nombre"));
              lista.add(dato);//Asignamos los registros obtenidos por el objeto "dato" al ArrayList
            }
            rs.close();//Finalizamos la consulta
        } catch (Exception e) {
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
    *Este metodo se encarga de llamar registros de la Base de Datos y mostralos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
    */
    public TpTrans selecTpTrans(TpTrans tp) {
        try {
            cn.conectar();
             sql = "SELECT * FROM tipos_transacciones WHERE tipo_transaccion_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();
            
            rs.next();
            datosTp.setTpTransId(rs.getInt("tipo_transaccion_id"));
            datosTp.setName(rs.getString("nombre"));
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error no se pudo buscar Tipos de Transaccion : " +e);
        }
        finally{
            cn.desconectar();
        }
        return datosTp;
    }
   

}
