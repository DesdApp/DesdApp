package modelo;

import java.sql.Date;

public class DtCompraVenta {

//Atributos
public int negId;
public Date dateEstVenta;
public String observ;


//Construtor de clase DtComVent
      public DtCompraVenta(int negId, Date dateEstVenta, String observ) {
        this.negId = negId;
        this.dateEstVenta = dateEstVenta;
        this.observ = observ;
    }

      public DtCompraVenta(){
          
      }
      
//<editor-fold defaultstate="collapsed" desc="Setter y Getter">
    public int getNegId() {
        return negId;
    }

    public void setNegId(int negId) {
        this.negId = negId;
    }

    public Date getDateEstVenta() {
        return dateEstVenta;
    }

    public void setDateEstVenta(Date dateEstVenta) {
        this.dateEstVenta = dateEstVenta;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }
//</editor-fold>

}
