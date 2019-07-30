package interfaces;

import java.util.ArrayList;
import modelo.Ventas;

public interface InterfaceVentas {

    public Ventas select(int id);

    public String update(Ventas venta);

    public String delete(int id);

    public String insert(Ventas venta);

    public ArrayList<Ventas> list();
}
