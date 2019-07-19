
package interfaces;

//Interfaz para la clase municipios

import java.util.ArrayList;
import modelo.Municipios;

public interface InterfaceMunicipio {
    //declaracion de los metodos abstractos
    public String insertMuni(Municipios muni);
    public String updateMuni(Municipios muni);
    public String deleteMuni(Municipios muni);
    public Municipios selectMuni(Municipios muni);
    public ArrayList<Municipios>listMuni();
    
}
