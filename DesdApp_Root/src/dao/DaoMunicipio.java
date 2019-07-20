package dao;

//Clase Dao para Municipios
import interfaces.InterfaceMunicipio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Municipios;

/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoMuni// Objeto de la clase Municipios
*contMuni// verificar las sentencias if de cada metodo.
 */
//implementacion de los metodos abstractos de la interfaz municipio
public class DaoMunicipio implements InterfaceMunicipio {

    private ConexionDB cn = new ConexionDB();
    private String sql = "";
    private String mensaje = "";
    private ResultSet result;
    private PreparedStatement ejecutar;
    private Municipios datoMuni;
    private int contMuni = 0;

    //Metodo para insertar Municipios
    @Override
   
    public String insertMuni(Municipios muni) {
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Eniva la consulta a la base de datos
            sql = "insert into municipios values(?,?,?)";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, muni.getMuniIdi());
            ejecutar.setString(2, muni.getNombre());
            ejecutar.setInt(3, muni.getDeptoId());
            //Realiza la consulta y Actualliza la base de datos
            contMuni = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contMuni == 0) {
                mensaje = "El registro no se a pidido Ingresar";
            } else {
                mensaje = "Registro Ingresado Con exito";
            }
        } catch (SQLException e) {
             //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error al insertar Municipios: " + e;
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
    }

    //Metodo para Modificar Municipios
    @Override
    public String updateMuni(Municipios muni) {
        try {
             //Se conecta a la base de datos
            cn.conectar();
            //Eniva la consulta a la base de datos
            sql = "updte munisipios set nombre=?, depto_id=? where muni_id=?";
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
                mensaje = "El registro no se a podido Modificar";
            } else {
                mensaje = "Registro modificado con Exito";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error al modificar Municipios: " + e;
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
    }

    //Metodo para Eliminar Municipios
    @Override
    public String deleteMuni(Municipios muni) {
        try {
             //Se conecta a la base de datos
            cn.conectar();
            //Eniva la consulta a la base de datos
            sql = "delete from departamentos  where muni_id=?";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, muni.getMuniIdi());
            //Realiza la consulta y Actualliza la base de datos
            contMuni = ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (contMuni == 0) {
                mensaje = "El registro nos e a podido Eliminar";
            } else {
                mensaje = "Registro eliminado con Exito";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje = "Error a eliminar Municipios: " + e;
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
    }

    //Metodos para Seleccionar municipios
    @Override
    public Municipios selectMuni(Municipios muni) {
        try {
             //Se conecta a la base de datos
            cn.conectar();
            //Eniva la consulta a la base de datos
            sql = "select * from municipios where muni_id=?";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, muni.getMuniIdi());
            //Realiza la consulta y muestra los datos de la base de datos
            result = ejecutar.executeQuery();
            //Visualiza la consulta
            while (result.next()) {
                datoMuni.setMuniIdi(result.getInt("muni_id"));
                datoMuni.setNombre(result.getString("nombre"));
                datoMuni.setDeptoId(result.getInt("depto_id"));
            }
        } catch (SQLException e) {
            //Mensaje Por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error al Seleccionar Departamento: " + e);
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion por medio del objeto datoMuni
        return datoMuni;
    }

    //Metodo para Listar Municipios.
    @Override
    public ArrayList<Municipios> listMuni() {
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
            sql = "Select * from municipios";
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
            System.out.println("Error al listar municipios: " + e);
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion de la lista 
        return list;
    }

}
