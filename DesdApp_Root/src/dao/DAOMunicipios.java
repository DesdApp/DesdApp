package dao;

//Clase Dao para Municipios
import modelo.Municipios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoMuni// Objeto de la clase Municipios
*contMuni// verificar las sentencias if de cada metodo.
 * @author javam2019
 */
/*

 */
//implementacion de los metodos abstractos de la interfaz municipio
public class DAOMunicipios implements interfaces.InterfaceMunicipio {

    private ConexionDB cn = new ConexionDB();
    private String sql = "";
    private String mensaje = "";
    private ResultSet result;
    private PreparedStatement ejecutar;
    private int contMuni = 0;

    //<editor-fold defaultstate="collapsed" desc="Seleccionar Municipios">
    /**
     * Este metodo es para realizar una consulta de un Municipio 
     * en base a la id.
     * @param id Este parametro es el id del elemento que deseamos buscar.
     * @return Retorna el objeto obtenido en la consulta.
     */
     @Override
    public Municipios select(int id) {
        Municipios dato = new Municipios();
        try {
             //Se conecta a la base de datos
            cn.conectar();
            //Eniva la consulta a la base de datos
            sql = "SELECT * FROM municipios WHERE muni_id=?";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, id);
            //Realiza la consulta y muestra los datos de la base de datos
            result = ejecutar.executeQuery();
            //Visualiza la consulta
            result.next();
                dato.setMuniIdi(result.getInt("muni_id"));
                dato.setNombre(result.getString("nombre"));
                dato.setDeptoId(result.getInt("depto_id"));
            result.close();
        } catch (SQLException e) {
            //Mensaje Por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error al Seleccionar Departamento: " + e);
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion por medio del objeto datoMuni
        return dato;
    }
//</editor-fold>
   

    //<editor-fold defaultstate="collapsed" desc="Listar Municipios">
    /**
     * Este metodo es para obtener todos los registros de la base de Datos
     * correspondites a la clase Municipios
     * @return Este metodo retorna un ArrayList de tipo Municipios
     */
    @Override
    public ArrayList<Municipios> list() {
        //Se Crea un objeto tipo ArrayList
        ArrayList<Municipios> list;
        //Se crea un Objeto tipo Municipios
        Municipios mun;
        //Se inicializa el objeto list
        list = new ArrayList();
        try {
             //Se conecta a la base de datos
            cn.conectar();
            //Eniva la consulta a la base de datos
            sql = "SELECT * FROM municipios";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Realiza la consulta y Muesta los datos de la base de datos
            result = ejecutar.executeQuery();
            //Visualiza la consulta 
            while (result.next()) {
                // //Cada vez que pase a un registro nuevo crea un objeto tipo Municipos
                mun = new Municipios();
                mun.setMuniIdi(result.getInt("muni_id"));
                mun.setNombre(result.getString("nombre"));
                mun.setMuniIdi(result.getInt("depto_id"));
                list.add(mun);
            }
        } catch (SQLException e) {
            //Mensaje por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error en DAOMunicipios ArrayList: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion de la lista 
        return list;
    }
//</editor-fold>
    

}
