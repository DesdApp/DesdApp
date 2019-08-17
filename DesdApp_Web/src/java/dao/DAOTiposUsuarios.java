package dao;

import modelo.TiposUsuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOTiposUsuarios implements interfaces.InterfaceTiposUsuarios {

    ConexionDB cn = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    String msg;
    String sql;

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
        return msg;
    }

    @Override
    public String deleteTipoUsario(int codigo) {
        try {
            cn.conectar();
            sql = "DELETE FROM tipos_usuarios WHERE tipo_usuario_id=?";
            execute = cn.getconexionDB().prepareStatement(sql);
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
            cn.desconectar();
        }
        return msg;
    }

    @Override
    public String updateTipoUsario(TiposUsuarios tipo) {
        try {
            cn.conectar();
            sql = "UPDATE tipos_usuarios SET nombre = ? WHERE tipo_usuario_id = ?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setByte(2, tipo.getTipoUsuarioId());
            execute.setString(1, tipo.getNombre());
            execute.executeUpdate();
            msg = "Registro actualizado";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Eror en DAOTipoUsuario UPDATE: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    @Override
    public TiposUsuarios selectTipoUsuario(byte codigo) {
        TiposUsuarios tipo = new TiposUsuarios();
        try {
            cn.conectar();
            sql = "SELECT * FROM tipos_usuarios WHERE tipo_usuario_id = ?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            rs = execute.executeQuery();
            rs.next();
            tipo.setTipoUsuarioId(rs.getByte("tipo_usuario_id"));
            tipo.setNombre(rs.getString("nombre"));
            rs.close();
            System.out.println("Se realizo el SELECT con exito" +rs);
        } catch (SQLException e) {
            System.out.println("Error en DAOTipoUsuario SELECT: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return tipo;
    }

    @Override
    public ArrayList<TiposUsuarios> list() {
        ArrayList<TiposUsuarios> list;
        TiposUsuarios tipo;
        list = new ArrayList();
        try {
            cn.conectar();
            sql = "SELECT * FROM tipos_usuarios";
            execute = cn.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {
                tipo = new TiposUsuarios();
                tipo.setTipoUsuarioId(rs.getByte("tipo_usuario_id"));
                tipo.setNombre(rs.getString("nombre"));
               
                
                list.add(tipo);
            }
            
        } catch (SQLException e) {
            System.out.println("Error en DAOTipoUsuario List: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return list;
    }
}
