package modelo;

public class Empleado {

    private int persona_id;
    private int empleado_id;
    private String puesto;
    private String fecha_inicio;
    private String fecha_finalizacion;
    private double sueldo;
    private String user;
    private String password;
    private int tipo_usuario_id;
    private int estado_empleado_id;

    //<editor-flod defaultstate="collapsed" desc="Metodos de acceso SET & GET">
    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(String fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTipo_usuario_id() {
        return tipo_usuario_id;
    }

    public void setTipo_usuario_id(int tipo_usuario_id) {
        this.tipo_usuario_id = tipo_usuario_id;
    }

    public int getEstado_empleado_id() {
        return estado_empleado_id;
    }

    public void setEstado_empleado_id(int estado_empleado_id) {
        this.estado_empleado_id = estado_empleado_id;
    }
    //</>editor-fold>
}
