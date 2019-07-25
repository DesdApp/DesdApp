package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.TiposPropiedades;

public class DAOTpPropiedades implements interfaces.InterfaceTpPropiedades {

    // Instanciamos las clases
    ConexionDB cx = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    // Atributos
    String sql;
    String msg;

    @Override
    public String insertTipo(TiposPropiedades tipo) {
        try {
            cx.conectar();
            sql = "INSERT INTO tipos_propiedades VALUES(?, ?)";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, tipo.getTipoPropiedadId());
            execute.setString(2, tipo.getNombre());
            execute.executeUpdate();
            msg = "Registro almacenado con exito";
        } catch (SQLException e) {
            System.out.println("Error en DAOTpPropiedades INSERT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

    @Override
    public String deleteTipo(byte codigo) {
        try {
            cx.conectar();
            sql = "DELETE FROM tipos_propiedades WHERE tipo_propiedad_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            int contDel = execute.executeUpdate();
            if (contDel == 0) {
                msg = "El registro no existe";
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

    @Override
    public String updateTipo(TiposPropiedades tipo) {
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

    @Override
    public TiposPropiedades selectTipo(byte codigo) {
        TiposPropiedades tipo = new TiposPropiedades();
        try {
            cx.conectar();
            sql = "SELECT * FROM tipos_propiedades WHERE tipo_propiedad_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            rs = execute.executeQuery();
            rs.next();
            tipo.setTipoPropiedadId(rs.getByte("tipo_propiedad_id"));
            tipo.setNombre(rs.getString("nombre"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOTpPropiedades SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return tipo;
    }

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
        } catch (SQLException e) {
            System.out.println("Error en DAOTpPropiedades LIST: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return list;
    }

}
