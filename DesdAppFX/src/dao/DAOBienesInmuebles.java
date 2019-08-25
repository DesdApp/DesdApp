/*
 * String msg es usado para mostrar un mensaje de como se realizo una consulta  
 * String sql se utiliza para escribir la consulta SQL
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.BienesInmuebles;

public class DAOBienesInmuebles implements interfaces.InterfaceBienes {

    // Instanciamos las clases
    ConexionDB cx = new ConexionDB();   // Objeto usado para establecer la conexion con la base de datos
    PreparedStatement execute;  // El PreparedStatement se utiliza para asignar datos antes de realizar una consulta SQL 
    ResultSet rs;   // El ResultSet almacena los registros que devuelve la consulta para luego acceder a ellos

    // Atibutos
    String msg;
    String sql;

    @Override
    public String insertBien(BienesInmuebles bien) {
        /*
        * Se realiza la consulta para agregar un registro a la tabla
         */
        try {
            cx.conectar();  // Realizamos la conexion con la base de datos
            sql = "INSERT INTO bienes_inmuebles VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // Asignamos a la variable sql la consulta
            execute = cx.getconexionDB().prepareStatement(sql); // Asignamos la consulta al PreparedStatement
            execute.setString(1, bien.getInmuebleId());    // Asignamos valores a la consulta
            execute.setInt(2, bien.getTipoPropiedadId());
            execute.setInt(3, bien.getEstadoId());
            execute.setInt(4, bien.getEstadoNegId());
            execute.setInt(5, bien.getClienteId());
            execute.setString(6, bien.getDireccion());
            execute.setInt(7, bien.getZonaId());
            execute.setString(8, bien.getMetrosCuadrados());
            execute.setString(9, bien.getDescripcionMetros());
            execute.setInt(10, bien.getCantCuartos());
            execute.setInt(11, bien.getCantNiveles());
            execute.setInt(12, bien.getSotanos());
            execute.setInt(13, bien.getElevadores());
            execute.setInt(14, bien.getPrecioMinVenta());
            execute.setInt(15, bien.getPrecioSugerido());
            execute.setInt(16, bien.getPrecioReal());
            execute.setInt(17, bien.getImageId());
            execute.setInt(18, bien.getCodEmpleado());
            execute.executeUpdate();    // Realizamos la consulta y actualizamos la base de datos
            msg = "Registro almacenado con exito";  // Escribimos un mensaje de que la consulta se realizo con exito
        } catch (SQLException e) {
            msg = "Error al almacenar el registro"; // Escribimos un mensaje de error
            /*
             * .getMessage() se utiliza para obtener un mensaje detallado del objeto Throwable    
             */
            System.out.println("Error en DAOBienesInmuebles INSERT: " + e.getMessage()); // Mostramos un mensaje de error
        } finally {
            cx.desconectar();   // Nos desconectamos de la base de datos
        }
        return msg;
    }

    @Override
    public String deleteBien(int codigo) {
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
            int contDel = execute.executeUpdate(); // La variable contDel verifica que el registro existe
            if (contDel == 0) { // Verificamos si el registro existe
                msg = "El registro no existe";  // escribimos un ensaje de que el registro no existe
            } else {
                msg = "Registro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Error al eliminar el registro";
            System.out.println("Error en DAOBienes DELETE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;

    }

    @Override
    public String updateBien(BienesInmuebles bien) {
        /*
        * Se realiza la consulta para actualizar un registro 
         */
        try {
            cx.conectar();
            sql = "UPDATE bienes_inmuebles SET tipo_propiedad_id = ?, estado_id = ?, "
                    + "estado_neg_id = ?, cliente_id = ?, direccion = ?, zona_id = ?, "
                    + "metro_cuadrados = ?, descripcion_metros = ?, cant_cuartos = ? , "
                    + "cant_niveles = ?, sotanos = ?, elevadores = ?, precio_min_venta = ?, "
                    + "precio_sugerido = ?, precio_real = ?, image_id=?, cod_empleado = ? WHERE inmueble_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setString(18, bien.getInmuebleId());    // Asignamos valores a la consulta
            execute.setInt(1, bien.getTipoPropiedadId());
            execute.setInt(2, bien.getEstadoId());
            execute.setInt(3, bien.getEstadoNegId());
            execute.setInt(4, bien.getClienteId());
            execute.setString(5, bien.getDireccion());
            execute.setInt(6, bien.getZonaId());
            execute.setString(7, bien.getMetrosCuadrados());
            execute.setString(8, bien.getDescripcionMetros());
            execute.setInt(9, bien.getCantCuartos());
            execute.setInt(10, bien.getCantNiveles());
            execute.setInt(11, bien.getSotanos());
            execute.setInt(12, bien.getElevadores());
            execute.setInt(13, bien.getPrecioMinVenta());
            execute.setInt(14, bien.getPrecioSugerido());
            execute.setInt(15, bien.getPrecioReal());
            execute.setInt(16, bien.getImageId());
            execute.setInt(17, bien.getCodEmpleado());
            execute.executeUpdate();
            msg = "Registro actualizado con exito";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Error en DAOBienes UPDATE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;

    }

    @Override
    /**
     * @return el registro que se selecciono
     */
    public BienesInmuebles selectBien(int codigo) {
        /*
        * Se realiza la consulta para seleccionar un registro
         */
        BienesInmuebles bien = new BienesInmuebles(); // Se crea un nuevo objeto Bienes para almacenar el resultado de la busqueda
        try {
            cx.conectar();
            sql = "SELECT * FROM bienes_inmuebles WHERE inmueble_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setInt(1, codigo);
            /*
            * Se utiliza el ExecuteQuery para obtener los resultados de la consulta
            * y los asigna al ResutSet para luego acceder a ellos
             */

            rs = execute.executeQuery();

            rs.next();  // Se pasa al  siguiente registro. En este caso el primero
            bien.setInmuebleId(rs.getString("inmueble_id"));
            bien.setTipoPropiedadId(rs.getInt("tipo_propiedad_id"));
            bien.setEstadoId(rs.getInt("estado_id"));
            bien.setEstadoNegId(rs.getInt("estado_neg_id"));
            bien.setClienteId(rs.getInt("cliente_id"));
            bien.setDireccion(rs.getString("direccion"));
            bien.setZonaId(rs.getInt("zona_id"));
            bien.setMetrosCuadrados(rs.getString("metro_cuadrados"));
            bien.setDescripcionMetros(rs.getString("descripcion_metros"));
            bien.setCantCuartos(rs.getInt("cant_cuartos"));
            bien.setCantNiveles(rs.getInt("cant_niveles"));
            bien.setSotanos(rs.getInt("sotanos"));
            bien.setElevadores(rs.getInt("elevadores"));
            bien.setPrecioMinVenta(rs.getInt("precio_min_venta"));
            bien.setPrecioSugerido(rs.getInt("precio_sugerido"));
            bien.setPrecioReal(rs.getInt("precio_real"));
            bien.setImageId(rs.getInt("image_id"));
            bien.setCodEmpleado(rs.getInt("cod_empleado"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOBienes SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return bien;
    }

    @Override
    /**
     * @return los registros de la tabla
     */
    public ArrayList<BienesInmuebles> listBienes() {
        ArrayList<BienesInmuebles> list = new ArrayList<>(); // Utilizamos un ArrayList para obtener todos los registros y almacenarlos
        BienesInmuebles bien;
        try {
            cx.conectar();
            sql = "SELECT * FROM bienes_inmuebles";
            execute = cx.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) { // Verifica que hayan mas registros
                bien = new BienesInmuebles();    // Cada vez que pase a un registro nuevo crea un objeto Bienes
                bien.setInmuebleId(rs.getString("inmueble_id"));
                bien.setTipoPropiedadId(rs.getInt("tipo_propiedad_id"));
                bien.setEstadoId(rs.getInt("estado_id"));
                bien.setEstadoNegId(rs.getInt("estado_neg_id"));
                bien.setClienteId(rs.getInt("cliente_id"));
                bien.setDireccion(rs.getString("direccion"));
                bien.setZonaId(rs.getInt("zona_id"));
                bien.setMetrosCuadrados(rs.getString("metro_cuadrados"));
                bien.setDescripcionMetros(rs.getString("descripcion_metros"));
                bien.setCantCuartos(rs.getInt("cant_cuartos"));
                bien.setCantNiveles(rs.getInt("cant_niveles"));
                bien.setSotanos(rs.getInt("sotanos"));
                bien.setElevadores(rs.getInt("elevadores"));
                bien.setPrecioMinVenta(rs.getInt("precio_min_venta"));
                bien.setPrecioSugerido(rs.getInt("precio_sugerido"));
                bien.setPrecioReal(rs.getInt("precio_real"));
                bien.setImageId(rs.getInt("image_id"));
                bien.setCodEmpleado(rs.getInt("cod_empleado"));
                list.add(bien); // Se agregan los registros al ArrayList
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOBienes LIST: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return list;
    }

}
