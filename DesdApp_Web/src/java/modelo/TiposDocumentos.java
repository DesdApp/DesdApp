package modelo;

/**
 * Esta clase declara los Metodos Get, Set y  atributos para 
 * la clase TiposDocumentos.
 * Se inicializan los Constructores llenos y vacios.
 * @author esteban
 */

public class TiposDocumentos {
 //Declaracion de Atributos para la clase TiposDocumentos
    private byte idTipoDoc;
    private String nombre;
    
    //Constructor con Parametros

    public TiposDocumentos(byte idTipoDoc, String nombre) {
        this.idTipoDoc = idTipoDoc;
        this.nombre = nombre;
    }
    
    //Constructor Vacio

    public TiposDocumentos() {
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public byte getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(byte idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//</editor-fold>
}
