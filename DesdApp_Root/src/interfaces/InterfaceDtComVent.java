package interfaces;

import java.util.List;
import modelo.DtComVent;

//Interfaz para la clase DtComVent
public interface InterfaceDtComVent {

//Metodos Abstractos
public void insertDtComVent(DtComVent dcv);
public void updateDtComVent(DtComVent dcv);
public void deleteDtComVent(DtComVent dcv);
public List<DtComVent> listaDtComVent();
public DtComVent selectDtComVent(DtComVent dcv);
}
//