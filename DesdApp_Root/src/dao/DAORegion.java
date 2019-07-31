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
public class DAORegion implements interfaces.InterfaceRegion {

    private final ConexionDB cn = new ConexionDB();
    private String sql = "";
    private String mensaje = "";
    private ResultSet result;
    private PreparedStatement ejecutar;
    private int contRegion = 0;

    

    //<editor-fold defaultstate="collapsed" desc="Seleccionar Region">
    /**
     * Este metodo es para realizar la consulta de una Region 
     * en base a la id
     * @param id Este parametro es la id del elemento que deseamos buscar.
     * @return Retorna el objeto obtenido en la consulta.
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
//</editor-fold>
   
   
    //<editor-fold defaultstate="collapsed" desc="Listar Region">
    /**
     * Este metodo es para obtener todos los registros de la base
     * de Datos correspondites a la clase Regiones
     * @return  Este metodo retorna un ArrayList de tipo Regiones.
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
//</editor-fold>
   
  

}
