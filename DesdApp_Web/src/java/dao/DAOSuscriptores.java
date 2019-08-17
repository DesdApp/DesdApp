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
        } finally {
            cx.desconectar();
        }
        return msg;
    }

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
