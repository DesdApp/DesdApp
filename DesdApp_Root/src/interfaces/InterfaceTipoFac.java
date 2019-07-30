
package interfaces;

//Interfaz para la clase Tipo Facturacion

import java.util.ArrayList;
import modelo.TipoFacturacion;

public interface InterfaceTipoFac {
    //Declaracion de Metodods Abstractos
    public TipoFacturacion select(int id);
    public ArrayList<TipoFacturacion>list();
    
    
}
