/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import modelo.TipoUsuario;


/**
 *
 * @author carolina
 */
public class PruebaCarol {
    public static void main(String[] args) {
        ConexionDB cn= new ConexionDB();
        DAOTIpoUsuario dao= new DAOTIpoUsuario();
        TipoUsuario modelo= new TipoUsuario();
        
       /* modelo.setNombre("Prueba");
        modelo.setTipoUsuarioId((byte)5);
        
       dao.insertTipoUsario(modelo);
        
       /* modelo.setTipoUsuarioId((byte)5);
        dao.deleteTipoUsario(5);*/
       
      /* modelo.setNombre("Modificado");
       dao.updateTipoUsario(modelo);
       */
       dao.selectTipoUario(1);
      String nombre= modelo.getNombre();
      int id= modelo.getTipoUsuarioId();
       
        System.out.println("nombre "+modelo.getNombre()+ " id "+modelo.getTipoUsuarioId());
        
                
    }
       
    }

