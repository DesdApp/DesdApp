package modelo;

/**
 * Esta Clase declara los metodos Get, Set, y
 * Atributos para la clase VentaRenta, 
 * Inicializa los contructores vacio y Lleno.
 * @author carolina
 */
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

    //Getter y Setter
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
