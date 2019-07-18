/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.InterfazDetVentas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.DetVentas;

public class DAODetVentas implements InterfazDetVentas{
    ConexionDB cn = new ConexionDB();
    private String mensaje="";
    private String sql="";
    private ResultSet result;
    private PreparedStatement run;
    private DetVentas dv = new DetVentas();   //Se inicializó
    
    
    // Método abstracto para ver los datos de un detalle de ventas
    @Override
    public DetVentas read(DetVentas ventas) {
        cn.conectar();
        sql="select * from detalles_ventas where detalle_id=?";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            result = run.executeQuery();
            dv.setDetalle_id(result.getInt("detalle_id"));
            dv.setNegocio_id(result.getInt("negocio_id"));
            dv.setVenta_id(result.getInt("venta_id"));
            result.close();
        } catch (Exception e) {
            System.out.println("Error al buscar detalle de ventas en: " +e);
        }finally{
            cn.desconectar();
        }
        return dv;
    }

    //Método para agregar registros de detalles de ventas
    @Override
    public void creat(DetVentas ventas) {
        cn.conectar();
        sql="insert into detalles_ventas values(?,?,?)";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, dv.getDetalle_id());
            run.setInt(2, dv.getNegocio_id());
            run.setInt(3, dv.getVenta_id()); 
            run.executeUpdate();
        } catch (Exception e) {
            mensaje = "Error en crear detalle de venta en: " + e;
        }finally{
            cn.desconectar();
        }
    }

    //Método para actualizar por medio de el id de detalle
    @Override
    public void upd(DetVentas ventas) {
    cn.conectar();
    sql="update detalles_ventas set negocio_id, venta_id where detalle_id=?";
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, dv.getNegocio_id());
            run.setInt(2, dv.getVenta_id());
            run.setInt(3, dv.getDetalle_id());
            run.executeUpdate();
        } catch (Exception e) {
            mensaje = "Error en actualizar detalles de venta: " + e;
        }finally{
            cn.desconectar();
        }
    }
 //Método para eliminar registro
    @Override
    public void del(DetVentas ventas) {
    cn.conectar();
    sql = "delete from detalles_ventas where detalle_id=?";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, dv.getDetalle_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en eliminar: " +e);
        }finally{
            cn.desconectar();
        }
    }
    
// listar 
    @Override
    public List<DetVentas> listar() {
        ArrayList<DetVentas> lista = new ArrayList();
        DetVentas v = null;
    
        try {
        cn.conectar();
        sql ="select * from detalles_ventas";
        run = cn.getconexionDB().prepareStatement(sql);
        result = run.executeQuery();
        
        while(result.next()){
            v.setDetalle_id(result.getInt("detalle_id"));
            v.setNegocio_id(result.getInt("negocio:id"));
            v.setVenta_id(result.getInt("venta_id"));
            lista.add(v);
        }
        result.close();
        } catch (Exception e) {
            System.out.println("Error al listar en: " + e);
        }finally{
            cn.desconectar();
        }
        return lista;
    }
    
    
    
}
