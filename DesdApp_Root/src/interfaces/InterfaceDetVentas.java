package interfaces;

import java.util.ArrayList;
import modelo.DetallesVentas;

public interface InterfaceDetVentas {

    public DetallesVentas select(int id);

    public String insert(DetallesVentas det);

    public String update(DetallesVentas det);

    public String delete(int id);

    public ArrayList<DetallesVentas> list();
}
