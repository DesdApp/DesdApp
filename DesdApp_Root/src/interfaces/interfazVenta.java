package interfaces;

import java.util.List;
import modelo.Venta;

public interface interfazVenta {
    public Venta read(Venta venta);
    public void upd(Venta venta);
    public void del(Venta venta);
    public void create(Venta venta);
    public List<Venta> listas();
}
