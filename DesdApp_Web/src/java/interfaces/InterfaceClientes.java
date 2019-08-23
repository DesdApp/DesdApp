package interfaces;

import java.util.ArrayList;
import modelo.Clientes;

public interface InterfaceClientes {
    
    public String insertCliente(Clientes cliente);
    public String deleteClientes(int codigo);
    public String updateClientes(Clientes cliente);
    public Clientes selectcliente(int codigo);
    public int validar(Clientes clin);
    public String insertpassword(Clientes cliente);
    public ArrayList<Clientes> listclientes();
}
