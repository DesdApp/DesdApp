package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    //atributos
    private Connection conexionDB;
    private static final String URL = "jdbc:mysql://127.0.0.1/_poner_el_enlace_a_la_base_de_datos";//poner el enlace a la base de datos con respecto a su configuaracion
    private static final String USER = "root";//esto de igual manera
    private static final String PASS = "";//y esto, si no lo han modificado dejen user y pass vacions

    //Metodos
    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexionDB = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexion Establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("NO se establecion la conexion, error: " + e);
        }
    }

    public void desconectar() {
        if (conexionDB != null) {
            try {
                if (conexionDB.isClosed() == false) {
                    conexionDB.close();
                    System.out.println("Desconecion se realizo con exito");
                }
            } catch (SQLException e) {
                System.out.println("NO de desconectar de la base de datos, error: " + e);                
            }
        }
    }

    //Setter and Getter
    public Connection getconexionDB() {
        return conexionDB;
    }

    public void setconexionDB(Connection conexionDB) {
        this.conexionDB = conexionDB;
    }
}