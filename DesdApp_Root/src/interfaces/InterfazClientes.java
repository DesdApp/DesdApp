package interfaces;

import java.util.ArrayList;
import modelo.Clientes;

public interface InterfazClientes {
    
    public String insertCliente(Clientes cliente);
    public String deleteClientes(int codigo);
    public String updateClientes(Clientes cliente);
    public Clientes selectcliente(int codigo);
    public ArrayList<Clientes> listclientes();
}
