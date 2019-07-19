
package interfaces;

import java.util.ArrayList;
import modelo.Regiones;
//Interfaz de Regiones
public interface InterfaceRegion {
    //Declaracion de metodos Abstractos de Regiones
public String insertRegion(Regiones region);   
public String updateRegion(Regiones region);
public String deleteRegion(Regiones region);
public Regiones selectRegion(Regiones region);
public ArrayList<Regiones>listRegiones();
}
