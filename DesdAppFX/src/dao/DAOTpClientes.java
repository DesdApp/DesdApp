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
    
    /**
     * 
     * @param codigo   por medio de una consulta buscará un registro de la base de datos
     * @return retornará los datos de la consulta
     */
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
    
    /**
     * 
     * @return   retornará una lista de los registros 
     */

    @Override
    public ArrayList<TiposClientes> listTipos() {
        TiposClientes tipos;
        ArrayList<TiposClientes> list = new ArrayList<>();
        try {
            cx.conectar();
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
