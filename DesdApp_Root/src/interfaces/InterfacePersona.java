
package interfaces;

import java.util.ArrayList;
import modelo.Persona;

//Interfaz para la Clase Persona
public interface InterfacePersona {
    //Metodos abstractos Para Persona
    public Persona select(int id);
    public String insert(Persona per);
    public String update(Persona per);
    public String delete(int id);
    public ArrayList<Persona>list();
}
