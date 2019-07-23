package interfaces;

import java.util.List;
import modelo.PagosPropiedades;

public interface InterfazPagPro {
    public PagosPropiedades read(PagosPropiedades papo);
    public void upd(PagosPropiedades papo);
    public void del(PagosPropiedades papo);
    public void create(PagosPropiedades papo);
    public List<PagosPropiedades> listas();
}
