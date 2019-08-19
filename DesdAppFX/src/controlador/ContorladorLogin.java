package controlador;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

//Importacion de conexion
import dao.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContorladorLogin implements Initializable {

    @FXML Button btnInicioSesion;
    @FXML TextField txtUser;
    @FXML PasswordField txtPassword;
    @FXML Label lblErrorSesion;
    
    
    
    @Override

    public void initialize(URL url, ResourceBundle rb) {

        
    }
    @FXML
    void iniciarSesion (ActionEvent evt){
        ConexionDB cn = new ConexionDB();
        
        //Asignar valores de las cajas de texto a variables
        cn.conectar();
        String usuario = txtUser.getText().trim();
        String contra = txtPassword.getText().trim();
        
        String sql = "SELECT * FROM empleados WHERE user='"+ usuario +"' AND password='"+ contra +"' ";
        
        try {
            Statement st = cn.getconexionDB().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                System.out.println("Se puedo");
                lblErrorSesion.setText("");
            }else{
                lblErrorSesion.setText("Error de usuario o contrasena");
            }
        } catch (SQLException e) {
            System.out.println("Error de coenxion" + e.getMessage());
            
        }finally{
            cn.desconectar();
        }
        
    }
    
}
