package interfaces;

import java.util.List;
import modelo.StPago;

//Interfaz de clase StPago
public interface InterfaceStPago {

//Metodos Abstractos
public String insertStPago(StPago pag);
public String updateStPago(StPago pag);
public String deleteStPago(StPago pag);
public List<StPago> listaStPago();
public StPago selectStPago(StPago pag);

}
