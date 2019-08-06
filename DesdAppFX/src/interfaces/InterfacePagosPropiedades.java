package interfaces;

import java.util.ArrayList;
import modelo.PagosPropiedades;

public interface InterfacePagosPropiedades {

    public PagosPropiedades select(int id);

    public String update(PagosPropiedades pago);

    public String delete(int id);

    public String insert(PagosPropiedades pago);

    public ArrayList<PagosPropiedades> list();
}
