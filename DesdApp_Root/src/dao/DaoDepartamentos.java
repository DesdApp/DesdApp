
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

//implementacion de los metodos abstractos de la interfaz Departamento
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
            //Conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de Datos
            sql="insert into departamentos values(?,?,?)";
            //Prepara la consulta en la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de Datos
            ejecutar.setInt(1, depto.getDeptoId());
            ejecutar.setString(2, depto.getNombre());
            ejecutar.setInt(3, depto.getRegionId());
            //Realiza la consulta y actualiza la base de datos
            conDepto=ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (conDepto==0) {
                mensaje="No se a podido insertar El Registro";
            }else{
                mensaje="Registro Almacenado con exito";
            }
        } catch (Exception e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje="Erro al insertar un Deprtamento"+e;
        }finally{
            //Se desconecta de la base de Datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
        }

    //Modificar Departamentos
    @Override
    public String updateDepto(Departamentos depto) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de Datos
            sql="update departamentos set nombre=?, region_id=? where depto_id=?";
            //Prepara la consulta en la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setString(1, depto.getNombre());
            ejecutar.setInt(2, depto.getRegionId());
            ejecutar.setInt(3, depto.getDeptoId());
            //Realiza la consulta y Actualiza la base de Datos
            conDepto=ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (conDepto==0) {
                mensaje="No se a podido modificar El Registro";
            }else {
                mensaje="Registro modificado Con Exito";
            }
        } catch (Exception e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje="Error a modificar Deprtamentos: "+e;
        }finally{
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
          }

    //Eliminar Departamentos
    @Override
    public String deleteDepto(Departamentos depto) {
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql="delete from departamentos where depto_id=?";
            //Prepara la consulta en la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, depto.getDeptoId());
            //Realiza la consulta y Actualiza la base de datos
            conDepto=ejecutar.executeUpdate();
            //Condiciona la consulta SQL
            //Si Existe la consulta en la base de tados entramos en el else de lo contrario entra al if y en ambas nos muestra el mensaje
            if (conDepto==0) {
                mensaje="No se a podido Eliminar el Registro";
            } else {
                mensaje="Registro Eliminado Con Exito";
            }
        } catch (SQLException e) {
            //Mensaje de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            mensaje="Error al Eliminar Departamentos: "+e;
        }finally{
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la consulta por medio de la variable mensaje
        return mensaje;
       }

    //Seleccionar Departamentos
    @Override
    public Departamentos selectDepto(Departamentos depto) {
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql="select * from departamentos where depto_id=?";
            //Prepara la consulta en la base de Datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Ejecuta la consulta en la base de datos
            ejecutar.setInt(1, depto.getDeptoId());
            //Realiza la consulta y muesta los datos de la base de datos
            resul= ejecutar.executeQuery();
            //Visualiza los datos de la consulta
            while (resul.next()) {                
                datoDepto.setDeptoId(resul.getInt("depto_id"));
                datoDepto.setNombre(resul.getString("nombre"));
                datoDepto.setRegionId(resul.getInt("region_id"));
            }
        } catch (SQLException e) {
            //Mensaje Por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error al seleccionar Departamentos " +e);
        }finally{
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion de los datos Tipo Departamentos
        return datoDepto;
        }

    //Listar Departamentos
    @Override
    public ArrayList<Departamentos> listDepto() {
        //Crea un objeto tipo ArrayList
        ArrayList<Departamentos> list;
        //Crea un objeto tipo Departamentos
        Departamentos deptos;
        //Inicializa el objeto tipo list
        list=new ArrayList();
        try {
            //Se conecta a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql="select * from departamentos";
            //Prepara la consulta en la base de datos
            ejecutar=cn.getconexionDB().prepareStatement(sql);
            //Realiza la consulta y muesta los datos de la base de datos
            resul=ejecutar.executeQuery();
            //Visualiza los datos de la consulta
            while (resul.next()) {              
                //Cada vez que pase a un registro nuevo crea un objeto tipo Departamentos
                deptos=new Departamentos();
                deptos.setDeptoId(resul.getInt("depto_id"));
                deptos.setNombre(resul.getString("nombre"));
                deptos.setRegionId(resul.getInt("region_id"));
                list.add(deptos);
            }
        } catch (SQLException e) {
            //Mensaje por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error al Listar Departamentos: "+e);
        }finally{
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna la visualizacion de los datos en un ArrayList
        return list;
        
         }
    
}
