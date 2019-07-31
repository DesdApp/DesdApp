package dao;
import modelo.Departamentos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoDepto// Objeto de la clase Departameto
*contDepto// verificar las sentencias if de cada metodo.
*/

//implementacion de los metodos abstractos de la interfaz Departamento
public class DAODepartamentos implements interfaces.InterfaceDepartamento{
    private ConexionDB cn= new ConexionDB();
    private String sql="";
    private String mensaje="";
    private  ResultSet resul;
    private PreparedStatement ejecutar;
    private int conDepto=0;

    //<editor-fold defaultstate="collapsed" desc="Seleccionar Departamentos">
    /**
     * Este metodo es para realizar una consulta de un Departamento 
     * en base a la id.
     * @param id Este parametro es el id del elemento que deseamos buscar.
     * @return  Retorna el objeto obtenido en la consulta.
     */
     @Override
    public Departamentos select(int id) {
        Departamentos dato = new Departamentos();
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql="SELECT * FROM departamentos WHERE depto_id=?";
            //Prepara la consulta en la base de Datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, id);
            //Realiza la consulta y muesta los datos de la base de datos
            resul= ejecutar.executeQuery();
            //Visualiza los datos de la consulta
            resul.next();                
                dato.setDeptoId(resul.getInt("depto_id"));
                dato.setNombre(resul.getString("nombre"));
                dato.setRegionId(resul.getInt("region_id"));
                resul.close();
        } catch (SQLException e) {
            //Mensaje Por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error al buscar registro " +e.getMessage());
        }finally{
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion de los datos Tipo Departamentos
        return dato;
        }
//</editor-fold>
   

    //<editor-fold defaultstate="collapsed" desc="Listar Departamentos">
    /**
     * Este metodo es para obtener todos lor registros de la base de Datos 
     * correspondites a la clase Departamentos.
     * @return Este metodo retorna un ArrayList de tipo Departamentos.
     */
     @Override
    public ArrayList<Departamentos> list() {
        //Crea un objeto tipo ArrayList
        ArrayList<Departamentos> list;
        //Crea un objeto tipo Departamentos
        Departamentos deptos;
        //Inicializa el objeto tipo list
        list=new ArrayList();
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql="SELECT * FROM departamentos";
            //Prepara la consulta en la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Realiza la consulta y muesta los datos de la base de datos
            resul=ejecutar.executeQuery();
            //Visualiza los datos de la consulta
            while (resul.next()) {              
                //Cada vez que pase a un registro nuevo crea un objeto tipo Departamentos
                deptos=new Departamentos();
                deptos.setDeptoId(resul.getInt("depto_id"));
                deptos.setNombre(resul.getString("nombre"));
                deptos.setRegionId(resul.getInt("region_id"));
                
                list.add(deptos);
                
            }
        } catch (SQLException e) {
            //Mensaje por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error en DAODepartamentos ArrayList: "+e.getMessage());
        }finally{
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion de los datos en un ArrayList
        return list;
        
         }
//</editor-fold>
    
   
    
}
