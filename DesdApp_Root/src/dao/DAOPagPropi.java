/*
 * cn // Objeto de la conexion a la base de datos
 * r // para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
 * run //  instancia de la ejecucion que contiene la base de datos
 * p // Objeto de la clase PagosPropiedades
 */
package dao;

import modelo.PagosPropiedades;
import interfaces.InterfazPagPro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOPagPropi implements InterfazPagPro {    //Implementamos la clase interface para los métodos abstractos

    // Instancias de clases
    ConexionDB cn = new ConexionDB();
    private ResultSet r;
    private PreparedStatement run;

    // Atributos
    private String sql;
    private String msg;

    @Override
    public PagosPropiedades select(PagosPropiedades pago) {  //Se realiza la consulta de select para ver el registro llamandolo por el detalle_id
        PagosPropiedades p = new PagosPropiedades();
        cn.conectar();
        sql = "SELECT * FROM pagos_propiedades WHERE pago_propiedad_id = ?"; //Se crea consulta sql para retornar los datos correspondientes al método
        try {

            run = cn.getconexionDB().prepareStatement(sql);   //Después de ser verificada la conexion, se obtiene la consulta
            r = run.executeQuery();  //Ejecuta la consulta y la almacena
            p.setPago_prop_id(r.getInt("pago_propiedad_id"));//Se asigna el valor específico a la variable
            p.setVenta_id(r.getInt("venta_id"));  //Se asigna el valor específico a la variable
            p.setTipo_pago_id(r.getInt("tipo_pago_id")); //Se asigna el valor específico a la variable
            p.setNo_tran(r.getInt("transaccion_no"));  //Se asigna el valor específico a la variable
            p.setFecha(r.getDate("fecha"));  //Se asigna el valor específico a la variable
            p.setMonto_pagado(r.getDouble("monto_pagado"));  //Se asigna el valor específico a la variable
            r.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOPagPropi SELECT: " + e.getMessage());  //Comentario para mostrar un error
        } finally {
            cn.desconectar();
        }
        return p;  //retornamos los datos de la tabla
    }

    @Override
    public String update(PagosPropiedades pago) {   //Se realiza la consulta de update para actualizar algún registro
        cn.conectar();
        sql = "UPDATE pagos_propiedades SET venta_id = ?, tipo_pago_id = ?, transaccion_no = ?, fecha = ?, monto_pagado = ? WHERE pago_propiedad_id = ?";   //Se crea consulta sql para actualizar datos

        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, pago.getVenta_id());
            run.setInt(2, pago.getTipo_pago_id());
            run.setInt(3, pago.getNo_tran());
            run.setDate(4, pago.getFecha());
            run.setDouble(5, pago.getMonto_pagado());
            run.setInt(6, pago.getPago_prop_id());
            run.executeUpdate();
            msg = "Registro actualizado con exito";
        } catch (SQLException e) {
            msg = "Error al actualizar el registro";
            System.out.println("Error en DAOPagPropi UPDATE: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    @Override
    public String delete(PagosPropiedades pago) {  //Se realiza consulta de delete para eliminar un registro
        cn.conectar();
        sql = "DELETE FROM pagos_propiedades WHERE pago_propiedad_id = ?"; //Se crea consulta sql para eliminar algún registro
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, pago.getPago_prop_id());
            byte contDel = (byte) run.executeUpdate();
            if (contDel == 0) {
                msg = "El registro no existe";
            } else {
                msg = "Registro actualizado con exito";
            }
        } catch (SQLException e) {
            msg = "Error al eliminar el registro";
            System.out.println("Error en DAOPagPropi DELETE: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    @Override
    public String insert(PagosPropiedades pago) {   //Se realiza la consulta de insert para agregar un registro
        cn.conectar();
        sql = "INSERT INTO pagos_propiedades VALUES(?, ?, ?, ?, ?, ?)"; //Se crea la consulta sql para insertar datos de pagos de una propiedad
        try {
            run = cn.getconexionDB().prepareStatement(sql);
            run.setInt(1, pago.getPago_prop_id());
            run.setInt(2, pago.getVenta_id());
            run.setInt(3, pago.getTipo_pago_id());
            run.setInt(4, pago.getNo_tran());
            run.setDate(5, pago.getFecha());
            run.setDouble(6, pago.getMonto_pagado());
            run.executeUpdate();
            msg = "Registro almacenado con exito";
        } catch (SQLException e) {
            msg = "Error al agregar el registro";
            System.out.println("Error en DAOPagPropi INSERT: " + e.getMessage()); //Comentario que se mostrará en caso de tener un error
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    @Override
    public ArrayList<PagosPropiedades> list() {   //Se realiza consulta de listar para listar los datos que se solicitan
        ArrayList<PagosPropiedades> list = new ArrayList();
        PagosPropiedades p;

        try {
            cn.conectar();
            sql = "select * from pagos_propiedades"; //Se crea consulta de sql para retornar la lista de datos
            run = cn.getconexionDB().prepareStatement(sql);
            r = run.executeQuery();

            while (r.next()) {
                p = new PagosPropiedades();
                p.setPago_prop_id(r.getInt("pago_propiedad_id"));
                p.setVenta_id(r.getInt("venta_id"));
                p.setTipo_pago_id(r.getInt("tipo_pago_id"));
                p.setNo_tran(r.getInt("transaccion_no"));
                p.setFecha(r.getDate("fecha"));
                p.setMonto_pagado(r.getDouble("monto_pagado"));
                list.add(p);
            }
            r.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOPagPropi LIST: " + e.getMessage());  //Comentario para marcar un error en caso de inconveniente
        } finally {
            cn.desconectar();
        }
        return list;  //retornamos la lista

    }

}
