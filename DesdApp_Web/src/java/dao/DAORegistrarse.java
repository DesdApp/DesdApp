package dao;

import interfaces.InterfaceRegistrarse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Registrarse;

public class DAORegistrarse implements InterfaceRegistrarse{
    
   //Intanciamos
    ConexionDB cn = new ConexionDB();
    PreparedStatement rs;
    ResultSet result;
   
    //Atributos
    String mg;
    String sql;
    
    @Override
    public String insert(Registrarse regis) {
     
        try {
            cn.conectar();
            sql = "";
        } catch (Exception e) {
        }
        finally{
            cn.desconectar();
        }
        return sql;
    }  
}
