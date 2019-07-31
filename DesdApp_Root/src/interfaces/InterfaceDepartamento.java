
package interfaces;

//Interface para la clasde Departamentos

import java.util.ArrayList;
import modelo.Departamentos;

public interface InterfaceDepartamento {
    //metodos abstractos para la clase deprtamentos
    
    public Departamentos select(int id);
    public ArrayList<Departamentos> list();
    
}
