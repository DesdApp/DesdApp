package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.TiposClientes;

public class DAOTpClientes implements interfaces.InterfaceTpClientes {

    // Instanciamos las clases
    ConexionDB cx = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    // Atributos
    String msg;
    String sql;

    @Override
    public String insertTipo(TiposClientes tipo) {
        try {
            cx.conectar();
            sql = "INSERT INTO tipos_clientes VALUES(?, ?, ?)";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, tipo.getTipoClienteId());
            execute.setString(2, tipo.getNombre());
            execute.setString(3, tipo.getDescripcion());
            execute.executeUpdate();
            msg = "Registro almacenado con exito";
        } catch (SQLException e) {
            msg = "Error al almacenar el registro";
            System.out.println("Error en DAOTpClientes INSERT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

    @Override
    public String deleteTipo(byte codigo) {
        try {
            cx.conectar();
            sql = "DELETE FROM tipos_clientes WHERE tipo_cliente_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            byte contDel = (byte) execute.executeUpdate();
            if (contDel == 0) {
                msg = "El registro no existe";
            } else {
                msg = "Registro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Error al eliminar el registro";
            System.out.println("Error en DAOTpClientes DELETE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

    @Override
    public String updateTipo(TiposClientes tipo) {
        try {
            cx.conectar();
            sql = "UPDATE tipos_clientes SET nombre = ?, descripcion = ? WHERE tipo_cliente_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(3, tipo.getTipoClienteId());
            execute.setString(1, tipo.getNombre());
            execute.setString(2, tipo.getDescripcion());
            execute.executeUpdate();
            msg = "Registro actualizado con exito";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Error en DAOTpClientes UPDATE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

    @Override
    public TiposClientes selectTipo(byte codigo) {
        TiposClientes tipo = new TiposClientes();
        try {
            cx.conectar();
            sql = "SELECT * FROM tipos_clientes WHERE tipo_cliente_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            rs = execute.executeQuery();
            rs.next();
            tipo.setTipoClienteId(rs.getByte("tipo_cliente_id"));
            tipo.setNombre(rs.getString("nombre"));
            tipo.setDescripcion(rs.getString("descripcion"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOTpClientes SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return tipo;
    }

    @Override
    public ArrayList<TiposClientes> listTipos() {
        TiposClientes tipos;
        ArrayList<TiposClientes> list = new ArrayList<>();
        try {
            sql = "SELECT * FROM tipos_clientes";
            execute = cx.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {
                tipos = new TiposClientes();
                tipos.setTipoClienteId(rs.getByte("tipo_cliente_id"));
                tipos.setNombre(rs.getString("nombre"));
                tipos.setDescripcion(rs.getString("descripcion"));
                list.add(tipos);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOTpClientes LIST: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return list;
    }

}
