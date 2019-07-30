package dao;

//Creacion de la clase dao
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Propietarios;

//implementacion de los metodos abstractos de la interfaz
public class DAOPropietarios implements interfaces.InterfacePropietarios {

    private ConexionDB cn = new ConexionDB();
    private String sql = "";
    private String mensaje = "";
    private ResultSet result;
    private PreparedStatement ejecutar;
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
            sql = "INSERT INTO propietarios VALUES(?,?,?,?,?)";
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

    
    //<editor-fold defaultstate="collapsed" desc="Insertar Propietarios">
    //Metodo para Seleccionar
    /**
     * Este metodo es para realizar la consulta de un tipo de facturacion en
     * base a la id.
     *
     * @param tipo_id Este parametro es la id del elemento que deseamos buscar.
     * @return Retorna el objeto obtendio de nuestra consulta.
     */
    @Override
    public Propietarios select(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="Insertar Propietarios">
    //Metodo para Seleccionar
    /**
     * Este metodo es para realizar la consulta de un tipo de facturacion en
     * base a la id.
     *
     * @param tipo_id Este parametro es la id del elemento que deseamos buscar.
     * @return Retorna el objeto obtendio de nuestra consulta.
     */
    @Override
    public ArrayList<Propietarios> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //</editor-fold>
}
