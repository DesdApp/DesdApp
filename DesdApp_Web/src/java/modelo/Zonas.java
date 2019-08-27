package modelo;
/**
 * Esta clase declara los Metodos Get, Set y  atributos para 
 * la clase Zonas.
 * Se inicializan los Constructores llenos y vacios.
 * @author carolina
 */
public class Zonas {

//    Atributos
    private int zonaId;
    private String nombre;
    private int muniId;

    //Constructor Vacio

    public Zonas() {
    }
    
    //Constructor de atributos

    public Zonas(int zonaId, String nombre, int muniId) {
        this.zonaId = zonaId;
        this.nombre = nombre;
        this.muniId = muniId;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
    public int getZonaId() {
        return zonaId;
    }

    public void setZonaId(int zonaId) {
        this.zonaId = zonaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMuniId() {
        return muniId;
    }

    public void setMuniId(int muniId) {
        this.muniId = muniId;
    }
//</editor-fold>
}
