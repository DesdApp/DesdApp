
package modelo;

//Modelo Region
public class Regiones {
    //declaracion de Atributos
    private int regionId;
    private String nombre;
    private String descripcion;
    
    //Constructor vacio

    public Regiones() {
    }

    //Constructor con parametros
    public Regiones(int regionId, String nombre, String descripcion) {
        this.regionId = regionId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
    //Declaracion de Getters y Setters
    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
