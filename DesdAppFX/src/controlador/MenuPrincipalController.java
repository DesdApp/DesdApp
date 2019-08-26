package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
//Importacion de DAO's
import java.sql.Date;
import java.util.ArrayList;
import dao.DAOPersonas;
import dao.DAOBienesInmuebles;
import dao.DAOClientes;
import dao.DAODepartamentos;
import dao.DAOEmpleados;
import dao.DAOMunicipios;
import dao.DAORegiones;
import dao.DAOTiposPropiedades;
import dao.DAOZonas;

//Importacion de Modelos
import modelo.Personas;
import modelo.Empleados;
import modelo.Clientes;
import modelo.BienesInmuebles;
import modelo.Regiones;
import modelo.Departamentos;
import modelo.Municipios;
import modelo.Zonas;
import modelo.TiposPropiedades;

public class MenuPrincipalController implements Initializable {

    //DAO y Modelo de Persona
    DAOPersonas daop = new DAOPersonas();
    Personas p = new Personas();

    //DAO y Modelo de Cliente
    DAOClientes daoc = new DAOClientes();
    Clientes c = new Clientes();

    //DAO y Modelo de Empleado
    DAOEmpleados daoe = new DAOEmpleados();
    Empleados e = new Empleados();

    //DAO y Modelo de Propiedad
    DAOBienesInmuebles daob = new DAOBienesInmuebles();
    BienesInmuebles b = new BienesInmuebles();

    DAOZonas daoZ = new DAOZonas();
    DAORegiones daoR = new DAORegiones();
    DAODepartamentos daoD = new DAODepartamentos();
    DAOMunicipios daoM = new DAOMunicipios();
    
    DAOTiposPropiedades daoTP = new DAOTiposPropiedades();

    @FXML
    private BorderPane bp;

    //<editor-fold defaultstate="collapsed" desc="Componentes Persona">
    //Componentes de Persona
    @FXML private Button btInsertPersona;
    @FXML private Button btNuevo;
    @FXML private TextField idPersona;
    @FXML private TextField nombrePersona;
    @FXML private TextField apellidoPersona;
    @FXML private ComboBox tipoDocPersona;
    @FXML private TextField noDocPersona;
    @FXML private TextField nitPersona;
    @FXML private TextArea direcPersona;
    @FXML private TextField celularPersona;
    @FXML private TextField telefonoPersona;
    @FXML private TextField correoPersona;
    @FXML private DatePicker fechaNacimientoPer;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Componentes Cliente">
    //Componentes de Cliente
    @FXML private Button btnInsertCliente;
    @FXML private Button btnNuevoC;
    @FXML private TextField idCliente;
    @FXML private TextField idPersonaC;
    @FXML private TextField nombreTitular;
    @FXML private TextField userCliente;
    @FXML private TextField passwordCliente;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Componentes Empleado">
    //Componentes de Empleado
    @FXML private Button btnInsertEmpleado;
    @FXML private Button btNuevoE;
    @FXML private TextField codEmpleado;
    @FXML private TextField idPersonaE;
    @FXML private ComboBox tipoUsr;
    @FXML private TextField puestoE;
    @FXML private DatePicker fechaInicio;
    @FXML private DatePicker fechaFinalizacion;
    @FXML private TextField userEmp;
    @FXML private TextField passwordEmp;
    //@FXML este tiene que ser para el de image
    @FXML private ComboBox estEmp;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Componentes de Propiedad">
    //Componnetes de Propiedad
    @FXML private Button btnIsertPropi;
    @FXML private Button btnNuevoPro;
    @FXML private TextField codPropiedad;
    @FXML private ComboBox tipoPropiedad;
    @FXML private ComboBox estadoProp;
    @FXML private ComboBox estadoNegPro;
    @FXML private TextField codCliPro;
    @FXML private TextArea direcPro;
    @FXML private ComboBox Region;
    @FXML private ComboBox Departa;
    @FXML private ComboBox Muni;
    @FXML private ComboBox Zona;
    @FXML private TextField metros2;
    @FXML private TextArea descrip2;
    @FXML private TextField cantCuartos;
    @FXML private TextField cantNiveles;
    @FXML private TextField sotanos;
    @FXML private TextField elevadores;
    @FXML private TextField precioMin;
    @FXML private TextField precioSug;
    @FXML  private TextField precioCliente;
    //@FXML este tiene que ser para insertar imagen
    @FXML private TextField codEmpPro;
//</editor-fold>

    @Override

    public void initialize(URL url, ResourceBundle rb) {

        //ComboBox 
        //ComboBox Tipo de Doc
        String[] textos = {"-- Selecionar --", "DPI", "Pasaporte"};
        ObservableList<String> lista = FXCollections.observableArrayList(textos);
        tipoDocPersona.setItems(lista);

        //ComboBox tipo usuario
        String[] tTextos = {"-- Selecionar --", "Administrador", "Secretaria", "Corredor", "Reportes"};
        ObservableList<String> listaTipoU = FXCollections.observableArrayList(tTextos);
        tipoUsr.setItems(listaTipoU);

        //ComboBox Estado Empleado
        String[] EstEmpTextos = {"-- Selecionar --", "Activo", "Suspendido", "Dado De Baja"};
        ObservableList<String> listaEstEmp = FXCollections.observableArrayList(EstEmpTextos);
        estEmp.setItems(listaEstEmp);

        //ComboBox Estado de Propiedad
        String[] EstProTextos = {"-- Selecionar --", "Disponible", "Vendido", "En Proceso", "No definido"};
        ObservableList<String> listaEstPro = FXCollections.observableArrayList(EstProTextos);
        estadoProp.setItems(listaEstPro);

        //ComboBox tipo Neg. Propiedad
        String[] tipoNegProp = {"-- Selecionar --", "Venta", "Renta"};
        ObservableList<String> listaTipoNeg = FXCollections.observableArrayList(tipoNegProp);
        estadoNegPro.setItems(listaTipoNeg);

        //ComboBox Tipo de propiedad
        //ArrayList<BienesInmuebles> listaTipoProp = new ArrayList();
        //listaTipoProp = daob.listBienes();
        //ObservableList<BienesInmuebles> listatp = FXCollections.observableArrayList(listaTipoProp);
        //tipoPropiedad.setItems(listatp);
        
        ArrayList<TiposPropiedades> listaTipoProp = new ArrayList();
        listaTipoProp = daoTP.listTipos();
        ObservableList<TiposPropiedades> listatp = FXCollections.observableArrayList(listaTipoProp);
        tipoPropiedad.setItems(listatp);
        
        //ComboBox Zonas
        ArrayList<Zonas> listaZonas = new ArrayList();
        listaZonas = daoZ.listZonas();
        ObservableList<Zonas> listaZ = FXCollections.observableArrayList(listaZonas);
        Zona.setItems(listaZ);
        
        //ComboBox Municipios
        ArrayList<Municipios> listaMuni= new ArrayList();
        listaMuni = daoM.list();
        ObservableList<Municipios> listaM = FXCollections.observableArrayList(listaMuni);
        Muni.setItems(listaM);
        
        //ComboBox Departamentos
        ArrayList<Departamentos> listaDepart = new ArrayList();
        listaDepart = daoD.list();
        ObservableList<Departamentos> listaD= FXCollections.observableArrayList(listaDepart);
        Departa.setItems(listaD);
        
        //ComboBox Regiones
        ArrayList<Regiones> listaReg = new ArrayList();
        listaReg = daoR.list();
        ObservableList<Regiones> listR = FXCollections.observableArrayList(listaReg);
        Region.setItems(listR);
        
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos para Limpiar">
    //Se limpian las cajas de texto
    public void limpiarPersona() {
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
        System.out.println("Se limpio con exito Persona");
    }

    public void limpiarCliente() {
        idCliente.setText("");
        idPersonaC.setText("");
        nombreTitular.setText("");
        userCliente.setText("");
        passwordCliente.setText("");
        System.out.println("Se limpio con Exito cliente");
    }

    public void limpiarEmp() {
        codEmpleado.setText("");
        idPersonaE.setText("");
        tipoUsr.setValue(null);
        puestoE.setText("");
        fechaInicio.setValue(null);
        fechaFinalizacion.setValue(null);
        userEmp.setText("");
        passwordEmp.setText("");
        estEmp.setValue(null);
        System.out.println("Se limpio Empleado");
    }

    public void limpiarPropi() {
        codPropiedad.setText("");
        tipoPropiedad.setSelectionModel(null);
        estadoProp.setSelectionModel(null);
        estadoNegPro.setSelectionModel(null);
        codCliPro.setText("");
        direcPro.setText("");
        Region.setSelectionModel(null);
        Departa.setSelectionModel(null);
        Muni.setSelectionModel(null);
        Zona.setSelectionModel(null);
        metros2.setText("");
        descrip2.setText("");
        cantCuartos.setText("");
        cantNiveles.setText("");
        sotanos.setText("");
        elevadores.setText("");
        precioMin.setText("");
        precioSug.setText("");
        precioCliente.setText("");
        codEmpPro.setText("");
        System.out.println("Se limpio Propiedad");
    }

//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos de Agregar">
    //Agergar Persona
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
        System.out.println("Se agrego con extio Persona");

    }

    //Agregar Cliente
    public void agregarCliente() {
        c.setClienteId(Integer.parseInt(idCliente.getText().trim()));
        c.setPersonaId(Integer.parseInt(idPersonaC.getText().trim()));
        c.setNombreTitular(nombreTitular.getText().trim());
        c.setUser(userCliente.getText().trim());
        c.setPassword(passwordCliente.getText().trim());
        daoc.insertCliente(c);
        System.out.println("Se agregao con exito Cliente");
    }

    //Agregar Empleado
    public void agregarEmpleado() {
        e.setEmpleadoId(Integer.parseInt(codEmpleado.getText().trim()));
        e.setPersonaId(Integer.parseInt(idPersonaE.getText().trim()));
        e.setTipoUsuarioId(tipoUsr.getSelectionModel().getSelectedIndex());
        e.setPuesto(puestoE.getText().trim());
        e.setFechaInicio(Date.valueOf(fechaInicio.getValue()));
        if (fechaFinalizacion.getValue() == null) {
            e.setFechaFinalizacion(null);
        } else {
            e.setFechaFinalizacion(Date.valueOf(fechaFinalizacion.getValue()));
        }
        e.setUser(userEmp.getText().trim());
        e.setPassword(passwordEmp.getText().trim());
        e.setEstadoEmpleadoId(estEmp.getSelectionModel().getSelectedIndex());
        daoe.insert(e);
        System.out.println("se agrego con exito empleado");
    }

    //Agregar Propiedad
    public void agregarPropiedad() {
        b.setInmuebleId(codPropiedad.getText().trim());
        b.setTipoPropiedadId(tipoPropiedad.getSelectionModel().getSelectedIndex());
        b.setEstadoId(estadoProp.getSelectionModel().getSelectedIndex());
        b.setEstadoNegId(estadoNegPro.getSelectionModel().getSelectedIndex());
        b.setClienteId(Integer.parseInt(codCliPro.getText().trim()));
        b.setDireccion(direcPro.getText().trim());
        b.setZonaId(Zona.getSelectionModel().getSelectedIndex());
        b.setMetrosCuadrados(metros2.getText().trim());
        b.setDescripcionMetros(descrip2.getText().trim());
        b.setCantCuartos(Integer.parseInt(cantCuartos.getText().trim()));
        b.setCantNiveles(Integer.parseInt(cantNiveles.getText().trim()));
        b.setSotanos(Integer.parseInt(sotanos.getText().trim()));
        b.setElevadores(Integer.parseInt(elevadores.getText().trim()));
        b.setPrecioMinVenta(Integer.parseInt(precioMin.getText().trim()));
        b.setPrecioSugerido(Integer.parseInt(precioSug.getText().trim()));
        b.setPrecioReal(Integer.parseInt(precioCliente.getText().trim()));
        b.setCodEmpleado(Integer.parseInt(codEmpPro.getText().trim()));
        daob.insertBien(b);
        System.out.println("Se agrego Propiedad con Exito");
    }
//</editor-fold>

    //Fuciones de botones
    @FXML void insertPersona(ActionEvent evt) {//Insert de persona
        agregarPersona();
        System.out.println("Fuciono agregar Persona");
    }

    @FXML void insertCliente(ActionEvent evt) {//Insert de Cliente
        agregarCliente();
        System.out.println("Funcion agregar Cliente");
    }

    @FXML void insertEmpleado(ActionEvent evt) {//Insert de Empleado
        agregarEmpleado();
        System.out.println("Funciona agregar Empleado");
    }

    @FXML void insertPropiedad(ActionEvent evt) {//Insert de Propiedad
        agregarPropiedad();
        System.out.println("Funciona agregar Propiedad");
    }

    //Botones Limpiar
    @FXML void limpiarP(ActionEvent evt) {
        limpiarPersona();
    }

    @FXML void limpiarE(ActionEvent evt) {
        limpiarEmp();
    }

    @FXML void LimpiarC(ActionEvent evt) {
        limpiarCliente();
    }

    @FXML void limpiarPro(ActionEvent evt) {
        limpiarPropi();
    }
}
