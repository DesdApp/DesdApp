package modelo;

/**
 * Esta Clase declara los metodos Get, Set, y
 * Atributos para la clase TiposUsuarios, 
 * Inicializa los contructores vacio y Lleno.
 * @author carolina
 */
public class TiposUsuarios {
//Atributos
    private byte tipoUsuarioId;
    private String nombre;

    //Constructor De atributos
    public TiposUsuarios(byte tipoUsuarioId, String nombre) {
        this.tipoUsuarioId = tipoUsuarioId;
        this.nombre = nombre;
    }
    //Constructor Vacio
    public TiposUsuarios() {
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
