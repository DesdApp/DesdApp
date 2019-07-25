package dao;

import modelo.Regiones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoRegion// Objeto de la clase Region
 */
public class DAORegion implements interfaces.InterfaceRegion {

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
            sql = "INSERT INTO regiones VALUES(?,?,?)";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, region.getRegionId());
            ejecutar.setString(2, region.getNombre());
            ejecutar.setString(3, region.getDescripcion());
            contRegion = ejecutar.executeUpdate();

            if (contRegion == 0) {
                mensaje = "No se ingreso el registro";
            } else {
                mensaje = "Se ha ingresado correctamente el registro";
            }
        } catch (SQLException e) {
            System.out.println("Error en DAORegion INSERT: " + e.getMessage());
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
            sql = "UPDATE regiones SET nombre=?, descripcion=? WHERE region_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setString(1, region.getNombre());
            ejecutar.setString(2, region.getDescripcion());
            ejecutar.setInt(3, region.getRegionId());
            contRegion = ejecutar.executeUpdate();

            if (contRegion == 0) {

                mensaje = "No se actualizó el registro";
            } else {
                mensaje = "Se ha actualizado el registro";
            }

        } catch (Exception e) {
            System.out.println("Error en DAORegion UPDATE: " + e.getMessage());
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
            sql = "DELETE FROM regiones WHERE region_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, region.getRegionId());
            contRegion = ejecutar.executeUpdate();
            if (contRegion == 0) {
                mensaje = "El registro no se a podido Eliminar";
            } else {
                mensaje = "Registro eliminado con Exito";
            }

        } catch (SQLException e) {
            System.out.println("Error en DAORegion DELETE: " + e.getMessage());
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
            sql = "SELECT * FROM regiones WHERE region_id=?";
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, region.getRegionId());
            result = ejecutar.executeQuery();

            while (result.next()) {
                datoRegion.setRegionId(result.getInt("region_id"));
                datoRegion.setNombre(result.getString("nombre"));
                datoRegion.setDescripcion(result.getString("descripcion"));
            }

        } catch (Exception e) {
            System.out.println("Error al selecionar registro" + e.getMessage());
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
            sql="SELECT * FROM regiones";
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
            System.out.println("Error al seleccionar lista de Regiones: "+e.getMessage());
        }
        finally{
            cn.desconectar();
        }
        return list;
    }

}
