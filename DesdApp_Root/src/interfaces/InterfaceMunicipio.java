
package interfaces;

//Interfaz para la clase municipios

import java.util.ArrayList;
import modelo.Municipios;

public interface InterfaceMunicipio {
    //declaracion de los metodos abstractos
    public String insert(Municipios muni);
    public String update(Municipios muni);
    public String delete(Municipios muni);
    public Municipios select(Municipios muni);
    public ArrayList<Municipios>list();
    
}
