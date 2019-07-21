package interfaces;

import java.util.List;
import modelo.TpTrans;

//Interfaz de la clase TpTrans
public interface InterfaceTpTrans {

//Metodos Abstractos
public void insertTpTrans(TpTrans tp);  
public void updateTpTrans(TpTrans tp);
public void deleteTpTrans(TpTrans tp);
public List<TpTrans> listaTpTrans();
public TpTrans selecTpTrans(TpTrans tp);

}
