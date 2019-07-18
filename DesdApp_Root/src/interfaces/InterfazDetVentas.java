/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.DetVentas;

public interface InterfazDetVentas {
//Métodos abstractas
    public DetVentas read(DetVentas ventas);
    public void creat(DetVentas ventas);
    public void upd(DetVentas ventas);
    public void del(DetVentas ventas);
    public List<DetVentas> listar();
}
