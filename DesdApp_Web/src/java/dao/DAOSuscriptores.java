package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Suscriptores;

/**
 * Esta clase es el objeto de acceso a datos para la clase Suscriptores.
 *
 * @author carolina
 */
public class DAOSuscriptores implements interfaces.InterfaceSuscriptores {

//    Instanciasmos las clases
    ConexionDB cx = new ConexionDB();
    PreparedStatement exe;
    ResultSet rs;

//    Atributos
    String msg;
    String sql;

    /**
     * Este metodo es para Ingresar un nuevo registo de tipo Suscriptor
     *
     * @param suscriptor Este parametro es el tipo de objeto que queremos
     * ingresar.
     * @return Retorna la consulta en un mensaje.
     */
    @Override
    public String insertSuscriptor(Suscriptores suscriptor) {
        try {
            //Se conecta a la base de datos
            cx.conectar();
            //Envia la consulta en la base de datos
            sql = "INSERT INTO suscriptores VALUES(?, ?, ?)";
            //Prepara la consulta en la base de datos.
            exe = cx.getconexionDB().prepareStatement(sql);
            //Ejecuata la consulta en la base de datos.
            exe.setInt(1, suscriptor.getSuscriptorId());
            //Realiza la consulta y actualia la base de datos
            exe.setString(2, suscriptor.getNombre());
            exe.setString(3, suscriptor.getCorreo());
            exe.executeUpdate();
            //Mensaje para verificar que la consulta se realizo con exito.
            msg = "Registro almacenado con exito";
        } catch (SQLException e) {
            msg = "Error al almacenar el registro";
            //.getMessage() se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error en DAOSuscriptores INSERT: " + e.getMessage());
        } finally {
            //se desconecta de la base de datos
            cx.desconectar();
        }
        //Retorna el mensaje de la consulta.
        return msg;
    }

    /**
     * Este metodo es para realizar la Eliminacion de un Suscriptor en bae al
     * suscriptorId
     *
     * @param suscriptorId Este parametro es el codigo del elemento que vamos a
     * Eliminar.
     * @return Retorna el objeto obtenido de nuestra consulta.
     */
    @Override
    public String deleteSuscriptor(int suscriptorId) {
        try {
            cx.conectar();
            sql = "DELETE FROM suscriptores WHERE suscriptor_id = ?";
            exe = cx.getconexionDB().prepareStatement(sql);
            exe.setInt(1, suscriptorId);
            byte contDel = (byte) exe.executeUpdate();
            if (contDel == 0) {
                msg = "El registro no existe";
            } else {
                msg = "Registro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Error al eliminar el registro";
            System.out.println("Error en DAOSuscriptores DELETE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

    /**
     * Este metodo es para realizar la modificacion de Suscriptores en la base
     * de datos.
     *
     * @param suscriptor Este metodo es el tipo de elemento que deseamos
     * modificar.
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    public String updateSuscriptor(Suscriptores suscriptor) {
        try {
            cx.conectar();
            sql = "UPDATE suscriptores SET nombre = ?, correo = ? WHERE suscriptor_id = ?";
            exe = cx.getconexionDB().prepareStatement(sql);
            exe.setInt(3, suscriptor.getSuscriptorId());
            exe.setString(1, suscriptor.getNombre());
            exe.setString(2, suscriptor.getCorreo());
            msg = "Registro actualizado con exito";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Error en DAOSuscriptores UPDATE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

    /**
     *Este metodo es para realizar la consulta de un Suscriptor en bae al 
     * susriptorId
     * @param suscriptorId Este parametro es el codigo del elemento que deseamos
     * buscar
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    public Suscriptores selectSuscriptor(int suscriptorId) {
        Suscriptores sub = new Suscriptores();
        try {
            cx.conectar();
            sql = "SELECT * FROM suscriptores WHERE suscriptor_id";
            exe = cx.getconexionDB().prepareStatement(sql);
            exe.setInt(1, suscriptorId);
            rs = exe.executeQuery();
            rs.next();
            sub.setSuscriptorId(rs.getInt("suscriptor_id"));
            sub.setNombre(rs.getString("nombre"));
            sub.setCorreo(rs.getString("correo"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOSuscriptores SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return sub;
    }
    /**
     * Este metodo es para obtener todos los registro de la base de datos
     * correspondietes a la clase Suscriptores.
     * @return  Este metodo retorna un ArrayList de tipo Suscriptores.
     */
    @Override
    public ArrayList<Suscriptores> listSuscriptores() {
        Suscriptores subs;
        ArrayList<Suscriptores> list = new ArrayList<>();
        try {
            cx.conectar();
            sql = "SELECT * FROM suscriptores WHERE suscriptor_id";
            exe = cx.getconexionDB().prepareStatement(sql);
            rs = exe.executeQuery();
            while (rs.next()) {
                subs = new Suscriptores();
                subs.setSuscriptorId(rs.getInt("suscriptor_id"));
                subs.setNombre(rs.getString("nombre"));
                subs.setCorreo(rs.getString("correo"));
                list.add(subs);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOSuscriptores LIST: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return list;
    }

}
