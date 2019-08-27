package dao;

import interfaces.InterfaceVistaBienes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.VistaBienes;

//Se implementa las interface de VistaBienes
public class DAOVistaBienes implements InterfaceVistaBienes{

    ConexionDB cx = new ConexionDB();//Se hace la conexion con la base de datos
    PreparedStatement execute;//Sirve para ejecutar las consultas en mi base de datos
    ResultSet rs;//Guarda los resultados de las consultas en mi base de datos
    
    //Atributos
    String sql = "";
    
    
    @Override
    public ArrayList<VistaBienes> listview(String prop) {
        ArrayList<VistaBienes> list = new ArrayList<>();//Se crea un objeto de tipo ArrayList para guardar el resultado de mi consulta
        VistaBienes vsBien;//Se crea un objeto de tipos VistaBien para ser usado en el bucle while
      
        try {
            cx.conectar();//Se abrio la conexion
            
            sql = "SELECT * FROM vista_inmueble WHERE tipopropiedad=?";//Se hace la consulta
            execute = cx.getconexionDB().prepareStatement(sql);//Se asigna la consulta a la base de datos
            execute.setString(1, prop);
            rs = execute.executeQuery();//Se asigna la respuesta del sql al objeto de tipo ResultSet
            
            while(rs.next()){
               vsBien = new VistaBienes();//Se intancia el objeto vsBien
               vsBien.setTipoProp(rs.getString("tipopropiedad"));//Se asigna al objeto vsBien datos de la base de datos
               vsBien.setVentaRenta(rs.getString("ventarenta"));
               vsBien.setHabitacion(rs.getInt("habitaciones"));
               vsBien.setMetrosC(rs.getString("metrocuadrado"));
               vsBien.setZona(rs.getString("zona"));
               vsBien.setDep(rs.getString("departamentos"));
               vsBien.setPrecioSug(rs.getInt("precio"));
               vsBien.setCodemple(rs.getInt("codemple"));
               vsBien.setNomemple(rs.getString("nombre"));
               list.add(vsBien);//Se le asigna los datos obtenidos en la base de datos(vsBien) al objeto de tipo ArrayList
            }
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error no se pudo mostrar los datos error DaoVistaBienes: " + e.getMessage());//Mensaje de error
        }
        finally{
            cx.desconectar();//Cierra conexion
        }
        return list;//Se retorna la lista que se le asigno el resultado de la busqueda
    }

    @Override
    public ArrayList<VistaBienes> listVnRn(String vent) {
     ArrayList<VistaBienes> listVent = new ArrayList<>();//Se crea un objeto de tipo ArrayList para guardar el resultado de mi consulta
        VistaBienes vsBien;//Se crea un objeto de tipos VistaBien para ser usado en el bucle while
      
        try {
            cx.conectar();//Se abrio la conexion
            
            sql = "SELECT * FROM vista_inmueble WHERE ventarenta=?";//Se hace la consulta
            execute = cx.getconexionDB().prepareStatement(sql);//Se asigna la consulta a la base de datos
            execute.setString(1, vent);
            rs = execute.executeQuery();//Se asigna la respuesta del sql al objeto de tipo ResultSet
            
            while(rs.next()){
               vsBien = new VistaBienes();//Se intancia el objeto vsBien
               vsBien.setTipoProp(rs.getString("tipopropiedad"));//Se asigna al objeto vsBien datos de la base de datos
               vsBien.setVentaRenta(rs.getString("ventarenta"));
               vsBien.setHabitacion(rs.getInt("habitaciones"));
               vsBien.setMetrosC(rs.getString("metrocuadrado"));
               vsBien.setZona(rs.getString("zona"));
               vsBien.setDep(rs.getString("departamentos"));
               vsBien.setPrecioSug(rs.getInt("precio"));
               vsBien.setCodemple(rs.getInt("codemple"));
               vsBien.setNomemple(rs.getString("nombre"));
               listVent.add(vsBien);//Se le asigna los datos obtenidos en la base de datos(vsBien) al objeto de tipo ArrayList
            }
            rs.close();
            
        } catch (Exception e) {
            System.out.println("Error no se pudo mostrar los datos error DaoVistaBienes: " + e.getMessage());//Mensaje de error
        }
        finally{
            cx.desconectar();//Cierra conexion
        }
        return listVent;//Se retorna la lista que se le asigno el resultado de la busqueda
    }
    
}
