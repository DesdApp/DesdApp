package interfaces;

import modelo.Empleado;
import java.util.ArrayList;

public interface InterfaceEmpleado {

    public void insertEmpleado(Empleado empleado);

    public void deleteEmpleado(int codigo);

    public void updateEmpleado(Empleado empleado);

    public Empleado selectEmpleado(int codigo);

    public ArrayList<Empleado> ListEmpleado();
}
