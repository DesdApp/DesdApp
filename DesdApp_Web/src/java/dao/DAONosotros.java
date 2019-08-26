package dao;

import interfaces.InterfaceNosotros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Nosotros;

public class DAONosotros  implements InterfaceNosotros{
    ConexionDB conex = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;
    String sql;

    @Override
    public ArrayList<Nosotros> list() {
        ArrayList<Nosotros> list = new ArrayList<>();
        Nosotros nos;
        try {
            conex.conectar();
            sql = "SELECT * FROM view_corredores";
            execute = conex.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            
            while (rs.next()){
                nos = new Nosotros();
                nos.setNombre(rs.getString("nombre"));
                nos.setApellido(rs.getString("apellido"));
                nos.setCorreo(rs.getString("correo"));
                nos.setTel(rs.getInt("telefono"));
                nos.setCel(rs.getInt("celular"));
                nos.setCod_empleado(rs.getInt("cod_empleado"));
                nos.setTipo_usuario_id(rs.getInt("tipo_usuario_id"));
                list.add(nos);                
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error en DAONosotros: " + e.getMessage());
        }finally{
            conex.desconectar();
        }
        return list;
    }
    
}
