package modelo;

public class BienesInmuebles {

    // Atributos
    private String inmuebleId;
    private int tipoPropiedadId;
    private int estadoId;
    private int estadoNegId;
    private int clienteId;
    private String direccion;
    private int zonaId;
    private String metrosCuadrados;
    private String descripcionMetros;
    private int cantCuartos;
    private int cantNiveles;
    private int sotanos;
    private int elevadores;
    private int precioMinVenta;
    private int precioSugerido;
    private int precioReal;
    private int imageId;
    private int codEmpleado;

    //Constructor
    public BienesInmuebles(String inmuebleId, int tipoPropiedadId, int estadoId, int estadoNegId, int clienteId, String direccion, int zonaId, String metrosCuadrados, String descripcionMetros, int cantCuartos, int cantNiveles, int sotanos, int elevadores, int precioMinVenta, int precioSugerido, int precioReal, int imageId, int codEmpleado) {
        this.inmuebleId = inmuebleId;
        this.tipoPropiedadId = tipoPropiedadId;
        this.estadoId = estadoId;
        this.estadoNegId = estadoNegId;
        this.clienteId = clienteId;
        this.direccion = direccion;
        this.zonaId = zonaId;
        this.metrosCuadrados = metrosCuadrados;
        this.descripcionMetros = descripcionMetros;
        this.cantCuartos = cantCuartos;
        this.cantNiveles = cantNiveles;
        this.sotanos = sotanos;
        this.elevadores = elevadores;
        this.precioMinVenta = precioMinVenta;
        this.precioSugerido = precioSugerido;
        this.precioReal = precioReal;
        this.imageId = imageId;
        this.codEmpleado = codEmpleado;
    }

    public BienesInmuebles() {
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
    public String getInmuebleId() {
        return inmuebleId;
    }

    public void setInmuebleId(String inmuebleId) {
        this.inmuebleId = inmuebleId;
    }

    public int getTipoPropiedadId() {
        return tipoPropiedadId;
    }

    public void setTipoPropiedadId(int tipoPropiedadId) {
        this.tipoPropiedadId = tipoPropiedadId;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public int getEstadoNegId() {
        return estadoNegId;
    }

    public void setEstadoNegId(int estadoNegId) {
        this.estadoNegId = estadoNegId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getZonaId() {
        return zonaId;
    }

    public void setZonaId(int zonaId) {
        this.zonaId = zonaId;
    }

    public String getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(String metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getDescripcionMetros() {
        return descripcionMetros;
    }

    public void setDescripcionMetros(String descripcionMetros) {
        this.descripcionMetros = descripcionMetros;
    }

    public int getCantCuartos() {
        return cantCuartos;
    }

    public void setCantCuartos(int cantCuartos) {
        this.cantCuartos = cantCuartos;
    }

    public int getCantNiveles() {
        return cantNiveles;
    }

    public void setCantNiveles(int cantNiveles) {
        this.cantNiveles = cantNiveles;
    }

    public int getSotanos() {
        return sotanos;
    }

    public void setSotanos(int sotanos) {
        this.sotanos = sotanos;
    }

    public int getElevadores() {
        return elevadores;
    }

    public void setElevadores(int elevadores) {
        this.elevadores = elevadores;
    }

    public int getPrecioMinVenta() {
        return precioMinVenta;
    }

    public void setPrecioMinVenta(int precioMinVenta) {
        this.precioMinVenta = precioMinVenta;
    }

    public int getPrecioSugerido() {
        return precioSugerido;
    }

    public void setPrecioSugerido(int precioSugerido) {
        this.precioSugerido = precioSugerido;
    }

    public int getPrecioReal() {
        return precioReal;
    }

    public void setPrecioReal(int precioReal) {
        this.precioReal = precioReal;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

//</editor-fold>
    
}