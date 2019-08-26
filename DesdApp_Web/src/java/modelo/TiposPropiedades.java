package modelo;
/**
 * Esta Clase declara los metodos Get, Set, y
 * Atributos para la clase TiposPropiedades, 
 * Inicializa los contructores vacio y Lleno.
 * @author carolina
 */
public class TiposPropiedades {

    // Atributos
    private byte tipoPropiedadId;
    private String nombre;
    
    //Constructor de atributos
    public TiposPropiedades(byte tipoPropiedadId, String nombre) {
        this.tipoPropiedadId = tipoPropiedadId;
        this.nombre = nombre;
    }
    
    //Constructor vacio
    public TiposPropiedades(){
        
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
    public byte getTipoPropiedadId() {
        return tipoPropiedadId;
    }

    public void setTipoPropiedadId(byte tipoPropiedadId) {
        this.tipoPropiedadId = tipoPropiedadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//</editor-fold>
}
