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
/**
 * Esta clase es el objeto de acceso a datos para la clase Departamentos.
 *
 * @author carolina
 */
public class DAODepartamentos implements interfaces.InterfaceDepartamento{
    private ConexionDB cn= new ConexionDB();
    private String sql="";
    private String mensaje="";
    private  ResultSet resul;
    private PreparedStatement ejecutar;
    private int conDepto=0;

    //Insertar Departamentos
    /**
     * Este metodo es para Ingresar un nuevo registro de Departamentos
     *
     * @param depto Este parametro es el tipo de objeto que deseamos Ingresar
     * @return retorna un mensaje de confirmación o error en caso de que el id
     * se repita
     */
    @Override
    public String insert(Departamentos depto) {
        try {
            //Conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de Datos
            sql="INSERT INTO departamentos VALUES(?,?,?)";
            //Prepara la consulta en la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de Datos
            ejecutar.setInt(1, depto.getDeptoId());
            ejecutar.setString(2, depto.getNombre());
            ejecutar.setInt(3, depto.getRegionId());
            //Realiza la consulta y actualiza la base de datos
            conDepto=ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (conDepto==0) {
                mensaje="No se ingresó el registro";
            }else{
                mensaje="Se ha ingresado el registro con éxito";
            }
        } catch (Exception e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje="Erro al insertar un Deprtamento";
            System.out.println("Error en DAODepartamentos INSERT: " + e.getMessage());
        }finally{
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
        }

   /**
     * Este metodo es para realizar la modificacion de Departamentos en base a
     * los datos.
     *
     * @param depto actualizará el registro que se llama por el id en la consulta
     * @return retornará un mensaje de confirmacion
     */
    @Override
    public String update(Departamentos depto) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de Datos
            sql="UPDATE departamentos SET nombre=?, region_id=? WHERE depto_id=?";
            //Prepara la consulta en la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setString(1, depto.getNombre());
            ejecutar.setInt(2, depto.getRegionId());
            ejecutar.setInt(3, depto.getDeptoId());
            //Realiza la consulta y Actualiza la base de Datos
            conDepto=ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (conDepto==0) {
                mensaje="No se actualizó el registro";
            }else {
                mensaje="Se ha actualizado el registro correctamente";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje="Error a modificar Deprtamentos";
            System.out.println("Error en DAODepartamentos UPDATE: " + e.getMessage());
        }finally{
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
          }

    /**
     * Este metodo es para realizar la Eliminacion de un Departamentos en
     * base al codigo
     *
     * @param id elimina un registro por medio del id ingresado
     * @return retorna un mensaje de confirmación o error en caso de que el
     * registro no exista
     */
    @Override
    public String delete(int id) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql="DELETE FROM departamentos WHERE depto_id=?";
            //Prepara la consulta en la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, id);
            //Realiza la consulta y Actualiza la base de datos
            conDepto=ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (conDepto==0) {
                mensaje="No se eliminó el registro";
            } else {
                mensaje="Se ha eliminado el registro correctamente";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje="Error al Eliminar Departamentos";
            System.out.println("Error en DAODepartamentos DELETE: " + e.getMessage());
        }finally{
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
       }

    /**
     * Este metodo es para realizar la consulta de un Departamentos en base
     * al codigo
     *
     * @param id Este parametro es el id del elemento que deseamos
     * buscar.
     * @return Retorna el objeto obtenido en nuestra consulta.
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

    /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondientes a la clase Departamentos.
     *
     * @return retornará una lista de los registros de la tabla que se pide en
     * la consulta
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
    
}
