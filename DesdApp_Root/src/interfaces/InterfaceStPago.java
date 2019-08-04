package interfaces;

import java.util.ArrayList;
import modelo.StPago;

//Interfaz de clase StPago
public interface InterfaceStPago {

//Metodos Abstractos
    public ArrayList<StPago> listaStPago();

    public StPago selectStPago(StPago pag);

}
