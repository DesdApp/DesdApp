package modelo;

/**
 * Esta clase declara los Metodos Get, Set y atributos para la clase Regiones.
 * Se inicializan los Constructores llenos y vacios.
 *
 * @author esteban
 */
public class Regiones {

    //declaracion de Atributos
    private int regionId;
    private String nombre;
    private String descripcion;

    //Constructor vacio
    public Regiones() {
    }

    //Constructor con parametros
    public Regiones(int regionId, String nombre, String descripcion) {
        this.regionId = regionId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

//</editor-fold>

}
