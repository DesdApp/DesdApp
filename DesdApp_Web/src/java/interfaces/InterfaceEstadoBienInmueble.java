package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase EstadoBienesInmuebles.
 *
 * @author esteban
 */
import modelo.EstadoBienInmueble;
import java.util.ArrayList;

public interface InterfaceEstadoBienInmueble {

    public EstadoBienInmueble selectEstado(byte codigo);

    public ArrayList<EstadoBienInmueble> listEstados();
}
