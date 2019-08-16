
package modelo;

import java.sql.Date;
//Modelo Clase Personas
public class Personas {
    //Atributos Clase persona
    private int personaId;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int celular;
    private String correo;
    private Date fechaNac;
    private long dpi;
    private int nit;
   

    //Constructor vacio Personas
    public Personas() {
    }
    

    //Constructor Con paramentros Personas

    public Personas(int personaId, String nombre, String apellido, String direccion, int telefono, int celular, String correo, Date fechaNac, long dpi, int nit) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.dpi = dpi;
        this.nit = nit;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter y Setter">
//</editor-fold>
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Persona" + "personaId=" + personaId + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", celular=" + celular + ", correo=" + correo + ", fechaNac=" + fechaNac + ", dpi=" + dpi + ", nit=" + nit;    }

   
            
   
}
