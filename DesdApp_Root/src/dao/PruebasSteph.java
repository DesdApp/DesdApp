package dao;

import modelo.DetallesVentas;
import modelo.PagosPropiedades;
import modelo.TiposPagos;
import modelo.Ventas;

public class PruebasSteph {

    public static void main(String[] args) {
        
        // Instancias de las clases
        DetallesVentas detalle = new DetallesVentas();
        Ventas venta = new Ventas();
        PagosPropiedades pago = new PagosPropiedades();
        TiposPagos tipo = new TiposPagos();
        
        DAODetVentas daoDetalle = new DAODetVentas();
        DAOVentas daoVenta = new DAOVentas();
        DAOPagosPropiedades daoPago = new DAOPagosPropiedades();
        DAOTpPagos daoTipo = new DAOTpPagos();
    }
    
}
