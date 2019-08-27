package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase TiposDocumentos.
 *
 * @author esteban
 */
import java.util.ArrayList;
import modelo.TiposDocumentos;

public interface InterfaceTiposDocumentos {

    //Declaracion de Metodos Abstractos
    public TiposDocumentos select(int id);

    public ArrayList<TiposDocumentos> list();

}
