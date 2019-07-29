package dao;
import modelo.TipoFacturacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoTipo// Objeto de la clase TipoFacturacion
 */
//implementacion de los Metodos Abastractos de la interfaz Tipo Facturacion
public class DAOTipoFacturacion implements interfaces.InterfaceTipoFac {

    public ConexionDB cn = new ConexionDB();
    public String sql = "";
    public String mensaje = "";
    public ResultSet result;
    public PreparedStatement ejecutar;
    public TipoFacturacion datoTipo;
    public int contTipo;

    //Metodo para ingresar
    @Override
    public String insert(TipoFacturacion tipo) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "INSERT INTO tipos_facturacion VALUES(?,?,?)";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, tipo.getTipoId());
            ejecutar.setString(2, tipo.getNombre());
            //Realiza la consulta y actualiza la base de datos
            contTipo = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contTipo == 0) {
                mensaje = "No se ingreso el registro";
            } else {
                mensaje = "Se ha ingresado el registro correctamente";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error al ingresar registro";
            System.out.println("Error en DAOTipoFacturacion INSERT: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
    }

    //Metodo para Modificar 
    @Override
    public String update(TipoFacturacion tipo) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "UPDATE tipos_facturacion SET nombre=? WHERE tipo_id=?";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setString(1, tipo.getNombre());
            ejecutar.setInt(2, tipo.getTipoId());
            //Realiza la consulta y actualiza la base de datos
            contTipo = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contTipo == 0) {
                mensaje = "No se actualizó el registro";
            } else {
                mensaje = "Se ha actualizado el registro";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error al actualizar";
            System.out.println("Error en DAOTipoFactura UPDATE: "+ e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
    }

    //Metodo para Eliminar
    @Override
    public String delete(TipoFacturacion tipo) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "DELETE FROM tipos_facturacion WHERE tipo_id=?";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, tipo.getTipoId());
            //Realiza la consulta y actualiza la base de datos
            contTipo = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contTipo == 0) {
                mensaje = "No se encontró registro";
            } else {
                mensaje = "Se ha eliminado el registro";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error al eliminar Tipo Factura";
            System.out.println("Error el DAOTipoFacturacion DELETE: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
    }

    //Metodo para Seleccionar
    /**
     * Este metodo es para realizar la consulta de un tipo de facturacion 
     * en base a la id.
     * 
     * @param tipo_id Este parametro es la id del elemento que deseamos buscar.
     * @return Retorna el objeto obtendio de nuestra consulta.
     */
     
    @Override
    public TipoFacturacion select(TipoFacturacion tipo_id) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "SELECT * FROM tipos_facturacion WHERE tipo_id=?";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, tipo_id.getTipoId());
            //Realiza la consulta y muestra los detos de la base de datos
            result = ejecutar.executeQuery();
            //visualiza la consulta
            while (result.next()) {
                datoTipo.setTipoId(result.getInt("tipo_id"));
                datoTipo.setNombre(result.getString("nombre"));
            }
        } catch (SQLException e) {
            //Mensaje por consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error al bucar Tipo Factura: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion de la consulta 
        return datoTipo;
    }

    //Metodo para listar
    /**
     * Este metodo es para obtener todos los registros de la base de 
     * datos correspondientes a la clase TipoFacturacion.
     * 
     * @return Este metodo retorna una ArrayList de tipo TipoFacturacion.
     * 
     */
    
    @Override
    public ArrayList<TipoFacturacion> list() {
        //Crea un objeto tipo ArrayList
        ArrayList<TipoFacturacion> list;
        //Crea un objeto tipo TipoFacturacioin
        TipoFacturacion tip;
        //Inicializa el objeto list
        list = new ArrayList();
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "SELECT * FROM tipos_facturacion";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Realiza la consulta y muestra los datos de la base de datos
            result = ejecutar.executeQuery();
            //visulaisa la consulta
            while (result.next()) {
                /*Por cada resultado que se obtenga de la consulta  
                se almacenara en el objeto de tipo TipoFacturacion
                
                 */
                tip = new TipoFacturacion();
                tip.setTipoId(result.getInt("tipo_id"));
                tip.setNombre(result.getString("nombre"));
                //almacena cada objeto en la lista
                list.add(tip);

            }
        } catch (SQLException e) {
            //Mensaje por consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error en DAOTipoFacturacion ArrayList: \n" + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion de la lista
        return list;
    }
    

}
