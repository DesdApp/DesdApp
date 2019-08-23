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
            sql = "SELECT * FROM view_corredor WHERE codigo_empleado=?";
            execute = conex.getconexionDB().prepareStatement(sql);
            execute.setInt(1, cod_emp);
            rs = execute.executeQuery();
            
            
            while (rs.next()){
            cor = new Corredores();
            cor.setNombre_corredor(rs.getString("nombre"));
            cor.setCod_emp(rs.getInt("codigo_empleado"));
            cor.setTel(rs.getInt("telefono"));
            cor.setCel(rs.getInt("celular"));
            cor.setCorreo(rs.getString("email"));
            cor.setTipo_prop(rs.getString("tipo_propiedad"));
            cor.setDireccion(rs.getString("direccion"));
            cor.setZona(rs.getString("zona"));
            cor.setPrecio_s(rs.getInt("precio"));
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
