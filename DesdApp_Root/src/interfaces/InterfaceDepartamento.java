
package interfaces;

//Interface para la clasde Departamentos

import java.util.ArrayList;
import modelo.Departamentos;

public interface InterfaceDepartamento {
    //metodos abstractos para la clase deprtamentos
    public String insert(Departamentos depto);
    public String update(Departamentos depto);
    public String delete(int id);
    public Departamentos select(int id);
    public ArrayList<Departamentos> list();
    
}
