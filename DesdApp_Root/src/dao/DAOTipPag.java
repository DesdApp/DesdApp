/*
 * cn // conexion a la base de datos
 * r // metadatos de resultSet
 * run // instancia de la ejecución
 * t // objeto de la clase TiposPagos
 */
package dao;

import modelo.TiposPagos;
import interfaces.InterfazTipPagos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOTipPag implements interfaces.InterfazTipPagos{  //Implementamos la clase interface para los métodos abstractos

    ConexionDB cn = new ConexionDB();
    private String sql="";
    private ResultSet r;
    private PreparedStatement run;
    private TiposPagos t = new TiposPagos();
    
    
    @Override
    public TiposPagos read(TiposPagos tp){ //Se realiza la consulta de select para ver el registro llamandolo por el detalle_id
        cn.conectar();
        sql = "select * from tipos_pagos where tipo_pago_id=?"; //Se crea consulta sql para retornar los datos correspondientes al método
        try {
            run = cn.getconexionDB().prepareStatement(sql);  //Después de ser verificada la conexion, se obtiene la consulta
            r = run.executeQuery(); //Ejecuta la consulta y la almacena
            t.setTipo_pago_id(r.getInt("tipo_pago_id")); //Se asigna el valor específico a la variable
            t.setNombre(r.getString("nombre"));  //Se asigna el valor específico a la variable
            r.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar tipo de pago en : " +e);  //Comentario para mostrar un error
        }finally{
            cn.desconectar();
        }
        return t;
    }

    @Override
    public void create(TiposPagos tp) {  //Se realiza la consulta de insert para agregar un registro
    cn.conectar();
    sql = "insert into tipos_pagos values(?,?)";  //Se crea la consulta sql para insertar datos de pagos de una propiedad
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, t.getTipo_pago_id());
            run.setString(2, t.getNombre());
            run.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al ingresar tipo de pago en: " + e);  //Comentario que se mostrará en caso de tener un error
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public void upd(TiposPagos tp) { //Se realiza la consulta de update para actualizar algún registro
    cn.conectar();
    sql = "update tipos_pagos set nombre where tipo_pago_id=?";  //Se crea consulta sql para actualizar datos
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setString(1, t.getNombre());
            run.setInt(2, t.getTipo_pago_id());
            run.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar tipo de pago en: " + e);  //Comentario que mostrará la ubicación del error
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public void del(TiposPagos tp) { //Se realiza consulta de delete para eliminar un registro
    cn.conectar();
    sql = "delete from tipos_pagos where tipo_pago_id=?"; //Se crea consulta sql para eliminar algún registro
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, t.getTipo_pago_id());
            run.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar en: " + e);  //Mostrará el error en caso de que pase, primero Dios no 
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public List<TiposPagos> listar() {   //Se realiza consulta de listar para listar los datos que se solicitan
        ArrayList<TiposPagos> list = new ArrayList();
        TiposPagos p;
        
        try {
            cn.conectar();
            sql = "select * from tipos_pagos"; //Se crea consulta de sql para retornar la lista de datos
            run = cn.getconexionDB().prepareStatement(sql);
            r = run.executeQuery();
            
            while(r.next()){
                p = new TiposPagos();
                p.setTipo_pago_id(r.getInt("tipo_pago_id"));
                p.setNombre(r.getString("nombre"));
                list.add(p);
            }
            r.close();
        } catch (SQLException e) {
            System.out.println("Error al listar en: " + e);  //Comentario para marcar un error en caso de inconveniente
        }finally{
            cn.desconectar();
        }
        return list;
    }
    
    
}
