/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.PagosPropiedades;

/**
 *
 * @author Stephanie María
 */
public interface InterfazPagPro {
    
    public PagosPropiedades read(PagosPropiedades papo);
    public void upd(PagosPropiedades papo);
    public void del(PagosPropiedades papo);
    public void create(PagosPropiedades papo);
    public List<PagosPropiedades> listas();
}
