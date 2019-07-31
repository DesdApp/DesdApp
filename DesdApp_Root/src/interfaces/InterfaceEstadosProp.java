package interfaces;

import java.util.ArrayList;
import modelo.EstadosPropiedades;

public interface InterfaceEstadosProp {
    
    //Metodos Absstractos
    public EstadosPropiedades selectEstado(byte codigo);
    
    public ArrayList<EstadosPropiedades> listEstados();
            
}
