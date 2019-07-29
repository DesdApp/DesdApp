
package interfaces;

//Interface para la clasde Departamentos

import java.util.ArrayList;
import modelo.Departamentos;

public interface InterfaceDepartamento {
    //metodos abstractos para la clase deprtamentos
    public String insert(Departamentos depto);
    public String update(Departamentos depto);
    public String delete(Departamentos depto);
    public Departamentos select(Departamentos depto);
    public ArrayList<Departamentos> list();
    
}
