package dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.DetallesVentas;
import modelo.PagosPropiedades;
import modelo.TiposPagos;
import modelo.Ventas;

public class PruebasSteph {

    public static void main(String[] args) {

        // Instanciamos las clases
//        ArrayList list;
        Date date = new Date(12202272000L * 1000);
        Scanner sc = new Scanner(System.in);

        // Instancias de los modelos
        DetallesVentas detalle = new DetallesVentas(1, 1, 1);
        Ventas venta = new Ventas(1, 1, "a", 1, "Prueba", "Direccion", date, 1, 1);
        PagosPropiedades pago = new PagosPropiedades(1, 1, 1, 1, date, (double) 10000);
        TiposPagos tipo = new TiposPagos(1, "Prueba");

        DetallesVentas datosDetalle = new DetallesVentas();
        Ventas datosVenta = new Ventas();
        PagosPropiedades datosPago = new PagosPropiedades();
        TiposPagos datosTipo = new TiposPagos();

        // Instancias de los DAO
        DAODetVentas daoDetalle = new DAODetVentas();
        DAOVentas daoVenta = new DAOVentas();
        DAOPagosPropiedades daoPago = new DAOPagosPropiedades();
        DAOTpPagos daoTipo = new DAOTpPagos();

        // Realizamos la conexion
        ConexionDB cx = new ConexionDB();

        // Atributos
        int id;

        System.out.println("1) Realizar pruebas en DetallesVentas");
        System.out.println("2) Realizar pruebas en Ventas");
        System.out.println("3) Realizar pruebas en PagosPropiedades");
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
                        daoDetalle.insert(detalle);
                        break;

                    case 2:
                        daoDetalle.delete(detalle);
                        break;

                    case 3:
                        daoDetalle.update(detalle);
                        break;

                    case 4:
                        datosDetalle = daoDetalle.select(detalle);
                        break;

                    case 5:
                        ArrayList<DetallesVentas> list = new ArrayList<>();
                        list = daoDetalle.list();
                        for (DetallesVentas detalles : list) {
                            System.out.println(detalles.toString());
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

}
