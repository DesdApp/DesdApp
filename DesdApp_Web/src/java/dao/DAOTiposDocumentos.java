package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.TiposDocumentos;

/*
 * cn // conexion a la base de datos
 * r // metadatos de resultSet
 * run // instancia de la ejecución
 * t // objeto de la clase TiposPagos
 */
/**
 * Esta clase es el objeto de acceso a datos para la clase TiposDocumentos.
 * @author carolina
 */
public class DAOTiposDocumentos implements interfaces.InterfaceTiposDocumentos {//Implementacion de los metodos abstractos de la interfazTpDocumentos

    //Instancia de las clases
    ConexionDB cn = new ConexionDB();
    private ResultSet result;
    private PreparedStatement ejecutar;

    //atributos
    private String sql;

    /**
     * Este metodo es para realizar la consulta de un Tipo de Documento en base
     * al id.
     *
     * @param id Este parametro es el id del elemento que deseamos buscar.
     * @return Retorna el objeto obtenido en nuestra consulta.
     */
    @Override
    public TiposDocumentos select(int id) {
        //Creamos un nuevo Objeto de TiposDocumentos para almacenar el resultado de la busqueda
        TiposDocumentos tipo = new TiposDocumentos();
        try {
            //Se conecta a la base de Datos
            cn.conectar();
            //Se Envia la consulta a la base de datos
            sql = "SELECT * FROM tipo_documento WHERE tipo_documento_id=? ";
            //Prepara la consulta en la base de datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Ejecuata la consulta en la base de datos
            ejecutar.setInt(1, id);
            //Realiza la consulta y muestra los datos de la base de datos
            result = ejecutar.executeQuery();
            //Visualiza la consulta
            result.next();
            tipo.setIdTipoDoc(result.getByte("tipo_documento_id"));
            tipo.setNombre(result.getString("nombre_documento"));

            result.close();

        } catch (SQLException e) {
            //Mensaje Por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error al Seleccionar TipoDocumento: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //reorna la busqueda en base por medio del objeto tipo.
        return tipo;
    }

    /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondite a la clase TiposDocumentos
     *
     * @return Este metodo retorna un ArrayList de TiposDocumentos
     */
    @Override
    public ArrayList<TiposDocumentos> list() {
        //Se crea un objeto tipo ArrayList
        ArrayList<TiposDocumentos> list;
        //Se crea un objeto tipo TiposDocumentos
        TiposDocumentos tipos;
        //Se inicializa el objeto list.
        list = new ArrayList();
        try {
            //Nos conectamos a la base de datos
            cn.conectar();
            //Envia la consulta a la base de datos
            sql = "SELECT * FROM tipo_documento";
            //Prepara la consulta en la base de Datos
            ejecutar = cn.getconexionDB().prepareStatement(sql);
            //Realiza la consulta y Muestra los datos en la base de datos
            result = ejecutar.executeQuery();
            //visualiza la consulta
            while (result.next()) {
                //Cada vez que pase a un registro nuevo crea un objeto tipo tipos.
                tipos = new TiposDocumentos();
                tipos.setIdTipoDoc(result.getByte("tipo_documento_id"));
                tipos.setNombre(result.getString("nombre_documento"));

                list.add(tipos);
            }
        } catch (SQLException e) {
            //Mensaje por Consola de Error se utiliza para obtener un mensaje detallado del objeto Throwable
            System.out.println("Error en DAOTpDocumentos ArrayList: " + e.getMessage());
        } finally {
            //Se desconecta de la base de datos
            cn.desconectar();
        }
        //Retorna  la visualizacion de la lista
        return list;
    }

}
