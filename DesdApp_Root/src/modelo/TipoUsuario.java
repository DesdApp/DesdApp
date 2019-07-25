package modelo;

public class TipoUsuario {

    private byte tipoUsuarioId;
    private String nombre;

    public TipoUsuario(byte tipoUsuarioId, String nombre) {
        this.tipoUsuarioId = tipoUsuarioId;
        this.nombre = nombre;
    }

    public TipoUsuario() {
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

   
    
    
}
