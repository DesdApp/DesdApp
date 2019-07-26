package interfaces;

import java.util.ArrayList;
import modelo.TiposPagos;

public interface InterfaceTpPagos {

    public TiposPagos select(int id);

    public String insert(TiposPagos tipo);

    public String update(TiposPagos tipo);

    public String delete(int id);

    public ArrayList<TiposPagos> list();
}
