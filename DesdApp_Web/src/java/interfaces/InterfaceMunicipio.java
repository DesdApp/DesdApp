package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase Municipios.
 *
 * @author esteban
 */
import java.util.ArrayList;
import modelo.Municipios;

public interface InterfaceMunicipio {

    //declaracion de los metodos abstractos
    public String insert(Municipios muni);

    public String update(Municipios muni);

    public String delete(int id);

    public Municipios select(int id);

    public ArrayList<Municipios> list();

}
