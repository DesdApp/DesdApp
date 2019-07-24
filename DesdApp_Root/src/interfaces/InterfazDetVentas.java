package interfaces;

import java.util.ArrayList;
import modelo.DetVentas;

public interface InterfazDetVentas {
    public DetVentas select(DetVentas ventas);
    public void insert(DetVentas ventas);
    public void update(DetVentas ventas);
    public void delete(DetVentas ventas);
    public ArrayList<DetVentas> listar();
}
