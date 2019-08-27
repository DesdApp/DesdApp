package modelo;

/**
 * Esta clase declara los Metodos Get, Set y atributos para la clase
 * Registrarse. Se inicializan los Constructores llenos y vacios.
 *
 * @author esteban
 */
import java.sql.Date;

public class Registrarse {

    // Atributos
    private int personaId;
    private String nombre;
    private String apellido;
    private byte tipoDocumentoId;
    private String noDocumento;
    private String nit;
    private String direccion;
    private int celular;
    private int telefono;
    private String correo;
    private Date fechaNacimiento;
    private String password;

//    Contructor con parametros
    public Registrarse(int personaId, String nombre, String apellido, byte tipoDocumentoId, String noDocumento, String nit, String direccion, int celular, int telefono, String correo, Date fechaNacimiento, String password) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumentoId = tipoDocumentoId;
        this.noDocumento = noDocumento;
        this.nit = nit;
        this.direccion = direccion;
        this.celular = celular;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
    }

//    Constructor vacio
    public Registrarse() {

    }

    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getTipoDocumentoId() {
        return tipoDocumentoId;
    }

    public void setTipoDocumentoId(byte tipoDocumentoId) {
        this.tipoDocumentoId = tipoDocumentoId;
    }

    public String getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//</editor-fold>
}
