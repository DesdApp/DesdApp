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

public class DAOEstPropiedades implements interfaces.InterfaceEstadosProp {

    // Instanciamos los objetos
    ConexionDB cx = new ConexionDB();   // Objeto usado para establecer la conexion con la base de datos
    PreparedStatement execute;  // El PreparedStatement se utiliza para asignar datos antes de realizar una consulta SQL 
    ResultSet rs;   // El ResultSet almacena los registros que devuelve la consulta para luego acceder a ellos

    // Atributos
    String sql;
    String msg;

    //<editor-fold defaultstate="collapsed" desc="Seleccionar Estado Propiedades">
    /**
     * Este parametro es par realizar la consulta de un tipo de Estado Propiedades
     * en base al codigo.
     * @param codigo Este parametro es el codigo del elemento que deseamos buscar.
     * @return  Retorna el objeto obtenido en la consulta.
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
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Listar Estado de Propiedades">
    /**
     * Este metodo es para obtener todos los registros de la base de datos correspondites
     * a la clase EstadoPropiedades
     * @return  Este metodo retorna un ArrayList de tipo Estado Propiedades.
     */
    
    @Override
    /**
     * @return los registros de la tabla
     */
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
//</editor-fold>

   

    
    
}

