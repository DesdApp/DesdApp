package modelo;

public class EstadosPropiedades {

    // Atributos
    private byte estadoPropiedadId;
    private String nombre;
    
    //Construtor de atributos

    public EstadosPropiedades(byte estadoPropiedadId, String nombre) {
        this.estadoPropiedadId = estadoPropiedadId;
        this.nombre = nombre;
    }
    
    //Construtor vacio
    public EstadosPropiedades(){
        
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
    public byte getEstadoPropiedadId() {
        return estadoPropiedadId;
    }

    public void setEstadoPropiedadId(byte estadoPropiedadId) {
        this.estadoPropiedadId = estadoPropiedadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//</editor-fold>
}
