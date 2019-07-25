package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    //atributos
    private Connection conexionDB;
    private static final String URL = "jdbc:mysql://127.0.0.1/desdapp";//poner el enlace a la base de datos con respecto a su configuaracion
    private static final String USER = "root";//esto de igual manera
    private static final String PASS = "";//y esto, si no lo han modificado dejen user y pass vacios

    //Metodos
    //conectar a base de datos
    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//se registra el Driver de conexion para mysql
            conexionDB = DriverManager.getConnection(URL, USER, PASS);//se envia la solicitud a la base de datos mediante los parametros previamente definidos
            System.out.println("Conexion Establecida");//este sout no es necesario ya que solo muestra cuando la conexion es exitos
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("NO se establecio la conexion, error: " + e);//Muestra el mensaje de error en la consolo se puede modificar para que se vea en otro lado por ejemplo un log.
        }
    }

    //Desconectar de la base de datos
    public void desconectar() {
        if (conexionDB != null) {//Indicamos que si existe una conexion la cierre, de lo contario no hara nada
            try {
                if (conexionDB.isClosed() == false) {//conexion.isClosed() devuelve una valor verdadero, con el if estamos verificano que en realidad exita una conexion.
                    conexionDB.close();
                    System.out.println("Desconeccion se realizo con exito");//Esto de igual manera no es necesario
                }
            } catch (SQLException e) {
                System.out.println("NO se desconecto de la base de datos, error: " + e); //Muestra el mensaje de error en consola
            }
        }
    }

    //Setter and Getter
    //Los metodos de acceso, son utilizados para darle a todo nuestro programa la posibilidad de utilizar la conexion, siempre y cuando se importe.
    public Connection getconexionDB() {
        return conexionDB;
    }

    public void setconexionDB(Connection conexionDB) {
        this.conexionDB = conexionDB;//no hace nada
    }
}
