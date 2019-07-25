package dao;

import modelo.EstadoEmp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOEstadoEmp implements interfaces.InterfaceEstadoEmp {

    ConexionDB cn = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    String msg;
    String sql;

    @Override
    public void insertEstadoEmp(EstadoEmp estadoEmp) {
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
    }

    @Override
    public void deleteEstadoEmp(int codigo) {
        try {
            cn.conectar();
            sql = "DELETE FROM estado_empleados WHERE estado_empleado_id=?";
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
    }

    @Override
    public void updateEmpleado(EstadoEmp estadoEmp) {
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
    }

    @Override
    public void selectEstadoEmp(int codigo) {
        EstadoEmp estado = new EstadoEmp();
        try {
            cn.conectar();
            sql = "SELECT * FROM estados_empleados WHERE estado_empleado_id=?";
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
    }

    @Override
    public ArrayList<EstadoEmp> ListEstadoEmp() {
        ArrayList<EstadoEmp> list = new ArrayList<>();
        EstadoEmp estado;
        try {
            cn.conectar();
            sql = "SELECT * FROM estados_empleados";
            execute = cn.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {
                estado = new EstadoEmp();
                estado.setEstadoEmpleadoId(rs.getByte("estado_empleado_id"));
                estado.setNombre(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error en DAOEstadoEmp List: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return list;
    }
}
