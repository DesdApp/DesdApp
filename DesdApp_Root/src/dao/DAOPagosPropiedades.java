/*
 * cn // Objeto de la conexion a la base de datos
 * r // para visualizar todos los metadatos de ResultSet creado al consultar la base de datos
 * run //  instancia de la ejecucion que contiene la base de datos
 * p // Objeto de la clase PagosPropiedades
 */
package dao;

import modelo.PagosPropiedades;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOPagosPropiedades implements interfaces.InterfacePagosPropiedades{    //Implementamos la clase interface para los métodos abstractos

    // Instancias de clases
    ConexionDB cn = new ConexionDB();
    private ResultSet rs;
    private PreparedStatement run;

    // Atributos
    private String sql;
    private String msg;

    @Override
    public PagosPropiedades select(PagosPropiedades p) {  //Se realiza la consulta de select para ver el registro llamandolo por el detalle_id
        PagosPropiedades pago = new PagosPropiedades();
        cn.conectar();
        sql = "SELECT * FROM pagos_propiedades WHERE pago_propiedad_id = ?"; //Se crea consulta sql para retornar los datos correspondientes al método
        try {

            run = cn.getconexionDB().prepareStatement(sql);   //Después de ser verificada la conexion, se obtiene la consulta
            run.setInt(1, p.getPago_prop_id());
            rs = run.executeQuery();  //Ejecuta la consulta y la almacena
            pago.setPago_prop_id(rs.getInt("pago_propiedad_id"));//Se asigna el valor específico a la variable
            pago.setVenta_id(rs.getInt("venta_id"));  //Se asigna el valor específico a la variable
            pago.setTipo_pago_id(rs.getInt("tipo_pago_id")); //Se asigna el valor específico a la variable
            pago.setNo_tran(rs.getInt("transaccion_no"));  //Se asigna el valor específico a la variable
            pago.setFecha(rs.getDate("fecha"));  //Se asigna el valor específico a la variable
            pago.setMonto_pagado(rs.getDouble("monto_pagado"));  //Se asigna el valor específico a la variable
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOPagosPropiedades SELECT: " + e.getMessage());  //Comentario para mostrar un error
        } finally {
            cn.desconectar();
        }
        return pago;  //retornamos los datos de la tabla
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
            System.out.println("Error en DAOPagosPropiedades UPDATE: " + e.getMessage());
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
            System.out.println("Error en DAOPagPropiedades DELETE: " + e.getMessage());
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
            msg = "Error al almacenar el registro";
            System.out.println("Error en DAOPagosPropiedades INSERT: " + e.getMessage()); //Comentario que se mostrará en caso de tener un error
        } finally {
            cn.desconectar();
        }
        return msg;
    }

    @Override
    public ArrayList<PagosPropiedades> list() {   //Se realiza consulta de listar para listar los datos que se solicitan
        ArrayList<PagosPropiedades> list = new ArrayList();
        PagosPropiedades pago;

        try {
            cn.conectar();
            sql = "SELECT * FROM pagos_propiedades"; //Se crea consulta de sql para retornar la lista de datos
            run = cn.getconexionDB().prepareStatement(sql);
            rs = run.executeQuery();

            while (rs.next()) {
                pago = new PagosPropiedades();
                pago.setPago_prop_id(rs.getInt("pago_propiedad_id"));
                pago.setVenta_id(rs.getInt("venta_id"));
                pago.setTipo_pago_id(rs.getInt("tipo_pago_id"));
                pago.setNo_tran(rs.getInt("transaccion_no"));
                pago.setFecha(rs.getDate("fecha"));
                pago.setMonto_pagado(rs.getDouble("monto_pagado"));
                list.add(pago);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOPagosPropiedades LIST: " + e.getMessage());  //Comentario para marcar un error en caso de inconveniente
        } finally {
            cn.desconectar();
        }
        return list;  //retornamos la lista

    }

}
