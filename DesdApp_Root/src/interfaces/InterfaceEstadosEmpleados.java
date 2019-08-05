package interfaces;

import modelo.EstadosEmpleados;
import java.util.ArrayList;

public interface InterfaceEstadosEmpleados {

    public String insert(EstadosEmpleados estadoEmp);

    public String delete(int codigo);

    public String update(EstadosEmpleados estadoEmp);

    public EstadosEmpleados select(int codigo);

    public ArrayList<EstadosEmpleados> list();
}
