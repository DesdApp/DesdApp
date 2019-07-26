package interfaces;

import java.util.ArrayList;
import modelo.TiposClientes;

public interface InterfaceTpClientes {
    
    public String insertTipo(TiposClientes tipo);
    
    public String deleteTipo(byte codigo);
    
    public String updateTipo(TiposClientes tipo);
    
    public TiposClientes selectTipo(byte codigo);
    
    public ArrayList<TiposClientes> listTipos();
}
