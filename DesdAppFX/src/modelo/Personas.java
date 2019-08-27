package modelo;

import java.sql.Date;
//Modelo Clase Personas

public class Personas {

    // Atributos
    private int personaId;
    private String nombre;
    private String apellido;
    private int tipoDocumentoId;
    private String noDocumento;
    private String nit;
    private String direccion;
    private int celular;
    private int telefono;
    private String correo;
    private Date fechaNacimiento;

//    Constructores
    public Personas(int personaId, String nombre, String apellido, int tipoDocumentoId, String noDocumento, String nit, String direccion, int celular, int telefono, String correo, Date fechaNac) {
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
        this.fechaNacimiento = fechaNac;
    }

    public Personas() {
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
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

    public int getTipoDocumentoId() {
        return tipoDocumentoId;
    }

    public void setTipoDocumentoId(int tipoDocumentoId) {
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
//</editor-fold>

    @Override
    public String toString() {
        return nombre;
    }
}
