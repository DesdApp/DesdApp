package modelo;

public class TipoUsuario {

    private int tipo_usario_id;
    private String nombre;

    //Setter & Getter
    public int getTipo_usario_id() {
        return tipo_usario_id;
    }

    public void setTipo_usario_id(int tipo_usario_id) {
        this.tipo_usario_id = tipo_usario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
