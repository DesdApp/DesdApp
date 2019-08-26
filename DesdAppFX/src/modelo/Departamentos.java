
package modelo;

//Modelo Clase Departamentos
public class Departamentos {
    //atributos privados de la clase departamentos
    private int deptoId;
    private String nombre;
    private int regionId;
    
    //Constructor vacio

    public Departamentos() {
    }
    
   //constructor con parametros

    public Departamentos(int deptoId, String nombre, int regionId) {
        this.deptoId = deptoId;
        this.nombre = nombre;
        this.regionId = regionId;
    }
    
    //Getters and Setters

    public int getDeptoId() {
        return deptoId;
    }

    public void setDeptoId(int deptoId) {
        this.deptoId = deptoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
