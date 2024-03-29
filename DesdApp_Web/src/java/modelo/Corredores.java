package modelo;
public class Corredores {


    private String nombre_corredor;
    private int cod_emp;
    private int tel;
    private int cel;
    private String correo;
    private String tipo_prop;
    private String direccion;
    private String zona;
    private int precio_s;

    // Constructor vacio
    public String getNombre_corredor() {
        return nombre_corredor;
    }

    // Constructor con parametros
    public void setNombre_corredor(String nombre_corredor) {
        this.nombre_corredor = nombre_corredor;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public int getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(int cod_emp) {
        this.cod_emp = cod_emp;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo_prop() {
        return tipo_prop;
    }

    public void setTipo_prop(String tipo_prop) {
        this.tipo_prop = tipo_prop;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getPrecio_s() {
        return precio_s;
    }

    public void setPrecio_s(int precio_s) {
        this.precio_s = precio_s;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Corredores{" + "nombre_corredor=" + nombre_corredor + ", cod_emp=" + cod_emp + ", tel=" + tel + ", cel=" + cel + ", correo=" + correo + ", tipo_prop=" + tipo_prop + ", direccion=" + direccion + ", zona=" + zona + ", precio_s=" + precio_s + '}';
    }
    
    
}
