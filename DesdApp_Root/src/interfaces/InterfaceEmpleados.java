package interfaces;

import modelo.Empleados;
import java.util.ArrayList;

public interface InterfaceEmpleados {

    public String insert(Empleados empleado);

    public String delete(int codigo);

    public String update(Empleados empleado);

    public Empleados select(int codigo);

    public ArrayList<Empleados> lits();
}
