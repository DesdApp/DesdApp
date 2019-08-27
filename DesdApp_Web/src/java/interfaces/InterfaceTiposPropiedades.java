package interfaces;

/**
 * Esta clase declara los Metodos abstractos para realizar las funciones CRUD a
 * la clase TiposPropiedades.
 *
 * @author esteban
 */
import java.util.ArrayList;
import modelo.TiposPropiedades;

public interface InterfaceTiposPropiedades {

    //Metodos Abstractos
    public String insertTipo(TiposPropiedades tipo);

    public String deleteTipo(byte codigo);

    public String updateTipo(TiposPropiedades tipo);

    public TiposPropiedades selectTipo(byte codigo);

    public ArrayList<TiposPropiedades> listTipos();
}
