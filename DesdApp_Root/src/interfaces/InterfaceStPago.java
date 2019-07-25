package interfaces;

import java.util.List;
import modelo.StPago;

//Interfaz de clase StPago
public interface InterfaceStPago {

//Metodos Abstractos
public void insertStPago(StPago pag);
public void updateStPago(StPago pag);
public void deleteStPago(StPago pag);
public List<StPago> listaStPago();
public StPago selectStPago(StPago pag);

}
