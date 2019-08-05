/*
 * cn // conexion a la base de datos
 * result // resultado de metadatos de ResultSet
 * run // instancia de la ejecución
 * v // Objeto de la clase Ventas
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Ventas;

public class DAOVentas implements interfaces.InterfaceVentas {  //Implementamos la clase interface para los métodos abstractos

    // Instancias de las clases
    ConexionDB cn = new ConexionDB();
    private ResultSet rs;
    private PreparedStatement execute;

    // Atributos
    private String sql;
    private String msg;

    @Override
    public Ventas select(int id) {  //Se realiza la consulta de select para ver el registro llamandolo por el detalle_id
        Ventas venta = new Ventas();
        cn.conectar();
        sql = "SELECT * FROM ventas WHERE venta_id = ?"; //Se crea consulta sql para retornar los datos correspondientes al método
        try {
            execute = cn.getconexionDB().prepareStatement(sql);  //Después de ser verificada la conexion, se obtiene la consulta
            execute.setInt(1, id);
            rs = execute.executeQuery();   //Ejecuta la consulta y la almacena
            venta.setVenta_id(rs.getInt("venta_id"));  //Se asigna el valor específico a la variable
            venta.setNumero_factura(rs.getInt("numero_factura"));  //Se asigna el valor específico a la variable
            venta.setSerie(rs.getString("serie")); //Se asigna el valor específico a la variable
            venta.setNit(rs.getInt("nit")); //Se asigna el valor específico a la variable
            venta.setNombre(rs.getString("nombre")); //Se asigna el valor específico a la variable
            venta.setDireccion(rs.getString("direccion")); //Se asigna el valor específico a la variable
            venta.setFecha(rs.getDate("fecha")); //Se asigna el valor específico a la variable
            venta.setTotal(rs.getDouble("total")); //Se asigna el valor específico a la variable
            venta.setTipo_id(rs.getInt("tipo_id")); //Se asigna el valor específico a la variable
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOVentas SELECT: " + e.getMessage());   //Comentario para mostrar un error
        } finally {
            cn.desconectar();
        }
        return venta;
    }
    /**
     * 
     * @param venta  actualizará los datos de un registro especificando por el id
     * @return  retorna un mensaje en caso de que tenga un error
     */
    @Override
    public String update(Ventas venta) { //Se realiza la consulta de update para actualizar algún registro
        cn.conectar();
        sql = "UPDATE ventas SET numero_factura = ?, serie = ?, nit = ?, nombre = ?, direccion = ?, fecha = ?, total = ?, tipo_id = ? WHERE venta_id = ?"; //Se crea consulta sql para actualizar datos

        try {
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(1, venta.getNumero_factura());
            execute.setString(2, venta.getSerie());
            execute.setInt(3, venta.getNit());
            execute.setString(4, venta.getNombre());
            execute.setString(5, venta.getDireccion());
            execute.setDate(6, venta.getFecha());
            execute.setDouble(7, venta.getTotal());
            execute.setInt(8, venta.getTipo_id());
            execute.setInt(9, venta.getVenta_id());
            execute.executeUpdate();
            msg = "Registro actualizado con exito";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Error en DAOVentas UDPATE: " + e.getMessage());  //Comentario que mostrará la ubicación delete error
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    /**
     * 
     * @param id     por medio del id ingresado se eliminará el registro
     * @return  retornará un mensaje en caso de falla
     */
    @Override
    public String delete(int id) {  //Se realiza consulta de delete para eliminar un registro
        cn.conectar();
        sql = "DELETE FROM ventas WHERE venta_id = ?";  //Se crea consulta sql para eliminar algún registro
        try {
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(1, id);
            byte contDel = (byte) execute.executeUpdate();
            if (contDel == 0) {
                msg = "El registro no existe";
            } else {
                msg = "Registro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Error al eliminar el registro";
            System.out.println("Error en eliminar: " + e);  //Mostrará si hay algún problema
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    /**
     * 
     * @param venta  se ingresarán nuevos registro con los datos dados
     * @return retornara un mensaje de falla en caso de que ya exista el registro
     */
    @Override
    public String insert(Ventas venta) {  //Se realiza la consulta de insert para agregar un registro
        cn.conectar();
        sql = "INSERT INTO ventas VALUES(? ,? ,? ,? ,? ,? ,? ,? ,?)";  //Se crea la consulta sql para insertar datos de pagos de una propiedad
        try {
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(1, venta.getVenta_id());
            execute.setInt(2, venta.getNumero_factura());
            execute.setString(3, venta.getSerie());
            execute.setInt(4, venta.getNit());
            execute.setString(5, venta.getNombre());
            execute.setString(6, venta.getDireccion());
            execute.setDate(7, venta.getFecha());
            execute.setDouble(8, venta.getTotal());
            execute.setInt(9, venta.getTipo_id());
            execute.executeUpdate();
            msg = "Registro almacenado con exito";
        } catch (SQLException e) {
            System.out.println("Error en DAOVentas INSERT: " + e.getMessage());  //Comentario que se mostrará en caso de tener un error
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    /**
     * 
     * @return  retorna una lista de los registros de la tabla que se pide a traves de la consulta 
     */
    @Override
    public ArrayList<Ventas> list() {  //Se realiza consulta de listar para listar los datos que se solicitan
        ArrayList<Ventas> list = new ArrayList();
        Ventas venta;

        try {
            cn.conectar();
            sql = "SELECT * FROM ventas"; //Se crea consulta de sql para retornar la lista de datos
            execute = cn.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();

            while (rs.next()) {
                venta = new Ventas();
                venta.setVenta_id(rs.getInt("venta_id"));
                venta.setNumero_factura(rs.getInt("numero_factura"));
                venta.setSerie(rs.getString("serie"));
                venta.setNit(rs.getInt("nit"));
                venta.setNombre(rs.getString("nombre"));
                venta.setDireccion(rs.getString("direccion"));
                venta.setFecha(rs.getDate("fecha"));
                venta.setTotal(rs.getDouble("total"));
                venta.setTipo_id(rs.getInt("tipo_id"));
                list.add(venta);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOVentas LIST: " + e.getMessage());  //Comentario para marcar un error en caso de inconveniente
        } finally {
            cn.desconectar();
        }
        return list;
    }
}
