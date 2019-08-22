/**
 * Se realizra la logica de acceso y comprobacion de
 * priviliegios de la aplicaicon de escritorio desde
 * este archivo.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginLogicaAcceso {

    ConexionDB cn = new ConexionDB();

    //
    String sql;
    //String permisos;
    PreparedStatement execute;
    ResultSet rs;

    //Se valida usario y contrasena
    public int validarUsario(String user , String contra) {
        int result = 0;
        try {
            cn.conectar();
            sql = "SELECT * FROM empleados WHERE user='" + user + "' AND password='" + contra + "' ";//Se prepara la consulta para validad usario y contrase;a

            execute = cn.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            
            if(rs.next()){
                result = 1;
                System.out.println("consulta realizada con exito, se inicio sesion");
            }else{System.out.println("No se inicio sesion");}
        } catch (SQLException e) {
            System.out.println("Error de validadion de usuario: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return result;
    }

    public int privilegios(String user, int permisos) {
        int privilegios=0;
        
        try {
            cn.conectar();
            sql = "SELECT * FROM empleados WHERE user='" + user + "' AND tipo_usuario_id='" + permisos + "' ";
            execute = cn.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            if(rs.next()){
                privilegios = 1;
                System.out.println("Tiene privilegios");
            }else{
                System.out.println("NO tiene privilegios");
        }
        } catch (SQLException e) {
            System.out.println("Error en Validacion de privilegios: " + e.getMessage());
        }finally{
            cn.desconectar();
        }
        return privilegios;
    }
}
