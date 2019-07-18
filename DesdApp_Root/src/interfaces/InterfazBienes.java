package interfaces;

import java.util.ArrayList;
import modelo.Bienes;

public interface InterfazBienes {
    
    public void insertBien(Bienes bien);
    
    public void deleteBien(int codigo);
    
    public void updateBien(Bienes bien);
    
    public void selectBien(int codigo);
    
    public ArrayList<Bienes> listBienes();
}
