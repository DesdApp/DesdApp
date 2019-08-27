package dao;

import modelo.TiposUsuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Esta clase es el objeto de acceso a datos para la clase TiposUsuarios.
 *
 * @author carolina
 */
public class DAOTiposUsuarios implements interfaces.InterfaceTiposUsuarios {

    //Instancia de las clases
    ConexionDB cn = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;
//Atributos
    String msg;
    String sql;

    /**
     * Este metodo es para Ingresar un nuevo Registro de TiposUsuarios
     *
     * @param tipo Este parametro es el tipo de objeto que deseamos Ingresar.
     * @return Nos retorna la consulta en un mensaje.
     */
    @Override
    public String insertTipoUsario(TiposUsuarios tipo) {
        try {
            cn.conectar();  // Realizamos la conexion con la base de datos
            sql = "INSERT INTO tipos_usuarios VALUES(?, ?)"; // Asignamos a la variable sql la consulta
            execute = cn.getconexionDB().prepareStatement(sql); // Asignamos la consulta al PreparedStatement
            execute.setByte(1, tipo.getTipoUsuarioId());
            execute.setString(2, tipo.getNombre());
            execute.executeUpdate();    // Realizamos la consulta y actualizamos la base de datos
            msg = "Registro almacenado con exito";  // Escribimos un mensaje de que la consulta se realizo con exito
        } catch (SQLException e) {
            msg = "Error al almacenar el registro"; // Escribimos un mensaje de error
            /*
             * .getMessage() se utiliza para obtener un mensaje detallado del objeto Throwable
             */
            System.out.println("Error en DAOTipoUsuario INSERT: " + e.getMessage()); // Mostramos un mensaje de error
        } finally {
            cn.desconectar();   // Nos desconectamos de la base de datos
        }
        //Retorna 
        return msg;
    }

    /**
     * Este metodo es para realizar la Eliminacion de un TipoUsurio en base al
     * codigo
     *
     * @param codigo Este parametro es el codigo del elemento que vamos a
     * Eliminar.
     * @return retorna el objeto obtenido de nuestra consulta.
     */
    @Override
    public String deleteTipoUsario(int codigo) {
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datso
            sql = "DELETE FROM tipos_usuarios WHERE tipo_usuario_id=?";
            //Prepara la consulta en la base de datos
            execute = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos.
            execute.setInt(1, codigo);
            byte contDEL = (byte) execute.executeUpdate();
            if (contDEL == 0) {
                msg = "El registro no existe";
            } else {
                msg = "Registro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Ocurrio un error al trata de eliminar el registro";
            System.out.println("Error en DAOTipoUsuario DELETE: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos.
            cn.desconectar();
        }
        //Retorna el mensaje del resultado.
        return msg;
    }

    /**
     * Este metodo es para realizar la modificacion de TiposUsuarios en la base
     * de datos.
     *
     * @param tipo Este parametro es el tipo de elemento que deseamos modificar.
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    public String updateTipoUsario(TiposUsuarios tipo) {
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "UPDATE tipos_usuarios SET nombre = ? WHERE tipo_usuario_id = ?";
            //Prepara la consulta en al base de datos.
            execute = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos.
            execute.setByte(2, tipo.getTipoUsuarioId());
            execute.setString(1, tipo.getNombre());
            //Realiza la consulta y muestra los datos de la base de datos
            execute.executeUpdate();
            msg = "Registro actualizado";
        } catch (SQLException e) {
            //Mensaje Por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            msg = "Error al actualizar el registro";
            System.out.println("Eror en DAOTipoUsuario UPDATE: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retrona el mensaje.
        return msg;
    }

    /**
     * Este metodo es para realizar la consulta de un TiposUsuarios en base al codigo.
     *
     * @param codigo Este parametro es el codigo del elemento que deseamos
     * buscar.
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    public TiposUsuarios selectTipoUsuario(byte codigo) {
        //Se crea un objeto de tipo TiposUsuarios
        TiposUsuarios tipo = new TiposUsuarios();
        try {
            //Se conecta a la base de datos.
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "SELECT * FROM tipos_usuarios WHERE tipo_usuario_id = ?";
            //Prepara la consulta en la base de datos.
            execute = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos.
            execute.setByte(1, codigo);
            //Realiza la consulta y muestra los datos de la base de datos
            rs = execute.executeQuery();
            //Visualiza la consulta 
            rs.next();
            tipo.setTipoUsuarioId(rs.getByte("tipo_usuario_id"));
            tipo.setNombre(rs.getString("nombre"));
            rs.close();
            System.out.println("Se realizo el SELECT con exito" + rs);
        } catch (SQLException e) {
            //Mensaje Por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error en DAOTipoUsuario SELECT: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos.
            cn.desconectar();
        }
        //Tetorna la consulta en un un objeto tipo.
        return tipo;
    }

    /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondientes a la clase TiposUsuarios.
     *
     * @return Este metodo retorna un ArrayList de TiposUsuarios.
     */
    @Override
    public ArrayList<TiposUsuarios> list() {
        //Crea un objeto tipo ArrayList
        ArrayList<TiposUsuarios> list;
        //Crea un objeto de tipo  TiposUsutios
        TiposUsuarios tipo;
        //Inicializa El Arraylist
        list = new ArrayList();
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "SELECT * FROM tipos_usuarios";
            //Prepara la consulta en la base de datos
            execute = cn.getconexionDB().prepareStatement(sql);
            //Realiza la consulta en la base de datos.
            rs = execute.executeQuery();
            //Visualiza la consulta
            while (rs.next()) {
                //Cada vez que pase a un registro nuevo crea un objeto tipo.
                tipo = new TiposUsuarios();
                tipo.setTipoUsuarioId(rs.getByte("tipo_usuario_id"));
                tipo.setNombre(rs.getString("nombre"));

                list.add(tipo);
            }

        } catch (SQLException e) {
            //Mensaje Por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error en DAOTipoUsuario List: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion de la lista.
        return list;
    }
}
