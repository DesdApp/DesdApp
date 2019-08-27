package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase Departamentos.
 *
 * @author esteban
 */
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
