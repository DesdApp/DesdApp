package interfaces;

import modelo.Ventas;
import java.util.ArrayList;

public interface InterfaceVentas {
    public Ventas select(Ventas venta);
    public String update(Ventas venta);
    public String delete(Ventas venta);
    public String insert(Ventas venta);
    public ArrayList<Ventas> list();
}
