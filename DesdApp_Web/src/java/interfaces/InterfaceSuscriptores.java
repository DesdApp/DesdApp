package interfaces;

import java.util.ArrayList;
import modelo.Suscriptores;

public interface InterfaceSuscriptores {

//    Metodos abstractos para la tabla Suscriptores
    public String insertSuscriptor(Suscriptores suscriptor);
    
    public String deleteSuscriptor(int suscriptorId);
    
    public String updateSuscriptor(Suscriptores suscriptor);
    
    public Suscriptores selectSuscriptor(int suscriptorId);
    
    public ArrayList<Suscriptores> listSuscriptores();
}
