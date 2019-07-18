package modelo;

public class Bienes {

    // Atributos
    private int inmuebleId;
    private String direccion;
    private byte zona;
    private int muniId;
    private String metrosCuadrados;
    private String descripcion;
    private float precioMetroCuadrado;
    private byte tipoPropiedadId;
    private byte estadoPropiedadId;
    private int propietarioId;
    private float precio;
    private float precioMinVenta;
    private int personaId;

    //<editor-fold defaultstate="collapsed" desc="Metodos Set y Get">
    public int getInmuebleId() {
        return inmuebleId;
    }

    public void setInmuebleId(int inmuebleId) {
        this.inmuebleId = inmuebleId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte getZona() {
        return zona;
    }

    public void setZona(byte zona) {
        this.zona = zona;
    }

    public int getMuniId() {
        return muniId;
    }

    public void setMuniId(int muniId) {
        this.muniId = muniId;
    }

    public String getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(String metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public void setPrecioMetroCuadrado(float precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public byte getTipoPropiedadId() {
        return tipoPropiedadId;
    }

    public void setTipoPropiedadId(byte tipoPropiedadId) {
        this.tipoPropiedadId = tipoPropiedadId;
    }

    public byte getEstadoPropiedadId() {
        return estadoPropiedadId;
    }

    public void setEstadoPropiedadId(byte estadoPropiedadId) {
        this.estadoPropiedadId = estadoPropiedadId;
    }

    public int getPropietarioId() {
        return propietarioId;
    }

    public void setPropietarioId(int propietarioId) {
        this.propietarioId = propietarioId;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecioMinVenta() {
        return precioMinVenta;
    }

    public void setPrecioMinVenta(float precioMinVenta) {
        this.precioMinVenta = precioMinVenta;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }
//</editor-fold>

}
