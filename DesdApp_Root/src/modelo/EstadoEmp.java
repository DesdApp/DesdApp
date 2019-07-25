package modelo;

public class EstadoEmp {

    private byte estadoEmpleadoId;
    private String nombre;

    public EstadoEmp(byte estadoEmpleadoId, String nombre) {
        this.estadoEmpleadoId = estadoEmpleadoId;
        this.nombre = nombre;
    }

    public EstadoEmp() {
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
   

}
