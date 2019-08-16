package interfaces;

import java.util.ArrayList;
import modelo.TpTransacciones;

//Interfaz de la clase TpTrans
public interface InterfaceTpTransacciones {

//Metodos Abstractos
    public String insertTpTrans(TpTransacciones tp);

    public String updateTpTrans(TpTransacciones tp);

    public String deleteTpTrans(TpTransacciones tp);

    public ArrayList<TpTransacciones> listaTpTrans();

    public TpTransacciones selecTpTrans(TpTransacciones tp);

}
