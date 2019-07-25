package dao;
import modelo.DetVentas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAODetVentas implements interfaces.InterfazDetVentas{  //Se implementa la clase de interface para llamar los métodos abstractos
    ConexionDB cn = new ConexionDB();  //Se crea un objeto para la conexion a la base de datos
    private String sql="";   //Se crea variable para la consulta de mysql 
    private ResultSet result;  //Resutados de una consulta sql
    private PreparedStatement run;  //Llamamos al método de ejecución
    private DetVentas dv = new DetVentas();  //Se crea un objeto para la clase modelo "ventas"
    

    @Override
    public DetVentas read(DetVentas ventas) {    //Se realiza la consulta de select para ver el registro llamandolo por el detalle_id
        cn.conectar();  //Abre
        sql="select * from detalles_ventas where detalle_id=?";  //Se crea consulta sql para retornar los datos correspondientes al método
        try {
            run = cn.getconexionDB().prepareStatement(sql); //Después de ser verificada la conexion, se obtiene la consulta
            result = run.executeQuery();  //Ejecuta la consulta y la almacena
            dv.setDetalle_id(result.getInt("detalle_id"));  //Se asigna el valor específico a la variable
            dv.setVenta_id(result.getInt("venta_id"));   //Se asigna el valor específico a la variable
            dv.setNegocio_id(result.getInt("negocio_id"));   //Se asigna el valor específico a la variable
            result.close();  //Cerramos la consulta
        } catch (Exception e) {
            System.out.println("Error al buscar detalle de ventas en: " +e);  //Comentario para mostrar un error
        }finally{
            cn.desconectar();  //Cierra
        }
        return dv;  //retornamos los datos de la tabla
    }

    @Override
    public void create(DetVentas ventas) {   //Se realiza la consulta de insert para agregar un registro
        cn.conectar();
        sql="insert into detalles_ventas values(?,?,?)";  //Se crea consulta sql para retornar los datos correspondientes al método
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, dv.getDetalle_id());
            run.setInt(2, dv.getVenta_id()); 
            run.setInt(3, dv.getNegocio_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en crear detalle de venta en: " + e); //Comentario para mostrar un error
        }finally{
            cn.desconectar();
        }
    }


    @Override
    public void upd(DetVentas ventas) {  //Se realiza la consulta de update para actualizar algún registro
    cn.conectar();
    sql="update detalles_ventas set venta_id, negocio_id where detalle_id=?";  //Se crea una consulta sql para retornar los nuevos datos
    
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, dv.getVenta_id());
            run.setInt(2, dv.getNegocio_id());
            run.setInt(3, dv.getDetalle_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en actualizar detalles de venta: " + e);  //Comentario de error en caso de que haya algún inconveniente 
        }finally{
            cn.desconectar();
        }
    }

    @Override
    public void del(DetVentas ventas) {  //Se realiza consulta de delete para eliminar un registro
    cn.conectar();
    sql = "delete from detalles_ventas where detalle_id=?";  //Se crea consulta sql para retornar la confirmación de la eliminación
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, dv.getDetalle_id());
            run.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en eliminar: " +e);  //Comentario para confirmar o denegar la eliminación
        }finally{
            cn.desconectar();
        }
    }
    
    @Override
    public List<DetVentas> listar() {   //Se realiza consulta de listar para listar los datos que se solicitan
        ArrayList<DetVentas> lista = new ArrayList();
        DetVentas v = null;
    
        try {
        cn.conectar();
        sql ="select * from detalles_ventas";  //Se crea consulta de sql para retornar la lista de datos
        run = cn.getconexionDB().prepareStatement(sql);
        result = run.executeQuery();
        
        while(result.next()){
            v.setDetalle_id(result.getInt("detalle_id"));
            v.setVenta_id(result.getInt("venta_id"));
            v.setNegocio_id(result.getInt("negocio_id"));
            lista.add(v);
        }
        result.close();
        } catch (Exception e) {
            System.out.println("Error al listar en: " + e); //Comentario para marcar un error en caso de inconveniente
        }finally{
            cn.desconectar();
        }
        return lista;   //retornamos la lista
    }
    
    
    
}
