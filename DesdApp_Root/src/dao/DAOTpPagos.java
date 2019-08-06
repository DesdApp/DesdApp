/*
 * cn // conexion a la base de datos
 * r // metadatos de resultSet
 * run // instancia de la ejecución
 * t // objeto de la clase TiposPagos
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.TiposPagos;

public class DAOTpPagos implements interfaces.InterfaceTpPagos {  //Implementamos la clase interface para los métodos abstractos

    // Instancias de las clases
    ConexionDB cn = new ConexionDB();
    private ResultSet r;
    private PreparedStatement run;

    // Atributos
    private String sql;
    private String msg;

    /**
     * 
     * @param id    mostrará los datos del registro que se buscó por el id
     * @return  retornará los datos
     */
    @Override
    public TiposPagos select(int id) { //Se realiza la consulta de select para ver el registro llamandolo por el detalle_id
        TiposPagos tipo = new TiposPagos();
        try {
            cn.conectar();
            sql = "SELECT * FROM tipos_pagos WHERE tipo_pago_id = ?"; //Se crea consulta sql para retornar los datos correspondientes al método
            run = cn.getconexionDB().prepareStatement(sql);  //Después de ser verificada la conexion, se obtiene la consulta
            run.setInt(1, id);
            r = run.executeQuery(); //Ejecuta la consulta y la almacena
            tipo.setTipo_pago_id(r.getInt("tipo_pago_id")); //Se asigna el valor específico a la variable
            tipo.setNombre(r.getString("nombre"));  //Se asigna el valor específico a la variable
            r.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOTpPagos SELECT: " + e.getMessage());  //Comentario para mostrar un error
        } finally {
            cn.desconectar();
        }
        return tipo;
    }
 /**
  * 
  * @param tipo  ingresará un nuevo registro 
  * @return  retornará un mensaje de confirmación o falla por que ya existe el id del registro
  */
    @Override
    public String insert(TiposPagos tipo) {  //Se realiza la consulta de insert para agregar un registro
        cn.conectar();
        sql = "INSERT INTO tipos_pagos VALUES(?,?)";  //Se crea la consulta sql para insertar datos de pagos de una propiedad

        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, tipo.getTipo_pago_id());
            run.setString(2, tipo.getNombre());
            run.executeUpdate();
            msg = "Registro almacenado con exito";
        } catch (SQLException e) {
            msg = "Error al almacenar el registro";
            System.out.println("Error en DAOTpPagos INSERT: " + e.getMessage());  //Comentario que se mostrará en caso de tener un error
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    /**
     * 
     * @param tipo  actualizará los datos de un registro por medio del id
     * @return  retornara una confirmación 
     */
    @Override
    public String update(TiposPagos tipo) { //Se realiza la consulta de update para actualizar algún registro
        cn.conectar();
        sql = "UPDATE tipos_pagos SET nombre = ? WHERE tipo_pago_id = ?";  //Se crea consulta sql para actualizar datos

        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setString(1, tipo.getNombre());
            run.setInt(2, tipo.getTipo_pago_id());
            run.executeUpdate();
            msg = "Registro actualziado con exito";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Error en DAOTpPagos UPDATE: " + e.getMessage());  //Comentario que mostrará la ubicación delete error
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    /**
     * 
     * @param id   eliminará el regsitro por el id
     * @return  retornará una conf
     */
    @Override
    public String delete(int id) { //Se realiza consulta de delete para eliminar un registro
        cn.conectar();
        sql = "DELETE FROM tipos_pagos WHERE tipo_pago_id = ?"; //Se crea consulta sql para eliminar algún registro
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, id);
            byte contDel = (byte) run.executeUpdate();
            if (contDel == 0) {
                msg = "El registro no existe";
            } else {
                msg = "Regsitro eliminado con exito";
            }
        } catch (SQLException e) {
            msg = "Error al eliminar el registro";
            System.out.println("Error en DAOTpPagos DELETE: " + e.getMessage());  //Mostrará el error en caso de que pase, primero Dios no
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    /**
     * 
     * @return   retornará una lista de los registros de la tabla 
     */
    @Override
    public ArrayList<TiposPagos> list() {   //Se realiza consulta de list para list los datos que se solicitan
        ArrayList<TiposPagos> list = new ArrayList();
        TiposPagos p;

        try {
            cn.conectar();
            sql = "SELECT * FROM tipos_pagos"; //Se crea consulta de sql para retornar la lista de datos
            run = cn.getconexionDB().prepareStatement(sql);
            r = run.executeQuery();

            while (r.next()) {
                p = new TiposPagos();
                p.setTipo_pago_id(r.getInt("tipo_pago_id"));
                p.setNombre(r.getString("nombre"));
                list.add(p);
            }
            r.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOTpPagos LIST: " + e.getMessage());  //Comentario para marcar un error en caso de inconveniente
        } finally {
            cn.desconectar();
        }
        return list;
    }

}
