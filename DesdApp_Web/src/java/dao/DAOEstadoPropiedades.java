/*
 * String msg es usado para mostrar un mensaje de como se realizo una consulta  
 * String sql se utiliza para escribir la consulta SQL
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.EstadosPropiedades;
/**
 * Esta clase es el objeto de acceso a datos para la clase EstadoPropiedades.
 *
 * @author carolina
 */

public class DAOEstadoPropiedades implements interfaces.InterfaceEstadosProp {

    // Instanciamos los objetos
    ConexionDB cx = new ConexionDB();   // Objeto usado para establecer la conexion con la base de datos
    PreparedStatement execute;  // El PreparedStatement se utiliza para asignar datos antes de realizar una consulta SQL 
    ResultSet rs;   // El ResultSet almacena los registros que devuelve la consulta para luego acceder a ellos

    // Atributos
    String sql;
    String msg;

    /**
     * Este metodo es para Ingresar un nuevo registro de EstadosPropiedades
     *
     * @param estado Este parametro es el tipo de objeto que deseamos Ingresar
     * @return retorna un mensaje de confirmación o error en caso de que el id
     * se repita
     */
    @Override
    public String insertEstado(EstadosPropiedades estado) {
        /*
        * Se realiza la consulta para agregar un registro a la tabla
         */
        try {
            cx.conectar();  // Realizamos la conexion a la base de datos
            sql = "INSERT INTO estados_propiedades VALUES(?, ?)";   // Asignamos a la variable sql la consulta
            execute = cx.getconexionDB().prepareStatement(sql); // Asignamos la consulta al PreparedStatement
            execute.setByte(1, estado.getEstadoPropiedadId());  // Asignamos los valores a la consulta
            execute.setString(2, estado.getNombre());
            /**
             * execute.update() es utilizado para ejecutar una consulta y
             * actualizar la base de datos
             */
            execute.executeUpdate();
            msg = "Resgistro almacenado con exito"; // Escribimos un mensaje de que la consulta se realizo con exito
        } catch (SQLException e) {
            msg = "Error al almacenar el registro"; // Escribimos un mensaje de error
            /**
             * .getMessage() se utiliza para obtener un mensaje detallado del
             * objeto Throwable
             */
            System.out.println("Error en DAOEstadosProp INSERT: " + e.getMessage()); // Mostramos un mensaje de error
        } finally {
            cx.desconectar();   // Nos desconectamos de la base de datos
        }
        return msg;
    }

    /**
     * Este metodo es para realizar la Eliminacion de un EstadosPropiedades en
     * base al codigo
     *
     * @param codigo elimina un registro por medio del id ingresado
     * @return retorna un mensaje de confirmación o error en caso de que el
     * registro no exista
     */
    @Override
    public String deleteEstado(byte codigo) {
        /**
         * Se realiza la consulta para borrar un registro de la tabla Nos
         * conectamos a la base de datos, asignamos la consulta al
         * PreparedStatement, asignamos los valores a la consulta y realizamos
         * la consulta. Luego cerramos la conexion
         */
        try {
            cx.conectar();
            sql = "DELETE FROM estados_propiedades WHERE estado_propiedad_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            byte contDel = (byte) execute.executeUpdate(); // La variable contDel verifica que el registro existe
            if (contDel == 0) { // Verificamos si el registro existe
                msg = "El registro no existe";  // escribimos un ensaje de que el registro no existe
            } else {
                msg = "registro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Error al eliminar el registro";
            System.out.println("Error en DAOEstadosProp DELETE: " + e.getMessage());
        } finally {

        }
        return msg;
    }

    /**
     * Este metodo es para realizar la modificacion de EstadosUsuarios en base a
     * los datos.
     *
     * @param estado actualizará el registro que se llama por el id en la consulta
     * @return retornará un mensaje de confirmacion
     */
    @Override
    public String updateEstado(EstadosPropiedades estado) {
        /**
         * Se realiza la consulta para actualizar un registro de la tabla
         */
        try {
            cx.conectar();
            sql = "UPDATE estados_propiedades SET nombre = ? WHERE estado_proiedad_id = ?";
            execute.setByte(2, estado.getEstadoPropiedadId());
            execute.setString(1, estado.getNombre());
            execute.executeUpdate();
            msg = "Registro actualizado con exito";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Error en DAOEstPropiedades UPDATE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

    /**
     * Este metodo es para realizar la consulta de un EstadosPropiedades en base
     * al codigo
     *
     * @param codigo Este parametro es el codigo del elemento que deseamos
     * buscar.
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    
    public EstadosPropiedades selectEstado(byte codigo) {
        /*
        * Se realiza la consulta para seleccionar un registro
        */
        EstadosPropiedades estado = new EstadosPropiedades();// Se crea un nuevo objeto EstadoPropiedades para almacenar el resultado de la busqueda
        try {
            cx.conectar();
            sql = "SELECT * FROM estados_propiedades WHERE estado_propiedad_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            /*
            * Se utiliza el ExecuteQuery para obtener los resultados de la consulta
            * y los asigna al ResutSet para luego acceder a ellos
             */
            rs = execute.executeQuery();
            rs.next(); // Se pasa al  siguiente registro.
            estado.setEstadoPropiedadId(rs.getByte("estado_propiedad_id"));// Se obtienen los valores de los campos y se le asignan al objeto estado
            estado.setNombre(rs.getString("nombre"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOEstPropiedades SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return estado;
    }

     /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondientes a la clase EstadosPropiedades.
     *
     * @return retornará una lista de los registros de la tabla que se pide en
     * la consulta
     */
    @Override
    
    public ArrayList<EstadosPropiedades> listEstados() {
        EstadosPropiedades estados;
        ArrayList<EstadosPropiedades> list = new ArrayList<>();// Utilizamos un ArrayList para obtener todos los registros y almacenarlos
        try {
            cx.conectar();
            sql = "SELECT * FROM estados_propiedades";
            execute = cx.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {// Verifica que hayan mas registros
                estados = new EstadosPropiedades();// Cada vez que pase a un registro nuevo crea un objeto EstadosPropiedades
                estados.setEstadoPropiedadId(rs.getByte("estado_propiedad_id"));
                estados.setNombre(rs.getString("nombre"));
                list.add(estados);// Se agregan los registros al ArrayList
            }
        } catch (SQLException e) {
            System.out.println("Error en DAOEstPropiedades LIST: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return list;

    }
    
}

