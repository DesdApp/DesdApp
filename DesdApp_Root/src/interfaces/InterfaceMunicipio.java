
package interfaces;

//Interfaz para la clase municipios

import java.util.ArrayList;
import modelo.Municipios;

public interface InterfaceMunicipio {
    //declaracion de los metodos abstractos
    public String insert(Municipios muni);
    public String update(Municipios muni);
    public String delete(int id);
    public Municipios select(int id);
    public ArrayList<Municipios>list();
    
}
