package modelo;

/**
 * Esta clase declara los Metodos Get, Set y atributos para la clase
 * EstadosEmpleados. Se inicializan los Constructores llenos y vacios.
 *
 * @author esteban
 */
public class EstadosEmpleados {

//    Atributos
    private byte estadoEmpleadoId;
    private String nombre;

//    Constructor con parametros
    public EstadosEmpleados(byte estadoEmpleadoId, String nombre) {
        this.estadoEmpleadoId = estadoEmpleadoId;
        this.nombre = nombre;
    }

//    Constructor vacio
    public EstadosEmpleados() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public byte getEstadoEmpleadoId() {
        return estadoEmpleadoId;
    }

    public void setEstadoEmpleadoId(byte estadoEmpleadoId) {
        this.estadoEmpleadoId = estadoEmpleadoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "EstadoEmp{" + "estadoEmpleadoId=" + estadoEmpleadoId + ", nombre=" + nombre + '}';
    }

}
