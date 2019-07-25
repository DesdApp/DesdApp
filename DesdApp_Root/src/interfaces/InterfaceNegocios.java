package interfaces;

import java.util.ArrayList;
import modelo.Negocios;

//Interfaz para la clase Negocios
public interface InterfaceNegocios {

//Metodos Abstractos
    public void insertNeg(Negocios neg);

    public void updateNeg(Negocios neg);

    public void deleteNeg(Negocios neg);

    public ArrayList<Negocios> listaNeg();

    public Negocios selectNeg(Negocios neg);
}
