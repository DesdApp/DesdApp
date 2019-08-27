package modelo;
/**
 * Esta Clase declara los metodos Get, Set, y
 * Atributos para la clase VistasBienes, 
 * Inicializa los contructores vacio y Lleno.
 * @author carolina
 */
public class VistasBienes {
//Attributos
    String tipoProp;
    String ventaRenta;
    String direc;
    String zona;
    int  precioSug;
    
    //Constructor Vacio

    public VistasBienes() {
    }
    
    //Constructor LLeno

    public VistasBienes(String tipoProp, String ventaRenta, String direc, String zona, int precioSug) {
        this.tipoProp = tipoProp;
        this.ventaRenta = ventaRenta;
        this.direc = direc;
        this.zona = zona;
        this.precioSug = precioSug;
    }
    
    
//Getter y Setters
    public String getTipoProp() {
        return tipoProp;
    }

    public void setTipoProp(String tipoProp) {
        this.tipoProp = tipoProp;
    }

    public String getVentaRenta() {
        return ventaRenta;
    }

    public void setVentaRenta(String ventaRenta) {
        this.ventaRenta = ventaRenta;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getPrecioSug() {
        return precioSug;
    }

    public void setPrecioSug(int precioSug) {
        this.precioSug = precioSug;
    }
    
    
    
    
}
