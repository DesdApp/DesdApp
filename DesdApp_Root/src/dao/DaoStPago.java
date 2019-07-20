package dao;

import interfaces.InterfaceStPago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.StPago;

/*
*cn = objeto para  hacer conexion con la Base de Datos
*rs = objeto ResultSet, encargado de mostras datos sobre las consultas realizadas
*jc = objeto PreparedStatement, encargado de realizar las consultas a la Base de Datos
*sql = Sentencia sql, permite manejar los datos en la Base de Datos
*datosStPag = objeto de la clase StPago
*/

//Se implementa la Interface de la clase StPago= InterfaceStPago
public class DaoStPago  implements InterfaceStPago {

private ConexionDB cn = new ConexionDB();
private ResultSet rs;
private PreparedStatement jc;
private String sql = "";
private StPago datosStPag;

    @Override
    public void insertStPago(StPago pag) {
        try {
            cn.conectar();
            sql = "insert into estado_pagos values (?,?)";
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setByte(1,pag.getStPagoId());
            jc.setString(2,pag.getName());
            jc.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error no se pudo insertar Estado de pago : " + e);
        }
        finally{
            cn.desconectar();
            
        }
    }

    @Override
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
    public List<StPago> listaStPago() {
        List<StPago> lista = new ArrayList();
        StPago p;
        
        try {
            cn.conectar();
            sql = "select * from estado_pagos ";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();
            
            while (rs.next()) {                
                p = new StPago();
                p.setStPagoId(rs.getByte("estado_pago_id"));
                p.setName(rs.getString("nombre"));
                lista.add(p);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error no se pudo listar Estado de Pago : " + e);
        }
        finally{
        cn.desconectar();
        }
     return lista;
     }

    @Override
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
