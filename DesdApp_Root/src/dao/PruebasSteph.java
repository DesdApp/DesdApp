package dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.DetallesVentas;
import modelo.PagosPropiedades;
import modelo.TiposPagos;
import modelo.Ventas;

public class PruebasSteph {

    public static void main(String[] args) {

        // Instanciamos las clases
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
                        JOptionPane.showMessageDialog(null, daoDetalle.insert(detalle));
                        break;

                    case 2:
                        System.out.println("Registro a eliminar: ");
                        id = sc.nextInt();
                        JOptionPane.showMessageDialog(null, daoDetalle.delete(id));
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, daoDetalle.update(detalle));
                        break;

                    case 4:
                        System.out.println("Registro a seleccionar: ");
                        id = sc.nextInt();
                        datosDetalle = daoDetalle.select(id);
                        JOptionPane.showMessageDialog(null, datosDetalle.toString());
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
                //<editor-fold defaultstate="collapsed" desc="Pruebas Ventas">
                System.out.println("1) INSERT");
                System.out.println("2) DELETE");
                System.out.println("3) UPDATE");
                System.out.println("4) SELECT");
                System.out.println("5) LIST");
                System.out.println("6) Regresar");
                id = sc.nextInt();
                switch (id) {
                    case 1:
                        JOptionPane.showMessageDialog(null, daoVenta.insert(venta));
                        break;

                    case 2:
                        System.out.println("Registro a eliminar: ");
                        id = sc.nextInt();
                        JOptionPane.showMessageDialog(null, daoVenta.delete(id));
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, daoVenta.update(venta));
                        break;

                    case 4:
                        System.out.println("Registro a seleccionar: ");
                        id = sc.nextInt();
                        datosVenta = daoVenta.select(id);
                        JOptionPane.showMessageDialog(null, datosVenta.toString());
                        break;

                    case 5:
                        System.out.println("Registro a seleccionar: ");
                        id = sc.nextInt();
                        datosVenta = daoVenta.select(id);
                        JOptionPane.showMessageDialog(null, datosVenta.toString());
                        break;

                    case 6:
                        break;

                    default:
                        throw new AssertionError();
                }

                break;
            //</editor-fold>

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
