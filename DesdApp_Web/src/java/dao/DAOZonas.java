package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Zonas;
/**
 * Esta clase es el objeto de acceso a datos para la clase Zonas.
 * @author carolina
 */
public class DAOZonas implements interfaces.InterfaceZonas {

   
   
    
//    Instanciamos las clases
    ConexionDB cx = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

//    Atributos
    String sql; //String sql se utiliza para escribir la consulta SQL
    String msg; //msg es usado para mostrar un mensaje de como se realizo una consulta

    /**
     * Este metodo es para realizar la consulta de una Zonas
     * en base a zonaId.
     * @param zonaId Este Parametro es el zonaId del elemento que 
     * deseamos buscar.
     * @return  Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    public Zonas selectZona(byte zonaId) {
        Zonas zona = new Zonas();
        try {
            cx.conectar();
            sql = "SELECT * FROM zonas WHERE zona_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setInt(1, zonaId);
            rs = execute.executeQuery();
            rs.next();
            zona.setZonaId(rs.getInt("zona_id"));
            zona.setNombre(rs.getString("nombre"));
            zona.setMuniId(rs.getInt("muni_id"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOZonas SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return zona;
    }

    /**
     * Este metodo es para obtener todos los registros de la base
     * de datos correspondientes a la clase Zonas.
     * @return  Este metodo retorna un ArrayList de tipo Zonas.
     */
    @Override
    public ArrayList<Zonas> listZonas() {
        Zonas zonas;
        ArrayList<Zonas> list = new ArrayList<>();
        try {
            cx.conectar();
            sql = "SELECT * FROM zonas";
            execute = cx.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {
                zonas = new Zonas();
                zonas.setZonaId(rs.getInt("zona_id"));
                zonas.setNombre(rs.getString("nombre"));
                zonas.setMuniId(rs.getInt("muni_id"));
                list.add(zonas);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOZonas LIST: " + e.getMessage());
        }
        return list;
    }
}
