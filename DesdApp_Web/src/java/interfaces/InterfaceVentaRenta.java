package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase VentaRenta.
 *
 * @author esteban
 */
import modelo.VentaRenta;
import java.util.ArrayList;

public interface InterfaceVentaRenta {

    public VentaRenta selectEstado(byte codigo);

    public ArrayList<VentaRenta> ListEstados();

}
