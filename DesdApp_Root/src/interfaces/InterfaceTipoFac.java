
package interfaces;

//Interfaz para la clase Tipo Facturacion

import java.util.ArrayList;
import modelo.TipoFacturacion;

public interface InterfaceTipoFac {
    //Declaracion de Metodods Abstractos
    public String insert(TipoFacturacion tipo);
    public String update(TipoFacturacion tipo);
    public String delete(TipoFacturacion tipo);
    public TipoFacturacion select(TipoFacturacion tipo_id);
    public ArrayList<TipoFacturacion>list();
    
    
}
