package interfaces;

import modelo.DetallesVentas;
import java.util.ArrayList;

public interface InterfaceDetVentas {
    public DetallesVentas select(DetallesVentas det);
    public String insert(DetallesVentas det);
    public String update(DetallesVentas det);
    public String delete(DetallesVentas det);
    public ArrayList<DetallesVentas> list();
}
