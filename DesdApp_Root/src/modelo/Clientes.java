package modelo;

public class Clientes {

    // Atributos
    private int clienteId;
    private byte clasificacion;

    //Contructor de  atributos
    public Clientes(int clienteId, byte clasificacion) {    
        this.clienteId = clienteId;
        this.clasificacion = clasificacion;
    }
    
    public Clientes(){
        
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
    public int getClienteId() {
        return clienteId;
    }

    public void setClientId(int clientId) {
        this.clienteId = clientId;
    }

    public byte getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(byte clasificacion) {
        this.clasificacion = clasificacion;
    }
//</editor-fold>

}