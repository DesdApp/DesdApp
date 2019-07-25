package modelo;

//Modelo Tipo Transacciones
public class TpTrans {
    
private int tpTransId;
private String name;


//Constructor de la Clase TpTrans
      public TpTrans(int tpTransId, String name) {
        this.tpTransId = tpTransId;
        this.name = name;
    }

      public TpTrans(){
          
      }
//<editor-fold defaultstate="collapsed" desc="Setter y Getter">
    public int getTpTransId() {
        return tpTransId;
    }

    public void setTpTransId(int tpTransId) {
        this.tpTransId = tpTransId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//</editor-fold>

  

    
}
