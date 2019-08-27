package dao;

import interfaces.InterfaceRegistrarse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Registrarse;
/**
 * Esta clase es el objeto de acceso a datos para la clase Registrarese.
 *
 * @author carolina
 */
public class DAORegistrarse implements InterfaceRegistrarse{
    
   //Intanciamos
    ConexionDB cn = new ConexionDB();
    PreparedStatement rs;
    ResultSet result;
   
    //Atributos
    String mg;
    String sql;
    
    /**
     * Este metodo es para registrarse en la pagina web.
     * @param regis este parametro es el tipo de objeto de deseamos ingresar.
     * @return Retorna la consulta en un mensaje.
     */
    @Override
    public String insert(Registrarse regis) {
     
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "";
        } catch (Exception e) {
        }
        finally{
            //se desconecta de la base de datos
            cn.desconectar();
        }
        //retorna un objeto de tipo sql.
        return sql;
    }  
}
