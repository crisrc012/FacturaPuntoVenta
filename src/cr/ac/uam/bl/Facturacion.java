/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uam.bl;

import cr.ac.uam.domain.Cliente;
import cr.ac.uam.domain.Factura;
import cr.ac.uam.domain.Producto;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author crobles
 */
public class Facturacion {

    private ArrayList<Factura> Facturas = null;

    public Facturacion() {
        Facturas = new ArrayList<>();
    }

    public Facturacion(ArrayList<Factura> Facturas) {
        this.Facturas = Facturas;
    }

    public ArrayList<Factura> getFacturas() {
        return Facturas;
    }

    public void setFacturas(ArrayList<Factura> Facturas) {
        this.Facturas = Facturas;
    }
    
    public void addFactura(Factura factura) {
        this.Facturas.add(factura);
    }
}
