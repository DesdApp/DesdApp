package modelo;

/**
 * Esta clase declara los Metodos Get, Set y atributos para la clase
 * Departamentos. Se inicializan los Constructores llenos y vacios.
 *
 * @author esteban
 */
public class Departamentos {

    // Atributos
    private int deptoId;
    private String nombre;
    private int regionId;

    // Constructor vacio
    public Departamentos() {
    }

    // Constructor con parametros
    public Departamentos(int deptoId, String nombre, int regionId) {
        this.deptoId = deptoId;
        this.nombre = nombre;
        this.regionId = regionId;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public int getDeptoId() {
        return deptoId;
    }

    public void setDeptoId(int deptoId) {
        this.deptoId = deptoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Departamentos " + "deptoId=" + deptoId + ", nombre=" + nombre + ", regionId=" + regionId;
    }

}
