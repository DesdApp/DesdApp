/*
*sql = Sentencia sql, permite manejar los datos en la Base de datos
*/
package dao;

import interfaces.InterfaceNeg;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Neg;

//Se implemeta la interface de mi clase Neg = InterfaceNeg
public class DaoNeg implements InterfaceNeg{

//Instaciamos clases
private ConexionDB cn = new ConexionDB();//cn = Objeto de conexion con la Base de Datos
private ResultSet rs;//rs = Objeto ResultSet, permite visualizar los datos de las consultas a la Base de Datos
private PreparedStatement jc;//jc = objeto PreparedStatement, encargado de enviar las sentencias SQL al driver
private Neg datosneg;//datosneg = Objeto de la clase Neg, sera utilizada en metodo select

//Atributos
private String sql="";


    @Override
     /*
    *Este metodo se encarga de insertar registros a la Base de Datos
    */
    public void insertNeg(Neg neg) {
        try {
            cn.conectar();//Realizamos la conexion con la base de datos
            sql = "insert into negocios values(?,?,?,?,?,?,?,?,?)";//Asignamos la consulta al sql
            
            jc = cn.getconexionDB().prepareStatement(sql);//Asignamos la consulta al PreparedStatement
            jc.setInt(1,neg.getNegocionId());//Asignamos valores a la consulta 
            jc.setInt(2,neg.getBienImbId());
            jc.setInt(3,neg.getTipoTransId());
            jc.setInt(4,neg.getAsesorId());
            jc.setDouble(5,neg.getPriceVenId());
            jc.setDouble(6,neg.getComEmpresa());
            jc.setDate(7,neg.getFecha());
            jc.setByte(8,neg.getStatePagoId());
            jc.setInt(9,neg.getClientId());
            jc.executeUpdate();//Realizamos las cunsulta y actualizamos la base de datos
        } catch (Exception e) {
            System.out.println("Error insertar negocio : " + e);//Si la consulta es incorrecta se muestra este mensaje
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
    public void updateNeg(Neg neg) {
        try {
            cn.conectar();
            sql = "update negocios set bien_inmueble_id=?,tipo_transaccion_id=?,asesor_id=?,precio_venta_propiedad=?,comision_empresa=?,fecha=?,estado_pago_id=?,cliente_id=? where negocio_id=?";
            
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1,neg.getBienImbId());
            jc.setInt(2,neg.getTipoTransId());
            jc.setInt(3,neg.getAsesorId());
            jc.setDouble(4,neg.getPriceVenId());
            jc.setDouble(5,neg.getComEmpresa());
            jc.setDate(6,neg.getFecha());
            jc.setByte(7,neg.getStatePagoId());
            jc.setInt(8,neg.getClientId());
            jc.setInt(9,neg.getNegocionId());
            jc.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error no se pudo modificar Negocio : " + e);
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
    public void deleteNeg(Neg neg) {
            try {
            cn.conectar();
            sql = "delete from negocios where negocio_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1,neg.getNegocionId());
            jc.executeUpdate();
        } catch (Exception e) {
                System.out.println("Error no se pudo eliminar Negocio : " + e);
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
    public List<Neg> listaNeg() {
        List<Neg> lista = new ArrayList();//Creamos un objeto de tipo List<Neg> para obtener todos los registros almacenados.
        Neg ng;//Creamos un objeto de mi clase Neg para llamar a los registros.
        
        try {
            cn.conectar();
            sql = "select * from negocios";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();//Se utiliza el executeQuery para obtener los resultados de la consulta y posteriormente los asigna al resultSet para luego acceder a ellos

            
            while (rs.next())//Verifica que haya mas registros
            {   
                ng = new Neg();//Inicializamos el objeto ng
                ng.setNegocionId(rs.getInt("negocio_id"));//Asignamos los valores al resultSet
                ng.setBienImbId(rs.getInt("bien_inmueble_id"));
                ng.setTipoTransId(rs.getInt("tipo_transaccion_id"));
                ng.setAsesorId(rs.getInt("asesor_id"));
                ng.setPriceVenId(rs.getDouble("precio_venta_propiedad"));
                ng.setComEmpresa(rs.getDouble("comision_empresa"));
                ng.setFecha(rs.getDate("fecha"));
                ng.setStatePagoId(rs.getByte("estado_pago_id"));
                ng.setClientId(rs.getInt("cliente_id"));
                lista.add(ng);//Asignamos los registros obtenidos por el objeto "ng" al ArrayList
            }
            rs.close();//Finalizamos la consulta
        } catch (Exception e) {
        }
        finally{
            cn.desconectar();
        }
        return lista;
    }

   /**
    * @return registro que se selecciono
    */
    
     /*
    *Este metodo se encarga de llamar a registros de la Base de Datos y mostralos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
    */
    @Override
    public Neg selectNeg(Neg neg) {
          try {
            cn.conectar();
            sql = "select * from negocios where negocio_id=?";
            
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1,neg.getNegocionId());
            rs = jc.executeQuery();
            
            rs.next();
             datosneg.setNegocionId(rs.getInt("negocio_id"));
             datosneg.setBienImbId(rs.getInt("bien_inmueble_id"));
             datosneg.setTipoTransId(rs.getInt("tipo_transaccion_id"));
             datosneg.setAsesorId(rs.getInt("asesor_id"));
             datosneg.setPriceVenId(rs.getDouble("precio_venta_propiedad"));
             datosneg.setComEmpresa(rs.getDouble("comision_empresa"));
             datosneg.setFecha(rs.getDate("fecha"));
             datosneg.setStatePagoId(rs.getByte("estado_pago_id"));
             datosneg.setClientId(rs.getInt("cliente_id"));
            rs.close();
        } catch (Exception e) {
              System.out.println("Error no se pudo buscar el negocio" + e);
        }
          finally{
              cn.desconectar();
          }
          return datosneg;
    }




}
