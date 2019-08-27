package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase Zonas.
 *
 * @author esteban
 */
import java.util.ArrayList;
import modelo.Zonas;

public interface InterfaceZonas {

//    Metodos abstractos de la tabla Zonas
    public Zonas selectZona(byte zonaId);

    public ArrayList<Zonas> listZonas();

}
