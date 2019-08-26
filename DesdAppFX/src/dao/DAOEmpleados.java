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

public class DAOEmpleados implements interfaces.InterfaceEmpleados {

    ConexionDB cn = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    String msg;
    String sql;

    @Override
    public String insert(Empleados empleado) {
        try {
            cn.conectar();  // Realizamos la conexion con la base de datos
            sql = "INSERT INTO empleados VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // Asignamos a la variable sql la consulta
            execute = cn.getconexionDB().prepareStatement(sql); // Asignamos la consulta al PreparedStatement
            execute.setInt(1, empleado.getEmpleadoId());
            execute.setInt(2, empleado.getPersonaId());
            execute.setInt(3, empleado.getTipoUsuarioId());
            execute.setString(4, empleado.getPuesto());
            execute.setDate(5, empleado.getFechaInicio());
            execute.setDate(6, empleado.getFechaFinalizacion());
            execute.setString(7, empleado.getUser());
            execute.setString(8, empleado.getPassword());
            execute.setInt(9, empleado.getImageId());
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

    @Override
    public String delete(int codigo) {
        try {
            cn.conectar();
            sql = "DELETE FROM empleados WHERE empleado_id = ?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(1, codigo);
            int contDEL = execute.executeUpdate();
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

    @Override
    public String update(Empleados empleado) {
        try {
            cn.conectar();
            sql = "UPDATE empleados SET persona_id=?, tipo_usario_id=?, puesto=?, fecha_inicio=?, fecha_finalizacion=?, user=?, password=?, image_id=?, estado_emp_id=? WHERE empleado_id = ?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(10, empleado.getEmpleadoId());
            execute.setInt(1, empleado.getPersonaId());
            execute.setInt(2, empleado.getTipoUsuarioId());
            execute.setString(3, empleado.getPuesto());
            execute.setDate(4, empleado.getFechaInicio());
            execute.setDate(5, empleado.getFechaFinalizacion());
            execute.setString(6, empleado.getUser());
            execute.setString(7, empleado.getPassword());
            execute.setInt(8, empleado.getImageId());
            execute.setInt(9, empleado.getEstadoEmpleadoId());
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
            empleados.setPersonaId(rs.getInt("persona_id"));
            empleados.setTipoUsuarioId(rs.getInt("tipo_usuario_id"));
            empleados.setPuesto(rs.getString("puesto"));
            empleados.setFechaInicio(rs.getDate("fecha_inicio"));
            empleados.setFechaFinalizacion(rs.getDate("fecha_finalizacion"));
            empleados.setUser(rs.getString("user"));
            empleados.setPassword(rs.getString("password"));
            empleados.setImageId(rs.getInt("image_id"));
            empleados.setEstadoEmpleadoId(rs.getInt("estado_empleado_id"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOEmpleado SELECT: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return empleados;
    }

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
                empleados.setEmpleadoId(rs.getInt("empleado_id"));
                empleados.setPersonaId(rs.getInt("persona_id"));
                empleados.setTipoUsuarioId(rs.getInt("tipo_usuario_id"));
                empleados.setPuesto(rs.getString("puesto"));
                empleados.setFechaInicio(rs.getDate("fecha_inicio"));
                empleados.setFechaFinalizacion(rs.getDate("fecha_finalizacion"));
                empleados.setUser(rs.getString("user"));
                empleados.setPassword(rs.getString("password"));
                empleados.setImageId(rs.getInt("image_id"));
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
