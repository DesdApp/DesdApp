/*
 * cn //  conexión a base de datos
 * result // resultado de metadatos de ResultSet
 * run // instancia de la ejecución
 * dv // Objeto de la clase DetVentas
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
    private String sql="";
    private ResultSet result;
    private PreparedStatement run;
    private DetVentas dv = new DetVentas();  
    

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

    @Override
    public void create(DetVentas ventas) {
        cn.conectar();
        sql="insert into detalles_ventas values(?,?,?)";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, dv.getDetalle_id());
            run.setInt(2, dv.getNegocio_id());
            run.setInt(3, dv.getVenta_id()); 
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en crear detalle de venta en: " + e);
        }finally{
            cn.desconectar();
        }
    }


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
            System.out.println("Error en actualizar detalles de venta: " + e);
        }finally{
            cn.desconectar();
        }
    }

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
            v.setNegocio_id(result.getInt("negocio_id"));
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
