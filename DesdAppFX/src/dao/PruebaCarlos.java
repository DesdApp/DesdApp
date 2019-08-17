/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Empleados;
import modelo.EstadosEmpleados;
import modelo.EstadosPropiedades;
import modelo.Propietarios;
import modelo.TiposUsuarios;

/**
 *
 * @author carolina
 */
public class PruebaCarlos {

    public static void main(String[] args) {
        
        
        

        // Instanciamos las clases
//        ArrayList list;
        Date date = new Date(12202272000L * 1000);
        Scanner sc = new Scanner(System.in);

        // Instancias de los modelos
        Empleados emp = new Empleados(7, 6, "Prueba", date, date, (double) 1000, "UserPrueba", "Pss Prueba", 1, 1);
        Propietarios propi= new Propietarios(5,"5","clienteModificado","passABC");
        EstadosEmpleados estadoEmp = new EstadosEmpleados((byte) 6, "Prueba");
        TiposUsuarios tipUsu = new TiposUsuarios((byte) 7, "Ingreso modificado");
        
        

        Empleados datosEmp = new Empleados();
        Propietarios datosProp= new Propietarios();
        EstadosPropiedades datoEstados = new EstadosPropiedades();
        TiposUsuarios datoTipoUsu = new TiposUsuarios();
        
        // Instancias de los DAO
        DAOEmpleados daoEmp = new DAOEmpleados();
        DAOPropietarios daoProp=new DAOPropietarios();
        DAOEstadosEmpleados daoEstadoEmp = new DAOEstadosEmpleados();
        DAOTiposUsuarios daoTipUsu = new DAOTiposUsuarios();
        

        // Realizamos la conexion
        ConexionDB cx = new ConexionDB();

        // Atributos
        int id;

        System.out.println("1) Realizar pruebas en Empleados");
        System.out.println("2) Realizar pruebas en Propietarios");
        System.out.println("3) Realizar pruebas en Estado de Empleados");
        System.out.println("4) Realizar pruebas en Tipos Usuario");
        System.out.println("5) Salir");
        id = sc.nextInt();
        switch (id) {
            //<editor-fold defaultstate="collapsed" desc="Pruebas Empleados">
            case 1:
                System.out.println("1) INSERT");
                System.out.println("2) DELETE");
                System.out.println("3) UPDATE");
                System.out.println("4) SELECT");
                System.out.println("5) LIST");
                System.out.println("6) Regresar");
                id = sc.nextInt();
                switch (id) {
                    case 1:
                        daoEmp.insert(emp);

                        break;

                    case 2:
                        daoEmp.delete(id);
                        break;

                    case 3:
                        daoEmp.update(emp);
                        break;

                    case 4:
                        daoEmp.select(id);
                        break;

                    case 5:
                        ArrayList<Empleados> lista = new ArrayList<>();
                        lista = daoEmp.lits();
                        for (Empleados empleado : lista) {
                            System.out.println(empleado.toString());
                        }
                        break;

                    case 6:
                        break;

                    default:
                        throw new AssertionError();
                }
                break;
            //</editor-fold>            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Pruebas Propiedades">
            case 2:
                System.out.println("1) INSERT");
                System.out.println("2) DELETE");
                System.out.println("3) UPDATE");
                System.out.println("4) SELECT");
                System.out.println("5) LIST");
                System.out.println("6) Regresar");
                id = sc.nextInt();
                switch (id) {
                    case 1:
                        daoProp.insert(propi);
                        
                        break;
                    case 2:
                        daoProp.delete(id);
                        
                        break;
                    case 3:
                        daoProp.update(propi);
                        
                        break;
                    case 4:
                        daoProp.select(id);
                        
                        break;
                    case 5:
                         ArrayList<Propietarios> lista = new ArrayList<>();
                        lista = daoProp.list();
                        for (Propietarios pro : lista) {
                            System.out.println(pro.toString());
                        }
                        
                        break;
                    case 6:
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Puebas Estado Empleados">
            case 3:
                System.out.println("1) INSERT");
                System.out.println("2) DELETE");
                System.out.println("3) UPDATE");
                System.out.println("4) SELECT");
                System.out.println("5) LIST");
                System.out.println("6) Regresar");
                id = sc.nextInt();
                switch (id) {
                    case 1:
                        daoEstadoEmp.insert(estadoEmp);
                        break;
                    case 2:
                        daoEstadoEmp.delete(id);
                        break;
                    case 3:
                        daoEstadoEmp.update(estadoEmp);

                        break;
                    case 4:
                        daoEmp.select(id);
                        break;
                    case 5:
                        ArrayList<EstadosEmpleados> lista = new ArrayList<>();
                        lista = daoEstadoEmp.list();
                        for (EstadosEmpleados estadoEmp1 : lista) {
                            System.out.println(estadoEmp1.toString());
                        }
                        break;
                    case 6:

                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            //</editor-fold>            //</editor-fold>            //</editor-fold>            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Pruebas Para tipos de Usuarios">
            case 4:
                System.out.println("1) INSERT");
                System.out.println("2) DELETE");
                System.out.println("3) UPDATE");
                System.out.println("4) SELECT");
                System.out.println("5) LIST");
                System.out.println("6) Regresar");
                id = sc.nextInt();
                switch (id) {
                    case 1:
                        daoTipUsu.insertTipoUsario(tipUsu);
                        break;
                    case 2:
                        daoTipUsu.deleteTipoUsario(id);
                        break;
                    case 3:
                        daoTipUsu.updateTipoUsario(tipUsu);
                        break;
                    case 4:
                        System.out.println("Registro a seleccionar: ");
                        id = sc.nextInt();
                        datoTipoUsu = daoTipUsu.selectTipoUsuario((byte)id);
                        JOptionPane.showMessageDialog(null, datoTipoUsu.toString());
                        //daoTipUsu.selectTipoUsuario((byte) id);
                        //System.out.println(daoTipUsu.toString());
                        break;
                    case 5:
                        ArrayList<TiposUsuarios> lista = new ArrayList<>();
                        lista = daoTipUsu.list();
                        for (TiposUsuarios tipoUsuario : lista) {
                            System.out.println(tipoUsuario.toString());
                        }
                            break;
                        
                        case 6:

                        break;
                    default:
                        throw new AssertionError();
                }
               
        }
        }
        //</editor-fold>

    }
