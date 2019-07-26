package interfaces;

import modelo.TipoUsuario;
import java.util.ArrayList;

public interface InterfaceTipoUsuario {

    public String insertTipoUsario(TipoUsuario tipo);

    public String deleteTipoUsario(int codigo);

    public String updateTipoUsario(TipoUsuario tipo);

    public TipoUsuario selectTipoUsuario(byte codigo);

    public ArrayList<TipoUsuario> listTipoUsuario();
}
