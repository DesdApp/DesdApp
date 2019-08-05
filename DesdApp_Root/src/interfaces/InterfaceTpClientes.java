package interfaces;

import java.util.ArrayList;
import modelo.TiposClientes;

public interface InterfaceTpClientes {    
    public TiposClientes selectTipo(byte codigo);
    
    public ArrayList<TiposClientes> listTipos();
}
