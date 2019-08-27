package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Zonas;

public class DAOZonas implements interfaces.InterfaceZonas {

//    Instanciamos las clases
    ConexionDB cx = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;

//    Atributos
    String sql;
    String msg;

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
