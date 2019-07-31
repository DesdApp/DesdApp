package dao;

import modelo.EstadosEmpleados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOEstadosEmpleados implements interfaces.InterfaceEstadosEmpleados {

    ConexionDB cn = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

    String msg;
    String sql;
//<editor-fold defaultstate="collapsed" desc="Seleccionar Estado Empleado">
    /**
     * Este metodo Es para realizar la consulta de un Estado Empleado 
     * en base al codigo.
     * @param codigo Este parametro es el codigo del elemento que debemos buscar
     * @return  Retorna el objeto obtenido de nuestra consulta.
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
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Listar Estado Empleados">
    /**
     * Este metodo es para obtener todos los registros de la base de 
     * datos correspondientes a la clase Estao Empleados
     * @return   Este metodo retorna un ArrayList de tipo EstadosEmpleados.
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
//</editor-fold>
   
}
