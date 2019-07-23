package interfaces;

import modelo.Empleado;
import java.util.ArrayList;

public interface InterfazEmpleado {

    public void insertEmpleado(Empleado empleado);

    public void deleteEmpleado(int codigo);

    public void updateEmpleado(Empleado empleado);

    public void selectEmpleado(int codigo);

    public ArrayList<Empleado> ListEmpleado();
}
