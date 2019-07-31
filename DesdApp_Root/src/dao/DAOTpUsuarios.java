package dao;

import modelo.TpUsuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOTpUsuarios implements interfaces.InterfaceTpUsuarios {

    ConexionDB cn = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    String msg;
    String sql;

    //<editor-fold defaultstate="collapsed" desc="Seleccionar TipoUsuario">
    /**
     * Este metodo es para realizar la consulta de un Tipo Usuario en base al
     * codigo
     *
     * @param codigo Este parametro es el codigo del elemento que debemos buscar
     * @return Retorna el objeto obtenido de nuestra consulta.
     */
    @Override
    public TpUsuarios selectTipoUsuario(byte codigo) {
        TpUsuarios tipo = new TpUsuarios();
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
            System.out.println("Se realizo el SELECT con exito" + rs);
        } catch (SQLException e) {
            System.out.println("Error en DAOTipoUsuario SELECT: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return tipo;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Listar TiposUsuarios">
    /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondientes a la clase Tipos Usuarios.
     *
     * @return Este metodo retorna un ArrayList de tipo TioposUsuarios.
     */
    @Override
    public ArrayList<TpUsuarios> list() {
        ArrayList<TpUsuarios> list;
        TpUsuarios tipo;
        list = new ArrayList();
        try {
            cn.conectar();
            sql = "SELECT * FROM tipos_usuarios";
            execute = cn.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {
                tipo = new TpUsuarios();
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
//</editor-fold>

}
