package interfaces;

import modelo.TiposUsuarios;
import java.util.ArrayList;

public interface InterfaceTiposUsuarios {

    public String insertTipoUsario(TiposUsuarios tipo);

    public String deleteTipoUsario(int codigo);

    public String updateTipoUsario(TiposUsuarios tipo);

    public TiposUsuarios selectTipoUsuario(byte codigo);

    public ArrayList<TiposUsuarios>list();
}
