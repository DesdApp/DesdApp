package dao;

//Creacion de la clase dao
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Propietarios;

//implementacion de los metodos abstractos de la interfaz

public class DAOPropietarios implements interfaces.InterfacePropietarios {

    private final ConexionDB cn = new ConexionDB();
    private String sql = "";
    private String mensaje = "";
    private ResultSet result;
    private PreparedStatement ejecutar;
    Propietarios datos = new Propietarios();
    private int contProp = 0;

    //<editor-fold defaultstate="collapsed" desc="Insertar Propietarios">
    //Metodo para Ingresar
    /**
     * Este metodo es para realizar el insert de un Propietario.
     *
     * @param prop Este parametro es el tipo de objeto que deseamos ingresar.
     * @return Retorna el mensaje.
     */
    @Override
    public String insert(Propietarios prop) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de Datos:
            sql = "INSERT INTO propietarios VALUES(?,?,?,?)";
            //Prepara la consulta en la base de Datos:
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de Datos:
            ejecutar.setInt(1, prop.getPropietarioId());
            ejecutar.setString(2, prop.getAcreedor());
            ejecutar.setString(3, prop.getUser());
            ejecutar.setString(4, prop.getPass());
            
            //Realiza la consulta y Actualiza la base de Datos.
            contProp = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de datos entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contProp == 0) {
                mensaje = "No se a Ingresado el Registro";
            } else {
                mensaje = "Registro Ingresado con Exito";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error en DAOPropietarios INSERT: " + e.getMessage();
        } finally {
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje.
        return mensaje;
    }
//</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="Modificar Propietarios">
    //Metodo para Modificar 
    /**
     * Este metodo es para realizar la Modificacion de un Propietario en base al
     * tipo de dato
     *
     * @param prop Este parametro es el tipo de elemento que deseamos Modificar.
     * @return Retorna el objeto obtendio de nuestra consulta.
     */
    @Override
    public String update(Propietarios prop) {
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de Datos
            sql = "UPDATE propietarios SET acreedor=?, user=?, password=? WHERE propietario_id=?";
            //Prepara la consulta en la Base de Datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de Datos
            ejecutar.setString(1, prop.getAcreedor());
            ejecutar.setString(2, prop.getUser());
            ejecutar.setString(3, prop.getPass());
            ejecutar.setInt(4, prop.getPropietarioId());
            //Realiza la consulta y Actualiza la base de Datos.
            contProp = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contProp == 0) {
                mensaje = "No se a podido Modificar el Registro";
            } else {
                mensaje = "Registro Modificado Con Exito";
            }
        } catch (SQLException e) {
            //Mensaje por consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Erro en el DAOPropiedades UPDATE: " + e.getMessage();
        } finally {
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        //Retorna la consulta realizada en la base de Datos.
        return mensaje;
    }
    //</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="Eliminar Propietarios">
    //Metodo para Eliminar
    /**
     * Este metodo es para realizar la Eliminacion de un Propietario en base a
     * la id.
     *
     * @param id Este parametro es la id del elemento que deseamos Eliminar.
     * @return Retorna el objeto obtendio de nuestra consulta.
     */
    @Override
    public String delete(int id) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de Datos
            sql = "DELETE FROM propietarios WHERE propietario_id=?";
            //Ejecuta la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Realiza la consulta en la base de Datos
            ejecutar.setInt(1, id);
            //Realiza y Actualiza la Base de Datos.
            contProp = ejecutar.executeUpdate();
             //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contProp == 0) {
                mensaje = "El registro no se a podido Eliminar";
            } else {
                mensaje = "Registro Eliminado con Exito";
            }
        } catch (SQLException e) {
            //Mensaje por consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error DAOPropietarios DELETE: " + e.getMessage();
        } finally {
            //Se desconecta de la base de Datos.
            cn.desconectar();
        }
        //Retorna 
        return mensaje;
    }
    //</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="Seleccionar Propietarios">
    //Metodo para Seleccionar
    /**
     * Este metodo es para realizar la consulta de un Propietario en
     * base a la id.
     *
     * @param id Este parametro es la id del elemento que deseamos buscar.
     * @return Retorna el objeto obtendio de nuestra consulta.
     */
    @Override
    public Propietarios select(int id) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Se envia la consulta a la base de Datos
            sql="SELECT * FROM propietarios WHERE propietario_id=?";
            //Se ejecuta lal consulata en la base de Datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de Datos
            ejecutar.setInt(1, id);
            //Realiza la consulta y Muestra los datos de la base de Datos
            result=ejecutar.executeQuery();
            //Muestra la consulta
            result.next();              
                datos.setPropietarioId(result.getInt("propietario_id"));
                datos.setAcreedor(result.getString("acreedor"));
                datos.setUser(result.getString("user"));
                datos.setPass(result.getString("password"));
            result.close();
        } catch (SQLException e) {
             //Mensaje por consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error en DAOPropietarios SELECT: " + e.getMessage());
        }finally{
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        // retorna el objeto
            return datos;
       }
    //</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="Listar Propietarios">
    //Metodo para listar
    /**
     * Este metodo es para obtener todos los registros de la base de 
     * datos correspondientes a la clase Propietarios.
     * 
     * @return Este metodo retorna una ArrayList de tipo Propietarios.
     * 
     */
    @Override
    public ArrayList<Propietarios> list() {
        //Crea un objeto tipo ArrayList
        ArrayList<Propietarios>list;
        //Crea un objeto tipo Propietarios
        Propietarios propi;
        //Inicializa el objeto tipo ArrayLisst
        list= new ArrayList();
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de Datos
            sql="SELECT * FROM propietarios";
            //Ejecuta la consulta en la base de Datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Realiza la consulta y Muestra los datos.
            result=ejecutar.executeQuery();
            //Visualiza los datos de la consulta
            while (result.next()) {   
                propi= new Propietarios();
                propi.setPropietarioId(result.getInt("propietario_id"));
                propi.setAcreedor(result.getString("acreedor"));
                propi.setUser(result.getString("user"));
                propi.setPass(result.getString("password"));
                
                list.add(propi);
            }
        } catch (SQLException e) {
            //Mensaje por consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error DAOPropietarios list: "+e.getMessage());
        }finally{
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        //Retorna la consulta del ArrayList
        return list;
        }

    //</editor-fold>
}
