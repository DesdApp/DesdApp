package modelo;

import java.sql.Date;

public class Empleados {

    private int personaId;
    private int empleadoId;
    private String puesto;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private double sueldo;
    private String user;
    private String password;
    private int tipoUsuarioId;
    private int estadoEmpleadoId;

    public Empleados(int personaId, int empleadoId, String puesto, Date fechaInicio, Date fechaFinalizacion, double sueldo, String user, String password, int tipoUsuarioId, int estadoEmpleadoId) {
        this.personaId = personaId;
        this.empleadoId = empleadoId;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.sueldo = sueldo;
        this.user = user;
        this.password = password;
        this.tipoUsuarioId = tipoUsuarioId;
        this.estadoEmpleadoId = estadoEmpleadoId;
    }

    public Empleados() {
    }
    //<editor-flod defaultstate="collapsed" desc="Metodos de acceso SET & GET">
   
    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechFinalizacion) {
        this.fechaFinalizacion = fechFinalizacion;
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

    public int getTipoUsuarioId() {
        return tipoUsuarioId;
    }

    public void setTipoUsuarioId(int tipoUsuarioId) {
        this.tipoUsuarioId = tipoUsuarioId;
    }

    public int getEstadoEmpleadoId() {
        return estadoEmpleadoId;
    }

    public void setEstadoEmpleadoId(int estadoEmpleadoId) {
        this.estadoEmpleadoId = estadoEmpleadoId;
    }
    //</>editor-fold>

    @Override
    public String toString() {
        return "Empleado{" + "personaId=" + personaId + ", empleadoId=" + empleadoId + ", puesto=" + puesto + ", fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + fechaFinalizacion + ", sueldo=" + sueldo + ", user=" + user + ", password=" + password + ", tipoUsuarioId=" + tipoUsuarioId + ", estadoEmpleadoId=" + estadoEmpleadoId + '}';
    }
    
    
}
