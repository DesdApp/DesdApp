
package modelo;

//modelo para la clase Tipo Facturacion
public class TipoFacturacion {
    //declaracion de Atributos privados
    private int tipoId;
    private String nombre;
    
    //Constructor Vacio

    public TipoFacturacion() {
    }
    
    //Constructor Con Parametros

    public TipoFacturacion(int tipoId, String nombre) {
        this.tipoId = tipoId;
        this.nombre = nombre;
    }
    
    //Getters y Setters

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoFacturacion{" + "tipoId=" + tipoId + ", nombre=" + nombre + '}';
    }
    
    
}
