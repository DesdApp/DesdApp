package interfaces;

import java.util.ArrayList;
import modelo.Ventas;

public interface InterfazVentas {

    public Ventas select(Ventas venta);

    public void update(Ventas venta);

    public void delete(Ventas venta);

    public void insert(Ventas venta);

    public ArrayList<Ventas> list();
}
