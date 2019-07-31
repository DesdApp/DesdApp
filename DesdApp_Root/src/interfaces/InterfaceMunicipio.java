
package interfaces;

//Interfaz para la clase municipios

import java.util.ArrayList;
import modelo.Municipios;

public interface InterfaceMunicipio {
    //declaracion de los metodos abstractos
    
    public Municipios select(int id);
    public ArrayList<Municipios>list();
    
}
