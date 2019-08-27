package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Corredores;

/**
 * Esta clase es el objeto de acceso a datos para la clase Corredores.
 *
 * @author carolina
 */
public class DAOCorredores implements interfaces.corredoresInterface{
    //Instanciamos las clases
    ConexionDB conex = new ConexionDB();
    PreparedStatement execute;
    //Atributos
    ResultSet rs;
    String sql;
    
    /**
     * Este metodo es para obtener todos los registros de la base de datos
     * correspondientes a la clase Corredores.
     *@param cod_emp este parametro 
     * @return retornará una lista de los registros de la tabla que se pide en
     * la consulta
     */
    @Override
    public ArrayList<Corredores> lista(int cod_emp) {
        ArrayList<Corredores> lista = new ArrayList<>();
        Corredores cor;
        try {
            conex.conectar();
            sql = "SELECT * FROM view_cardsmodi WHERE cod_empleado=?";
            execute = conex.getconexionDB().prepareStatement(sql);
            execute.setInt(1, cod_emp);
            rs = execute.executeQuery();
            
            
            while (rs.next()){
            cor = new Corredores();
            cor.setNombre_corredor(rs.getString("nombre"));
            cor.setTel(rs.getInt("telefono"));
            cor.setCel(rs.getInt("celular"));
            cor.setCorreo(rs.getString("correo"));
            cor.setCod_emp(rs.getInt("cod_empleado"));
            cor.setTipo_prop(rs.getString("tipo_propiedad"));
            cor.setDireccion(rs.getString("direccion"));
            cor.setPrecio_s(rs.getInt("precio"));
            cor.setZona(rs.getString("zona"));
            lista.add(cor);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en DAOCorredores: " + e.getMessage());
        }finally{
            conex.desconectar();
        }
        return lista;
         }
 
}
