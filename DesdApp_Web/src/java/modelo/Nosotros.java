package modelo;
public class Nosotros {
    
    private String nombre;
    private String apellido;
    private int cel;
    private int tel;
    private String correo;
    private int cod_empleado;
    private int tipo_usuario_id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(int cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public int getTipo_usuario_id() {
        return tipo_usuario_id;
    }

    public void setTipo_usuario_id(int tipo_usuario_id) {
        this.tipo_usuario_id = tipo_usuario_id;
    }

    @Override
    public String toString() {
        return "Nosotros{" + "nombre=" + nombre + ", apellido=" + apellido + ", cel=" + cel + ", tel=" + tel + ", correo=" + correo + ", cod_empleado=" + cod_empleado + ", tipo_usuario_id=" + tipo_usuario_id + '}';
    }


   
    
    
}
