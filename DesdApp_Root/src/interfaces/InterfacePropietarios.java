
package interfaces;

import java.util.ArrayList;
import modelo.Propietarios;


public interface InterfacePropietarios {
    public String insert(Propietarios prop);
    public String update(Propietarios prop);
    public String delete(int id);
    public Propietarios select(int id);
    public ArrayList<Propietarios>list();
}
