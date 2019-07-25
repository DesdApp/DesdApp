package interfaces;

import java.util.ArrayList;
import modelo.Bienes;

public interface InterfaceBienes {
    
    //Metodos Abstractos de mi clase Bienes
    public String insertBien(Bienes bien);
    
    public String deleteBien(int codigo);
    
    public String updateBien(Bienes bien);
    
    public Bienes selectBien(int codigo);
    
    public ArrayList<Bienes> listBienes();
}
