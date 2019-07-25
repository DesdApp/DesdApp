/*
*sql = Sentencia sql, permite manejar los datos en la Base de datos
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Negocios;

//Se implemeta la interface de mi clase Negocios = InterfaceNegocios
public class DAONegocios implements interfaces.InterfaceNegocios {

//Instaciamos clases
    private ConexionDB cn = new ConexionDB();//cn = Objeto de conexion con la Base de Datos
    private ResultSet rs;//rs = Objeto ResultSet, permite visualizar los datos de las consultas a la Base de Datos
    private PreparedStatement jc;//jc = objeto PreparedStatement, encargado de enviar las sentencias SQL al driver
    private Negocios datosneg;//datosneg = Objeto de la clase Negocios, sera utilizada en metodo select

//Atributos
    private String sql = "";

    @Override
    /*
    *Este metodo se encarga de insertar registros a la Base de Datos
     */
    public void insertNeg(Negocios neg) {
        try {
            cn.conectar();//Realizamos la conexion con la base de datos
            sql = "INSERT INTO negocios VALUES(?,?,?,?,?,?,?,?,?)";//Asignamos la consulta al sql

            jc = cn.getconexionDB().prepareStatement(sql);//Asignamos la consulta al PreparedStatement
            jc.setInt(1, neg.getNegocionId());//Asignamos valores a la consulta
            jc.setInt(2, neg.getBienImbId());
            jc.setInt(3, neg.getTipoTransId());
            jc.setInt(4, neg.getAsesorId());
            jc.setDouble(5, neg.getPriceVenId());
            jc.setDouble(6, neg.getComEmpresa());
            jc.setDate(7, neg.getFecha());
            jc.setByte(8, neg.getStatePagoId());
            jc.setInt(9, neg.getClientId());
            jc.executeUpdate();//Realizamos las cunsulta y actualizamos la base de datos
        } catch (SQLException e) {
            System.out.println("Error insertar negocio : " + e.getMessage());//Si la consulta es incorrecta se muestra este mensaje
        } finally {
            cn.desconectar();//Desconectamos la conexion a la conexion a la Base de datos
        }
    }

    @Override
    /*
    *Este metodo se encarga de realizar modificaciones a registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos.
    *Cerramos la Base de Datos.
     */
    public void updateNeg(Negocios neg) {
        try {
            cn.conectar();
            sql = "UPDATE negocios SET bien_inmueble_id=?,tipo_transaccion_id=?,asesor_id=?,precio_venta_propiedad=?,comision_empresa=?,fecha=?,estado_pago_id=?,cliente_id=? WHERE negocio_id=?";

            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1, neg.getBienImbId());
            jc.setInt(2, neg.getTipoTransId());
            jc.setInt(3, neg.getAsesorId());
            jc.setDouble(4, neg.getPriceVenId());
            jc.setDouble(5, neg.getComEmpresa());
            jc.setDate(6, neg.getFecha());
            jc.setByte(7, neg.getStatePagoId());
            jc.setInt(8, neg.getClientId());
            jc.setInt(9, neg.getNegocionId());
            jc.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error no se pudo modificar Negocio : " + e.getMessage());
        } finally {
            cn.desconectar();
        }
    }

    @Override
    /*
    *Este metodo se encarga de eliminar registros de la Base de Datos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    public void deleteNeg(Negocios neg) {
        try {
            cn.conectar();
            sql = "DELETE FROM negocios WHERE negocio_id=?";
            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1, neg.getNegocionId());
            jc.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error no se pudo eliminar Negocio : " + e.getMessage());
        } finally {
            cn.desconectar();
        }
    }

    @Override
    /**
     * @return registros de la tabla
     */

    /*
    *Este metodo se encarga de llamar a los registros de la Base de Datos para porteriormente listarlos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    public ArrayList<Negocios> listaNeg() {
        ArrayList<Negocios> lista = new ArrayList();//Creamos un objeto de tipo List<Neg> para obtener todos los registros almacenados.
        Negocios ng;//Creamos un objeto de mi clase Negocios para llamar a los registros.

        try {
            cn.conectar();
            sql = "SELECT * FROM negocios";
            jc = cn.getconexionDB().prepareStatement(sql);
            rs = jc.executeQuery();//Se utiliza el executeQuery para obtener los resultados de la consulta y posteriormente los asigna al resultSet para luego acceder a ellos

            while (rs.next())//Verifica que haya mas registros
            {
                ng = new Negocios();//Inicializamos el objeto ng
                ng.setNegocionId(rs.getInt("negocio_id"));//Asignamos los valores al resultSet
                ng.setBienImbId(rs.getInt("bien_inmueble_id"));
                ng.setTipoTransId(rs.getInt("tipo_transaccion_id"));
                ng.setAsesorId(rs.getInt("asesor_id"));
                ng.setPriceVenId(rs.getDouble("precio_venta_propiedad"));
                ng.setComEmpresa(rs.getDouble("comision_empresa"));
                ng.setFecha(rs.getDate("fecha"));
                ng.setStatePagoId(rs.getByte("estado_pago_id"));
                ng.setClientId(rs.getInt("cliente_id"));
                lista.add(ng);//Asignamos los registros obtenidos por el objeto "ng" al ArrayList
            }
            rs.close();//Finalizamos la consulta
        } catch (SQLException e) {
            System.out.println("Error en DAONegocios LIST: " + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return lista;
    }

    /**
     * @return registro que se selecciono
     */
    /*
    *Este metodo se encarga de llamar a registros de la Base de Datos y mostralos.
    *Nos conectamos a la base de datos,asignamos nuestra consulta al PreparedStatement,realizamos la consulta y actualizamos datos.
    *Cerramos la Base de Datos.
     */
    @Override
    public Negocios selectNeg(Negocios neg) {
        try {
            cn.conectar();
            sql = "SELECT * FROM negocios WHERE negocio_id=?";

            jc = cn.getconexionDB().prepareStatement(sql);
            jc.setInt(1, neg.getNegocionId());
            rs = jc.executeQuery();

            rs.next();
            datosneg.setNegocionId(rs.getInt("negocio_id"));
            datosneg.setBienImbId(rs.getInt("bien_inmueble_id"));
            datosneg.setTipoTransId(rs.getInt("tipo_transaccion_id"));
            datosneg.setAsesorId(rs.getInt("asesor_id"));
            datosneg.setPriceVenId(rs.getDouble("precio_venta_propiedad"));
            datosneg.setComEmpresa(rs.getDouble("comision_empresa"));
            datosneg.setFecha(rs.getDate("fecha"));
            datosneg.setStatePagoId(rs.getByte("estado_pago_id"));
            datosneg.setClientId(rs.getInt("cliente_id"));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error no se pudo buscar el negocio" + e.getMessage());
        } finally {
            cn.desconectar();
        }
        return datosneg;
    }

}
