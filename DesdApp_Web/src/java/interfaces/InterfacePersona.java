
package interfaces;

import java.util.ArrayList;
import modelo.Personas;

//Interfaz para la Clase Personas
public interface InterfacePersona {
    //Metodos abstractos Para Personas
    public Personas select(int id);
    public String insert(Personas per);
    public String update(Personas per);
    public String delete(int id);
    public ArrayList<Personas>list();
}
