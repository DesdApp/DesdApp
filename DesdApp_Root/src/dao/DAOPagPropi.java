/*
 * cn // Objeto de la conexion a la base de datos
 * r // para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
 * run //  instancia de la ejecucion que contiene la base de datos
 * p // Objeto de la clase PagosPropiedades
 */
package dao;

import modelo.PagosPropiedades;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOPagPropi implements interfaces.InterfazPagPro{    //Implementamos la clase interface para los métodos abstractos

    ConexionDB cn = new ConexionDB();
    private String sql="";
    private ResultSet r;
    private PreparedStatement run;
    private PagosPropiedades p = new PagosPropiedades();
    
    
    @Override
    public PagosPropiedades read(PagosPropiedades papo) {  //Se realiza la consulta de select para ver el registro llamandolo por el detalle_id
    cn.conectar();
    sql = "SELECT * FROM pagos_propiedades WHERE pago_propiedad_id=?"; //Se crea consulta sql para retornar los datos correspondientes al método
        try {
            run = cn.getconexionDB().prepareStatement(sql);   //Después de ser verificada la conexion, se obtiene la consulta
            r = run.executeQuery();  //Ejecuta la consulta y la almacena
            p.setPago_prop_id(r.getInt("pago_propiedad_id"));//Se asigna el valor específico a la variable
            p.setVenta_id(r.getInt("venta_id"));  //Se asigna el valor específico a la variable
            p.setTipo_pago_id(r.getInt("tipo_pago_id")); //Se asigna el valor específico a la variable
            p.setNo_tran(r.getInt("transaccion_no"));  //Se asigna el valor específico a la variable
            p.setFecha(r.getDate("fecha"));  //Se asigna el valor específico a la variable
            p.setMonto_pagado(r.getDouble("monto_pagado"));  //Se asigna el valor específico a la variable
            r.close();
        } catch (Exception e) {
            System.out.println("Error en: " + e);  //Comentario para mostrar un error
        }finally{
            cn.desconectar();
        }
        return p;  //retornamos los datos de la tabla
    }

    @Override
    public void upd(PagosPropiedades papo) {   //Se realiza la consulta de update para actualizar algún registro
            cn.conectar();
        sql="UPDATE pagos_propiedades SET venta_id, tipo_pago_id, transaccion_no, fecha, monto_pagado WHERE pago_propiedad_id=?";   //Se crea consulta sql para actualizar datos
    
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
    public void del(PagosPropiedades papo) {  //Se realiza consulta de delete para eliminar un registro
    cn.conectar();
    sql = "DELETE FROM pagos_propiedades WHERE pago_propiedad_id=?"; //Se crea consulta sql para eliminar algún registro
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, p.getPago_prop_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en eliminar: " + e); //Comentario en caso de error 
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public void create(PagosPropiedades papo) {   //Se realiza la consulta de insert para agregar un registro
    cn.conectar();
    sql = "INSERT INTO pagos_propiedades VALUES(?,?,?,?,?,?)"; //Se crea la consulta sql para insertar datos de pagos de una propiedad
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
            System.out.println("Error en agregar: " + e); //Comentario que se mostrará en caso de tener un error
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public List<PagosPropiedades> listas() {   //Se realiza consulta de listar para listar los datos que se solicitan
    ArrayList<PagosPropiedades> list = new ArrayList();
    PagosPropiedades p = null;
    
        try {
            cn.conectar();
            sql = "SELECT * FROM pagos_propiedades"; //Se crea consulta de sql para retornar la lista de datos
            run = cn.getconexionDB().prepareStatement(sql);
            r = run.executeQuery();
            
            while(r.next()){
                p.setPago_prop_id(r.getInt("pago_propiedad_id"));
                p.setVenta_id(r.getInt("venta_id"));
                p.setTipo_pago_id(r.getInt("tipo_pago_id"));
                p.setNo_tran(r.getInt("transaccion_no"));
                p.setFecha(r.getDate("fecha"));
                p.setMonto_pagado(r.getDouble("monto_pagado"));
                list.add(p);
            }
            r.close();
        } catch (Exception e) {
            System.out.println("Error al listar en: " + e);  //Comentario para marcar un error en caso de inconveniente
        }finally{
            cn.desconectar();
        }
        return list;  //retornamos la lista

    }


    
}
