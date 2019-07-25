package dao;

import interfaces.InterfaceRegion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Regiones;

/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoRegion// Objeto de la clase Region
 */
//implementacion de los Metodos Abastractos de la interfaz Regiones
public class DaoRegion implements InterfaceRegion {

    private ConexionDB cn = new ConexionDB();
    private String sql = "";
    private String mensaje = "";
    private ResultSet result;
    private PreparedStatement ejecutar;
    private Regiones datoRegion;
    private int contRegion;

    //insertar Un nuevo Registro para Regiones
    @Override
    public String insertRegion(Regiones region) {
        try {
            cn.conectar();//conecta a la base de datos
            sql = "insert into regiones values(?,?,?)"; //Se envia la consulta a la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql); //Prepara la consulta en la base de datos
            //ejecuta la consulta en la base de datos
            ejecutar.setInt(1, region.getRegionId());
            ejecutar.setString(2, region.getNombre());
            ejecutar.setString(3, region.getDescripcion());
            //Realiza la consulta y actualiza la base de datos
            contRegion = ejecutar.executeUpdate();

            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contRegion == 0) {  
                mensaje = "No se a podigo Insertar el Registro";
            } else {
                mensaje = "Regisgro Ingresado con Exito";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje="Erro al Ingresar Regiones: "+e;
        } finally {
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        //Retorna la consulta realizada a la base de datos
        return mensaje;
    }

    //Modificar Registro de Region
    @Override
    public String updateRegion(Regiones region) {
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "update regiones set nombre=?, descripcion=? where region_id=?";
            //Prepara la consulta en la base de Datos
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

                mensaje = "El registro no se pudo modificar";
            } else {
                mensaje = "Registro modificado con Exito";
            }

        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error al modificar Region: " + e;
        } finally {
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        //Retorna la consulta realizada a la base de datos
        return mensaje;
    }

    //Eliminar Regiones
    @Override
    public String deleteRegion(Regiones region) {
        try {
            //se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "delete from regiones where region_id=?";
            //Prepara la consulta en la base de Datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, region.getRegionId());
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
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error al eliminar Regiones: " + e;
        } finally {
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        return mensaje;
    }

    //seleccionar Region
    @Override
    public Regiones selectRegion(Regiones region) {
        try {
            //Conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "select * from regiones where region_id=?";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la bae de Datos
            ejecutar.setInt(1, region.getRegionId());
            //Realiza la consulta y Muesta los datos de la base de datos
            result = ejecutar.executeQuery();
            //Visualiza los datos de la consulta
            while (result.next()) {
                datoRegion.setRegionId(result.getInt("region_id"));
                datoRegion.setNombre(result.getString("nombre"));
                datoRegion.setDescripcion(result.getString("descripcion"));
            }

        } catch (SQLException e) {
            //Mensaje por consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error al Selecionar Registro" + e);
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna los datos tipo Region
        return datoRegion;
    }

    //listar Region.
    @Override
    public ArrayList<Regiones> listRegiones() {
        //Crea un objeto tipo ArrayList
        ArrayList<Regiones> list;
        //Crea un objeto tipo Regiones
        Regiones regiones;
        //Inicializamos el objeto list
        list=new ArrayList();   
        try {
            //Conectamos la base de datos
            cn.conectar();
            //Se envia la consulta a la base de datos
            sql="select * from regiones";
            //Prepara la consulta en la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Realiza la consulta y Muestra los datos 
            result=ejecutar.executeQuery();
            //Visualiza los datos de la consulta
            while (result.next()) {
                //Cada vez que pase a un registro nuevo crea un objeto Regiones
            regiones=new Regiones();
            regiones.setRegionId(result.getInt("region_id"));
            regiones.setNombre(result.getString("nombre"));
            regiones.setDescripcion(result.getString("descripcion"));
            //Se agregan los registros a un ArrayList
                list.add(regiones);
                
            }
        } catch (SQLException e) {
            //Mensaje Por consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error al seleccionar lista de Regiones: "+e);
        }
        finally{
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //retorna los registros del ArrayList
        return list;
    }

}
