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
        String[] textos = {"Uno", "Dos", "Tres"};
        ObservableList<String> lista = FXCollections.observableArrayList(textos);
        listaP.setItems(lista);

    }

    @FXML
    void iniciarSesion(ActionEvent evt) {
        LoginLogicaAcceso login = new LoginLogicaAcceso();

        String user = txtUser.getText().trim();
        String contra = txtPassword.getText().trim();
        int permisos = 1;
        int sesion = login.validarUsario(user, contra);
        int privi = login.privilegios(user, permisos);

        if (sesion == 1) {
            System.out.println("Se inicio sesion*-*-");

        } else {
            lblErrorSesion.setText("Datos invalidos");
            System.out.println("datos invalidos");
        }
        if (privi == 1) {

        } else {
            lblErrorSesion.setText("NO tiene privilegios");
            System.out.println("No tiene permisos");
        }

    }

}
