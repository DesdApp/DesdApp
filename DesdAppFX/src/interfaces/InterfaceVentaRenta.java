
package interfaces;
import modelo.VentaRenta;
import java.util.ArrayList;
public interface InterfaceVentaRenta {
    
    public VentaRenta selectEstado(byte codigo);
    public ArrayList<VentaRenta> ListEstados();
    
}
