package dao;

import modelo.Personas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoPerosona// Objeto de la clase Personas
 */
public class DAOPersonas implements interfaces.InterfacePersona {

    private ConexionDB cn = new ConexionDB();
    private String sql = "";
    private ResultSet result;
    private PreparedStatement ejecutar;
    private Personas datoPersona = new Personas();
    private String mensaje = "";
    private int contPer = 0;

    //<editor-fold defaultstate="collapsed" desc="Seleccionar Personas">
    /**
     * Este metodo es para realizara la consulta de una Personas en base al id
     *
     * @param id este parametro es el id del elemento que deseamos buscar
     * @return Retorna el objeto obtenido de nuestra consulta
     */
    @Override
    public Personas select(int id) {
        Personas dato = new Personas();
        try {
            cn.conectar();
            sql = "SELECT * FROM personas WHERE persona_id=?";//Se envia la consulta a la base de Datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, id);
            result = ejecutar.executeQuery();

            //while recorre la consulta en la base de datos  y visualiza los datos de la consulta
            result.next();
            dato.setPersonaId(result.getInt("persona_id"));
            dato.setApellido(result.getString("nombre"));
            dato.setNombre(result.getString("apellido"));
            dato.setDireccion(result.getString("direccion"));
            dato.setTelefono(result.getInt("telefono"));
            dato.setCelular(result.getInt("celular"));
            dato.setCorreo(result.getString("correo"));
            dato.setFechaNac(result.getDate("fecha_nacimiento"));
            dato.setDpi(result.getLong("dpi"));
            dato.setNit(result.getInt("nit"));
            result.close();
        } catch (SQLException e) {
            System.out.println("Error al Seleccionar Persona: " + e.getMessage());
        } finally {
            cn.desconectar();//cesconecta la base de datos
        }
        return dato;
//retorna datos tipo Personas
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Insertar Personas">
    /**
     * Este metodo es para ingresar una Personas
     * @param per Este parametro es el tipo de objeto que deseamos Ingresar
     * @return Retorna Un Mensaje en base a la consulta.
     */
    @Override
    public String insert(Personas per) {
        try {
            cn.conectar();
            sql = "INSERT INTO personas VALUES(?,?,?,?,?,?,?,?,?,?)";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, per.getPersonaId());
            ejecutar.setString(2, per.getNombre());
            ejecutar.setString(3, per.getApellido());
            ejecutar.setString(4, per.getDireccion());
            ejecutar.setInt(5, per.getTelefono());
            ejecutar.setInt(6, per.getCelular());
            ejecutar.setString(7, per.getCorreo());
            ejecutar.setDate(8, per.getFechaNac());
            ejecutar.setLong(9, per.getDpi());
            ejecutar.setInt(10, per.getNit());

            ////Realizamos la consulta y actualizamos la base de datos
            contPer = ejecutar.executeUpdate();

            if (contPer == 0) {
                mensaje = "No Se a podido agregar el registro";
            } else {
                mensaje = "Registro agregado con éxito";
            }

        } catch (SQLException e) {
            mensaje = "Error al ingresar registro";
            System.out.println("Error en DAOPersona INSERT: " + e.getMessage());
        } finally {
            cn.desconectar(); //Desconecta la base de datos
        }
        return mensaje; //Valor de retorno
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Modificar Personas">
    /**
     * Este Metodo es para realizar la Modificacion de una Personas en 
 base al tipo de Dato
     * @param per Este parametro es el tipo de elemento que deseamos Modificar.
     * @return Retorna el objeto obtenido en nuestra consulta
     */
    @Override
    public String update(Personas per) {
        try {
            cn.conectar();
            sql = "UPDATE personas SET nombre=?, apellido=?, direccion=?, telefono=?, celular=?, correo=?, fecha_nacimiento=?, dpi=?, nit=?  WHERE persona_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);

            //Ejecuta la consulta en la base de datos
            ejecutar.setString(1, per.getNombre());
            ejecutar.setString(2, per.getApellido());
            ejecutar.setString(3, per.getDireccion());
            ejecutar.setInt(4, per.getTelefono());
            ejecutar.setInt(5, per.getCelular());
            ejecutar.setString(6, per.getCorreo());
            ejecutar.setDate(7, per.getFechaNac());
            ejecutar.setLong(8, per.getDpi());
            ejecutar.setInt(9, per.getNit());
            ejecutar.setInt(10, per.getPersonaId());

            contPer = ejecutar.executeUpdate(); //Realizamos la consulta y actualizamos la base de datos

            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contPer == 0) {
                mensaje = "No se modificó el registro";
            } else {
                mensaje = "Registro modificado con éxito";
            }

        } catch (Exception e) {
            mensaje = "Error al modificar registro";
            System.out.println("Error en DAOPersona UPDATE: " + e.getMessage());
        } finally {
            cn.desconectar();// Nos desconectamos de la base de Datos
        }
        return mensaje; //Este es nuestro valor de Retorno
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Eliminar Personas">
    /**
     * Este metodo es para Realizar la Eliminacion de una Personas en base
 la id
     * @param id Este parametro es la id del elemento que deseamos Eliminar.
     * @return Retorna el objeto de nuestra consulta
     */
     @Override
    public String delete(int id) {
        try {
            cn.conectar();
            sql = "DELETE FROM personas WHERE persona_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setLong(1, id);
            //Realiza la consulta y actualiza la base de datos
            contPer = ejecutar.executeUpdate();
            //Si la consulta es verdadera no elimina nuestro registro pero si es falsa Eliminara el registro con exito.
            if (contPer == 0) {
                mensaje = "No existe el registro";
                System.out.println("No se eliminó");
            } else {
                mensaje = "Registro eliminado con éxito";
                System.out.println("Eliminado");
            }
        } catch (SQLException e) {
            mensaje = "Error al eliminar registro";
            System.out.println("Error en DAOPersona DELETE: " + e.getMessage());
        } finally {
            cn.desconectar();// Se desconecta de la base de datos
        }
        return mensaje; //Retorna nuestra variable mensaje
    }
//</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Listar Personas">
    /**
     * Este metodo es para obtener todos los registros de la base de
     * Datos correspondientes a la clase Personas
     * @return  Este metodo Retorna un ArrayList tipo Personas
     */
     @Override
    public ArrayList<Personas> list() {
        ArrayList<Personas> lista; //creamos un objeto tipo Array list
        Personas perso; //Creamos un objeto tipo Personas
        lista = new ArrayList(); //Inicializamos nuestro Objeto de Tipo ArrayList
        try {
            cn.conectar();
            sql = "SELECT * FROM personas";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            result = ejecutar.executeQuery();

            while (result.next()) {
                perso = new Personas();//Cada vez que pase a un registro nuevo crea un objeto Perosona

                perso.setPersonaId(result.getInt("persona_id"));
                perso.setApellido(result.getString("nombre"));
                perso.setNombre(result.getString("apellido"));
                perso.setDireccion(result.getString("direccion"));
                perso.setTelefono(result.getInt("telefono"));
                perso.setCelular(result.getInt("celular"));
                perso.setCorreo(result.getString("correo"));
                perso.setFechaNac(result.getDate("fecha_nacimiento"));
                perso.setDpi(result.getLong("dpi"));
                perso.setNit(result.getInt("nit"));

                lista.add(perso); //Se agregan los registros a un ArrayList

            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar lista personas: " + e.getMessage());
        } finally {
            cn.desconectar();//desconecta la base de datos
        }
        return lista;//Retorna los registros agregados al ArrayList
    }

//</editor-fold>
   
   
}
