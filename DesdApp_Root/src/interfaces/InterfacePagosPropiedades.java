package interfaces;

import modelo.PagosPropiedades;
import java.util.ArrayList;

public interface InterfacePagosPropiedades {
    public PagosPropiedades select(PagosPropiedades pago);
    public String update(PagosPropiedades pago);
    public String delete(PagosPropiedades pago);
    public String insert(PagosPropiedades pago);
    public ArrayList<PagosPropiedades> list();
}
