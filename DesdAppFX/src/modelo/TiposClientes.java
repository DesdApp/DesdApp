package modelo;

public class TiposClientes {

    // Atributos
    private byte tipoClienteId;
    private String nombre;
    private String descripcion;

    
    //Constructor
    public TiposClientes(byte tipoClienteId, String nombre, String descripcion) {    
        this.tipoClienteId = tipoClienteId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public TiposClientes(){
        
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
    public byte getTipoClienteId() {
        return tipoClienteId;
    }

    public void setTipoClienteId(byte tipoClienteId) {
        this.tipoClienteId = tipoClienteId;
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

    @Override
    public String toString() {
        return "TiposClientes{" + "tipoClienteId=" + tipoClienteId + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
}
