package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Suscriptores;

public class DAOSuscriptores implements interfaces.InterfaceSuscriptores {

//    Instanciasmos las clases
    ConexionDB cx = new ConexionDB();
    PreparedStatement exe;
    ResultSet rs;

//    Atributos
    String msg;
    String sql;

    @Override
    public String insertSuscriptor(Suscriptores suscriptor) {
        try {
            cx.conectar();
            sql = "INSERT INTO suscriptores VALUES(?, ?, ?)";
            exe = cx.getconexionDB().prepareStatement(sql);
            exe.setInt(1, suscriptor.getSuscriptorId());
            exe.setString(2, suscriptor.getNombre());
            exe.setString(3, suscriptor.getCorreo());
            exe.executeUpdate();
            msg = "Registro almacenado con exito";
        } catch (SQLException e) {
            msg = "Error al almacenar el registro";
            System.out.println("Error en DAOSuscriptores INSERT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

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
        }
    }

    @Override
    public Suscriptores selectSuscriptor(int suscriptorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Suscriptores> listSuscriptores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
