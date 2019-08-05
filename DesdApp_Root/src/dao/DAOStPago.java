/*
*sql = Sentencia sql, permite manejar los datos en la Base de Datos
 */
package dao;

import modelo.StPago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Se implementa la Interface de la clase StPago= InterfaceStPago
public class DAOStPago implements interfaces.InterfaceStPago {

//Instanciamos las clases
    private ConexionDB cn = new ConexionDB();//cn = objeto para  hacer conexion con la Base de Datos
    private ResultSet rs;//rs = Objeto ResultSet, permite visualizar los datos de las consultas a la Base de Datos
    private PreparedStatement jc;//jc = objeto PreparedStatement, encargado de enviar las sentencias SQL al driver
    private StPago datosStPag;//datosStPag = objeto de la clase StPago, se utilizara en el metodo select

//Atributos
    private String sql = "";
    private String msg;

    /**
     * 
     * 
     */
    @Override
    /*
    *Este metodo se encarga de llamar a los registros de la Base de Datos para porteriormente listarlos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    public ArrayList<StPago> listaStPago() {
        ArrayList<StPago> lista = new ArrayList();//Creamos un objeto de tipo List<StPago> para obtener todos los registros almacenados
        StPago p;//Creamos un objeto de mi clase StPago para llamar a los registros.

        try {
            cn.conectar();
            sql = "SELECT * FROM estado_pagos ";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();//Se utiliza el executeQuery para obtener los resultados de la consulta y posteriormente los asigna al resultSet para luego acceder a ellos

            while (rs.next())//Verifica que haya mas registros
            {
                p = new StPago();//Inicializamos el objeto p
                p.setStPagoId(rs.getByte("estado_pago_id"));
                p.setName(rs.getString("nombre"));
                lista.add(p);//Asignamos los registros obtenidos por el objeto "p" al ArrayList
            }
            rs.close();//Finalizamos la consulta
        } catch (SQLException e) {
            System.out.println("Error no se pudo listar Estado de Pago : " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return lista;
    }

    /**
     * 
     * @param pag   buscará el registro de la base de datos por medio de pag 
     *  @return   retornará los datos obtenidos por medio de una consulta con su id
     */
    @Override

    /*
    *Este metodo se encarga de llamar registros de la Base de Datos y mostralos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    public StPago selectStPago(StPago pag) {
        try {
            cn.conectar();
            sql = "SELECT * FROM estado_pagos WHERE estado_pago_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();

            rs.next();
            datosStPag.setStPagoId(rs.getByte("estado_pago_id"));
            datosStPag.setName(rs.getString("nombre"));
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error no se pudo buscar Estado de Pago : " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return datosStPag;
    }

}
