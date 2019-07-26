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
        EstadosPropiedades estadoProp= new EstadosPropiedades((byte)5,"Prueba");
        
        

        Empleado datosEmp=new Empleado();
        EstadosPropiedades datoEstados=new EstadosPropiedades();
        

        // Instancias de los DAO
        DAOEmpleado daoEmp = new DAOEmpleado();
        DAOEstPropiedades daoEst=new DAOEstPropiedades();
        DAODetVentas daoDetalle = new DAODetVentas();
        DAOVentas daoVenta = new DAOVentas();
        DAOPagosPropiedades daoPago = new DAOPagosPropiedades();
        DAOTpPagos daoTipo = new DAOTpPagos();

        // Realizamos la conexion
        ConexionDB cx = new ConexionDB();

        // Atributos
        int id;

        System.out.println("1) Realizar pruebas en Empleados");
        System.out.println("2) Realizar pruebas en Propietarios");
        System.out.println("3) Realizar pruebas en Estado de Propiedades");
        System.out.println("4) Realizar pruebas en TiposPagos");
        System.out.println("5) Salir");
        id = sc.nextInt();
        switch (id) {
            //<editor-fold defaultstate="collapsed" desc="Pruebas DetallesVentas">
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
                //<editor-fold defaultstate="collapsed" desc="Pruebas Ventas">

                //</editor-fold>
                break;

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
                //<editor-fold defaultstate="collapsed" desc="Pruebas PagosPropiedades">

                //</editor-fold>
                break;

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
    
    
    
    /*

    ConexionDB cn = new ConexionDB();

    Scanner sc = new Scanner(System.in);
    int opcion = sc.nextInt();

    switch (opcion

    
    

) {

            case 1:
                
                System.out.println("Prueba Para Empleados");
                DAOEmpleado daoem = new DAOEmpleado();
                Empleado emp = new Empleado();
                List<Empleado> lista = new ArrayList();

                int opcion2 = sc.nextInt();

                switch (opcion2) {
                    
                    case 1:
                        System.out.println("Insertar");
                        emp.setPersonaId(25);
                        emp.setEmpleadoId(6);
                        emp.setPuesto("Contador");
                        emp.setFechaInicio((Date.valueOf("2019-01-06")));
                        emp.setFechaFinalizacion(Date.valueOf("2019-07-10"));
                        emp.setSueldo(1500.55);
                        emp.setUser("InsertUser");
                        emp.setPassword("5568a");
                        emp.setTipoUsuarioId(3);
                        emp.setEstadoEmpleadoId(1);

                        daoem.insertEmpleado(emp);
                        break;
                }
                break;
        }

        //Pureba para empleados
//        DAOEmpelado daoem = new DAOEmpelado();
//        Empleado emp = new Empleado();
//        List<Empleado> lista = new ArrayList();
        //Ingresar Empleado
        /* emp.setPersonaId(25);
        emp.setEmpleadoId(6);
        emp.setPuesto("Contador");
        emp.setFechaInicio((Date.valueOf("2019-01-06")));
        emp.setFechaFinalizacion(Date.valueOf("2019-07-10"));
        emp.setSueldo(1500.55);
        emp.setUser("InsertUser");
        emp.setPassword("5568a");
        emp.setTipoUsuarioId(3);
        emp.setEstadoEmpleadoId(1);
        
        daoem.insertEmpleado(emp);
         */
        //Modificar Empleado
        /* emp.setEmpleadoId(6);
        emp.setPuesto("Mantenimiento");
        emp.setFechaInicio((Date.valueOf("2019-01-06")));
        emp.setFechaFinalizacion(Date.valueOf("2019-07-10"));
        emp.setSueldo(1500.55);
        emp.setUser("InsertUser");
        emp.setPassword("5568a");
        emp.setTipoUsuarioId(3);
        emp.setEstadoEmpleadoId(1);
        
        daoem.updateEmpleado(emp);
         */
        //Eliminar Empleado
        /*emp.setEmpleadoId(6);
        daoem.deleteEmpleado(6);
         */
        //Seleccionar Empleado
        /*emp =daoem.selectEmpleado((int)3);
        System.out.println(emp.toString());*/
        //Seleccionar Lista
        /* lista= daoem.ListEmpleado();
        for (Empleado empleado : lista) {
            System.out.println(empleado.toString());
        }
         */
        //Prueba para Tipos de Usuarios
        //DAOTIpoUsuario dao = new DAOTIpoUsuario();
        //TipoUsuario tipoUsuario = new TipoUsuario();
        //List<TipoUsuario> lst = new ArrayList();

        /* modelo.setNombre("Prueba");
        modelo.setTipoUsuarioId((byte)5);
        
       dao.insertTipoUsario(modelo);
        
       /* modelo.setTipoUsuarioId((byte)5);
        dao.deleteTipoUsario(5);*/
 /* modelo.setNombre("Modificado");
       dao.updateTipoUsario(modelo);
         */
 /* tipoUsuario = dao.selectTipoUsuario((byte) 1);
        byte tipoUsuarioId = tipoUsuario.getTipoUsuarioId();
        String tipoUsuarioNombre = tipoUsuario.getNombre();

        System.out.println("nombre " + tipoUsuarioNombre + " id " + tipoUsuarioId);*/
 /* lst = dao.listTipoUsuario();
        for (TipoUsuario tipoUsuario1 : lst) {
            System.out.println(tipoUsuario1.toString());
            
        }*/
 /*  lst=dao.listTipoUsuario();
        for (int i = 0; i < lst.size(); i++) {
            System.out.println("Nombre: "+lst.get(i).getNombre());
            System.out.println("Id: "+lst.get(i).getTipoUsuarioId());
           
            
        }*/
    }


