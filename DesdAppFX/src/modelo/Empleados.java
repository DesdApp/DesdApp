package modelo;

import java.sql.Date;

public class Empleados {
    
    private int empleadoId;
    private int personaId;
    private int tipoUsuarioId;
    private String puesto;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private String user;
    private String password;
    private int imageId;
    private int estadoEmpleadoId;

    //Contructor
    public Empleados(int empleadoId, int personaId, int tipoUsuarioId, String puesto, Date fechaInicio, Date fechaFinalizacion, String user, String password, int imageId, int estadoEmpleadoId) {
        this.empleadoId = empleadoId;
        this.personaId = personaId;
        this.tipoUsuarioId = tipoUsuarioId;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.user = user;
        this.password = password;
        this.imageId = imageId;
        this.estadoEmpleadoId = estadoEmpleadoId;
    }

    //Constructor vacio
    public Empleados() {
    }
    
    //<editor-flod defaultstate="collapsed" desc="Metodos de acceso SET & GET">

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public int getTipoUsuarioId() {
        return tipoUsuarioId;
    }

    public void setTipoUsuarioId(int tipoUsuarioId) {
        this.tipoUsuarioId = tipoUsuarioId;
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

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
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
        return "Empleado{" + "empleadoId=" + empleadoId + ", personaId=" + personaId + ", tipoUsuarioId=" + tipoUsuarioId + ", puesto=" + puesto +  ", fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + fechaFinalizacion + ", user=" + user + ", password=" + password + ", imageId=" + imageId  + ", estadoEmpleadoId=" + estadoEmpleadoId + '}';
    }
    
    
    
}
