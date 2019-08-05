package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Clientes;

public class DAOClientes implements interfaces.InterfaceClientes {

    // Instanciamos las clases
    ConexionDB cx = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    // Atributos
    String sql;
    String msg;

    /**
     * 
     * @param cliente ingresará un nuevo registro 
     * @return  retornará un mensaje de confirmación o error en caso de que el id ya exista en otro registro
     */
    @Override
    public String insertCliente(Clientes cliente) {
        try {
            cx.conectar();
            sql = "INSERT INTO clientes VALUES(?, ?)";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setInt(1, cliente.getClienteId());
            execute.setByte(2, cliente.getClasificacion());
            execute.executeUpdate();
            msg = "Registro almacenado con exito";
        } catch (SQLException e) {
            msg = "Error al almacenar el registro";
            System.out.println("Error en DAOClientes INSERT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }
 
    /**
     * 
     * @param codigo  eliminará el registro por medio de la consulta con el id especifico
     * @return  retornará un mensaje de confirmación o error en caso de que el id no exista
     */
    @Override
    public String deleteClientes(int codigo) {
        try {
            cx.conectar();
            sql = "DELETE FROM clientes WHERE cliente_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setInt(1, codigo);
            byte contDel = (byte) execute.executeUpdate();
            if (contDel == 0) {
                msg = "El registro no existe";
            } else {
                msg = "Registro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Error al eliminar el registro";
            System.out.println("Error en DAOClientes DELETE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

    /**
     * 
     * @param cliente   actualizará los datos de un registro por el id
     * @return  retorna mensaje de confirmacion
     */
    @Override
    public String updateClientes(Clientes cliente) {
        try {
            cx.conectar();
            sql = "UPDATE clientes SET clasificacion_id = ? WHERE cliente_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setInt(2, cliente.getClienteId());
            execute.setByte(1, cliente.getClasificacion());
            execute.executeUpdate();
            msg = "Registro actualizado con exito";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Error en DAOClientes UPDATE: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return msg;
    }

    /**
     * 
     * @param codigo   se buscará un registro por su id
     * @return  se mostrarán los datos del registro
     */
    @Override
    public Clientes selectcliente(int codigo) {
        Clientes cliente = new Clientes();
        try {
            cx.conectar();
            sql = "SELECT * FROM clientes WHERE cliente_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setInt(1, codigo);
            rs = execute.executeQuery();
            rs.next();
            cliente.setClientId(rs.getInt("cliente_id"));
            cliente.setClasificacion(rs.getByte("clasificacion_id"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOClientes SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return cliente;
    }

    /**
     * 
     * @return   retornará una lista de los registros de la tabla que se pidió por medio de la consulta 
     */
    @Override
    public ArrayList<Clientes> listclientes() {
        Clientes clientes;
        ArrayList<Clientes> list = new ArrayList<>();
        try {
            cx.conectar();
            sql = "SELECT * FROM clientes";
            execute = cx.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {
                clientes = new Clientes();
                clientes.setClientId(rs.getInt("cliente_id"));
                clientes.setClasificacion(rs.getByte("clasificacion_id"));
                list.add(clientes);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOClientes LIST: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return list;
    }

}
