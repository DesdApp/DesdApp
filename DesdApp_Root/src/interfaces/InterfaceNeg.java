package interfaces;

import java.util.List;
import modelo.Neg;

//Interfaz para la clase Neg
public interface InterfaceNeg {
    
//Metodos Abstractos
public void insertNeg(Neg neg);
public void updateNeg(Neg neg);
public void deleteNeg(Neg neg);
public List<Neg> listaNeg();
public Neg selectNeg(Neg neg);
}
