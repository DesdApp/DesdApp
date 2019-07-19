/*
 * cn // conexion a la base de datos
 * r // metadatos de resultSet
 * run // instancia de la ejecución
 * t // objeto de la clase TiposPagos
 */
package dao;

import interfaces.InterfazTipPagos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.TiposPagos;

public class DAOTipPag implements InterfazTipPagos{

    ConexionDB cn = new ConexionDB();
    private String sql="";
    private ResultSet r;
    private PreparedStatement run;
    private TiposPagos t = new TiposPagos();
    
    
    @Override
    public TiposPagos read(TiposPagos tp){
        cn.conectar();
        sql = "select * from tipos_pagos where tipo_pago_id=?";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            r = run.executeQuery();
            t.setTipo_pago_id(r.getInt("tipo_pago_id"));
            t.setNombre(r.getString("nombre"));
            r.close();
        } catch (Exception e) {
            System.out.println("Error al buscar tipo de pago en : " +e);
        }finally{
            cn.desconectar();
        }
        return t;
    }

    @Override
    public void create(TiposPagos tp) {
    cn.conectar();
    sql = "insert into tipos_pagos values(?,?)";
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, t.getTipo_pago_id());
            run.setString(2, t.getNombre());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al ingresar tipo de pago en: " + e);
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public void upd(TiposPagos tp) {
    cn.conectar();
    sql = "update tipos_pagos set nombre where tipo_pago_id=?";
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setString(1, t.getNombre());
            run.setInt(2, t.getTipo_pago_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar tipo de pago en: " + e);
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public void del(TiposPagos tp) {
    cn.conectar();
    sql = "delete from tipos_pagos where tipo_pago_id=?";
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, t.getTipo_pago_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar en: " + e);
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public List<TiposPagos> listar() {
        ArrayList<TiposPagos> list = new ArrayList();
        TiposPagos p = null;
        
        try {
            cn.conectar();
            sql = "select * from tipos_pagos";
            run = cn.getconexionDB().prepareStatement(sql);
            r = run.executeQuery();
            
            while(r.next()){
                p.setTipo_pago_id(r.getInt("tipo_pago_id"));
                p.setNombre(r.getString("nombre"));
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
