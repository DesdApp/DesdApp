package modelo;

/**
 * Esta clase declara los Metodos Get, Set y atributos para la clase Nosotros.
 * Se inicializan los Constructores llenos y vacios.
 *
 * @author esteban
 */
public class Nosotros {

    private String nombre;
    private String apellido;
    private int cel;
    private int tel;
    private String correo;
    private int cod_empleado;
    private int tipo_usuario_id;

//    Constructor vacio
    public Nosotros() {
    }

//    Constructor con parametros
    public Nosotros(String nombre, String apellido, int cel, int tel, String correo, int cod_empleado, int tipo_usuario_id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cel = cel;
        this.tel = tel;
        this.correo = correo;
        this.cod_empleado = cod_empleado;
        this.tipo_usuario_id = tipo_usuario_id;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
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
//</editor-fold>

}
