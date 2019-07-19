package interfaces;

import java.util.ArrayList;
import modelo.EstadosPropiedades;

public interface InterfazEstadosProp {
    
    public String insertEstado(EstadosPropiedades estado);
            
    public String deleteEstado(byte codigo);
            
    public String updateEstado(EstadosPropiedades estado);
            
    public EstadosPropiedades selectEstado(int codigo);
    
    public ArrayList<EstadosPropiedades> listEstados();
            
}
