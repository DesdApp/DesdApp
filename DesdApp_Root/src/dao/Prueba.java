/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Stephanie María
 */
public class Prueba {
    public static void main(String[] args) {
        ConexionDB cn = new ConexionDB();
        cn.conectar();
        cn.desconectar();
    }
}