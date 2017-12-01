/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uam.bl;

import cr.ac.uam.data.CSVReader;
import cr.ac.uam.domain.Factura;
import java.util.ArrayList;

/**
 *
 * @author crobles
 */
public class Facturacion {

    private ArrayList<Factura> Facturas = null;

    public Facturacion() {
        CSVReader facturas = new CSVReader();
        Facturas = facturas.readFacturasFromCSV();
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
