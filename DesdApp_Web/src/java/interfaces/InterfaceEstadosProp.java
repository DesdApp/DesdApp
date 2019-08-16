package interfaces;

import java.util.ArrayList;
import modelo.EstadosPropiedades;

public interface InterfaceEstadosProp {
    
    //Metodos Absstractos
    public String insertEstado(EstadosPropiedades estado);
            
    public String deleteEstado(byte codigo);
            
    public String updateEstado(EstadosPropiedades estado);
            
    public EstadosPropiedades selectEstado(byte codigo);
    
    public ArrayList<EstadosPropiedades> listEstados();
            
}
