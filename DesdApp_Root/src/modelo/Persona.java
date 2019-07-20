
package modelo;

import java.sql.Date;
//Modelo Clase Persona
public class Persona {
    //Atributos Clase persona
    private int personaId;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int celular;
    private String correo;
    private Date fechaNac;
    private int dpi;
    private int nit;
   

    //Constructor vacio Persona
    public Persona() {
    }
    

    //Constructor Con paramentros Persona
    public Persona(int personaId, String nombre, String apellido, String direccion, int telefono, String correo, Date fechaNac, int dpi, int nit, int celular) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.dpi = dpi;
        this.nit = nit;
        this.celular = celular;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="Getter y Setter">
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

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
 public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
    
//</editor-fold>

   
            
   
}
