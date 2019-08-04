package interfaces;

import java.util.ArrayList;
import modelo.Negocios;

//Interfaz para la clase Negocios
public interface InterfaceNegocios {

//Metodos Abstractos
    public String insertNeg(Negocios neg);

    public String updateNeg(Negocios neg);

    public String deleteNeg(Negocios neg);

    public ArrayList<Negocios> listaNeg();

    public Negocios selectNeg(Negocios neg);
}
