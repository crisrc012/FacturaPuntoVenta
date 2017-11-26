/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uam.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author crobles
 */
public class Factura {
    private int id;
    private Cliente cliente;
    private Date fecha;
    private ArrayList<Producto> productos;

    public Factura() {
    }

    public Factura(int id, Cliente cliente, Date fecha, ArrayList<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
