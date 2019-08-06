
package interfaces;

import java.util.ArrayList;
import modelo.Regiones;
//Interfaz de Regiones
public interface InterfaceRegion {
    //Declaracion de metodos Abstractos de Regiones
public String insert(Regiones region);   
public String update(Regiones region);
public String delete(int id);
public Regiones select(int id);
public ArrayList<Regiones>list();
}
