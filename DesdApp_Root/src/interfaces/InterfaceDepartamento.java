
package interfaces;

//Interface para la clasde Departamentos

import java.util.ArrayList;
import modelo.Departamentos;

public interface InterfaceDepartamento {
    //metodos abstractos para la clase deprtamentos
    public String insertDepto(Departamentos depto);
    public String updateDepto(Departamentos depto);
    public String deleteDepto(Departamentos depto);
    public Departamentos selectDepto(Departamentos depto);
    public ArrayList<Departamentos> listDepto();
    
}
