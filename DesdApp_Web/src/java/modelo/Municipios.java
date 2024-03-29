package modelo;

/**
 * Esta clase declara los Metodos Get, Set y atributos para la clase Municipios.
 * Se inicializan los Constructores llenos y vacios.
 *
 * @author esteban
 */
//Modelo clase municipios
public class Municipios {

    //Declaracion de Atributos 
    private int muniIdi;
    private String nombre;
    private int deptoId;

    //Constructor Vacio
    public Municipios() {
    }

    //Constructor con Parametros
    public Municipios(int muniIdi, String nombre, int deptoId) {
        this.muniIdi = muniIdi;
        this.nombre = nombre;
        this.deptoId = deptoId;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public int getMuniIdi() {
        return muniIdi;
    }

    public void setMuniIdi(int muniIdi) {
        this.muniIdi = muniIdi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDeptoId() {
        return deptoId;
    }

    public void setDeptoId(int deptoId) {
        this.deptoId = deptoId;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Municipios{" + "muniIdi=" + muniIdi + ", nombre=" + nombre + ", deptoId=" + deptoId + '}';
    }

}
