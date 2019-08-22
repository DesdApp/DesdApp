package dao;

import modelo.Personas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    private ResultSet rs;
    private PreparedStatement exe;
    private String msg = "";
    private int cont = 0;

    @Override
    //Selecionar Personas.
    public Personas select(int id) {
        Personas persona = new Personas();
        try {
            cn.conectar();
            sql = "SELECT * FROM personas WHERE persona_id = ?";//Se envia la consulta a la base de Datos
            exe = cn.getconexionDB().prepareStatement(sql);
            exe.setInt(1, id);
            rs = exe.executeQuery();

            rs.next();
            persona.setPersonaId(rs.getInt("persona_id"));
            persona.setApellido(rs.getString("nombre"));
            persona.setNombre(rs.getString("apellido"));
            persona.setTipoDocumentoId(rs.getByte("tipo_documento_id"));
            persona.setNoDocumento(rs.getString("no_documento"));
            persona.setNit(rs.getString("nit"));
            persona.setDireccion(rs.getString("direccion"));
            persona.setCelular(rs.getInt("celular"));
            persona.setTelefono(rs.getInt("telefono"));
            persona.setCorreo(rs.getString("correo"));
            persona.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOPersonas SELECT: " + e.getMessage());
        } finally {
            cn.desconectar();//cesconecta la base de datos
        }
        return persona;
//retorna datos tipo Personas
    }

    //insertar persona
    @Override
    public String insert(Personas per) {
        try {
            cn.conectar();
            //Entro
            sql = "INSERT INTO personas VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            exe = cn.getconexionDB().prepareStatement(sql);
            exe.setInt(1, per.getPersonaId());
            exe.setString(2, per.getNombre());
            exe.setString(3, per.getApellido());
            exe.setByte(4, per.getTipoDocumentoId());
            exe.setString(5, per.getNoDocumento());
            exe.setString(6, per.getNit());
            exe.setString(7, per.getDireccion());
            exe.setInt(8, per.getCelular());
            exe.setInt(9, per.getTelefono());
            exe.setString(10, per.getCorreo());
            exe.setDate(11, per.getFechaNacimiento());

            ////Realizamos la consulta y actualizamos la base de datos
            cont = exe.executeUpdate();

            if (cont == 0) {
                msg = null;
            } else {
                msg = "Registro agregado con éxito";
            }

        } catch (SQLException e) {
            msg = null;
            System.out.println("Error en DAOPersona INSERT: " + e.getMessage());
        } finally {
            cn.desconectar(); //Desconecta la base de datos
        }
        return msg; //Valor de retorno
    }

    //Modificar Personas
    @Override
    public String update(Personas per) {
        try {
            cn.conectar();
            sql = "UPDATE personas SET nombre = ?, apellido = ?,"
                    + " tipo_documento_id = ?, no_documento = ?,"
                    + " nit = ?, direccion = ?, celular= ?, telefono = ?,"
                    + " correo = ?, fecha_nacimiento = ? WHERE persona_id = ?";
            exe = cn.getconexionDB().prepareStatement(sql);

            //Ejecuta la consulta en la base de datos
            exe.setInt(11, per.getPersonaId());
            exe.setString(1, per.getNombre());
            exe.setString(2, per.getApellido());
            exe.setByte(3, per.getTipoDocumentoId());
            exe.setString(4, per.getNoDocumento());
            exe.setString(5, per.getNit());
            exe.setString(6, per.getDireccion());
            exe.setInt(7, per.getCelular());
            exe.setInt(8, per.getTelefono());
            exe.setString(9, per.getCorreo());
            exe.setDate(10, per.getFechaNacimiento());

            cont = exe.executeUpdate(); //Realizamos la consulta y actualizamos la base de datos

            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (cont == 0) {
                msg = "No se modificó el registro";
            } else {
                msg = "Registro modificado con éxito";
            }

        } catch (SQLException e) {
            msg = "Error al modificar registro";
            System.out.println("Error en DAOPersona UPDATE: " + e.getMessage());
        } finally {
            cn.desconectar();// Nos desconectamos de la base de Datos
        }
        return msg; //Este es nuestro valor de Retorno
    }

    //Eliminar Personas
    @Override
    public String delete(int id) {
        try {
            cn.conectar();
            sql = "DELETE FROM personas WHERE persona_id = ?";
            exe = cn.getconexionDB().prepareStatement(sql);
            exe.setLong(1, id);
            //Realiza la consulta y actualiza la base de datos
            cont = exe.executeUpdate();
            //Si la consulta es verdadera no elimina nuestro registro pero si es falsa Eliminara el registro con exito.
            if (cont == 0) {
                msg = "No existe el registro";
                System.out.println("No se eliminó");
            } else {
                msg = "Registro eliminado con éxito";
                System.out.println("Eliminado");
            }
        } catch (SQLException e) {
            msg = "Error al eliminar registro";
            System.out.println("Error en DAOPersona DELETE: " + e.getMessage());
        } finally {
            cn.desconectar();// Se desconecta de la base de datos
        }
        return msg; //Retorna nuestra variable mensaje
    }

    //listar Personas por pedio de un ArrayList.
    @Override
    public ArrayList<Personas> list() {
        ArrayList<Personas> list = new ArrayList<>(); //creamos un objeto tipo Array list
        Personas persona; //Creamos un objeto tipo Personas
        try {
            cn.conectar();
            sql = "SELECT * FROM personas";
            exe = cn.getconexionDB().prepareStatement(sql);
            rs = exe.executeQuery();

            while (rs.next()) {
                persona = new Personas();//Cada vez que pase a un registro nuevo crea un objeto Perosona

                persona.setPersonaId(rs.getInt("persona_id"));
                persona.setApellido(rs.getString("nombre"));
                persona.setNombre(rs.getString("apellido"));
                persona.setTipoDocumentoId(rs.getByte("tipo_documento_id"));
                persona.setNoDocumento(rs.getString("no_documento"));
                persona.setNit(rs.getString("nit"));
                persona.setDireccion(rs.getString("direccion"));
                persona.setCelular(rs.getInt("celular"));
                persona.setTelefono(rs.getInt("telefono"));
                persona.setCorreo(rs.getString("correo"));
                persona.setFechaNacimiento(rs.getDate("fecha_nacimiento"));

                list.add(persona); //Se agregan los registros a un ArrayList

            }
        } catch (SQLException e) {
            System.out.println("Error en DAOPersonas LIST: " + e.getMessage());
        } finally {
            cn.desconectar();//desconecta la base de datos
        }
        return list;//Retorna los registros agregados al ArrayList
    }

    @Override
    public int validar(Personas persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
