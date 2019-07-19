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
            cn.conectar();
            sql = "insert into municipios values(?,?,?)";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, muni.getMuniIdi());
            ejecutar.setString(2, muni.getNombre());
            ejecutar.setInt(3, muni.getDeptoId());
            contMuni = ejecutar.executeUpdate();
            if (contMuni == 0) {
                mensaje = "El registro no se a pidido Ingresar";
            } else {
                mensaje = "Registro Ingresado Con exito";
            }
        } catch (SQLException e) {
            mensaje = "Error al insertar Municipios: " + e;
        } finally {
            cn.desconectar();
        }
        return mensaje;
    }

    //Metodo para Modificar Municipios
    @Override
    public String updateMuni(Municipios muni) {
        try {
            cn.conectar();
            sql = "updte munisipios set nombre=?, depto_id=? where muni_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setString(1, muni.getNombre());
            ejecutar.setInt(2, muni.getDeptoId());
            ejecutar.setInt(3, muni.getMuniIdi());
            contMuni = ejecutar.executeUpdate();
            if (contMuni == 0) {
                mensaje = "El registro no se a podido Modificar";
            } else {
                mensaje = "Registro modificado con Exito";
            }
        } catch (SQLException e) {
            mensaje = "Error al modificar Municipios: " + e;
        } finally {
            cn.desconectar();
        }
        return mensaje;
    }

    //Metodo para Eliminar Municipios
    @Override
    public String deleteMuni(Municipios muni) {
        try {
            cn.conectar();
            sql = "delete from departamentos  where muni_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, muni.getMuniIdi());
            contMuni = ejecutar.executeUpdate();

            if (contMuni == 0) {
                mensaje = "El registro nos e a podido Eliminar";
            } else {
                mensaje = "Registro eliminado con Exito";
            }
        } catch (SQLException e) {
            mensaje = "Error a eliminar Municipios: " + e;
        } finally {
            cn.desconectar();
        }
        return mensaje;
    }

    //Metodos para Seleccionar municipios
    @Override
    public Municipios selectMuni(Municipios muni) {
        try {
            cn.conectar();
            sql = "select * from municipios where muni_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, muni.getMuniIdi());
            result = ejecutar.executeQuery();
            while (result.next()) {
                datoMuni.setMuniIdi(result.getInt("muni_id"));
                datoMuni.setNombre(result.getString("nombre"));
                datoMuni.setDeptoId(result.getInt("depto_id"));
            }
        } catch (SQLException e) {
            System.out.println("Error al Seleccionar Departamento: " + e);
        } finally {
            cn.desconectar();
        }
        return datoMuni;
    }

    //Metodo para Listar Municipios.
    @Override
    public ArrayList<Municipios> listMuni() {
        ArrayList<Municipios> list;
        Municipios mun;
        list = new ArrayList();
        try {
            cn.conectar();
            sql = "Select * from municipios";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            result = ejecutar.executeQuery();
            while (result.next()) {
                mun = new Municipios();
                mun.setMuniIdi(result.getInt("muni_id"));
                mun.setNombre(result.getString("nombre"));
                mun.setMuniIdi(result.getInt("depto_id"));
                list.add(mun);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar municipios: " + e);
        } finally {
            cn.desconectar();
        }
        return list;
    }

}
