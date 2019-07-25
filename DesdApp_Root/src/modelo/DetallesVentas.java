package modelo;
public class DetallesVentas {

//Se declaran los atributos que componen la tabla "detalles_ventas" en la base de datos
    
    private int detalle_id;
    private int venta_id;
    private int negocio_id;            

    public DetallesVentas(int detalle_id, int venta_id, int negocio_id) {
        this.detalle_id = detalle_id;
        this.venta_id = venta_id;
        this.negocio_id = negocio_id;
    }

    public DetallesVentas() {
    }

    
    
//Métodos Setter/Getter para llamar y dar los datos correspondientes    
    //<editor-fold defaultstate="collapsed" desc="Setters and Getters">

//Métodos    
    
    public int getDetalle_id() {
        return detalle_id;
    }

    public void setDetalle_id(int detalle_id) {
        this.detalle_id = detalle_id;
    }

    public int getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public int getNegocio_id() {
        return negocio_id;
    }

    public void setNegocio_id(int negocio_id) {
        this.negocio_id = negocio_id;
    }
            
    
    
}
    
//</editor-fold>
    
