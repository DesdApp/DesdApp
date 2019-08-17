/*
 * String msg es usado para mostrar un mensaje de como se realizo una consulta  
 * String sql se utiliza para escribir la consulta SQL
 */
package dao;

import modelo.BienesInmuebles;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.VentaRenta;

public class DAOVentaRenta implements interfaces.InterfaceVentaRenta {

    // Instanciamos los objetos
    ConexionDB cx = new ConexionDB();   // Objeto usado para establecer la conexion con la base de datos
    PreparedStatement execute;  // El PreparedStatement se utiliza para asignar datos antes de realizar una consulta SQL 
    ResultSet rs;   // El ResultSet almacena los registros que devuelve la consulta para luego acceder a ellos

    // Atributos
    String sql;
    String msg;

    @Override
    public VentaRenta selectEstado(byte codigo) {
        /*
        * Se realiza la consulta para seleccionar un registro
        */
        VentaRenta estado = new VentaRenta();// Se crea un nuevo objeto VentaRenta para almacenar el resultado de la busqueda
        try {
            cx.conectar();
            sql = "SELECT * FROM venta_renta WHERE estado_neg_id = ?";
            execute = cx.getconexionDB().prepareStatement(sql);
            execute.setByte(1, codigo);
            /*
            * Se utiliza el ExecuteQuery para obtener los resultados de la consulta
            * y los asigna al ResutSet para luego acceder a ellos
            */
            rs = execute.executeQuery();
            rs.next(); // Se pasa al  siguiente registro.
            estado.setEstadoNegId(rs.getByte("estado_neg_id"));// Se obtienen los valores de los campos y se le asignan al objeto estado
            estado.setNombre(rs.getString("nombre"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOVentaRenta SELECT: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return estado;
    }

    @Override
    public ArrayList<VentaRenta> ListEstados() {
        VentaRenta estados;
        ArrayList<VentaRenta> list = new ArrayList<>();// Utilizamos un ArrayList para obtener todos los registros y almacenarlos
        try {
            cx.conectar();
            sql = "SELECT * FROM venta_renta";
            execute = cx.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            while (rs.next()) {// Verifica que hayan mas registros
                estados = new VentaRenta();// Cada vez que pase a un registro nuevo crea un objeto VentaRenta
                estados.setEstadoNegId(rs.getByte("estado_neg_id"));
                estados.setNombre(rs.getString("nombre"));
                list.add(estados);// Se agregan los registros al ArrayList
            }
        } catch (SQLException e) {
            System.out.println("Error en DAOVentaRenta LIST: " + e.getMessage());
        } finally {
            cx.desconectar();
        }
        return list;
    }

}
