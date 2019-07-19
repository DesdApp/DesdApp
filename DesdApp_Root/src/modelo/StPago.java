package modelo;

//Clase Estado Pagos
public class StPago {

//Atributos de la clase StPago = Estado Pagos
private byte stPagoId;
private String name;


//Constructor de Clase StPago
public StPago(byte stPagoId, String name) {
        this.stPagoId = stPagoId;
        this.name = name;
    }

public StPago(){
    
}


//<editor-fold defaultstate="collapsed" desc="Setter y Getter">
    public byte getStPagoId() {
        return stPagoId;
    }

    public void setStPagoId(byte stPagoId) {
        this.stPagoId = stPagoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//</editor-fold>

    

}
