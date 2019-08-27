package dao;

import interfaces.InterfaceNosotros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Nosotros;

/**
 * Esta clase es el objeto de acceso a datos para la clase Nosotros.
 *
 * @author carolina
 */

public class DAONosotros  implements InterfaceNosotros{
    //Instancia de las clases
    ConexionDB conex = new ConexionDB();
    PreparedStatement execute;

    //Atributos
    ResultSet rs;
    String sql;

    /**
     * Este metodo es para obtener todos los registros de la base de datos 
     * correspondientes a la clase Nosotros.
     * @return  Retorna una lista de los registros de la tabla que se pide en la consulta.
     */
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

    /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondites a la clase Nosotros
     * @return Retorna una lista de los registros de la tabla que se pide en la 
     * consulta.
     */
    @Override
    public ArrayList<Nosotros> lista() {
        ArrayList<Nosotros> lista = new ArrayList<>();
        Nosotros nos;
        try {
            conex.conectar();
            sql = "SELECT * FROM view_corredores WHERE cod_empleado=?";
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
                lista.add(nos);                
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error en DAONosotros: " + e.getMessage());
        }finally{
            conex.desconectar();
        }
        return lista;
    }
    }
    

