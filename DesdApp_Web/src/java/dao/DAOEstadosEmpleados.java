package dao;

import modelo.EstadosEmpleados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Esta clase es el objeto de acceso a datos para la clase EstadosEmpleados.
 *
 * @author carolina
 */
public class DAOEstadosEmpleados implements interfaces.InterfaceEstadosEmpleados {

    //Instancias de clases
    ConexionDB cn = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    //Declaracion de Atributos
    String msg;
    String sql;

    /**
     * Este metodo es para Ingresar un nuevo registro de EstadosEmpleados
     *
     * @param estadoEmp Este parametro es el tipo de objeto que deseamos Ingresar
     * @return retorna un mensaje de confirmación o error en caso de que el id
     * se repita
     */
    @Override
    public String insert(EstadosEmpleados estadoEmp) {
        try {
            cn.conectar();  // Realizamos la conexion con la base de datos
            sql = "INSERT INTO estados_empleados VALUES(?, ?)"; // Asignamos a la variable sql la consulta
            execute = cn.getconexionDB().prepareStatement(sql); // Asignamos la consulta al PreparedStatement
            execute.setByte(1, estadoEmp.getEstadoEmpleadoId());
            execute.setString(2, estadoEmp.getNombre());
            execute.executeUpdate();    // Realizamos la consulta y actualizamos la base de datos
            msg = "Registro almacenado con exito";  // Escribimos un mensaje de que la consulta se realizo con exito
        } catch (SQLException e) {
            msg = "Error al almacenar el registro"; // Escribimos un mensaje de error
            /*
             * .getMessage() se utiliza para obtener un mensaje detallado del objeto Throwable
             */
            System.out.println("Error en DAOEstadoEmp INSERT: " + e.getMessage()); // Mostramos un mensaje de error
        } finally {
            cn.desconectar();   // Nos desconectamos de la base de datos
        }
        return msg;
    }

    /**
     * Este metodo es para realizar la Eliminacion de un EstadosEmpleados en
     * base al codigo
     *
     * @param codigo elimina un registro por medio del id ingresado
     * @return retorna un mensaje de confirmación o error en caso de que el
     * registro no exista
     */
    @Override
    public String delete(int codigo) {
        try {
            cn.conectar();
            sql = "DELETE FROM estado_empleados WHERE estado_empleado_id = ?";
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
            System.out.println("Error en DAOEstadoEmp DELETE: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    /**
     * Este metodo es para realizar la modificacion de EstadosEmpleados en base a
     * los datos.
     *
     * @param estadoEmp actualizará el registro que se llama por el id en la consulta
     * @return retornará un mensaje de confirmacion
     */
    @Override
    public String update(EstadosEmpleados estadoEmp) {
        try {
            cn.conectar();
            sql = "UPDATE estado_empleados SET nombre = ? WHERE estado_empleado_id = ?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setByte(2, estadoEmp.getEstadoEmpleadoId());
            execute.setString(1, estadoEmp.getNombre());
            execute.executeUpdate();
            msg = "Registro actualizado";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Eror en DAOEstadoEmp UPDATE: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    /**
     * Este metodo es para realizar la consulta de un EstadosEmpleados en base
     * al codigo
     *
     * @param codigo Este parametro es el codigo del elemento que deseamos
     * buscar.
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    public EstadosEmpleados select(int codigo) {
        EstadosEmpleados estado = new EstadosEmpleados();
        try {
            cn.conectar();
            sql = "SELECT * FROM estados_empleados WHERE estado_empleado_id = ?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(1, codigo);
            rs = execute.executeQuery();
            rs.next();
            estado.setEstadoEmpleadoId(rs.getByte("estado_empleado_id"));
            estado.setNombre(rs.getString("nombre"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOEstadoEmp SELECT: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return estado;
    }

    /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondientes a la clase EstadosEmpleados.
     *
     * @return retornará una lista de los registros de la tabla que se pide en
     * la consulta
     */
    @Override
    public ArrayList<EstadosEmpleados> list() {
        ArrayList<EstadosEmpleados> list = new ArrayList<>();
        EstadosEmpleados estado;
        try {
            cn.conectar();
            sql = "SELECT * FROM estados_empleados";
            execute = cn.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {
                estado = new EstadosEmpleados();
                estado.setEstadoEmpleadoId(rs.getByte("estado_empleado_id"));
                estado.setNombre(rs.getString("nombre"));
                list.add(estado);
            }
        } catch (SQLException e) {
            System.out.println("Error en DAOEstadoEmp List: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return list;
    }
}
