
package interfaces;


import java.util.List;
import modelo.DetalleVt;

public interface InterfaceDetalleVt {

    //Metodos abstractos
    public void addDetalleVt(DetalleVt dv);
    public void updateDetalleVt(DetalleVt dv);
    public DetalleVt selectDetalleVt(DetalleVt dv);
    public void deleteDetalle(DetalleVt dv);
    public List<DetalleVt> listVenta();
    
}
