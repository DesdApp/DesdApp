package modelo;

public class DetalleVt {

    //Declaro mis  atributos
    private int detalleId;
    private int ventaId;
    private int negocioId;
    
    

    //<editor-fold defaultstate="collapsed" desc="Constructores">
     public DetalleVt(int detalleId, int ventaId, int negocioId) {
        this.detalleId = detalleId;
        this.ventaId = ventaId;
        this.negocioId = negocioId;
    }
    
    public DetalleVt(){
        
    }
//</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Setter y Getter">
     public int getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(int detalleId) {
        this.detalleId = detalleId;
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public int getNegocioId() {
        return negocioId;
    }

    public void setNegocioId(int negocioId) {
        this.negocioId = negocioId;
    }
//</editor-fold>
    

   
    
    
    

    
}
