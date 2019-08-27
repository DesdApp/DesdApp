package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase Corredores.
 *
 * @author esteban
 */
import java.util.ArrayList;
import modelo.Corredores;

public interface corredoresInterface {

    public ArrayList<Corredores> lista(int cod_emp);

}
