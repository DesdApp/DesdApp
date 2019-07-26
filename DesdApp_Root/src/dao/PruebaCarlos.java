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
import modelo.TipoUsuario;

/**
 *
 * @author carolina
 */
public class PruebaCarlos {

    public static void main(String[] args) {
        ConexionDB cn = new ConexionDB();

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
                
        switch (opcion) {

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

}
