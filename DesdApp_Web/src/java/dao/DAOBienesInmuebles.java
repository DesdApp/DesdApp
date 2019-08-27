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

/**
 * Esta clase es el objeto de acceso a datos para la clase BienesInmuebles.
 *
 * @author carolina
 */
public class DAOBienesInmuebles implements interfaces.InterfaceBienes {

    // Instanciamos las clases
    ConexionDB cx = new ConexionDB();   // Objeto usado para establecer la conexion con la base de datos
    PreparedStatement execute;  // El PreparedStatement se utiliza para asignar datos antes de realizar una consulta SQL 
    ResultSet rs;   // El ResultSet almacena los registros que devuelve la consulta para luego acceder a ellos

    // Atibutos
    String msg;
    String sql;

    /**
     * Este metodo es para Ingresar un nuevo registro de BienesInmuebles
     *
     * @param bien Este parametro es el tipo de objeto que deseamos Ingresar
     * @return retorna un mensaje de confirmación o error en caso de que el id
     * se repita
     */
    @Override
    public String insertBien(BienesInmuebles bien) {
       
        try {
            cx.conectar();  // Realizamos la conexion con la base de datos
            sql = "INSERT INTO bienes_inmuebles VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // Asignamos a la variable sql la consulta
            execute = cx.getconexionDB().prepareStatement(sql); // Asignamos la consulta al PreparedStatement
            execute.setString(1, bien.getInmuebleId());    // Asignamos valores a la consulta
            execute.setByte(2, bien.getTipoPropiedadId());
            execute.setByte(3, bien.getEstadoId());
            execute.setByte(4, bien.getEstadoNegId());
            execute.setInt(5, bien.getClienteId());
            execute.setString(6, bien.getDireccion());
            execute.setInt(7, bien.getZonaId());
            execute.setString(8, bien.getMetrosCuadrados());
            execute.setString(9, bien.getDescripcionMetros());
            execute.setByte(10, bien.getCantCuartos());
            execute.setByte(11, bien.getCantNiveles());
            execute.setByte(12, bien.getSotanos());
            execute.setByte(13, bien.getElevadores());
            execute.setInt(14, bien.getPrecioMinVenta());
            execute.setInt(15, bien.getPrecioSugerido());
            execute.setInt(16, bien.getPrecioReal());
            execute.setInt(17, bien.getCodEmpleado());
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
 /**
     * Este metodo es para realizar la Eliminacion de un BienesInmuebles en
     * base al codigo
     *
     * @param codigo elimina un registro por medio del id ingresado
     * @return retorna un mensaje de confirmación o error en caso de que el
     * registro no exista
     */
    @Override
    public String deleteBien(int codigo) {
       
        try {
            cx.conectar();
            sql = "DELETE FROM bienes_inmuebles WHERE inmueble_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setInt(1, codigo);
            byte contDel = (byte) execute.executeUpdate(); // La variable contDel verifica que el registro existe
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

     /**
     * Este metodo es para realizar la modificacion de BienesInmuebles en base a
     * los datos.
     *
     * @param bien actualizará el registro que se llama por el id en la consulta
     * @return retornará un mensaje de confirmacion
     */
    @Override
    public String updateBien(BienesInmuebles bien) {
        /*
        * Se realiza la consulta para actualizar un registro 
         */
        try {
            cx.conectar();
            sql = "UPDATE bienes_inmuebles SET tipo_propiedad_id = ?, estado_id = ?, "
                    + "estado_neg_id = ?, cliente_id = ?, direccion = ?, zona_id = ?, "
                    + "metros_cuadrados = ?, descripcion_metros = ?, cant_cuartos = ? , "
                    + "cant_niveles = ?, sotanos = ?, elevadores = ?, precio_min_venta = ?, "
                    + "precio_sugerido = ?, precio_real = ?, cod_empleado = ? WHERE inmueble_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setString(17, bien.getInmuebleId());    // Asignamos valores a la consulta
            execute.setByte(1, bien.getTipoPropiedadId());
            execute.setByte(2, bien.getEstadoId());
            execute.setByte(3, bien.getEstadoNegId());
            execute.setInt(4, bien.getClienteId());
            execute.setString(5, bien.getDireccion());
            execute.setInt(6, bien.getZonaId());
            execute.setString(7, bien.getMetrosCuadrados());
            execute.setString(8, bien.getDescripcionMetros());
            execute.setByte(9, bien.getCantCuartos());
            execute.setByte(10, bien.getCantNiveles());
            execute.setByte(11, bien.getSotanos());
            execute.setByte(12, bien.getElevadores());
            execute.setInt(13, bien.getPrecioMinVenta());
            execute.setInt(14, bien.getPrecioSugerido());
            execute.setInt(15, bien.getPrecioReal());
            execute.setInt(16, bien.getCodEmpleado());
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

     /**
     * Este metodo es para realizar la consulta de un BienesInmuebles en base
     * al codigo
     *
     * @param codigo Este parametro es el codigo del elemento que deseamos
     * buscar.
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    
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
            bien.setTipoPropiedadId(rs.getByte("tipo_propiedad_id"));
            bien.setEstadoId(rs.getByte("estado_id"));
            bien.setEstadoNegId(rs.getByte("estado_neg_id"));
            bien.setClienteId(rs.getInt("cliente_id"));
            bien.setDireccion(rs.getString("direccion"));
            bien.setZonaId(rs.getInt("zona_id"));
            bien.setMetrosCuadrados(rs.getString("metros_cuadrados"));
            bien.setDescripcionMetros(rs.getString("descripcion_metros"));
            bien.setCantCuartos(rs.getByte("cant_cuartos"));
            bien.setCantNiveles(rs.getByte("cant_niveles"));
            bien.setSotanos(rs.getByte("sotanos"));
            bien.setElevadores(rs.getByte("elevadores"));
            bien.setPrecioMinVenta(rs.getInt("precio_min_venta"));
            bien.setPrecioSugerido(rs.getInt("precio_sugerido"));
            bien.setPrecioReal(rs.getInt("precio_real"));
            bien.setCodEmpleado(rs.getInt("cod_empleado"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOBienes SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return bien;
    }

    /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondientes a la clase BienesInmuebles.
     *
     * @return retornará una lista de los registros de la tabla que se pide en
     * la consulta
     */
    @Override
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
                bien.setTipoPropiedadId(rs.getByte("tipo_propiedad_id"));
                bien.setEstadoId(rs.getByte("estado_id"));
                bien.setEstadoNegId(rs.getByte("estado_neg_id"));
                bien.setClienteId(rs.getInt("cliente_id"));
                bien.setDireccion(rs.getString("direccion"));
                bien.setZonaId(rs.getByte("zona_id"));
                bien.setMetrosCuadrados(rs.getString("metros_cuadrados"));
                bien.setDescripcionMetros(rs.getString("descripcion_metros"));
                bien.setCantCuartos(rs.getByte("cant_cuartos"));
                bien.setCantNiveles(rs.getByte("cant_niveles"));
                bien.setSotanos(rs.getByte("sotanos"));
                bien.setElevadores(rs.getByte("elevadores"));
                bien.setPrecioMinVenta(rs.getInt("precio_min_venta"));
                bien.setPrecioSugerido(rs.getInt("precio_sugerido"));
                bien.setPrecioReal(rs.getInt("precio_real"));
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

    @Override
    public ArrayList<BienesInmuebles> listView(String prop) {
        ArrayList<BienesInmuebles> viewList = new ArrayList();
        BienesInmuebles b;
        
        try {
            cx.conectar();
            sql="SELECT * FROM view_inmueble where tipopropiedad=?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setString(1, prop);
            rs = execute.executeQuery();
            
            while(rs.next()){
                b = new BienesInmuebles();
                b.setTipoPropiedadId(rs.getByte("tipopropiedad"));
                b.setEstadoNegId(rs.getByte("ventarenta"));
                b.setDireccion(rs.getString("direccion"));
                b.setZonaId(rs.getInt("zona"));
                b.setPrecioSugerido(rs.getInt("precio_sugerido"));
                viewList.add(b);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("error en daolistar: "+ e.getMessage());
        }
        finally{
            cx.desconectar();
        }
        return viewList;
    }

}
