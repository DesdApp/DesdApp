package modelo;

public class VistasBienes {

    //Atributos de clase VistaBien
    String tipoProp;
    String ventaRenta;
    int habitacion;
    String zona;
    String dep;
    String metrosC;
    int  precioSug;
    int codemple;
    String nomemple;

    //Constructores
    public VistasBienes(String tipoProp, String ventaRenta, int habitacion, String zona,String dep, String metrosC, int precioSug, int codemple, String nomemple) {
        this.tipoProp = tipoProp;
        this.ventaRenta = ventaRenta;
        this.habitacion = habitacion;
        this.zona = zona;
        this.dep = dep;
        this.metrosC = metrosC;
        this.precioSug = precioSug;
        this.codemple = codemple;
        this.nomemple = nomemple;
    }
    //Constructor vacio
    public VistasBienes(){
        
    }

    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">

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

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getMetrosC() {
        return metrosC;
    }

    public void setMetrosC(String metrosC) {
        this.metrosC = metrosC;
    }

    public int getPrecioSug() {
        return precioSug;
    }

    public void setPrecioSug(int precioSug) {
        this.precioSug = precioSug;
    }

    public int getCodemple() {
        return codemple;
    }

    public void setCodemple(int codemple) {
        this.codemple = codemple;
    }

    public String getNomemple() {
        return nomemple;
    }

    public void setNomemple(String nomemple) {
        this.nomemple = nomemple;
    }
     

//</editor-fold>

    @Override
    public String toString() {
        return "VistaBien{" + "tipoProp=" + tipoProp + ", ventaRenta=" + ventaRenta + ", habitacion=" + habitacion + ", zona=" + zona + ", dep=" + dep + ", metrosC=" + metrosC + ", precioSug=" + precioSug + ", codemple=" + codemple + ", nomemple=" + nomemple + '}';
    }

    
    
 
    
    
}
