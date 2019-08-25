package controlador;

import dao.LoginLogicaAcceso;
import java.io.IOException;
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
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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

    @FXML
    AnchorPane ap;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] textos = {"Administrador", "Secretaria", "Corredor", "Reportes"};
        ObservableList<String> lista = FXCollections.observableArrayList(textos);
        listaP.setItems(lista);
    }

    @FXML
    void iniciarSesion(ActionEvent evt) throws IOException {
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

        if (permisos == 0) {//Al no tener ninguno de los privilegios nuestra en pantalla que no existen privilegios
            lblErrorSesion.setText("NO tiene privilegios");
            System.out.println("No tiene permisos");
        }

        int sesionP = login.privilegios(user, permisos);//Se ejecuta la funcion con los valores asigandos
        int sesion = login.validarUsario(user, contra);//ejecutar comprobacion

        //Se validad y de ser erronea la comprobacion se muestra en pantalla
        if (sesion == 1 && sesionP == 1) {
            System.out.println("Se inicio sesion*-*-");
            lblErrorSesion.setText("");
            if (login.validarUsario(user, contra) == 1) {
                System.out.println("si se realizo la comprobacion");
                FXMLLoader loader = new FXMLLoader();
                URL location = ContorladorLogin.class.getResource("/vista/menuprincipal/MenuPrincipal.fxml");
                loader.setLocation(location);
                BorderPane bp = loader.load();
                Stage stage = new Stage();
                stage.setTitle("Bienvenido");
                Scene scene = new Scene(bp);
                stage.setScene(scene);
                stage.initOwner(ap.getScene().getWindow());//Indica que depende del formulario login
                stage.setMaximized(true);//Muestra la ventana maximizada
                ((Stage) ap.getScene().getWindow()).close();//cierra el formulario actual
                stage.show();//muestra el formulario
            }

        } else {
            lblErrorSesion.setText("Datos invalidos");
            System.out.println("datos invalidos, no se inicio sesion");
        }

    }

}
