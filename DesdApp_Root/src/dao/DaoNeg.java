package dao;

import interfaces.InterfaceNeg;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Neg;

/*
*cn = Objeto de conexion con la Base de Datos
*rs = Objeto ResultSet, permite visualizar los datos de las consultas a la Base de Datos
*jc = Objeto PreparedStatement, se encarga de realizar consultas a la Base de datos
*sql = Sentencia sql, permite manejar los datos en mi Base de datos
*datosneg = Objeto de la clase Neg
*/
public class DaoNeg implements InterfaceNeg{

//Variables
private ConexionDB cn = new ConexionDB();
private ResultSet rs;
private PreparedStatement jc;
private String sql="";
private Neg datosneg;



//Metodo Insetar Negocio
    @Override
    public void insertNeg(Neg neg) {
        try {
            cn.conectar();
            sql = "insert into negocios values(?,?,?,?,?,?,?,?,?)";
            
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1,neg.getNegocionId());
            jc.setInt(2,neg.getBienImbId());
            jc.setInt(3,neg.getTipoTransId());
            jc.setInt(4,neg.getAsesorId());
            jc.setDouble(5,neg.getPriceVenId());
            jc.setDouble(6,neg.getComEmpresa());
            jc.setDate(7,neg.getFecha());
            jc.setByte(8,neg.getStatePagoId());
            jc.setInt(9,neg.getClientId());
            
        } catch (Exception e) {
            System.out.println("Error insertar negocio : " + e);
        }
        finally{
            cn.desconectar();
        }
    }

    
  //Metodos Modificar Negocio
    @Override
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

    
   //Metodo Eliminar Negocio
    @Override
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

    
  //Metodo Listar Negocio
    @Override
    public List<Neg> listaNeg() {
        List<Neg> lista = new ArrayList();
        Neg ng;
        
        try {
            cn.conectar();
            sql = "select * from negocios";
            rs = jc.executeQuery();
            while (rs.next()) {   
                ng = new Neg();
                ng.setNegocionId(rs.getInt("negocio_id"));
                ng.setBienImbId(rs.getInt("bien_inmueble_id"));
                ng.setTipoTransId(rs.getInt("tipo_transaccion_id"));
                ng.setAsesorId(rs.getInt("asesor_id"));
                ng.setPriceVenId(rs.getDouble("precio_venta_propiedad"));
                ng.setComEmpresa(rs.getDouble("comision_empresa"));
                ng.setFecha(rs.getDate("fecha"));
                ng.setStatePagoId(rs.getByte("estado_pago_id"));
                ng.setClientId(rs.getInt("cliente_id"));
                lista.add(ng);
            }
            rs.close();
        } catch (Exception e) {
        }
        finally{
            cn.desconectar();
        }
        return lista;
    }

   //Metodo buscar Negocio
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
