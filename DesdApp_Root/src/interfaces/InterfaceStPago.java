package interfaces;

import java.util.ArrayList;
import modelo.StPago;

//Interfaz de clase StPago
public interface InterfaceStPago {

//Metodos Abstractos
    public String insertStPago(StPago pag);

    public String updateStPago(StPago pag);

    public String deleteStPago(StPago pag);

    public ArrayList<StPago> listaStPago();

    public StPago selectStPago(StPago pag);

}
