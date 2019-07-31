package interfaces;

import modelo.TpUsuarios;
import java.util.ArrayList;

public interface InterfaceTpUsuarios {

    public TpUsuarios selectTipoUsuario(byte codigo);

    public ArrayList<TpUsuarios>list();
}
