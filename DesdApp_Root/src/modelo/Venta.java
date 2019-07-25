package modelo;
import java.sql.Date;

public class Venta {
//Se declaran los atributos que componen en la base de datos a la tabla de "ventas"
    private int venta_id;
    private int numero_factura;
    private String serie;
    private int nit;
    private String nombre;
    private String direccion;
    private Date fecha;
    private double total;
    private int tipo_id;

//Métodos Setter/Getter para llamar y dar los datos correspondientes
    //<editor-fold defaultstate="collapsed" desc="Setters and Getters">
    public int getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(int tipo_id) {
        this.tipo_id = tipo_id;
    }
    
//</editor-fold>
    
    
    
}
