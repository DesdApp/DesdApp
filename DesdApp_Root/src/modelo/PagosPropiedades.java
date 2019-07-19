package modelo;

import java.sql.Date;

public class PagosPropiedades {


    private int pago_prop_id;
    private int venta_id;
    private int tipo_pago_id;
    private int no_tran;
    private Date fecha;
    private Double monto_pagado;
    
    
    //<editor-fold defaultstate="collapsed" desc="Setters and Getters">
    public int getPago_prop_id() {
        return pago_prop_id;
    }

    public void setPago_prop_id(int pago_prop_id) {
        this.pago_prop_id = pago_prop_id;
    }

    public int getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public int getTipo_pago_id() {
        return tipo_pago_id;
    }

    public void setTipo_pago_id(int tipo_pago_id) {
        this.tipo_pago_id = tipo_pago_id;
    }

    public int getNo_tran() {
        return no_tran;
    }

    public void setNo_tran(int no_tran) {
        this.no_tran = no_tran;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getMonto_pagado() {
        return monto_pagado;
    }

    public void setMonto_pagado(Double monto_pagado) {
        this.monto_pagado = monto_pagado;
    }


//</editor-fold>
}
    