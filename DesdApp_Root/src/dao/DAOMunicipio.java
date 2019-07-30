package dao;

//Clase Dao para Municipios
import modelo.Municipios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoMuni// Objeto de la clase Municipios
*contMuni// verificar las sentencias if de cada metodo.
 */
//implementacion de los metodos abstractos de la interfaz municipio
public class DAOMunicipio implements interfaces.InterfaceMunicipio {

    private ConexionDB cn = new ConexionDB();
    private String sql = "";
    private String mensaje = "";
    private ResultSet result;
    private PreparedStatement ejecutar;
    private int contMuni = 0;

    //Metodo para insertar Municipios
    @Override
   
    public String insert(Municipios muni) {
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envía la consulta a la base de datos
            sql = "INSERT INTO municipios VALUES(?,?,?)";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, muni.getMuniIdi());
            ejecutar.setString(2, muni.getNombre());
            ejecutar.setInt(3, muni.getDeptoId());
            //Realiza la consulta y Actualliza la base de datos
            contMuni = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de datos entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contMuni == 0) {
                mensaje = "No se ha ingresado el registro";
            } else {
                mensaje = "Se ha ingresado el registro correctamente";
            }
        } catch (SQLException e) {
             //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error en DAOMunicipios INSERT: " + e.getMessage();
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
    }

    //Metodo para Modificar Municipios
    @Override
    public String update(Municipios muni) {
        try {
             //Se conecta a la base de datos
            cn.conectar();
            //Eniva la consulta a la base de datos
            sql = "UPDATE municipios SET nombre=?, depto_id=? WHERE muni_id=?";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setString(1, muni.getNombre());
            ejecutar.setInt(2, muni.getDeptoId());
            ejecutar.setInt(3, muni.getMuniIdi());
            //Realiza la consulta y Actualliza la base de datos
            contMuni = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contMuni == 0) {
                mensaje = "No se actualizó el registro";
            } else {
                mensaje = "Se ha actualizado el registro con éxito";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error en DAOMunicipios UPDATE: " + e.getMessage();
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
    }

    //Metodo para Eliminar Municipios
    @Override
    public String delete(int id) {
        try {
             //Se conecta a la base de datos
            cn.conectar();
            //Eniva la consulta a la base de datos
            sql = "DELETE FROM municipios  WHERE muni_id=?";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, id);
            //Realiza la consulta y Actualliza la base de datos
            contMuni = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contMuni == 0) {
                mensaje = "El registro no existe";
            } else {
                mensaje = "Se ha eliminado el registro con éxito";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error en DAOMunicipios DELETE: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
    }

    //Metodos para Seleccionar municipios
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

    //Metodo para Listar Municipios.
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

}
