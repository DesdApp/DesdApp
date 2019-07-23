/*
 * cn // conexion a la base de datos
 * result // resultado de metadatos de ResultSet
 * run // instancia de la ejecución
 * v // Objeto de la clase Venta
 */
package dao;

import interfaces.interfazVenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Venta;

public class DAOVenta implements interfazVenta{  //Implementamos la clase interface para los métodos abstractos
    ConexionDB cn = new ConexionDB();
    private String sql="";
    private ResultSet result;
    private PreparedStatement run;
    private Venta v = new Venta();
    
    
    @Override
    public Venta read(Venta venta) {  //Se realiza la consulta de select para ver el registro llamandolo por el detalle_id
        cn.conectar();
        sql="select * from ventas where venta_id=?"; //Se crea consulta sql para retornar los datos correspondientes al método
        try {
            run = cn.getconexionDB().prepareStatement(sql);  //Después de ser verificada la conexion, se obtiene la consulta
            result = run.executeQuery();   //Ejecuta la consulta y la almacena
            v.setVenta_id(result.getInt("venta_id"));  //Se asigna el valor específico a la variable
            v.setNumero_factura(result.getInt("numero_factura"));  //Se asigna el valor específico a la variable
            v.setSerie(result.getString("serie")); //Se asigna el valor específico a la variable
            v.setNit(result.getInt("nit")); //Se asigna el valor específico a la variable
            v.setNombre(result.getString("nombre")); //Se asigna el valor específico a la variable
            v.setDireccion(result.getString("direccion")); //Se asigna el valor específico a la variable
            v.setFecha(result.getDate("fecha")); //Se asigna el valor específico a la variable
            v.setTotal(result.getDouble("total")); //Se asigna el valor específico a la variable
            v.setTipo_id(result.getInt("tipo_id")); //Se asigna el valor específico a la variable
            result.close();
        } catch (Exception e) {
            System.out.println("Error al buscar ventas en: " +e);   //Comentario para mostrar un error
        }finally{
            cn.desconectar();
        }
        return v;
    }

    @Override
    public void upd(Venta venta) { //Se realiza la consulta de update para actualizar algún registro
        cn.conectar();
        sql="update ventas set numero_factura, serie, nit, nombre, direccion, fecha, total, tipo_id where venta_id=?"; //Se crea consulta sql para actualizar datos
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, v.getNumero_factura());
            run.setString(2, v.getSerie());
            run.setInt(3, v.getNit());
            run.setString(4, v.getNombre());
            run.setString(5, v.getDireccion());
            run.setDate(6, v.getFecha());
            run.setDouble(7, v.getTotal());
            run.setInt(8, v.getTipo_id()); 
            run.setInt(9, v.getVenta_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en actualizar detalles de venta: " + e);  //Comentario que mostrará la ubicación del error
        }finally{
            cn.desconectar();
        }    
    }

    @Override
    public void del(Venta venta) {  //Se realiza consulta de delete para eliminar un registro
        cn.conectar();
    sql = "delete from ventas where venta_id=?";  //Se crea consulta sql para eliminar algún registro
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, v.getVenta_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en eliminar: " +e);  //Mostrará si hay algún problema
        }finally{
            cn.desconectar();
        }
    }
    

    @Override
    public void create(Venta venta) {  //Se realiza la consulta de insert para agregar un registro
            cn.conectar();
        sql="insert into ventas values(?,?,?,?,?,?,?,?,?)";  //Se crea la consulta sql para insertar datos de pagos de una propiedad
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
            System.out.println("Error en crear detalle de venta en: " + e);  //Comentario que se mostrará en caso de tener un error
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public List<Venta> listas() {  //Se realiza consulta de listar para listar los datos que se solicitan
            ArrayList<Venta> lista = new ArrayList();
            Venta v = null;
    
        try {
        cn.conectar();
        sql ="select * from ventas"; //Se crea consulta de sql para retornar la lista de datos
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
            System.out.println("Error al listar en: " + e);  //Comentario para marcar un error en caso de inconveniente
        }finally{
            cn.desconectar();
        }
        return lista;
    }
    }

