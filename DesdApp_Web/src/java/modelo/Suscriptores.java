package modelo;

/**
 * Esta clase declara los Metodos Get, Set y  atributos para 
 * la clase Suscriptores.
 * Se inicializan los Constructores llenos y vacios.
 * @author esteban
 */

public class Suscriptores {

    // Atributos
    private int suscriptorId;
    private String nombre;
    private String correo;
    
//    Constructor vacio
    public Suscriptores() {
    }

//    Constructor con parametros
    public Suscriptores(int suscriptorId, String nombre, String correo) {
        this.suscriptorId = suscriptorId;
        this.nombre = nombre;
        this.correo = correo;
    }
    
    

    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
    public int getSuscriptorId() {
        return suscriptorId;
    }

    public void setSuscriptorId(int suscriptorId) {
        this.suscriptorId = suscriptorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
//</editor-fold>
}
