package interfaces;

import java.util.List;
import modelo.DetVentas;

public interface InterfazDetVentas {
    public DetVentas read(DetVentas ventas);
    public void create(DetVentas ventas);
    public void upd(DetVentas ventas);
    public void del(DetVentas ventas);
    public List<DetVentas> listar();
}
