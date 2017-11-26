/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uam.domain;

/**
 *
 * @author crobles
 */
public class Producto {

    private int id;
    private String descripcion;
    private double valor;
    private long cantidad;

    public Producto() {
    }

    public Producto(int id, String descripcion, double valor, long cantidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

}
