/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.interfazVenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Venta;

public class DAOVenta implements interfazVenta{
    ConexionDB cn = new ConexionDB();
    private String mensaje="";
    private String sql="";
    private ResultSet result;
    private PreparedStatement run;
    private Venta v = new Venta();
    
    
    @Override
    public Venta read(Venta venta) {
        cn.conectar();
        sql="select * from venta where venta_id=?";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            result = run.executeQuery();
            v.setVenta_id(result.getInt("venta_id"));
            v.setNumero_factura(result.getInt("numero_factura"));
            v.setSerie(result.getString("serie"));
            v.setNit(result.getInt("nit"));
            v.setNombre(result.getString("nombre"));
            v.setDireccion(result.getString("direccion"));
            v.setFecha(result.getDate("fecha"));
            v.setTotal(result.getDouble("total"));
            v.setTipo_id(result.getInt("tipo_id"));
            result.close();
        } catch (Exception e) {
            System.out.println("Error al buscar ventas en: " +e);
        }finally{
            cn.desconectar();
        }
        return v;
    }

    @Override
    public void upd(Venta venta) {
        cn.conectar();
        sql="update venta set numero_factura, serie, nit, nombre, direccion, fecha, total, tipo_id where venta_id=?";
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, v.getVenta_id());
            run.setInt(2, v.getNumero_factura());
            run.setString(3, v.getSerie());
            run.setInt(4, v.getNit());
            run.setString(5, v.getNombre());
            run.setString(6, v.getDireccion());
            run.setDate(7, v.getFecha());
            run.setDouble(8, v.getTotal());
            run.setInt(9, v.getTipo_id()); 
            run.executeUpdate();
        } catch (Exception e) {
            mensaje = "Error en actualizar detalles de venta: " + e;
        }finally{
            cn.desconectar();
        }    
    }

    @Override
    public void del(Venta venta) {
        cn.conectar();
    sql = "delete from venta where venta_id=?";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, v.getVenta_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en eliminar: " +e);
        }finally{
            cn.desconectar();
        }
    }
    

    @Override
    public void create(Venta venta) {
            cn.conectar();
        sql="insert into venta values(?,?,?,?,?,?,?,?,?)";
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, v.getVenta_id());
            run.setInt(2, v.getNumero_factura());
            run.setString(3, v.getSerie());
            run.setInt(4, v.getNit());
            run.setString(5, v.getNombre());
            run.setString(6, v.getDireccion());
            run.setDate(7, v.getFecha());
            run.setDouble(8, v.getTotal());
            run.setInt(9, v.getTipo_id());  
            run.executeUpdate();
        } catch (Exception e) {
            mensaje = "Error en crear detalle de venta en: " + e;
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public List<Venta> listas() {
            ArrayList<Venta> lista = new ArrayList();
            Venta v = null;
    
        try {
        cn.conectar();
        sql ="select * from venta";
        run = cn.getconexionDB().prepareStatement(sql);
        result = run.executeQuery();
        
        while(result.next()){
            v.setVenta_id(result.getInt("venta_id"));
            v.setNumero_factura(result.getInt("numero_factura"));
            v.setSerie(result.getString("serie"));
            v.setNit(result.getInt("nit"));
            v.setNombre(result.getString("nombre"));
            v.setDireccion(result.getString("direccion"));
            v.setFecha(result.getDate("fecha"));
            v.setTotal(result.getDouble("total"));
            v.setTipo_id(result.getInt("tipo_id"));
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

