
package interfaces;

//Interfaz para la clase Tipo Facturacion

import java.util.ArrayList;
import modelo.TipoFacturacion;

public interface InterfaceTipoFac {
    //Declaracion de Metodods Abstractos
    public String insertTipoFac(TipoFacturacion tipo);
    public String updateTipoFac(TipoFacturacion tipo);
    public String deletTipoFac(TipoFacturacion tipo);
    public TipoFacturacion selectTipoFac(TipoFacturacion tipo);
    public ArrayList<TipoFacturacion>listTipoFac();
    
    
}
