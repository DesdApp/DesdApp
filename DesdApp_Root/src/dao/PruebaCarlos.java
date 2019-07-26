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
import modelo.Empleado;
import modelo.EstadoEmp;
import modelo.EstadosPropiedades;
import modelo.TipoUsuario;

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
        Empleado emp = new Empleado(7, 6, "Prueba", date, date, (double) 1000, "UserPrueba", "Pss Prueba", 1, 1);
        EstadoEmp estadoEmp = new EstadoEmp((byte) 5, "Prueba");

        Empleado datosEmp = new Empleado();
        EstadosPropiedades datoEstados = new EstadosPropiedades();

        // Instancias de los DAO
        DAOEmpleado daoEmp = new DAOEmpleado();
        DAOEstadoEmp daoEstadoEmp = new DAOEstadoEmp();

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
            //<editor-fold defaultstate="collapsed" desc="Pruebas Empleado">
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
                        daoEmp.insertEmpleado(emp);

                        break;

                    case 2:
                        daoEmp.deleteEmpleado(id);
                        break;

                    case 3:
                        daoEmp.updateEmpleado(emp);
                        break;

                    case 4:
                        daoEmp.selectEmpleado(id);
                        break;

                    case 5:
                        ArrayList<Empleado> lista = new ArrayList<>();
                        lista = daoEmp.ListEmpleado();
                        for (Empleado empleado : lista) {
                            System.out.println(empleado.toString());
                        }
                        break;

                    case 6:
                        break;

                    default:
                        throw new AssertionError();
                }
                break;
            //</editor-fold>

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
                        System.out.println("Aun no esta el modelo la interfaz y el dao");
                        break;
                    case 2:
                        System.out.println("Aun no esta el modelo la interfaz y el dao");
                        break;
                    case 3:
                        System.out.println("Aun no esta el modelo la interfaz y el dao");
                        break;
                    case 4:
                        System.out.println("Aun no esta el modelo la interfaz y el dao");
                        break;
                    case 5:
                        System.out.println("Aun no esta el modelo la interfaz y el dao");
                        break;
                    case 6:
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Puebas Estado Empleado">
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
                        daoEstadoEmp.insertEstadoEmp(estadoEmp);
                        break;
                    case 2:
                        daoEstadoEmp.deleteEstadoEmp(id);
                        break;
                    case 3:
                        daoEstadoEmp.updateEmpleado(estadoEmp);

                        break;
                    case 4:
                        daoEmp.selectEmpleado(id);
                        break;
                    case 5:
                        ArrayList<EstadoEmp> lista = new ArrayList<>();
                        lista = daoEstadoEmp.ListEstadoEmp();
                        for (EstadoEmp estadoEmp1 : lista) {
                            System.out.println(estadoEmp1.toString());
                        }
                        break;
                    case 6:

                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            //</editor-fold>

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

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    default:
                        throw new AssertionError();
                }
                //<editor-fold defaultstate="collapsed" desc="Pruebas TiposPagos">

                //</editor-fold>
                break;

            case 5:
                break;

            default:
                throw new AssertionError();

        }

    }
    //</editor-fold>

}
