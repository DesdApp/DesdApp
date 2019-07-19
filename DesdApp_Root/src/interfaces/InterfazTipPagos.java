/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.TiposPagos;

public interface InterfazTipPagos {

    public TiposPagos read (TiposPagos tp);
    public void create(TiposPagos tp);
    public void upd(TiposPagos tp);
    public void del(TiposPagos tp);
    public List<TiposPagos> listar();
}
