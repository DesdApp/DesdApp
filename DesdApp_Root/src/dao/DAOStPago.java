/*
*sql = Sentencia sql, permite manejar los datos en la Base de Datos
*/
package dao;
import modelo.StPago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



//Se implementa la Interface de la clase StPago= InterfaceStPago
public class DAOStPago  implements interfaces.InterfaceStPago {

//Instanciamos las clases
private ConexionDB cn = new ConexionDB();//cn = objeto para  hacer conexion con la Base de Datos
private ResultSet rs;//rs = Objeto ResultSet, permite visualizar los datos de las consultas a la Base de Datos
private PreparedStatement jc;//jc = objeto PreparedStatement, encargado de enviar las sentencias SQL al driver
private StPago datosStPag;//datosStPag = objeto de la clase StPago, se utilizara en el metodo select

//Atributos
private String sql = "";
private String msg;

    @Override
    /*
    *Este metodo se encarga de insertar registros a la Base de Datos
    */
    public String insertStPago(StPago pag) {
        try {
            cn.conectar();//Realizamos la conexion con la base de datos
            sql = "INSERT INTO estado_pagos VALUES (?,?)";//Asignamos la consulta al sql
            
            jc = cn.getconexionDB().prepareStatement(sql);//Asignamos la consulta al PreparedStatement
            jc.setByte(1,pag.getStPagoId());//Asignamos valores a la consulta 
            jc.setString(2,pag.getName());
            jc.executeUpdate();//Realizamos las cunsulta y actualizamos la base de datos
            msg = "Se ha ingresado el registro correctamente";
        } catch (Exception e) {
            msg = "Error al ingresar registro";
            System.out.println("Error en DAOStPago INSERT: "+e.getMessage());//Si, la consulta es incorrecta se muestra este mensaje
        }
        finally{
            cn.desconectar();//Desconectamos la conexion a la conexion a la Base de datos
            
        }
        return msg;
    }

    @Override
    /*
    *Este metodo se encarga de realizar modificaciones registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos.
    *Cerramos la Base de Datos.
    */
    public String updateStPago(StPago pag) {
        try {
            cn.conectar();
            sql = "UPDATE estado_pagos SET nombre=? WHERE estado_pago_id=?";
            jc  = cn.getconexionDB().prepareStatement(sql);
            jc.setString(1,pag.getName());
            jc.setByte(2,pag.getStPagoId());
            jc.executeUpdate();
            msg = "Se actualizó el registro correctamente";
        } catch (Exception e) {
            msg = "Error al actualizar registro";
            System.out.println("Error en DAOStPago UPDATE: " + e.getMessage());
        }
        finally{
            cn.desconectar();
        }
        return msg;
        
    }

    @Override
    /*
    *Este metodo se encarga de eliminar registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
    */
    public String deleteStPago(StPago pag) {
        try {
            cn.conectar();
            sql = "DELETE FROM estado_pagos WHERE estado_pago_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setByte(1,pag.getStPagoId());
            byte contDel = (byte) jc.executeUpdate();
            if (contDel == 0) {
                msg = "El registro no existe";
            } else {

                msg = "Se ha eliminado el registro";
            }
        } catch (Exception e) {
            msg = "No se ha eliminado el registro";
            System.out.println("Error al eliminar registro en DAOStPago DELETE: " + e.getMessage());
        }
        finally{
            cn.desconectar();
        }
    return msg;
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
    public List<StPago> listaStPago() {
        List<StPago> lista = new ArrayList();//Creamos un objeto de tipo List<StPago> para obtener todos los registros almacenados
        StPago p;//Creamos un objeto de mi clase StPago para llamar a los registros.
        
        try {
            cn.conectar();
            sql = "SELECT * FROM estado_pagos ";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();//Se utiliza el executeQuery para obtener los resultados de la consulta y posteriormente los asigna al resultSet para luego acceder a ellos
            
            while (rs.next())//Verifica que haya mas registros
            {                
                p = new StPago();//Inicializamos el objeto p
                p.setStPagoId(rs.getByte("estado_pago_id"));
                p.setName(rs.getString("nombre"));
                lista.add(p);//Asignamos los registros obtenidos por el objeto "p" al ArrayList
            }
            rs.close();//Finalizamos la consulta
        } catch (Exception e) {
            System.out.println("Error no se pudo listar Estado de Pago : " + e);
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
    public StPago selectStPago(StPago pag) {
        try {
            cn.conectar();
            sql = "SELECT * FROM estado_pagos WHERE estado_pago_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();
            
            rs.next();
            datosStPag.setStPagoId(rs.getByte("estado_pago_id"));
            datosStPag.setName(rs.getString("nombre"));
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error no se pudo buscar Estado de Pago : " + e);
        }
        finally{
            cn.desconectar();
        }
        return datosStPag;
    }


}
