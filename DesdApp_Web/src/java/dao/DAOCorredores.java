package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Corredores;

public class DAOCorredores implements interfaces.corredoresInterface{
    ConexionDB conex = new ConexionDB();
    PreparedStatement execute;
    ResultSet rs;
    String sql;
    
    
    @Override
    public ArrayList<Corredores> lista(int cod_emp) {
        ArrayList<Corredores> lista = new ArrayList<>();
        Corredores cor;
        try {
            conex.conectar();
            sql = "SELECT * FROM view_cardscorredores";
            execute = conex.getconexionDB().prepareStatement(sql);
            rs = execute.executeQuery();
            
            
            while (rs.next()){
            cor = new Corredores();
            cor.setNombre_corredor(rs.getString("nombre"));
            cor.setTel(rs.getInt("telefono"));
            cor.setCel(rs.getInt("celular"));
            cor.setCorreo(rs.getString("correo"));
            cor.setCod_emp(rs.getInt("cod_empleado"));
            cor.setTipo_prop(rs.getString("tipo_propiedad"));
            cor.setTipo_usuario_id(rs.getInt("tipo_usuario"));
            cor.setDireccion(rs.getString("direccion"));
            cor.setPrecio_s(rs.getInt("precio"));
            cor.setZona(rs.getString("zona"));
            lista.add(cor);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error en DAOCorredores: " + e.getMessage());
        }finally{
            conex.desconectar();
        }
        return lista;
         }
 
}
