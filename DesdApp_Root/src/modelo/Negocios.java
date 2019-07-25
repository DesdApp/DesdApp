package modelo;

import java.sql.Date;

//Modelo Negocios
public class Negocios {

//Atributos de la clase Negocios = Negocios
private int negocionId;
private int bienImbId;
private int tipoTransId;
private int AsesorId;
private double priceVenId;
private double comEmpresa;
private Date fecha;
private byte statePagoId;
private int clientId;


//Constructores
  public Negocios(int negocionId, int bienImbId, int tipoTransId, int AsesorId, double priceVenId, double comEmpresa, Date fecha, byte statePagoId, int clientId) {
        this.negocionId = negocionId;
        this.bienImbId = bienImbId;
        this.tipoTransId = tipoTransId;
        this.AsesorId = AsesorId;
        this.priceVenId = priceVenId;
        this.comEmpresa = comEmpresa;
        this.fecha = fecha;
        this.statePagoId = statePagoId;
        this.clientId = clientId;
    }

  public Negocios(){
      
  }
//<editor-fold defaultstate="collapsed" desc="Setter y Getter">
    public int getNegocionId() {
        return negocionId;
    }

    public void setNegocionId(int negocionId) {
        this.negocionId = negocionId;
    }

    public int getBienImbId() {
        return bienImbId;
    }

    public void setBienImbId(int bienImbId) {
        this.bienImbId = bienImbId;
    }

    public int getTipoTransId() {
        return tipoTransId;
    }

    public void setTipoTransId(int tipoTransId) {
        this.tipoTransId = tipoTransId;
    }

    public int getAsesorId() {
        return AsesorId;
    }

    public void setAsesorId(int AsesorId) {
        this.AsesorId = AsesorId;
    }

    public double getPriceVenId() {
        return priceVenId;
    }

    public void setPriceVenId(double priceVenId) {
        this.priceVenId = priceVenId;
    }

    public double getComEmpresa() {
        return comEmpresa;
    }

    public void setComEmpresa(double comEmpresa) {
        this.comEmpresa = comEmpresa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public byte getStatePagoId() {
        return statePagoId;
    }

    public void setStatePagoId(byte statePagoId) {
        this.statePagoId = statePagoId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

//</editor-fold>

  
}
