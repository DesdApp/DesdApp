package interfaces;

import modelo.EstadoEmp;
import java.util.ArrayList;

public interface InterfaceEstadoEmp {

    public void insertEstadoEmp(EstadoEmp estadoEmp);

    public void deleteEstadoEmp(int codigo);

    public void updateEmpleado(EstadoEmp estadoEmp);

    public void selectEstadoEmp(int codigo);

    public ArrayList<EstadoEmp> ListEstadoEmp();
}
