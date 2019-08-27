package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase Regiones.
 *
 * @author esteban
 */
import java.util.ArrayList;
import modelo.Regiones;

public interface InterfaceRegion {

    //Declaracion de metodos Abstractos de Regiones
    public String insert(Regiones region);

    public String update(Regiones region);

    public String delete(int id);

    public Regiones select(int id);

    public ArrayList<Regiones> list();
}
