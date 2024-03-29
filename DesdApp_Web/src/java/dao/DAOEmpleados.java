/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Empleados;

/**
 * Esta clase es el objeto de acceso a datos para la clase Empleados.
 *
 * @author carolina
 */
public class DAOEmpleados implements interfaces.InterfaceEmpleados {

    //Instancia de clases
    ConexionDB cn = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    //Atributos
    String msg;
    String sql;

    /**
     * Este metodo es para Ingresar un nuevo registro de Empleados
     *
     * @param empleado Este parametro es el tipo de objeto que deseamos Ingresar
     * @return retorna un mensaje de confirmación o error en caso de que el id
     * se repita
     */
    @Override
    public String insert(Empleados empleado) {
        try {
            cn.conectar();  // Realizamos la conexion con la base de datos
            sql = "INSERT INTO empleados VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // Asignamos a la variable sql la consulta
            execute = cn.getconexionDB().prepareStatement(sql); // Asignamos la consulta al PreparedStatement
            execute.setInt(1, empleado.getPersonaId());
            execute.setInt(2, empleado.getEmpleadoId());
            execute.setString(3, empleado.getPuesto());
            execute.setDate(4, empleado.getFechaInicio());
            execute.setDate(5, empleado.getFechaFinalizacion());
            execute.setDouble(6, empleado.getSueldo());
            execute.setString(7, empleado.getUser());
            execute.setString(8, empleado.getPassword());
            execute.setInt(9, empleado.getTipoUsuarioId());
            execute.setInt(10, empleado.getEstadoEmpleadoId());
            execute.executeUpdate();    // Realizamos la consulta y actualizamos la base de datos
            msg = "Registro almacenado con exito";  // Escribimos un mensaje de que la consulta se realizo con exito
        } catch (SQLException e) {
            msg = "Error al almacenar el registro"; // Escribimos un mensaje de error
            /*
             * .getMessage() se utiliza para obtener un mensaje detallado del objeto Throwable
             */
            System.out.println("Error en DAOEmpleado INSERT: " + e.getMessage()); // Mostramos un mensaje de error
        } finally {
            cn.desconectar();   // Nos desconectamos de la base de datos
        }
        return msg;
    }

    /**
     * Este metodo es para realizar la Eliminacion de un Empleados en
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
            sql = "DELETE FROM empleados WHERE empleado_id = ?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(1, codigo);
            byte contDEL = (byte) execute.executeUpdate();
            if (contDEL == 0) {
                msg = "El registro no existe";
            } else {
                msg = "Registro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Ocurrio un error al tratar de eliminar el registro";
            System.out.println("Error en DAOEmpelado DELETE: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    /**
     * Este metodo es para realizar la modificacion de Empleados en base a
     * los datos.
     *
     * @param empleado actualizará el registro que se llama por el id en la consulta
     * @return retornará un mensaje de confirmacion
     */
    @Override
    public String update(Empleados empleado) {
        try {
            cn.conectar();
            sql = "UPDATE empleados SET puesto = ?, fecha_inicio = ?, fecha_finalizacion = ?, sueldo = ?, user = ?, password = ?, tipo_usuario_id = ?, estado_empleado_id = ? WHERE empleado_id = ?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(9, empleado.getEmpleadoId());
            execute.setString(1, empleado.getPuesto());
            execute.setDate(2, empleado.getFechaInicio());
            execute.setDate(3, empleado.getFechaFinalizacion());
            execute.setDouble(4, empleado.getSueldo());
            execute.setString(5, empleado.getUser());
            execute.setString(6, empleado.getPassword());
            execute.setInt(7, empleado.getTipoUsuarioId());
            execute.setInt(8, empleado.getEstadoEmpleadoId());
            execute.executeUpdate();
            msg = "Registro actualizado";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Eror en DAOEmpleado UPDATE: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    /**
     * Este metodo es para realizar la consulta de un Empleados en base
     * al codigo
     *
     * @param codigo Este parametro es el codigo del elemento que deseamos
     * buscar.
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    public Empleados select(int codigo) {
        Empleados empleados = new Empleados();
        try {
            cn.conectar();
            sql = "SELECT * FROM empleados WHERE empleado_id=?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(1, codigo);

            rs = execute.executeQuery();

            rs.next();
            empleados.setEmpleadoId(rs.getInt("empleado_id"));
            empleados.setPuesto(rs.getString("puesto"));
            empleados.setFechaInicio(rs.getDate("fecha_inicio"));
            empleados.setFechaFinalizacion(rs.getDate("fecha_finalizacion"));
            empleados.setSueldo(rs.getInt("sueldo"));
            empleados.setUser(rs.getString("user"));
            empleados.setPassword(rs.getString("password"));
            empleados.setTipoUsuarioId(rs.getInt("tipo_usuario_id"));
            empleados.setEstadoEmpleadoId(rs.getInt("estado_empleado_id"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOEmpleado SELECT: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return empleados;
    }

    /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondientes a la clase Empleados.
     *
     * @return retornará una lista de los registros de la tabla que se pide en
     * la consulta
     */
    @Override
    public ArrayList<Empleados> lits() {
        ArrayList<Empleados> list = new ArrayList<>();
        Empleados empleados;
        try {
            cn.conectar();
            sql = "SELECT * FROM empleados";
            execute = cn.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {
                empleados = new Empleados();
                empleados.setPersonaId(rs.getInt("persona_id"));
                empleados.setEmpleadoId(rs.getInt("empleado_id"));
                empleados.setPuesto(rs.getString("puesto"));
                empleados.setFechaInicio(rs.getDate("fecha_inicio"));
                empleados.setFechaFinalizacion(rs.getDate("fecha_finalizacion"));
                empleados.setSueldo(rs.getDouble("sueldo"));
                empleados.setUser(rs.getString("user"));
                empleados.setPassword(rs.getString("password"));
                empleados.setTipoUsuarioId(rs.getInt("tipo_usuario_id"));
                empleados.setEstadoEmpleadoId(rs.getInt("estado_empleado_id"));
                list.add(empleados);
            }
        } catch (SQLException e) {
            System.out.println("Error en DAOEmpleado List: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return list;
          }

}
