package interfaces;

import java.util.ArrayList;
import modelo.DtCompraVenta;

//Interfaz para la clase DtComVent
public interface InterfaceDtCompraVenta {

//Metodos Abstractos
    public String insertDtComVent(DtCompraVenta dcv);

    public String updateDtComVent(DtCompraVenta dcv);

    public String deleteDtComVent(DtCompraVenta dcv);

    public ArrayList<DtCompraVenta> listaDtComVent();

    public DtCompraVenta selectDtComVent(DtCompraVenta dcv);
}
//
