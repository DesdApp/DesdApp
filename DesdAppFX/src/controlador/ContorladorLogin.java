package controlador;

import dao.LoginLogicaAcceso;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ContorladorLogin implements Initializable {

    @FXML
    Button btnInicioSesion;
    @FXML
    TextField txtUser;
    @FXML
    PasswordField txtPassword;
    @FXML
    Label lblErrorSesion;
    @FXML
    ComboBox listaP;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] textos = {"Administrador", "Secretaria", "Corredor", "Reportes"};
        ObservableList<String> lista = FXCollections.observableArrayList(textos);
        listaP.setItems(lista);
    }

    @FXML
    void iniciarSesion(ActionEvent evt) {
        LoginLogicaAcceso login = new LoginLogicaAcceso();

        String user = txtUser.getText().trim();//asignar valores
        String contra = txtPassword.getText().trim();//asignar valores

        int pValor = listaP.getSelectionModel().getSelectedIndex();//Se obtiene el valor del index del combobox 
        int permisos; //se inicia permisos con valor 0

        //Se comprueba el valor obtenido de combobox y se asigna el valor conrespodiente a permisos
        if (pValor == 0) {//comprueba si tiene privilegios de administrador
            System.out.println("Tiene privilegios de administrador");
            permisos = 1;
        } else if (pValor == 1) {//comprueba si tiene privilegios de Secretaria
            System.out.println("Tiene privilegios de Secretaria");
            permisos = 2;
        } else if (pValor == 2) {//comprueba si tiene privilegios de Corredor
            System.out.println("Tiene privilegios de Corredor");
            permisos = 3;
        } else if (pValor == 3) {//comprueba si tiene privilegios de Reportes
            System.out.println("Tiene privilegios de Reportes");
            permisos = 4;
        } else {//De lo contrario asigna el valor cero a los permisos
            permisos = 0;
        } 
        
        System.out.println(listaP.getSelectionModel().getSelectedIndex());
        
        if(permisos ==0) {//Al no tener ninguno de los privilegios nuestra en pantalla que no existen privilegios
            lblErrorSesion.setText("NO tiene privilegios");
            System.out.println("No tiene permisos");
        }
        
        int sesionP = login.privilegios(user, permisos);//Se ejecuta la funcion con los valores asigandos
        int sesion = login.validarUsario(user, contra);//ejecutar comprobacion
        
        //Se validad y de ser erronea la comprobacion se muestra en pantalla
        if (sesion == 1 && sesionP ==1) {
            System.out.println("Se inicio sesion*-*-");
            lblErrorSesion.setText("");
            login.validarUsario(user, contra);
        } else {
            lblErrorSesion.setText("Datos invalidos");
            System.out.println("datos invalidos, no se inicio sesion");
        }

    }

}
