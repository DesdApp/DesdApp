package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase EstadosPropiedades.
 *
 * @author esteban
 */
import java.util.ArrayList;
import modelo.EstadosPropiedades;

public interface InterfaceEstadosProp {

    //Metodos Absstractos
    public String insertEstado(EstadosPropiedades estado);

    public String deleteEstado(byte codigo);

    public String updateEstado(EstadosPropiedades estado);

    public EstadosPropiedades selectEstado(byte codigo);

    public ArrayList<EstadosPropiedades> listEstados();

}
