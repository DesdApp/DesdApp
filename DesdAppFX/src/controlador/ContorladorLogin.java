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
import dao.LoginLogicaAcceso;
import javafx.scene.control.ComboBox;

public class ContorladorLogin implements Initializable {

    @FXML Button btnInicioSesion;
    @FXML TextField txtUser;
    @FXML PasswordField txtPassword;
    @FXML Label lblErrorSesion;
    @FXML ComboBox<String> listaP;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {     
        
    }
    
    @FXML
    void iniciarSesion (ActionEvent evt){
       LoginLogicaAcceso login = new LoginLogicaAcceso();
              
       String user = txtUser.getText().trim();
       String contra = txtPassword.getText().trim();
       int permisos = 1;
       int sesion = login.validarUsario(user, contra);
       int privi = login.privilegios(user, permisos);
       
       if(sesion == 1){
           System.out.println("Se inicio sesion*-*-");
           
       }else{
           lblErrorSesion.setText("Datos invalidos");
           System.out.println("datos invalidos");
       }
       if(privi == 1){ 
               
           }else{
               lblErrorSesion.setText("NO tiene privilegios");
               System.out.println("No tiene permisos");
           }

       
    }
    
}
