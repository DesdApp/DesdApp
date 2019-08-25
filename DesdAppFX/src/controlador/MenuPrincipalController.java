package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import dao.DAOPersonas;//se importa dao de persona para utilizacion
import java.sql.Date;
import modelo.Personas;//solo se hace para pruebas
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MenuPrincipalController implements Initializable {

    DAOPersonas daop = new DAOPersonas();
    Personas p = new Personas();
    
    @FXML
    private BorderPane bp;
    @FXML
    private Button btInsertPersona;
    @FXML
    private Button btNuevo;
    @FXML
    private TextField idPersona;
    @FXML
    private TextField nombrePersona;
    @FXML
    private TextField apellidoPersona;
    @FXML
    private ComboBox tipoDocPersona;
    @FXML
    private TextField noDocPersona;
    @FXML
    private TextField nitPersona;
    @FXML
    private TextArea direcPersona;
    @FXML
    private TextField celularPersona;
    @FXML
    private TextField telefonoPersona;
    @FXML
    private TextField correoPersona;
    @FXML
    private DatePicker fechaNacimientoPer;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] textos = {"DPI", "Pasaporte"};
        ObservableList<String> lista = FXCollections.observableArrayList(textos);
        tipoDocPersona.setItems(lista);
    }

    //Se limpian las cajas de texto
        public void limpiar(){
            idPersona.setText("");
            nombrePersona.setText("");
            apellidoPersona.setText("");
            tipoDocPersona.setSelectionModel(null);
            noDocPersona.setText("");
            nitPersona.setText("");
            direcPersona.setText("");
            celularPersona.setText("");
            telefonoPersona.setText("");
            correoPersona.setText("");
            fechaNacimientoPer.setValue(null);
            System.out.println("Se limpio con exito");
        }
        
    //agergar Persona
        public void agregarPersona() {
        p.setPersonaId(0);
        p.setNombre(nombrePersona.getText().trim());
        p.setApellido(apellidoPersona.getText().trim());
        p.setTipoDocumentoId(tipoDocPersona.getSelectionModel().getSelectedIndex());
        p.setNoDocumento(noDocPersona.getText().trim());
        p.setNit(nitPersona.getText().trim());
        p.setDireccion(direcPersona.getText().trim());
        p.setCelular(Integer.parseInt(celularPersona.getText().trim()));
        p.setTelefono(Integer.parseInt(telefonoPersona.getText().trim()));
        p.setCorreo(correoPersona.getText().trim());
        p.setFechaNacimiento(Date.valueOf(fechaNacimientoPer.getValue()));
        daop.insert(p);
        System.out.println("Se ejecuto la insercion");
            
    }
    
    
    
    
    @FXML
    void insertPersona(ActionEvent evt) {
        agregarPersona();
        //limpiar();
    }
    
    @FXML
    void nuevo(ActionEvent evt){
        limpiar();
    }
}
