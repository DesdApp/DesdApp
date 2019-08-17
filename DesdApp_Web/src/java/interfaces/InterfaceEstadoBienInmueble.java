package interfaces;

import modelo.EstadoBienInmueble;
import java.util.ArrayList;

public interface InterfaceEstadoBienInmueble {

    public EstadoBienInmueble selectEstado(byte codigo);

    public ArrayList<EstadoBienInmueble> listEstados();
}
