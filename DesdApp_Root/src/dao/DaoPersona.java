
package dao;

import interfaces.InterfacePersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Persona;
/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoPerosona// Objeto de la clase Persona
*/

//Implementacion de los metodos abstractos de la interfaz Persona
public class DaoPersona implements InterfacePersona{
    private ConexionDB cn=new ConexionDB();
    private String sql="";
    private ResultSet result;
    private PreparedStatement ejecutar;
    private Persona datoPersona=new Persona();
    private String mensaje="";
    private int contPer=0;

    @Override
    //Selecionar Persona.
    public Persona selectPersona(Persona per) {
        try {
            cn.conectar();
            sql="select * from personas where persona_id=?";//Se envia la consulta a la base de Datos
            ejecutar=cn.getconexionDB().prepareStatement(sql); 
            ejecutar.setInt(1, per.getPersonaId());
            result=ejecutar.executeQuery();
            
            while(result.next()){
                datoPersona.setPersonaId(result.getInt("persona_id"));
                datoPersona.setApellido(result.getString("nombre"));
                datoPersona.setNombre(result.getString("apellido"));
                datoPersona.setDireccion(result.getString("direccion"));
                datoPersona.setTelefono(result.getInt("telefono"));
                datoPersona.setCorreo(result.getString("correo"));
                datoPersona.setFechaNac(result.getDate("fecha_nacimiento"));
                datoPersona.setDpi(result.getInt("dpi"));
                datoPersona.setNit(result.getInt("nit"));
                datoPersona.setTipoUsuarioId(result.getInt("tipo_usuario_id"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error al Seleccionar Persona: "+e);
        }finally{
            cn.desconectar();
        }
        return datoPersona;
    }

    //insertar persona
    @Override
    public String insertPersona(Persona per) {
        try {
            cn.conectar();
            sql="insert into personas values(?,?,?,?,?,?,?,?,?,?)";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, per.getPersonaId());
            ejecutar.setString(2, per.getNombre());
            ejecutar.setString(3, per.getApellido());
            ejecutar.setString(4, per.getDireccion());
            ejecutar.setInt(5, per.getTelefono());
            ejecutar.setString(6, per.getCorreo());
            ejecutar.setDate(7, per.getFechaNac());
            ejecutar.setInt(8, per.getDpi());
            ejecutar.setInt(9, per.getNit());
            ejecutar.setInt(10, per.getTipoUsuarioId());
            contPer=ejecutar.executeUpdate();
            
            if (contPer==0) {
                mensaje="No Se a podido agregar el Registro";
            }else{
                mensaje="Registro Agregado Con Exito"; 
            }
            
        } catch (SQLException e) {
            mensaje="Error al Agregar el Registro: "+e;
        }finally{
            cn.desconectar();
        }
        return mensaje;
         }

    //Modificar Persona
    @Override
    public String updatePersona(Persona per) {
        try {
            cn.conectar();
            sql="update personas set persona_id=?, nombre=?, apellido=?, direccion=?, telefono=?, correo=?, fecha_nacimiento=?,"
                    + "dpi=?, nit=?, tipo_usuario_id=?  where persona_id=?";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            
            ejecutar.setString(1, per.getNombre());
            ejecutar.setString(2, per.getApellido());
            ejecutar.setString(3, per.getDireccion());
            ejecutar.setInt(4, per.getTelefono());
            ejecutar.setString(5, per.getCorreo());
            ejecutar.setDate(6, per.getFechaNac());
            ejecutar.setInt(7, per.getDpi());
            ejecutar.setInt(8, per.getNit());
            ejecutar.setInt(9, per.getTipoUsuarioId());
            ejecutar.setInt(10, per.getPersonaId());
            contPer=ejecutar.executeUpdate();
            
            if(contPer==0){
                mensaje="No se a podido Modificar El Registro";
            }else{
                mensaje="Registro modificado Con Exito";
            }
            
        } catch (Exception e) {
            mensaje="Error al Modificar: "+e;
        }finally{
            cn.desconectar();
        }
        return mensaje;
         }
    
    //Eliminar Persona

    @Override
    public String deletPersona(Persona per) {
        try {
            cn.conectar();
            sql="delete from personas where persona_id=?";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, per.getDpi());
            contPer=ejecutar.executeUpdate();
            if (contPer==0) {
                mensaje="No se a podido Eliminar El Registro";
            } else {
                mensaje="Registro Eliminado con Exito";
            }
        } catch (SQLException e) {
            mensaje="Error al eliminar Persona: "+e;
        }finally{
            cn.desconectar();
        }
        return mensaje;
         }
    
    //listar Personas por pedio de un ArrayList.

    @Override
    public ArrayList<Persona> listPersona() {
        ArrayList<Persona>lista;
        Persona perso;
        lista=new ArrayList();
        try {
            cn.conectar();
            sql="Select * from personas";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            result=ejecutar.executeQuery();
            
            while(result.next()){
                perso=new Persona();
                
                 perso.setPersonaId(result.getInt("persona_id"));
                perso.setApellido(result.getString("nombre"));
                perso.setNombre(result.getString("apellido"));
                perso.setDireccion(result.getString("direccion"));
                perso.setTelefono(result.getInt("telefono"));
                perso.setCorreo(result.getString("correo"));
                perso.setFechaNac(result.getDate("fecha_nacimiento"));
                perso.setDpi(result.getInt("dpi"));
                perso.setNit(result.getInt("nit"));
                perso.setTipoUsuarioId(result.getInt("tipo_usuario_id"));
                
                lista.add(perso);
                
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar lista personas: "+e);
        }finally{
            cn.desconectar();
        }
        return lista;
         }
    
}
