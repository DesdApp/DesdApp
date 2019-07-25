package interfaces;

import modelo.TipoUsuario;
import java.util.ArrayList;

public interface InterfazTipoUsuario {

    public void insertTipoUsario(TipoUsuario tipo);

    public void deleteTipoUsario(int codigo);

    public void updateTipoUsario(TipoUsuario tipo);

    public void selectTipoUario(int codigo);

    public ArrayList<TipoUsuario> ListTipoUsuario();
}
