/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Propietarios;

/**
 *
 * @author Admin
 */
public class PruebasCarol {
    public static void main(String[] args) {
        DAOPropietarios dao = new DAOPropietarios();
        Propietarios propietario = new Propietarios();
        propietario = dao.select(6);
        System.out.println(propietario.toString());
        
    }
    
    
}
