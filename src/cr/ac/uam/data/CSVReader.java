/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uam.data;

import cr.ac.uam.bl.Clientes;
import cr.ac.uam.bl.Inventario;
import cr.ac.uam.domain.Cliente;
import cr.ac.uam.domain.Factura;
import cr.ac.uam.domain.Producto;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author crisrc012 Referencia:
 * http://www.java67.com/2015/08/how-to-load-data-from-csv-file-in-java.html
 */
public class CSVReader {

    private String path = null;

    public CSVReader() {
        if (System.getProperty("os.name").contains("Windows")) {
            this.path = "C:/Users/crobles/Documents/NetBeansProjects/FacturaPuntoVenta/src/cr/ac/uam/data";
        } else {
            this.path = "/home/crisrc012/NetBeansProjects/FacturaPuntoVenta/src/cr/ac/uam/data";
        }
    }

    public ArrayList<Producto> readProductosFromCSV() {
        ArrayList<Producto> productos = new ArrayList<>();
        Path pathToFile = Paths.get(path + "/Productos.csv");
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                Producto producto = new Producto(Integer.parseInt(attributes[0]),
                        attributes[1],
                        Double.parseDouble(attributes[2]),
                        Long.valueOf(attributes[3]));
                productos.add(producto);
                line = br.readLine();
            }
        } catch (IOException ex) {
        }
        return productos;
    }

    public ArrayList<Cliente> readClientesFromCSV() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Path pathToFile = Paths.get(path + "/Clientes.csv");
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                Cliente cliente = new Cliente(attributes[0],
                        attributes[1],
                        attributes[2],
                        attributes[3]);
                clientes.add(cliente);
                line = br.readLine();
            }
        } catch (IOException ex) {
        }
        return clientes;
    }

    private Date StringToDate(String date) {
        try {
            DateFormat formatter;
            Date Date;
            formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date = (Date) formatter.parse(date);
            return Date;
        } catch (ParseException e) {
            return new Date();
        }
    }

    public ArrayList<Factura> readFacturasFromCSV() {
        ArrayList<Factura> facturas = new ArrayList<>();
        Path pathToFile = Paths.get(path + "/Facturas.csv");
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)) {
            Clientes clientes = new Clientes();
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                // Clientes
                Cliente cliente = null;
                for (Cliente c : clientes.getClientes()) {
                    if (attributes[1].equals(c.getCedula())) {
                        cliente = c;
                    }
                }
                // Productos
                String[] idProductos = attributes[3].split(",");
                Inventario inventario = new Inventario(false);
                ArrayList<Producto> productos = new ArrayList<>();
                Producto producto = null;
                for (int i = 0; i < idProductos.length; i++) {
                    for (int j = 0; j < inventario.getInventario().size(); j++) {
                        if (Integer.parseInt(idProductos[i]) == inventario.getInventario().get(j).getId()) {
                            productos.add(inventario.getInventario().get(j));
                        }
                    }
                }
                Factura factura = new Factura(Integer.parseInt(attributes[0]),
                        cliente,
                        StringToDate(attributes[2]),
                        productos);
                facturas.add(factura);
                line = br.readLine();
            }
            return facturas;
        } catch (IOException ex) {
            return new ArrayList<>();
        }
    }
}
