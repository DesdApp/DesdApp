/*
 * String msg es usado para mostrar un mensaje de como se realizo una consulta  
 * String sql se utiliza para escribir la consulta SQL
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.EstadoBienInmueble;

/**
 * Esta clase es el objeto de acceso a datos para la clase EstadoBienInmueble.
 *
 * @author carolina
 */

public class DAOEstadoBienInmueble implements interfaces.InterfaceEstadoBienInmueble {

    // Instanciamos los objetos
    ConexionDB cx = new ConexionDB();   // Objeto usado para establecer la conexion con la base de datos
    PreparedStatement execute;  // El PreparedStatement se utiliza para asignar datos antes de realizar una consulta SQL 
    ResultSet rs;   // El ResultSet almacena los registros que devuelve la consulta para luego acceder a ellos

    // Atributos
    String sql;
    String msg;

    /**
     * Este metodo es para realizar la consulta de un EstadoBienInmueble en base
     * al codigo
     *
     * @param codigo Este parametro es el codigo del elemento que deseamos
     * buscar.
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    
    public EstadoBienInmueble selectEstado(byte codigo) {
        /*
        * Se realiza la consulta para seleccionar un registro
        */
        EstadoBienInmueble estado = new EstadoBienInmueble();// Se crea un nuevo objeto EstadoPropiedades para almacenar el resultado de la busqueda
        try {
            cx.conectar();
            sql = "SELECT * FROM estado_bien_inmueble WHERE estado_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            /*
            * Se utiliza el ExecuteQuery para obtener los resultados de la consulta
            * y los asigna al ResutSet para luego acceder a ellos
             */
            rs = execute.executeQuery();
            rs.next(); // Se pasa al  siguiente registro.
            estado.setEstadoId(rs.getByte("estado_id"));// Se obtienen los valores de los campos y se le asignan al objeto estado
            estado.setNombre(rs.getString("nombre"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOEstadoBienInmuble SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return estado;
    }

    /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondientes a la clase EstadoBienInmueble.
     *
     * @return retornará una lista de los registros de la tabla que se pide en
     * la consulta
     */
    @Override
    
    public ArrayList<EstadoBienInmueble> listEstados() {
        EstadoBienInmueble estados;
        ArrayList<EstadoBienInmueble> list = new ArrayList<>();// Utilizamos un ArrayList para obtener todos los registros y almacenarlos
        try {
            cx.conectar();
            sql = "SELECT * FROM estado_bien_inmueble";
            execute = cx.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {// Verifica que hayan mas registros
                estados = new EstadoBienInmueble();// Cada vez que pase a un registro nuevo crea un objeto EstadoBienInmueble
                estados.setEstadoId(rs.getByte("estado_id"));
                estados.setNombre(rs.getString("nombre"));
                list.add(estados);// Se agregan los registros al ArrayList
            }
        } catch (SQLException e) {
            System.out.println("Error en DAOEstadoBienInmuble LIST: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return list;

    }
    
}

