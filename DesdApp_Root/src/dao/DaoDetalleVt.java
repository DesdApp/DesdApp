package dao;

import interfaces.InterfaceDetalleVt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.DetalleVt;

public class DaoDetalleVt implements InterfaceDetalleVt{

private ConexionDB cn = new ConexionDB();
private DetalleVt dtVenta = new DetalleVt();
private ResultSet rst;
private PreparedStatement jc;
private String mensaje;
private String sql;

    @Override
    public void addDetalleVt(DetalleVt dv) {
        try {
            cn.conectar();
            sql = "insert into detalles_ventas values (?,?,?)";
            
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1,dv.getDetalleId());
            jc.setInt(2,dv.getVentaId());
            jc.setInt(3,dv.getNegocioId());
            jc.executeUpdate();
           
        } catch (Exception e) {
            System.out.println("Error no se pudo agregar Detalle venta" + e );
        }
        finally{
            cn.desconectar();
        }
    }

    @Override
    public void updateDetalleVt(DetalleVt dv) {
        try {
            cn.conectar();
            sql = "update detalles_ventas set venta_id=?,negocio_id=? where detalle_id=? ";
            
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1,dv.getVentaId());
            jc.setInt(2,dv.getNegocioId());
            jc.setInt(3,dv.getVentaId());
            jc.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error no se pudo modificar Detalle de venta " + e );
        }
        finally{
            cn.desconectar();
        }
    }

  
    @Override
    public void deleteDetalle(DetalleVt dv) {
        try {
            cn.conectar();
            sql = "delete from detalles_ventas where detalle_id=?";
            
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1,dv.getDetalleId());
            jc.executeUpdate();
        
        } catch (Exception e) {
            System.out.println("Error no se pudo eliminar el detalle de venta" + e );
        }
        finally{
            cn.desconectar();
        }
    }

    @Override
    public List<DetalleVt> listVenta() {
        List<DetalleVt> lista = new ArrayList();
        DetalleVt datos;
        
        try {
            cn.conectar();
            sql = "select * from detalles_ventas";
            jc = cn.getconexionDB().prepareStatement(sql);
            rst = jc.executeQuery();
            
            while (rst.next()) { 
                datos = new DetalleVt();
                datos.setDetalleId(rst.getInt("detalle_id"));
                datos.setVentaId(rst.getByte("venta_id"));
                datos.setVentaId(rst.getInt("negocio_id"));
                lista.add(datos);
            }
            rst.close();
        } catch (Exception e) {
            System.out.println("Error no se pudo listar base de datos: " +  e );
        }
        finally{
        cn.desconectar();    
        }
      return lista;
    }

    @Override
    public DetalleVt selectDetalleVt(DetalleVt dv) {
        try {
            cn.conectar();
            sql = "select * form detalles_ventas where detalle_id";
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1,dv.getDetalleId());
            rst = jc.executeQuery();
            
            rst.next();
             dtVenta.setDetalleId(rst.getInt("detalle_id"));
             dtVenta.setVentaId(rst.getByte("venta_id"));
             dtVenta.setVentaId(rst.getInt("negocio_id"));
            rst.close();
        } catch (Exception e) {
            System.out.println("Error no se pudo buscar detalled e venta : " + e );
        }
        finally{
            cn.desconectar();
        }
        return dtVenta;
    }

   
}
