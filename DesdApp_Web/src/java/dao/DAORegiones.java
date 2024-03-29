package dao;

import modelo.Regiones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoRegion// Objeto de la clase Region
 */
/**
 * Esta clase es el objeto de acceso a datos para la clase Regiones.
 *
 * @author carolina
 */
public class DAORegiones implements interfaces.InterfaceRegion {

    private final ConexionDB cn = new ConexionDB();
    private String sql = "";
    private String mensaje = "";
    private ResultSet result;
    private PreparedStatement ejecutar;
    private int contRegion=0;

    /**
     * Este metodo es para ingresar un nuevo registro de tipo 
     * Regiones
     * @param region Este parametro es el tipo de objeto que deseamos
     * Ingresar
     * 
     * @return Retorna la consulta en un mensaje. 
     */
    @Override
    public String insert(Regiones region) {
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta en la base de datos.
            sql = "INSERT INTO regiones VALUES(?,?,?)";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos.
            ejecutar.setInt(1, region.getRegionId());
            ejecutar.setString(2, region.getNombre());
            ejecutar.setString(3, region.getDescripcion());
            //Realiza la consulta y actualiza la base de datos
            contRegion = ejecutar.executeUpdate();

            if (contRegion == 0) {
                mensaje = "No se ingreso el registro";
            } else {
                mensaje = "Se ha ingresado correctamente el registro";
            }
        } catch (SQLException e) {
            System.out.println("Error en DAORegion INSERT: " + e.getMessage());
        } finally {
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        //Retorna la consulta realizada a la base de datos
        return mensaje;
    }


    /**
     * Este metodo es para realizar la modificacion de las Regines 
     * en ase a los datos.
     * @param region Actualizara el registro que se llama por el id en la 
     * consulta 
     * @return Retornara un mensaje de confirmaicon. 
     * 
     */
    @Override
    public String update(Regiones region) {
        try {
            //Se conecta a la base de datos
            cn.conectar();
            sql = "UPDATE regiones SET nombre=?, descripcion=? WHERE region_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de Datos
            ejecutar.setString(1, region.getNombre());
            ejecutar.setString(2, region.getDescripcion());
            ejecutar.setInt(3, region.getRegionId());
            //Realiza la consulta y Actualiza la base de datos
            contRegion = ejecutar.executeUpdate();

            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contRegion == 0) {

                mensaje = "No se actualizó el registro";
            } else {
                mensaje = "Se ha actualizado el registro";
            }

        } catch (SQLException e) {
            System.out.println("Error en DAORegion UPDATE: " + e.getMessage());
        } finally {
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        //Retorna la consulta realizada a la base de datos
        return mensaje;
    }

    /**
     * Este metodo es para realizar la eliminacion de una Region en base 
     * al id
     * @param id Este parametro elimina un registro por medio del id ingresado
     * 
     * @return Retorna un mensaje de confirmacion o error en caso de que el registro 
     * no exixta.
     */
    @Override
    public String delete(int id) {
        try {
            //se conecta a la base de datos
            cn.conectar();
            sql = "DELETE FROM regiones WHERE region_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, id);
            //Realiza la consulta y Actualiza la base de datos
            contRegion = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contRegion == 0) {
                mensaje = "El registro no se a podido Eliminar";
            } else {
                mensaje = "Registro eliminado con Exito";
            }

        } catch (SQLException e) {
            System.out.println("Error en DAORegion DELETE: " + e.getMessage());
        } finally {
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        return mensaje;
    }

    /**
     * Este metodo es para realizar la consulta de una Region en bse a la id
     * @param id Este parametro es el codigo del elemento que 
     * deseamos buscar.
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    public Regiones select(int id) {
        Regiones datos = new Regiones();
        try {
            //Conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de Datos:
            sql = "SELECT * FROM regiones WHERE region_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la bae de Datos
            ejecutar.setInt(1, id);

            //Realiza la consulta y Muesta los datos de la base de datos
            result = ejecutar.executeQuery();
            //Visualiza los datos de la consulta
            result.next();
            datos.setRegionId(result.getInt("region_id"));
            datos.setNombre(result.getString("nombre"));
            datos.setDescripcion(result.getString("descripcion"));
            result.close();

        } catch (SQLException e) {
            System.out.println("Error en DAORegion SELECT: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna los datos tipo Region
        return datos;
    }

    /**
     * Este metodo es para obtener todos los registros de la base de
     * datos correspondientes a la clase Regiones.
     * @return  Retorna un lista de los registros de la tabla que se pide en
     * la consulta.
     */
    @Override
    public ArrayList<Regiones> list() {
        //Crea un objeto tipo ArrayList
        ArrayList<Regiones> list;
        //Crea un objeto tipo Regiones
        Regiones regiones;
        //Inicializamos el objeto list
        list = new ArrayList();
        try {
            //Conectamos la base de datos
            cn.conectar();
            sql = "SELECT * FROM regiones";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Realiza la consulta y Muestra los datos 
            result = ejecutar.executeQuery();
            //Visualiza los datos de la consulta
            while (result.next()) {
                //Cada vez que pase a un registro nuevo crea un objeto Regiones
                regiones = new Regiones();
                regiones.setRegionId(result.getInt("region_id"));
                regiones.setNombre(result.getString("nombre"));
                regiones.setDescripcion(result.getString("descripcion"));
                //Se agregan los registros a un ArrayList
                list.add(regiones);

            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar lista de Regiones: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //retorna los registros del ArrayList
        return list;
    }

}
