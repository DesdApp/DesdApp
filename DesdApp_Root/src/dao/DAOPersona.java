package dao;

import modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoPerosona// Objeto de la clase Persona
*/


public class DAOPersona implements interfaces.InterfacePersona{
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
            sql="SELECT * FROM personas WHERE persona_id=?";//Se envia la consulta a la base de Datos
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
            System.out.println("Error al Seleccionar Persona: "+e.getMessage());
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
            sql="INSERT INTO personas VALUES(?,?,?,?,?,?,?,?,?,?)";
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
                mensaje="No Se a podido agregar el registro";
            }else{
                mensaje="Registro agregado con éxito"; 
            }
            
        } catch (SQLException e) {
            mensaje="Error al ingresar registro";
            System.out.println("Error en DAOPersona INSERT: "+e.getMessage());
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
            sql="UPDATE personas SET persona_id=?, nombre=?, apellido=?, direccion=?, telefono=?, correo=?, fecha_nacimiento=?,"
                    + "dpi=?, nit=?, tipo_usuario_id=?  WHERE persona_id=?";
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
                mensaje="No se modificó el registro";
            }else{
                mensaje="Registro modificado con éxito";
            }
            
        } catch (Exception e) {
            mensaje="Error al modificar registro";
            System.out.println("Error en DAOPersona UPDATE: " + e.getMessage());
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
            sql="DELETE FROM personas WHERE persona_id=?";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, per.getDpi());
            contPer=ejecutar.executeUpdate();
            if (contPer==0) {
                mensaje="No existe el registro";
            } else {
                mensaje="Registro eliminado con éxito";
            }
        } catch (SQLException e) {
            mensaje="Error al eliminar registro";
            System.out.println("Error en DAOPersona DELETE: " + e.getMessage());
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
            sql="SELECT * FROM personas";
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
            System.out.println("Error al mostrar lista personas: "+e.getMessage());
        }finally{
            cn.desconectar();
        }
        return lista;
         }
    
}
