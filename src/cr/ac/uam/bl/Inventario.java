/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uam.bl;

import cr.ac.uam.data.CSVReader;
import cr.ac.uam.domain.Producto;
import java.util.ArrayList;

/**
 *
 * @author crobles
 */
public class Inventario {

    private ArrayList<Producto> Inventario = null;

    public Inventario(boolean empty) {
        if (!empty) {
            CSVReader productos = new CSVReader();
            this.Inventario = productos.readProductosFromCSV();
        } else {
            Inventario = new ArrayList<>();
        }
    }

    public Inventario(ArrayList<Producto> productos) {
        this.Inventario = productos;
    }

    public ArrayList<Producto> getInventario() {
        return Inventario;
    }

    public void setInventario(ArrayList<Producto> Inventario) {
        this.Inventario = Inventario;
    }

    public void addProducto(Producto producto) {
        if (this.Inventario.isEmpty()) {
            this.Inventario.add(producto);
        } else {
            boolean exist = false;
            for (int i = 0; i < this.Inventario.size(); i++) {
                if (this.Inventario.get(i).getId() == producto.getId()) {
                    exist = true;
                    break;
                }
            }
            if (exist) {
                for (int i = 0; i < this.Inventario.size(); i++) {
                    if (this.Inventario.get(i).getId() == producto.getId()) {
                        long cantidad = this.Inventario.get(i).getCantidad();
                        this.Inventario.get(i).setCantidad(cantidad);
                    }
                }
            } else {
                this.Inventario.add(producto);
            }
        }
    }

    public void removeProducto(int id) {
        Producto productoPivot = null;
        for (Producto producto : this.Inventario) {
            if (id == producto.getId()) {
                productoPivot = producto;
            }
        }
        if (productoPivot != null) {
            this.Inventario.remove(productoPivot);
        }
    }
    
    public void editProducto(int id, long cantidad){
        Producto productoPivot = null;
        for (Producto producto : this.Inventario) {
            if (id == producto.getId()) {
                productoPivot = producto;
            }
        }
        if (productoPivot != null) {
            this.Inventario.remove(productoPivot);
            productoPivot.setCantidad(cantidad);
            Inventario.add(productoPivot);
        }
    }
}
