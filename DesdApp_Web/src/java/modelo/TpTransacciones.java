package modelo;

//Modelo Tipo Transacciones
public class TpTransacciones {
    
private int tpTransId;
private String name;


//Constructor de la Clase TpTrans
      public TpTransacciones(int tpTransId, String name) {
        this.tpTransId = tpTransId;
        this.name = name;
    }

      public TpTransacciones(){
          
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
