/*  
* String msg es usado para mostrar un mensaje de como se realizo una consulta  
* String sql se utiliza para escribir la consulta SQL
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Bienes;

public class DAOBienes implements interfaces.InterfazBienes {

    // Instanciamos las clases
    ConexionDB cx = new ConexionDB();   // Objeto usado para establecer la conexion con la base de datos
    PreparedStatement execute;  // El PreparedStatement se utiliza para asignar datos antes de realizar una consulta SQL 
    ResultSet rs;   // El ResultSet almacena los registros que devuelve la consulta para luego acceder a ellos

    // Atibutos
    String msg;
    String sql;

    @Override
    public void insertBien(Bienes bien) {
        try {
            cx.conectar();  // Realizamos la conexion con la base de datos
            sql = "INSERT INTO bienes_inmuebles VALUES(?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?)"; // Asignamos a la variable sql la consulta
            execute = cx.getconexionDB().prepareStatement(sql); // Asignamos la consulta al PreparedStatement
            execute.setInt(1, bien.getInmuebleId());    // Asignamos valores a la consulta
            execute.setString(2, bien.getDireccion());
            execute.setByte(3, bien.getZona());
            execute.setInt(4, bien.getMuniId());
            execute.setString(5, bien.getMetrosCuadrados());
            execute.setString(6, bien.getDescripcion());
            execute.setFloat(7, bien.getPrecioMetroCuadrado());
            execute.setByte(8, bien.getTipoPropiedadId());
            execute.setByte(9, bien.getEstadoPropiedadId());
            execute.setInt(10, bien.getPropietarioId());
            execute.setFloat(11, bien.getPrecio());
            execute.setFloat(12, bien.getPrecioMinVenta());
            execute.setInt(13, bien.getPersonaId());
            execute.executeUpdate();    // Realizamos la consulta y actualizamos la base de datos
            msg = "Registro almacenado con exito";  // Escribimos un mensaje de que la consulta se realizo con exito
        } catch (SQLException e) {
            msg = "Error al almacenar el registro"; // Escribimos un mensaje de error
            /*
        * .getMessage() se utiliza para obtener un mensaje detallado del objeto Throwable    
             */
            System.out.println("Error en DAOBienes INSERT: " + e.getMessage()); // Mostramos un mensaje de error
        } finally {
            cx.desconectar();   // Nos desconectamos de la base de datos
        }
    }

    @Override
    public void deleteBien(int codigo) {
        /*
        * Se realiza la consulta para borrar un registro de la tabla
        * Nos conectamos a la base de datos, asignamos la consulta al PreparedStatement, asignamos los valores a la consulta
        * y realizamos la consulta. Luego cerramos la conexion
         */
        try {
            cx.conectar();
            sql = "DELETE FROM bienes_inmuebles WHERE inmueble_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setInt(1, codigo);
            byte contDel = (byte) execute.executeUpdate(); // La variable contDel es utilizada para verificar que el registro existe y se elimino
            if (contDel == 0) { // Verificamos si el registro existe
                msg = "El registro no existe";  // escribimos un ensaje de que el registro no existe
            } else {
                msg = "registro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Error al eliminar el registro";
            System.out.println("Error en DAOBienes DELETE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
    }

    @Override
    public void updateBien(Bienes bien) {
        /*
        * Se realiza la consulta para actualizar un registro 
         */
        try {
            cx.conectar();
            sql = "UPDATE bienes_inmuebles SET direccion = ?, zona = ?, "
                    + "muni_id = ?, metros_cuadrados = ?, descripcion = ?, "
                    + "precio_metro_cuadrado = ?, tipo_propiedad_id = ?, "
                    + "estado_propiedad_id = ?, propietario_id = ?, precio = ?, "
                    + "precio_min_venta = ?, persona_id = ? WHERE inmueble_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setInt(13, bien.getInmuebleId());
            execute.setString(1, bien.getDireccion());
            execute.setByte(2, bien.getZona());
            execute.setInt(3, bien.getMuniId());
            execute.setString(4, bien.getMetrosCuadrados());
            execute.setString(5, bien.getDescripcion());
            execute.setFloat(6, bien.getPrecioMetroCuadrado());
            execute.setByte(7, bien.getTipoPropiedadId());
            execute.setByte(8, bien.getEstadoPropiedadId());
            execute.setInt(9, bien.getPropietarioId());
            execute.setFloat(10, bien.getPrecio());
            execute.setFloat(11, bien.getPrecioMinVenta());
            execute.setInt(12, bien.getPersonaId());
            execute.executeUpdate();
            msg = "Registro actualizado con exito";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Error en DAOBienes UPDATE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
    }

    @Override
    public void selectBien(int codigo) {
            Bienes bien = new Bienes();
            try {
            
        } catch (Exception e) {
        }
    }

    @Override
    public ArrayList<Bienes> listBienes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
