
package dao;

import interfaces.InterfaceDepartamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Departamentos;

/*
*cn // Objeto de la Conexion a la Base de datos
*sql // sentencia sql
*result //para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
*ejecutar// instancia de la ejecucion que contiene la base de datos
*datoDepto// Objeto de la clase Departameto
*contDepto// verificar las sentencias if de cada metodo.
*/


public class DaoDepartamentos implements InterfaceDepartamento{
    private ConexionDB cn= new ConexionDB();
    private String sql="";
    private String mensaje="";
    private  ResultSet resul;
    private PreparedStatement ejecutar;
    private Departamentos datoDepto;
    private int conDepto=0;

    //Insertar Departamentos
    @Override
    public String insertDepto(Departamentos depto) {
        try {
            cn.conectar();
            sql="insert into departamentos values(?,?,?)";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, depto.getDeptoId());
            ejecutar.setString(2, depto.getNombre());
            ejecutar.setInt(3, depto.getRegionId());
            conDepto=ejecutar.executeUpdate();
            
            if (conDepto==0) {
                mensaje="No se a podido insertar El Registro";
            }else{
                mensaje="Registro Almacenado con exito";
            }
        } catch (Exception e) {
            mensaje="Erro al insertar un Deprtamento"+e;
        }finally{
            cn.desconectar();
        }
        return mensaje;
        }

    //Modificar Departamentos
    @Override
    public String updateDepto(Departamentos depto) {
        try {
            cn.conectar();
            sql="update departamentos set nombre=?, region_id=? where depto_id=?";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            ejecutar.setString(1, depto.getNombre());
            ejecutar.setInt(2, depto.getRegionId());
            ejecutar.setInt(3, depto.getDeptoId());
            conDepto=ejecutar.executeUpdate();
            if (conDepto==0) {
                mensaje="No se a podido modificar El Registro";
            }else {
                mensaje="Registro modificado Con Exito";
            }
        } catch (Exception e) {
            mensaje="Error a modificar Deprtamentos: "+e;
        }finally{
            cn.desconectar();
        }
        return mensaje;
          }

    //Eliminar Departamentos
    @Override
    public String deleteDepto(Departamentos depto) {
        try {
            cn.conectar();
            sql="delete from departamentos where depto_id=?";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            ejecutar.setInt(1, depto.getDeptoId());
            conDepto=ejecutar.executeUpdate();
            if (conDepto==0) {
                mensaje="No se a podido Eliminar el Registro";
            } else {
                mensaje="Registro Eliminado Con Exito";
            }
        } catch (SQLException e) {
            mensaje="Error al Eliminar Departamentos: "+e;
        }finally{
            cn.desconectar();
        }
        return mensaje;
       }

    //Seleccionar Departamentos
    @Override
    public Departamentos selectDepto(Departamentos depto) {
        try {
            cn.conectar();
            sql="select * from departamentos where depto_id=?";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            resul= ejecutar.executeQuery();
            
            while (resul.next()) {                
                datoDepto.setDeptoId(resul.getInt("depto_id"));
                datoDepto.setNombre(resul.getString("nombre"));
                datoDepto.setRegionId(resul.getInt("region_id"));
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar Departamentos " +e);
        }finally{
            cn.desconectar();
        }
        return datoDepto;
        }

    //Listar Departamentos
    @Override
    public ArrayList<Departamentos> listDepto() {
        ArrayList<Departamentos> list;
        Departamentos deptos;
        list=new ArrayList();
        try {
            cn.conectar();
            sql="select * from departamentos";
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            resul=ejecutar.executeQuery();
            while (resul.next()) {                
                deptos=new Departamentos();
                deptos.setDeptoId(resul.getInt("depto_id"));
                deptos.setNombre(resul.getString("nombre"));
                deptos.setRegionId(resul.getInt("region_id"));
                list.add(deptos);
            }
        } catch (SQLException e) {
            System.out.println("Error al Listar Departamentos: "+e);
        }finally{
            cn.desconectar();
        }
        return list;
        
         }
    
}
