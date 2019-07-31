package interfaces;

import modelo.EstadosEmpleados;
import java.util.ArrayList;

public interface InterfaceEstadosEmpleados {

   

    public EstadosEmpleados select(int codigo);

    public ArrayList<EstadosEmpleados> list();
}
