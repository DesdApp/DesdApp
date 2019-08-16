
package interfaces;

import java.util.ArrayList;
import modelo.TiposDocumentos;


public interface InterfaceTiposDocumentos {
    //Declaracion de Metodos Abstractos
    public TiposDocumentos select(int id);
    public ArrayList<TiposDocumentos> list();
    
}
