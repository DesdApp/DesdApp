/*
 * cn // Objeto de la conexion a la base de datos
 * r // para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
 * run //  instancia de la ejecucion que contiene la base de datos
 * p // Objeto de la clase PagosPropiedades
 */
package dao;

import interfaces.InterfazPagPro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.PagosPropiedades;

public class DAOPagPropi implements InterfazPagPro{

    ConexionDB cn = new ConexionDB();
    private String sql="";
    private ResultSet r;
    private PreparedStatement run;
    private PagosPropiedades p = new PagosPropiedades();
    
    
    @Override
    public PagosPropiedades read(PagosPropiedades papo) {
    cn.conectar();
    sql = "select * from pagos_propiedades where pago_propiedad_id=?";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            r = run.executeQuery();
            p.setPago_prop_id(r.getInt("pago_propiedad_id"));
            p.setVenta_id(r.getInt("venta_id"));
            p.setTipo_pago_id(r.getInt("tipo_pago_id"));
            p.setNo_tran(r.getInt("no_transaccion"));
            p.setFecha(r.getDate("fecha"));
            p.setMonto_pagado(r.getDouble("monto_pagado"));
            r.close();
        } catch (Exception e) {
            System.out.println("Error en: " + e);
        }finally{
            cn.desconectar();
        }
        return p;
    }

    @Override
    public void upd(PagosPropiedades papo) {
            cn.conectar();
        sql="update pagos_propiedades set venta_id, tipo_pago_id, no_transaccion, fecha, monto_pagado where pago_propiedad_id=?";
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, p.getVenta_id());
            run.setInt(2, p.getTipo_pago_id());
            run.setInt(3, p.getNo_tran());
            run.setDate(4, p.getFecha());
            run.setDouble(5, p.getMonto_pagado());
            run.setInt(6, p.getPago_prop_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en actualizar detalles de venta: "+ e);
        }finally{
            cn.desconectar();
        } 
    }

    @Override
    public void del(PagosPropiedades papo) {
    cn.conectar();
    sql = "delete from pagos_propiedades where pago_propiedad_id=?";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, p.getPago_prop_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en eliminar: " + e);
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public void create(PagosPropiedades papo) {
    cn.conectar();
    sql = "insert into pagos_propiedades values(?,?,?,?,?,?)";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, p.getPago_prop_id());
            run.setInt(2, p.getVenta_id());
            run.setInt(3, p.getTipo_pago_id());
            run.setInt(4, p.getNo_tran());
            run.setDate(5, p.getFecha());
            run.setDouble(6, p.getMonto_pagado());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en agregar: " + e);
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public List<PagosPropiedades> listas() {
    ArrayList<PagosPropiedades> list = new ArrayList();
    PagosPropiedades p = null;
    
        try {
            cn.conectar();
            sql = "select * from pagos_propiedades";
            run = cn.getconexionDB().prepareStatement(sql);
            r = run.executeQuery();
            
            while(r.next()){
                p.setPago_prop_id(r.getInt("pago_propiedad_id"));
                p.setVenta_id(r.getInt("venta_id"));
                p.setTipo_pago_id(r.getInt("tipo_pago_id"));
                p.setNo_tran(r.getInt("no_transaccion"));
                p.setFecha(r.getDate("fecha"));
                p.setMonto_pagado(r.getDouble("monto_pagado"));
                list.add(p);
            }
            r.close();
        } catch (Exception e) {
            System.out.println("Error al listar en: " + e);
        }finally{
            cn.desconectar();
        }
        return list;
    }


    
}
