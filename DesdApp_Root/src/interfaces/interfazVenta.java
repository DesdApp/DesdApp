/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Venta;

public interface interfazVenta {
    
    public Venta read(Venta venta);
    public void upd(Venta venta);
    public void del(Venta venta);
    public void create(Venta venta);
    public List<Venta> listas();
}
