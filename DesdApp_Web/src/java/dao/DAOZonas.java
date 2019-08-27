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
        //Se crea un objeto tipo Zonas
        Zonas zona = new Zonas();
        try {
            //Se conecta a la base de Datos
            cx.conectar();
            //Envia la consulta a la base de datos.
            sql = "SELECT * FROM zonas WHERE zona_id = ?";
            //Prepara la consulta en la base de Datos.
            execute = cx.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de Datos
            execute.setInt(1, zonaId);
            //Realiza la consulta y muestra los datos de la base de datos
            rs = execute.executeQuery();
            //Visualiza la consulta.
            rs.next();
            zona.setZonaId(rs.getInt("zona_id"));
            zona.setNombre(rs.getString("nombre"));
            zona.setMuniId(rs.getInt("muni_id"));
            rs.close();
        } catch (SQLException e) {
            //Mensaje por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error en DAOZonas SELECT: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos.
            cx.desconectar();
        }
        //Retorna la busqueda en base por medio del objeto zona.
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
