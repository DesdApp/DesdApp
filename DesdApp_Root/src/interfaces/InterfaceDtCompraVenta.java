package interfaces;

import java.util.ArrayList;
import modelo.DtCompraVenta;

//Interfaz para la clase DtComVent
public interface InterfaceDtCompraVenta {

//Metodos Abstractos
    public void insertDtComVent(DtCompraVenta dcv);

    public void updateDtComVent(DtCompraVenta dcv);

    public void deleteDtComVent(DtCompraVenta dcv);

    public ArrayList<DtCompraVenta> listaDtComVent();

    public DtCompraVenta selectDtComVent(DtCompraVenta dcv);
}
//
