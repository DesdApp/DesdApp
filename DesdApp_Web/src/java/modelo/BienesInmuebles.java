package modelo;

/**
 * Esta clase declara los Metodos Get, Set y atributos para la clase
 * BienesInmuebles. Se inicializan los Constructores llenos y vacios.
 *
 * @author esteban
 */
public class BienesInmuebles {

    // Atributos
    private String inmuebleId;
    private byte tipoPropiedadId;
    private byte estadoId;
    private byte estadoNegId;
    private int clienteId;
    private String direccion;
    private int zonaId;
    private String metrosCuadrados;
    private String descripcionMetros;
    private byte cantCuartos;
    private byte cantNiveles;
    private byte sotanos;
    private byte elevadores;
    private int precioMinVenta;
    private int precioSugerido;
    private int precioReal;
    private int codEmpleado;

    //Constructor con parametros
    public BienesInmuebles(String inmuebleId, byte tipoPropiedadId, byte estadoId, byte estadoNegId, int clienteId, String direccion, int zonaId, String metrosCuadrados, String descripcionMetros, byte cantCuartos, byte cantNiveles, byte sotanos, byte elevadores, int precioMinVenta, int precioSugerido, int precioReal, int codEmpleado) {
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
        this.codEmpleado = codEmpleado;
    }

    // Contructor vacio
    public BienesInmuebles() {
    }

    @Override
    public String toString() {
        return "BienesInmuebles{" + "inmuebleId=" + inmuebleId + ", tipoPropiedadId=" + tipoPropiedadId + ", estadoId=" + estadoId + ", estadoNegId=" + estadoNegId + ", clienteId=" + clienteId + ", direccion=" + direccion + ", zonaId=" + zonaId + ", metrosCuadrados=" + metrosCuadrados + ", descripcionMetros=" + descripcionMetros + ", cantCuartos=" + cantCuartos + ", cantNiveles=" + cantNiveles + ", sotanos=" + sotanos + ", elevadores=" + elevadores + ", precioMinVenta=" + precioMinVenta + ", precioSugerido=" + precioSugerido + ", precioReal=" + precioReal + ", codEmpleado=" + codEmpleado + '}';
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
    public String getInmuebleId() {
        return inmuebleId;
    }

    public void setInmuebleId(String inmuebleId) {
        this.inmuebleId = inmuebleId;
    }

    public byte getTipoPropiedadId() {
        return tipoPropiedadId;
    }

    public void setTipoPropiedadId(byte tipoPropiedadId) {
        this.tipoPropiedadId = tipoPropiedadId;
    }

    public byte getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(byte estadoId) {
        this.estadoId = estadoId;
    }

    public byte getEstadoNegId() {
        return estadoNegId;
    }

    public void setEstadoNegId(byte estadoNegId) {
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

    public byte getCantCuartos() {
        return cantCuartos;
    }

    public void setCantCuartos(byte cantCuartos) {
        this.cantCuartos = cantCuartos;
    }

    public byte getCantNiveles() {
        return cantNiveles;
    }

    public void setCantNiveles(byte cantNiveles) {
        this.cantNiveles = cantNiveles;
    }

    public byte getSotanos() {
        return sotanos;
    }

    public void setSotanos(byte sotanos) {
        this.sotanos = sotanos;
    }

    public byte getElevadores() {
        return elevadores;
    }

    public void setElevadores(byte elevadores) {
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

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }
//</editor-fold>
}
