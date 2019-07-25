package modelo;
public class TiposPagos {
    
//Se declaran los atributos que componen a la tabla de "tipos_pagos" en la base de datos
    private int tipo_pago_id;
    private String nombre;

    public TiposPagos(int tipo_pago_id, String nombre) {
        this.tipo_pago_id = tipo_pago_id;
        this.nombre = nombre;
    }

    public TiposPagos() {
    }
    
     
    
//Métodos de Setter/Getter para llamar y dar los datos correspondientes
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">


    public int getTipo_pago_id() {
        return tipo_pago_id;
    }

    public void setTipo_pago_id(int tipo_pago_id) {
        this.tipo_pago_id = tipo_pago_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
//</editor-fold>
    
}
