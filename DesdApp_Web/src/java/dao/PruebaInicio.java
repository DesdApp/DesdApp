/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.BienesInmuebles;
import dao.DAOBienesInmuebles;
import modelo.Zonas;
/**
 *
 * @author javam2019
 */
public class PruebaInicio {

    public static void main(String[] args) {
        ArrayList<BienesInmuebles> list = new ArrayList<>();
        BienesInmuebles bien = new BienesInmuebles();
        DAOBienesInmuebles dao = new DAOBienesInmuebles();
        Zonas zon= new Zonas();
        
        
        
        list = dao.listView("Casas");
        for (BienesInmuebles bienesInmuebles : list) {
            System.out.println(bienesInmuebles.toString());
        }
        
    }
}
