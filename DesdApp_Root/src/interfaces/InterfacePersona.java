
package interfaces;

import java.util.ArrayList;
import modelo.Persona;

//Interfaz para la Clase Persona
public interface InterfacePersona {
    //Metodos abstractos Para Persona
    public Persona selectPersona(Persona per);
    public String insertPersona(Persona per);
    public String updatePersona(Persona per);
    public String deletPersona(Persona per);
    public ArrayList<Persona>listPersona();
}
