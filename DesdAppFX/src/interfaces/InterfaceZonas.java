package interfaces;

import java.util.ArrayList;
import modelo.Zonas;

public interface InterfaceZonas {
    
//    Metodos abstractos de la tabla Zonas
    public Zonas selectZona(byte zonaId);
    
    public ArrayList<Zonas> listZonas();
    
}
