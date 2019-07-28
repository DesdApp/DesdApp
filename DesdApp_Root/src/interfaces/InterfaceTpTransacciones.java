package interfaces;

import java.util.ArrayList;
import modelo.TpTransacciones;

//Interfaz de la clase TpTrans
public interface InterfaceTpTransacciones {

//Metodos Abstractos
    public void insertTpTrans(TpTransacciones tp);

    public void updateTpTrans(TpTransacciones tp);

    public void deleteTpTrans(TpTransacciones tp);

    public ArrayList<TpTransacciones> listaTpTrans();

    public TpTransacciones selecTpTrans(TpTransacciones tp);

}
