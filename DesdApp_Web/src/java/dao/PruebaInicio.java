/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.Corredores;



/**
 *
 * @author javam2019
 */
public class PruebaInicio {

    public static void main(String[] args) {
        ArrayList<Corredores> listar = new ArrayList<>();
        Corredores c = new Corredores();
        DAOCorredores dao = new DAOCorredores();
        listar = dao.lista(2);
        for (Corredores corredores : listar) {
            System.out.println(corredores.toString());
        }
        
        
//        DAOClientes clin = new DAOClientes();
//        Clientes cl = new Clientes(0, 0, "Estela", "estel23", "estel23");
//        
//        System.out.println(clin.validar(cl));
    }
}
