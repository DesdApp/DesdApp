package modelo;

public class EstadosEmpleados {

    private byte estadoEmpleadoId;
    private String nombre;

    public EstadosEmpleados(byte estadoEmpleadoId, String nombre) {
        this.estadoEmpleadoId = estadoEmpleadoId;
        this.nombre = nombre;
    }

    public EstadosEmpleados() {
    }

    //Setter & Getter

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

    @Override
    public String toString() {
        return "EstadoEmp{" + "estadoEmpleadoId=" + estadoEmpleadoId + ", nombre=" + nombre + '}';
    }
   

}
