package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Clientes;

public class DAOClientes implements interfaces.InterfaceClientes {

    // Instanciamos las clases
    ConexionDB cx = new ConexionDB();
    PreparedStatement exe;
    ResultSet rs;

    // Atributos
    String sql;
    String msg;

    /**
     *
     * @param cliente ingresará un nuevo registro
     * @return retornará un mensaje de confirmación o error en caso de que el id
     * ya exista en otro registro
     */
    @Override
    public String insertCliente(Clientes cliente) {
        try {
            cx.conectar();
            sql = "INSERT INTO clientes VALUES(?, ?, ?, ?, ?)";
            exe = cx.getconexionDB().prepareStatement(sql);
            exe.setInt(1, cliente.getClienteId());
            exe.setInt(2, cliente.getPersonaId());
            exe.setString(3, cliente.getNombreTitular());
            exe.setString(4, cliente.getUser());
            exe.setString(5, cliente.getPassword());
            exe.executeUpdate();
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
     * @param codigo eliminará el registro por medio de la consulta con el id
     * especifico
     * @return retornará un mensaje de confirmación o error en caso de que el id
     * no exista
     */
    @Override
    public String deleteClientes(int codigo) {
        try {
            cx.conectar();
            sql = "DELETE FROM clientes WHERE cliente_id = ?";
            exe = cx.getconexionDB().prepareStatement(sql);
            exe.setInt(1, codigo);
            byte contDel = (byte) exe.executeUpdate();
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
     * @param cliente actualizará los datos de un registro por el id
     * @return retorna mensaje de confirmacion
     */
    @Override
    public String updateClientes(Clientes cliente) {
        try {
            cx.conectar();
            sql = "UPDATE clientes SET persona_id = ?, nombre_titular = ?,"
                    + " user = ?, password = ? WHERE cliente_id = ?";
            exe = cx.getconexionDB().prepareStatement(sql);
            exe.setInt(5, cliente.getClienteId());
            exe.setInt(1, cliente.getPersonaId());
            exe.setString(2, cliente.getNombreTitular());
            exe.setString(3, cliente.getUser());
            exe.setString(4, cliente.getPassword());
            exe.executeUpdate();
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
     * @param codigo se buscará un registro por su id
     * @return se mostrarán los datos del registro
     */
    @Override
    public Clientes selectcliente(int codigo) {
        Clientes cliente = new Clientes();
        try {
            cx.conectar();
            sql = "SELECT * FROM clientes WHERE cliente_id = ?";
            exe = cx.getconexionDB().prepareStatement(sql);
            exe.setInt(1, codigo);
            rs = exe.executeQuery();
            rs.next();
            cliente.setClienteId(rs.getInt("cliente_id"));
            cliente.setPersonaId(rs.getInt("persona_id"));
            cliente.setNombreTitular(rs.getString("nombre_titular"));
            cliente.setUser(rs.getString("user"));
            cliente.setPassword(rs.getString("password"));
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
     * @return retornará una lista de los registros de la tabla que se pidió por
     * medio de la consulta
     */
    @Override
    public ArrayList<Clientes> listclientes() {
        Clientes clientes;
        ArrayList<Clientes> list = new ArrayList<>();
        try {
            cx.conectar();
            sql = "SELECT * FROM clientes";
            exe = cx.getconexionDB().prepareStatement(sql);
            rs = exe.executeQuery();
            while (rs.next()) {
                clientes = new Clientes();
                clientes.setClienteId(rs.getInt("cliente_id"));
                clientes.setPersonaId(rs.getInt("persona_id"));
                clientes.setNombreTitular(rs.getString("nombre_titular"));
                clientes.setUser(rs.getString("user"));
                clientes.setPassword(rs.getString("password"));
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

    @Override
    public int validar(Clientes clin) {
        try {
            cx.conectar();
            
            sql = "SELECT * FROM clientes WHERE user=? AND password=?";
            exe=cx.getconexionDB().prepareStatement(sql);
            exe.setString(1, clin.getUser());
            exe.setString(2, clin.getPassword());
            rs=exe.executeQuery();
            
            if(rs.next()){
                return 1;
            }

        } catch (SQLException e) {

            System.out.println("Error: "+e.getMessage());
        }finally{
            cx.desconectar();
        }
        return 0;
        }
    

}
