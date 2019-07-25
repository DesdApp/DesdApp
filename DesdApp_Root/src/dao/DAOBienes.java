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

public class DAOBienes implements interfaces.InterfaceBienes {

    // Instanciamos las clases
    ConexionDB cx = new ConexionDB();   // Objeto usado para establecer la conexion con la base de datos
    PreparedStatement execute;  // El PreparedStatement se utiliza para asignar datos antes de realizar una consulta SQL 
    ResultSet rs;   // El ResultSet almacena los registros que devuelve la consulta para luego acceder a ellos

    // Atibutos
    String msg;
    String sql;

    @Override
    public String insertBien(Bienes bien) {
        /*
        * Se realiza la consulta para agregar un registro a la tabla
        */
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
            byte contDel = (byte) execute.executeUpdate(); // La variable contDel verifica que el registro existe
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
        return msg;

    }

    @Override
    public String updateBien(Bienes bien) {
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
        return msg;

    }

    @Override
    /**
     * @return el registro que se selecciono
     */
    public Bienes selectBien(int codigo) {
        /*
        * Se realiza la consulta para seleccionar un registro
         */
        Bienes bien = new Bienes(); // Se crea un nuevo objeto Bienes para almacenar el resultado de la busqueda
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
            bien.setInmuebleId(rs.getInt("inmueble_id"));   // Se obtienen los valores de los campos y se le asignan al objeto bien
            bien.setDireccion(rs.getString("direccion"));
            bien.setZona(rs.getByte("zona"));
            bien.setMuniId(rs.getInt("muni_id"));
            bien.setMetrosCuadrados(rs.getString("metros_cuadrados"));
            bien.setDescripcion(rs.getString("descripcion"));
            bien.setPrecioMetroCuadrado(rs.getFloat("precio_metro_cuadrado"));
            bien.setTipoPropiedadId(rs.getByte("tipo_propiedad_id"));
            bien.setEstadoPropiedadId(rs.getByte("estado_propiedad_id"));
            bien.setPropietarioId(rs.getInt("propietario_id"));
            bien.setPrecio(rs.getFloat("precio"));
            bien.setPrecioMinVenta(rs.getFloat("precio_min_venta"));
            bien.setPersonaId(rs.getInt("persona_id"));
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
    public ArrayList<Bienes> listBienes() {
        ArrayList<Bienes> list = new ArrayList<>(); // Utilizamos un ArrayList para obtener todos los registros y almacenarlos
        Bienes bien;
        try {
            cx.conectar();
            sql = "SELECT * FROM bienes_inmuebles";
            execute = cx.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) { // Verifica que hayan mas registros
                bien = new Bienes();    // Cada vez que pase a un registro nuevo crea un objeto Bienes
                bien.setInmuebleId(rs.getInt("inmueble_id"));
                bien.setDireccion(rs.getString("direccion"));
                bien.setZona(rs.getByte("zona"));
                bien.setMuniId(rs.getInt("muni_id"));
                bien.setMetrosCuadrados(rs.getString("metros_cuadrados"));
                bien.setDescripcion(rs.getString("descripcion"));
                bien.setPrecioMetroCuadrado(rs.getFloat("precio_metro_cuadrado"));
                bien.setTipoPropiedadId(rs.getByte("tipo_propiedad_id"));
                bien.setEstadoPropiedadId(rs.getByte("estado_propiedad_id"));
                bien.setPropietarioId(rs.getInt("propietario_id"));
                bien.setPrecio(rs.getFloat("precio"));
                bien.setPrecioMinVenta(rs.getFloat("precio_min_venta"));
                bien.setPersonaId(rs.getInt("persona_id"));
                rs.close();
                list.add(bien); // Se agregan los registros al ArrayList
            }
        } catch (SQLException e) {
            System.out.println("Error en DAOBienes LIST: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return list;
    }

}
