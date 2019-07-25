package interfaces;

import modelo.TiposPagos;
import java.util.ArrayList;

public interface InterfaceTpPagos {
    public TiposPagos select (TiposPagos tipo);
    public String insert(TiposPagos tipo);
    public String update(TiposPagos tipo);
    public String delete(TiposPagos tipo);
    public ArrayList<TiposPagos> list();
}
