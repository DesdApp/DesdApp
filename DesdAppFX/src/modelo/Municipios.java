
package modelo;

//Modelo clase municipios
public class Municipios {
    //Declaracion de Atributos 
    private int muniIdi;
    private String nombre;
    private int deptoId;
    
    //Constructor Vacio
    public Municipios() {
    }
    
    //Constructor con Parametros

    public Municipios(int muniIdi, String nombre, int deptoId) {
        this.muniIdi = muniIdi;
        this.nombre = nombre;
        this.deptoId = deptoId;
    }
    
    //Getters y Setteres

    public int getMuniIdi() {
        return muniIdi;
    }

    public void setMuniIdi(int muniIdi) {
        this.muniIdi = muniIdi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDeptoId() {
        return deptoId;
    }

    public void setDeptoId(int deptoId) {
        this.deptoId = deptoId;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
