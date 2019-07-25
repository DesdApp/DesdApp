
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
            cn.conectar();//conecta a la base de datos
            sql="select * from personas where persona_id=?";//Se envia la consulta a la base de Datos
            ejecutar=cn.getconexionDB().prepareStatement(sql); //prepara la consulta en la base de datos
            ejecutar.setInt(1, per.getPersonaId());//ejecuta la consulta
            result=ejecutar.executeQuery();//visualiza los metadatos de la consulta
            
            //while recorre la consulta en la base de datos  y visualiza los datos de la consulta
            while(result.next()){
                datoPersona.setPersonaId(result.getInt("persona_id"));
                datoPersona.setApellido(result.getString("nombre"));
                datoPersona.setNombre(result.getString("apellido"));
                datoPersona.setDireccion(result.getString("direccion"));
                datoPersona.setTelefono(result.getInt("telefono"));
                datoPersona.setCelular(result.getInt("celular"));
                datoPersona.setCorreo(result.getString("correo"));
                datoPersona.setFechaNac(result.getDate("fecha_nacimiento"));
                datoPersona.setDpi(result.getInt("dpi"));
                datoPersona.setNit(result.getInt("nit"));
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error al Seleccionar Persona: "+e);//expecion de error se muestra en consola
        }finally{
            cn.desconectar();//cesconecta la base de datos
        }
        return datoPersona;//retorna datos tipo Persona
    }

    //insertar persona
    @Override
    public String insertPersona(Persona per) {
        try {
            cn.conectar();//Establece conexion a la base de Datos
            sql="insert into personas values(?,?,?,?,?,?,?,?,?,?)"; //Se envia la consulta a la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql); //Se parapara la consulta en la base de datos
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, per.getPersonaId());
            ejecutar.setString(2, per.getNombre());
            ejecutar.setString(3, per.getApellido());
            ejecutar.setString(4, per.getDireccion());
            ejecutar.setInt(5, per.getTelefono());
            ejecutar.setInt(6, per.getCelular());
            ejecutar.setString(7, per.getCorreo());
            ejecutar.setDate(8, per.getFechaNac());
            ejecutar.setInt(9, per.getDpi());
            ejecutar.setInt(10, per.getNit());
            
            ////Realizamos la consulta y actualizamos la base de datos
            contPer=ejecutar.executeUpdate();
            
            //Condiciona la sentencia SQL
            if (contPer==0) { //entrara a esta parte de la condicion de la sentencia si no inserta 
                mensaje="No Se a podido agregar el Registro"; 
            }else{ //Entrara a esta parte de la condicion si la sentencia se inserta
                mensaje="Registro Agregado Con Exito"; 
            }
            
        } catch (SQLException e) {
            mensaje="Error al Agregar el Registro: "+e; // Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
        }finally{
            cn.desconectar(); //Desconecta la base de datos
        }
        return mensaje; //Valor de retorno
         }

    //Modificar Persona
    @Override
    public String updatePersona(Persona per) {
        try {
            cn.conectar(); //conecta a la base de datos
            sql="update personas set persona_id=?, nombre=?, apellido=?, direccion=?, telefono=?, celular=? ,correo=?, fecha_nacimiento=?,"
                    + "dpi=?, nit=? where persona_id=?";   //Envia la consulta a la base de Datos
            ejecutar=cn.getconexionDB().prepareStatement(sql); //Prepara la consulta en la base de Datos
            
            //Ejecuta la consulta en la base de datos
            ejecutar.setString(1, per.getNombre());
            ejecutar.setString(2, per.getApellido());
            ejecutar.setString(3, per.getDireccion());
            ejecutar.setInt(4, per.getTelefono());
            ejecutar.setInt(5, per.getCelular());
            ejecutar.setString(6, per.getCorreo());
            ejecutar.setDate(7, per.getFechaNac());
            ejecutar.setInt(8, per.getDpi());
            ejecutar.setInt(9, per.getNit());
            ejecutar.setInt(10, per.getPersonaId());
            
            contPer=ejecutar.executeUpdate(); //Realizamos la consulta y actualizamos la base de datos
            
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if(contPer==0){
                mensaje="No se a podido Modificar El Registro";
            }else{
                mensaje="Registro modificado Con Exito";
            }
            
        } catch (SQLException e) {
            mensaje="Error al Modificar: "+e; // Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
        }finally{
            cn.desconectar();// Nos desconectamos de la base de Datos
        }
        return mensaje; //Este es nuestro valor de Retorno
         }
    
    //Eliminar Persona

    @Override
    public String deletPersona(Persona per) {
        try {
            cn.conectar(); //Se Conecta a la base de Datos
            sql="delete from personas where persona_id=?"; //Envia la consulta a la base de Datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);//Prepara Nestra consulta a la base de Datos
            
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, per.getDpi());
            //Realiza la consulta y actualiza la base de datos
            contPer=ejecutar.executeUpdate();
            //Si la consulta es verdadera no elimina nuestro registro pero si es falsa Eliminara el registro con exito.
            if (contPer==0) {
                mensaje="No se a podido Eliminar El Registro";
            } else {
                mensaje="Registro Eliminado con Exito";
            }
        } catch (SQLException e) {
            mensaje="Error al eliminar Persona: "+e; // Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
        }finally{
            cn.desconectar();// Se desconecta de la base de datos
        }
        return mensaje; //Retorna nuestra variable mensaje
         }
    
    //listar Personas por pedio de un ArrayList.

    @Override
    public ArrayList<Persona> listPersona() {
        ArrayList<Persona>lista; //creamos un objeto tipo Array list
        Persona perso; //Creamos un objeto tipo Persona
        lista=new ArrayList(); //Inicializamos nuestro Objeto de Tipo ArrayList
        try {
            cn.conectar(); //conecta la base de datos
            sql="Select * from personas";//Envia la consulta a la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql); //prepara la cosulta en la base de datos
            result=ejecutar.executeQuery();//Realiza la consulta y muestra los datos de la base de datos
            //Visualiza los datos de la consulta
            while(result.next()){
                perso=new Persona();//Cada vez que pase a un registro nuevo crea un objeto Perosona
                
                 perso.setPersonaId(result.getInt("persona_id"));
                perso.setApellido(result.getString("nombre"));
                perso.setNombre(result.getString("apellido"));
                perso.setDireccion(result.getString("direccion"));
                perso.setTelefono(result.getInt("telefono"));
                perso.setCelular(result.getInt("celular"));
                perso.setCorreo(result.getString("correo"));
                perso.setFechaNac(result.getDate("fecha_nacimiento"));
                perso.setDpi(result.getInt("dpi"));
                perso.setNit(result.getInt("nit"));
                
                
                lista.add(perso); //Se agregan los registros a un ArrayList
                
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar lista personas: "+e);//Mensaje por consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
        }finally{
            cn.desconectar();//desconecta la base de datos
        }
        return lista;//Retorna los registros agregados al ArrayList
         }
    
}
