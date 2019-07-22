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
import modelo.Empleado;

public class DAOEmpelado implements interfaces.InterfazEmpleado {

    ConexionDB cn = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    String msg;
    String sql;

    @Override
    public void insertEmpleado(Empleado empleado) {
        try {
            cn.conectar();  // Realizamos la conexion con la base de datos
            sql = "INSERT INTO empleados VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // Asignamos a la variable sql la consulta
            execute = cn.getconexionDB().prepareStatement(sql); // Asignamos la consulta al PreparedStatement
            execute.setInt(1, empleado.getPersona_id());
            execute.setInt(2, empleado.getEmpleado_id());
            execute.setString(3, empleado.getPuesto());
            execute.setString(4, empleado.getFecha_inicio());
            execute.setString(5, empleado.getFecha_finalizacion());
            execute.setDouble(6, empleado.getSueldo());
            execute.setString(7, empleado.getUser());
            execute.setString(8, empleado.getPassword());
            execute.setInt(9, empleado.getTipo_usuario_id());
            execute.setInt(10, empleado.getEstado_empleado_id());
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
    }

    @Override
    public void deleteEmpleado(int codigo) {
        try {
            cn.conectar();
            sql = "DELETE FROM empleados WHERE empleado_id=?";
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
            System.out.println("Error en DAOEmpelado DELETE: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
    }

    @Override
    public void updateEmpleado(Empleado empleado) {
        try {
            cn.conectar();
            sql = "UPDATE empleados SET puesto = ?, fecha_inicio = ?, fecha_finalizacion = ?, sueldo = ?, user = ?, password = ?, tipo_usario_id = ?, estado_empleado_id = ? WHERE empleado_id = ?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(9, empleado.getEmpleado_id());
            execute.setString(1, empleado.getPuesto());
            execute.setString(2, empleado.getFecha_inicio());
            execute.setString(3, empleado.getFecha_finalizacion());
            execute.setDouble(4, empleado.getSueldo());
            execute.setString(5, empleado.getUser());
            execute.setString(6, empleado.getPassword());
            execute.setInt(7, empleado.getTipo_usuario_id());
            execute.setInt(8, empleado.getEstado_empleado_id());
            execute.executeUpdate();
            msg = "Registro actualizado";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Eror en DAOEmpleado UPDATE: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
    }

    @Override
    public void selectEmpleado(int codigo) {
        Empleado empleados = new Empleado();
        try {
            cn.conectar();
            sql = "SELECT * FROM empleados WHERE empleado_id=?";
            execute = cn.getconexionDB().prepareStatement(sql);
            execute.setInt(1, codigo);

            rs = execute.executeQuery();

            rs.next();
            empleados.setEmpleado_id(rs.getInt("empleado_id"));
            empleados.setPuesto(rs.getString("puesto"));
            empleados.setFecha_inicio(rs.getString("fecha_inicio"));
            empleados.setFecha_finalizacion(rs.getString("fecha_finalizacion"));
            empleados.setSueldo(rs.getInt("sueldo"));
            empleados.setUser(rs.getString("user"));
            empleados.setPassword(rs.getString("password"));
            empleados.setTipo_usuario_id(rs.getInt("tipo_usuario_id"));
            empleados.setEstado_empleado_id(rs.getInt("estado_empleado_id"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOEmpleado SELECT: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
    }

    @Override
    public ArrayList<Empleado> ListEmpleado() {
        ArrayList<Empleado> list = new ArrayList<>();
        Empleado empleados;
        try {
            cn.conectar();
            sql = "SELECT * FROM empleados";
            execute = cn.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {
                empleados = new Empleado();
                empleados.setPersona_id(rs.getInt("persona_id"));
                empleados.setEmpleado_id(rs.getInt("empleado_id"));
                empleados.setPuesto(rs.getString("puesto"));
                empleados.setFecha_inicio(rs.getString("fecha_inicio"));
                empleados.setFecha_finalizacion(rs.getString("fecha_finalizacion"));
                empleados.setSueldo(rs.getDouble("sueldo"));
                empleados.setUser(rs.getString("user"));
                empleados.setPassword(rs.getString("password"));
                empleados.setTipo_usuario_id(rs.getInt("tipo_usuario_id"));
                empleados.setEstado_empleado_id(rs.getInt("estado_empleado_id"));
            }
        } catch (SQLException e) {
            System.out.println("Error en DAOEmpleado List: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return list;
    }

}
