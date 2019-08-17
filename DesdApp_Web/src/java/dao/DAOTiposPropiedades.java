/*
 * String msg es usado para mostrar un mensaje de como se realizo una consulta  
 * String sql se utiliza para escribir la consulta SQL
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.TiposPropiedades;

public class DAOTiposPropiedades implements interfaces.InterfaceTiposPropiedades {

    // Instanciamos las clases
    ConexionDB cx = new ConexionDB(); // Objeto usado para establecer la conexion con la base de datos
    PreparedStatement execute;// El PreparedStatement se utiliza para asignar datos antes de realizar una consulta SQL 
    ResultSet rs; // El ResultSet almacena los registros que devuelve la consulta para luego acceder a ellos

    // Atributos
    String sql;
    String msg;

    /**
     * 
     * @param tipo  se ingresa un nuevo registro
     * @return  retorna un mensaje de confirmación o error en caso de que el id se repita
     */
    @Override
    public String insertTipo(TiposPropiedades tipo) {
        /*
        * Se realiza la consulta para agregar un registro a la tabla
         */
        try {
            cx.conectar();// Realizamos la conexion a la base de datos
            sql = "INSERT INTO tipos_propiedades VALUES(?, ?)";// Asignamos a la variable sql la consulta
            execute = cx.getconexionDB().prepareStatement(sql);// Asignamos la consulta al PreparedStatement
            execute.setByte(1, tipo.getTipoPropiedadId());// Asignamos los valores a la consulta
            execute.setString(2, tipo.getNombre());
            /**
             * execute.update() es utilizado para ejecutar una consulta y
             * actualizar la base de datos
             */
            execute.executeUpdate();
            msg = "Registro almacenado con exito";// Escribimos un mensaje de que la consulta se realizo con exito
        } catch (SQLException e) {
             msg = "Error al almacenar el registro"; // Escribimos un mensaje de error
            /**
             * .getMessage() se utiliza para obtener un mensaje detallado del
             * objeto Throwable
             */
            System.out.println("Error en DAOTpPropiedades INSERT: " + e.getMessage());// Escribimos un mensaje de error
        } finally {
            cx.desconectar(); // Nos desconectamos de la base de datos
        }
        return msg;
    }

    /**
     * 
     * @param codigo  elimina un registro por medio del id ingresado 
     * @return  retorna un mensaje de confirmación o error en caso de que el registro no exista
     */
    @Override
    public String deleteTipo(byte codigo) {
        /**
         * Se realiza la consulta para borrar un registro de la tabla Nos
         * conectamos a la base de datos, asignamos la consulta al
         * PreparedStatement, asignamos los valores a la consulta y realizamos
         * la consulta. Luego cerramos la conexion
         */
        try {
            cx.conectar();
            sql = "DELETE FROM tipos_propiedades WHERE tipo_propiedad_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            int contDel = execute.executeUpdate();// La variable contDel verifica que el registro existe
            if (contDel == 0) { // Verificamos si el registro existe
                msg = "El registro no existe"; // escribimos un ensaje de que el registro no existe
            } else {
                msg = "Registro eliminado con exito";
            }
        } catch (SQLException e) {
            System.out.println("Error en DAOTpPropiedades DELETE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

    /**
     * 
     * @param tipo  actualizará el registro que se llama por el id en la consulta
     * @return  retornará un mensaje de confirmacion
     */
    @Override
    public String updateTipo(TiposPropiedades tipo) {
        /**
         * Se realiza la consulta para actualizar un registro de la tabla
         */
        try {
            cx.conectar();
            sql = "UPDATE tipos_propiedades SET nombre = ? WHERE tipo_propiedad_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(2, tipo.getTipoPropiedadId());
            execute.setString(1, tipo.getNombre());
            execute.executeUpdate();
            msg = "Registro actualizado con exito";
        } catch (SQLException e) {
            System.out.println("Error en DAOTpPropiedades UPDATE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }
/**
     * @return el registro que se selecciono
     */
    @Override
    
    public TiposPropiedades selectTipo(byte codigo) {
        /*
        * Se realiza la consulta para seleccionar un registro
        */
        TiposPropiedades tipo = new TiposPropiedades();// Se crea un nuevo objeto TiposPropiedades para almacenar el resultado de la busqueda
        try {
            cx.conectar();
            sql = "SELECT * FROM tipos_propiedades WHERE tipo_propiedad_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            /*
            * Se utiliza el ExecuteQuery para obtener los resultados de la consulta
            * y los asigna al ResutSet para luego acceder a ellos
             */
            rs = execute.executeQuery();
            rs.next();// Se pasa al  siguiente registro.
            tipo.setTipoPropiedadId(rs.getByte("tipo_propiedad_id"));// Se obtienen los valores de los campos y se le asignan al objeto tipo
            tipo.setNombre(rs.getString("nombre"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOTpPropiedades SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return tipo;
    }

    /**
     * 
     * @return  retornará una lista de los registros de la tabla que se pide en la consulta
     */
    @Override
    public ArrayList<TiposPropiedades> listTipos() {
        TiposPropiedades tipo;
        ArrayList<TiposPropiedades> list = new ArrayList<>();
        try {
            cx.conectar();
            sql = "SELECT * FROM tipos_propiedades";
            execute = cx.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {
                tipo = new TiposPropiedades();
                tipo.setTipoPropiedadId(rs.getByte("tipo_propiedad_id"));
                tipo.setNombre(rs.getString("nombre"));
                list.add(tipo);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOTpPropiedades LIST: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return list;
    }

}
