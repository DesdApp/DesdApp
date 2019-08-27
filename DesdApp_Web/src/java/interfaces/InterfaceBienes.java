package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase BienesInmuebles.
 *
 * @author esteban
 */
import java.util.ArrayList;
import modelo.BienesInmuebles;

public interface InterfaceBienes {

    //Metodos Abstractos de mi clase Bienes
    public String insertBien(BienesInmuebles bien);

    public String deleteBien(int codigo);

    public String updateBien(BienesInmuebles bien);

    public BienesInmuebles selectBien(int codigo);

    public ArrayList<BienesInmuebles> listBienes();

    public ArrayList<BienesInmuebles> listView(String prop);

}
