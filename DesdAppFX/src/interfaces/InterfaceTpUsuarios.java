package interfaces;

import modelo.TpUsuarios;
import java.util.ArrayList;

public interface InterfaceTpUsuarios {

    public String insertTipoUsario(TpUsuarios tipo);

    public String deleteTipoUsario(int codigo);

    public String updateTipoUsario(TpUsuarios tipo);

    public TpUsuarios selectTipoUsuario(byte codigo);

    public ArrayList<TpUsuarios>list();
}
