/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Departamentos;
import modelo.Municipios;
import modelo.Persona;
import modelo.Regiones;
import modelo.TipoFacturacion;

/**
 *
 * @author Stephanie María
 */
public class PruebasCarolina {
    public static void main(String[] args) {
      
        Date date = new Date(12202272000L * 1000);
        Scanner sc = new Scanner(System.in);
        
        Persona per = new Persona(1, "Prueba", "Apellido", "Direccion", 1, 1, "Correo", date, 2, 0);
        Regiones reg = new Regiones(1, "Nombre", "Descripcion");
        Departamentos dep = new Departamentos(1, "nombre", 1);
        Municipios muni = new Municipios(1, "nombre", 1);
        TipoFacturacion tip = new TipoFacturacion(1, "nombre");
        
        Persona datosPer = new Persona();
        Regiones datosReg = new Regiones();
        Departamentos datosDep = new Departamentos();
        Municipios datosMuni = new Municipios();
        TipoFacturacion datosTip = new TipoFacturacion();
        
        DAOPersona daoPer = new DAOPersona();
        DAORegion daoReg = new DAORegion();
        DAODepartamentos daoDep = new DAODepartamentos();
        DAOMunicipio daoMuni = new DAOMunicipio();
        DAOTipoFacturacion daoTip = new DAOTipoFacturacion();
        
        ConexionDB cn = new ConexionDB();
        
        int id;
        
        System.out.println("1) Pruebas en Persona");
        System.out.println("2) Pruebas en Regiones");
        System.out.println("3) Pruebas en Departamentos");
        System.out.println("4) Pruebas en Municipios");
        System.out.println("5) Pruebas en Tipo Facturación");
        id = sc.nextInt();
        switch (id){
            
            case 1:
                System.out.println("1) INSERT");
                System.out.println("2) DELETE");
                System.out.println("3) UPDATE");
                System.out.println("4) SELECT");
                System.out.println("5) LIST");
                System.out.println("6) Regresar");
                switch(id){
                    case 1:
                        daoPer.insertPersona(per);
                        break;
                    case 2:
                        daoPer.deletPersona(per);
                        break;
                    case 3:
                        daoPer.updatePersona(per);
                        break;
                    case 4:
                        datosPer =  daoPer.selectPersona(per);
                        break;
                    case 5:
                        ArrayList<Persona> list = new ArrayList();
                        list = daoPer.listPersona();
                        for (Persona pers : list) {
                            System.out.println(pers.toString());
                        }
                        break;
                    case 6:
                        break;
                        
                    default:
                        throw new AssertionError();
                }
                break;
        
            case 2:
                System.out.println("1) INSERT");
                System.out.println("2) DELETE");
                System.out.println("3) UPDATE");
                System.out.println("4) SELECT");
                System.out.println("5) LIST");
                System.out.println("6) Regresar");
                switch(id){
                    case 1:
                        
                        break;
                    case 2:
                        daoPer.deletPersona(per);
                        break;
                    case 3:
                        daoPer.updatePersona(per);
                        break;
                    case 4:
                        datosPer =  daoPer.selectPersona(per);
                        break;
                    case 5:
                        ArrayList<Persona> list = new ArrayList();
                        list = daoPer.listPersona();
                        for (Persona pers : list) {
                            System.out.println(pers.toString());
                        }
                        break;
                    case 6:
                        break;
                        
                    default:
                        throw new AssertionError();
                }
                break;
        
        }
    }}