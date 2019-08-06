package modelo;

public class TpUsuarios {

    private byte tipoUsuarioId;
    private String nombre;

    public TpUsuarios(byte tipoUsuarioId, String nombre) {
        this.tipoUsuarioId = tipoUsuarioId;
        this.nombre = nombre;
    }

    public TpUsuarios() {
    }
    
       //Setter & Getter
    public byte getTipoUsuarioId() {
        return tipoUsuarioId;
    }

    public void setTipoUsuarioId(byte tipoUsuarioId) {
        this.tipoUsuarioId = tipoUsuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Id = " + tipoUsuarioId + ", Nombre = " + nombre;
    }

   
    
    
}
