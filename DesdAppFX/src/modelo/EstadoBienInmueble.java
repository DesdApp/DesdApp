package modelo;

public class EstadoBienInmueble {

    // Atributos
    private byte estadoId;
    private String nombre;
    
    //Construtor de atributos

    public EstadoBienInmueble(byte estadoPropiedadId, String nombre) {
        this.estadoId = estadoPropiedadId;
        this.nombre = nombre;
    }
    
    //Construtor vacio
    public EstadoBienInmueble(){
        
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
    public byte getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(byte estadoId) {
        this.estadoId = estadoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "EstadosPropiedades{" + "estadoPropiedadId=" + estadoId + ", nombre=" + nombre + '}';
    }
    
    
}
