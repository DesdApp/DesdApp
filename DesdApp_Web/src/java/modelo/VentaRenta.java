package modelo;

public class VentaRenta {
    //Atributos
    private byte estadoNegId;
    private String nombre;
    
    //Constructor
    public VentaRenta(byte estadoNegId, String nombre) {
        this.estadoNegId = estadoNegId;
        this.nombre = nombre;
    }
    
    //Constructor Vacio
    public VentaRenta() {
    }

    public byte getEstadoNegId() {
        return estadoNegId;
    }

    public void setEstadoNegId(byte estadoNegId) {
        this.estadoNegId = estadoNegId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
