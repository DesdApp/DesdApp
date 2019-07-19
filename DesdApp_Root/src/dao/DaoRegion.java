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
            cn.conectar();
            sql = "insert into regiones values(?,?,?)";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, region.getRegionId());
            ejecutar.setString(2, region.getNombre());
            ejecutar.setString(3, region.getDescripcion());
            contRegion = ejecutar.executeUpdate();

            if (contRegion == 0) {
                mensaje = "No se a podigo Insertar el Registro";
            } else {
                mensaje = "Regisgro Ingresado con Exito";
            }
        } catch (SQLException e) {
        } finally {
            cn.desconectar();
        }
        return mensaje;
    }

    //Modificar Registro de Region
    @Override
    public String updateRegion(Regiones region) {
        try {
            cn.conectar();
            sql = "update regiones set nombre=?, descripcion=? where region_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setString(1, region.getNombre());
            ejecutar.setString(2, region.getDescripcion());
            ejecutar.setInt(3, region.getRegionId());
            contRegion = ejecutar.executeUpdate();

            if (contRegion == 0) {

                mensaje = "El registro no se pudo modificar";
            } else {
                mensaje = "Registro modificado con Exito";
            }

        } catch (Exception e) {
            mensaje = "Error al modificar Region: " + e;
        } finally {
            cn.desconectar();
        }
        return mensaje;
    }

    //Eliminar Regiones
    @Override
    public String deleteRegion(Regiones region) {
        try {
            cn.conectar();
            sql = "delete from regiones where region_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, region.getRegionId());
            contRegion = ejecutar.executeUpdate();
            if (contRegion == 0) {
                mensaje = "El registro no se a podido Eliminar";
            } else {
                mensaje = "Registro eliminado con Exito";
            }

        } catch (SQLException e) {
            mensaje = "Error al eliminar Regiones: " + e;
        } finally {
            cn.desconectar();
        }
        return mensaje;
    }

    //seleccionar Region
    @Override
    public Regiones selectRegion(Regiones region) {
        try {
            cn.conectar();
            sql = "select * from regiones where region_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, region.getRegionId());
            result = ejecutar.executeQuery();

            while (result.next()) {
                datoRegion.setRegionId(result.getInt("region_id"));
                datoRegion.setNombre(result.getString("nombre"));
                datoRegion.setDescripcion(result.getString("descripcion"));
            }

        } catch (Exception e) {
            System.out.println("Error al Selecionar Registro" + e);
        } finally {
            cn.desconectar();
        }
        return datoRegion;
    }

    //listar Region.
    @Override
    public ArrayList<Regiones> listRegiones() {
        ArrayList<Regiones> list;
        Regiones regiones;
        list=new ArrayList();   
        try {
            cn.conectar();
            sql="select * from regiones";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            result=ejecutar.executeQuery();
            
            while (result.next()) {
            regiones=new Regiones();
            regiones.setRegionId(result.getInt("region_id"));
            regiones.setNombre(result.getString("nombre"));
            regiones.setDescripcion(result.getString("descripcion"));
                list.add(regiones);
                
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar lista de Regiones: "+e);
        }
        finally{
            cn.desconectar();
        }
        return list;
    }

}
