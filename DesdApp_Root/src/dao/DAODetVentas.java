package dao;

import modelo.DetallesVentas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAODetVentas implements interfaces.InterfaceDetVentas {  //Se implementa la clase de interface para llamar los métodos abstractos

    // Instancias de las clases
    ConexionDB cn = new ConexionDB();  //Se crea un objeto para la conexion a la base de datos
    private ResultSet rs;  //Resutados de una consulta sql
    private PreparedStatement run;  //Llamamos al método de ejecución

    // Atributos
    private String sql;   //Se crea variable para la consulta de mysql 
    private String msg;

    @Override
    public DetallesVentas select(DetallesVentas det) {    //Se realiza la consulta de select para ver el registro llamandolo por el detalle_id
        DetallesVentas detalle = new DetallesVentas();
        try {
            cn.conectar();  //Abre
            sql = "SELECT * FROM detalles_ventas WHERE detalle_id = ?";  //Se crea consulta sql para retornar los datos correspondientes al método
            run.setInt(1, det.getDetalle_id());
            run = cn.getconexionDB().prepareStatement(sql); //Después de ser verificada la conexion, se obtiene la consulta
            rs = run.executeQuery();  //Ejecuta la consulta y la almacena
            det.setDetalle_id(rs.getInt("detalle_id"));  //Se asigna el valor específico a la variable
            det.setVenta_id(rs.getInt("venta_id"));   //Se asigna el valor específico a la variable
            det.setNegocio_id(rs.getInt("negocio_id"));   //Se asigna el valor específico a la variable
            rs.close();  //Cerramos la consulta
        } catch (SQLException e) {
            System.out.println("Error en DAODetVentas SELECT: " + e.getMessage());  //Comentario para mostrar un error
        } finally {
            cn.desconectar();  //Cierra
        }
        return detalle;  //retornamos los datos de la tabla
    }

    @Override
    public String insert(DetallesVentas det) {   //Se realiza la consulta de insert para agregar un registro
        cn.conectar();
        sql = "INSERT INTO detalles_ventas VALUES(?,?,?)";  //Se crea consulta sql para retornar los datos correspondientes al método
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, det.getDetalle_id());
            run.setInt(2, det.getVenta_id());
            run.setInt(3, det.getNegocio_id());
            run.executeUpdate();
            msg = "Registro almacenado con exito";
        } catch (SQLException e) {
            msg = "Error al almacenar el registro";
            System.out.println("Error en DAODetVentas INSERT: " + e.getMessage()); //Comentario para mostrar un error
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    @Override
    public String update(DetallesVentas det) {  //Se realiza la consulta de update para actualizar algún registro
        cn.conectar();
        sql = "UPDATE detalles_ventas SET venta_id = ?, negocio_id = ? WHERE detalle_id = ?";  //Se crea una consulta sql para retornar los nuevos datos

        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, det.getVenta_id());
            run.setInt(2, det.getNegocio_id());
            run.setInt(3, det.getDetalle_id());
            run.executeUpdate();
            msg = "Registro actualizado con exito";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Error en DAODetVentas UPDATE: " + e.getMessage());  //Comentario de error en caso de que haya algún inconveniente 
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    @Override
    public String delete(DetallesVentas det) {  //Se realiza consulta de delete para eliminar un registro
        cn.conectar();
        sql = "DELETE FROM detalles_ventas WHERE detalle_id = ?";  //Se crea consulta sql para retornar la confirmación de la eliminación
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, det.getDetalle_id());
            byte contDel = (byte) run.executeUpdate();
            if (contDel == 0) {
                msg = "El registro no existe";
            } else {
                msg = "Registro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Error al eliminar el registro";
            System.out.println("Error en DAODetVentas DELETE: " + e.getMessage());  //Comentario para confirmar o denegar la eliminación
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    @Override
    public ArrayList<DetallesVentas> list() {   //Se realiza consulta de list para list los datos que se solicitan
        ArrayList<DetallesVentas> list = new ArrayList();
        DetallesVentas venta;

        try {
            cn.conectar();
            sql = "SELECT * FROM detalles_ventas";  //Se crea consulta de sql para retornar la lista de datos
            run = cn.getconexionDB().prepareStatement(sql);
            rs = run.executeQuery();
            while (rs.next()) {
                venta = new DetallesVentas();
                venta.setDetalle_id(rs.getInt("detalle_id"));
                venta.setVenta_id(rs.getInt("venta_id"));
                venta.setNegocio_id(rs.getInt("negocio_id"));
                list.add(venta);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAODetVentas LIST" + e.getMessage()); //Comentario para marcar un error en caso de inconveniente
        } finally {
            cn.desconectar();
        }
        return list;   //retornamos la lista
    }

}
