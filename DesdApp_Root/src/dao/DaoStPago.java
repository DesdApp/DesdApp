/*
*sql = Sentencia sql, permite manejar los datos en la Base de Datos
*/
package dao;

import interfaces.InterfaceStPago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.StPago;


//Se implementa la Interface de la clase StPago= InterfaceStPago
public class DaoStPago  implements InterfaceStPago {

//Instanciamos las clases
private ConexionDB cn = new ConexionDB();//cn = objeto para  hacer conexion con la Base de Datos
private ResultSet rs;//rs = Objeto ResultSet, permite visualizar los datos de las consultas a la Base de Datos
private PreparedStatement jc;//jc = objeto PreparedStatement, encargado de enviar las sentencias SQL al driver
private StPago datosStPag;//datosStPag = objeto de la clase StPago, se utilizara en el metodo select

//Atributos
private String sql = "";


    @Override
    /*
    *Este metodo se encarga de insertar registros a la Base de Datos
    */
    public void insertStPago(StPago pag) {
        try {
            cn.conectar();//Realizamos la conexion con la base de datos
            sql = "insert into estado_pagos values (?,?)";//Asignamos la consulta al sql
            
            jc = cn.getconexionDB().prepareStatement(sql);//Asignamos la consulta al PreparedStatement
            jc.setByte(1,pag.getStPagoId());//Asignamos valores a la consulta 
            jc.setString(2,pag.getName());
            jc.executeUpdate();//Realizamos las cunsulta y actualizamos la base de datos
        } catch (Exception e) {
            System.out.println("Error no se pudo insertar Estado de pago : " + e);//Si, la consulta es incorrecta se muestra este mensaje
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
    public void updateStPago(StPago pag) {
        try {
            cn.conectar();
            sql = "update estado_pagos set nombre=? where estado_pago_id=?";
            jc  = cn.getconexionDB().prepareStatement(sql);
            jc.setString(1,pag.getName());
            jc.setByte(2,pag.getStPagoId());
            jc.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error no se pudo modificar Estado de pago : " + e);
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
    public void deleteStPago(StPago pag) {
        try {
            cn.conectar();
            sql = "delete from estado_pagos where estado_pago_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setByte(1,pag.getStPagoId());
            jc.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error no se pudo eliminar Estado de Pago : "+ e);
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
    public List<StPago> listaStPago() {
        List<StPago> lista = new ArrayList();//Creamos un objeto de tipo List<StPago> para obtener todos los registros almacenados
        StPago p;//Creamos un objeto de mi clase StPago para llamar a los registros.
        
        try {
            cn.conectar();
            sql = "select * from estado_pagos ";
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
            sql = "select * from estado_pagos where estado_pago_id=?";
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
