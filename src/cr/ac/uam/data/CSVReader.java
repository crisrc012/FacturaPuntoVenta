/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uam.data;

import cr.ac.uam.domain.Cliente;
import cr.ac.uam.domain.Producto;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)) {
            // read the first line from the text file
            String line = br.readLine();
            // loop until all lines are read
            while (line != null) {
                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(";");

                Producto producto = new Producto(Integer.parseInt(attributes[0]),
                        attributes[1],
                        Double.parseDouble(attributes[2]),
                        Long.valueOf(attributes[3]));
                // adding producto into ArrayList
                productos.add(producto);
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return productos;
    }

    public ArrayList<Cliente> readClientesFromCSV() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Path pathToFile = Paths.get(path + "/Clientes.csv");

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)) {
            // read the first line from the text file
            String line = br.readLine();
            // loop until all lines are read
            while (line != null) {
                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(";");
                Cliente cliente = new Cliente(attributes[0],
                        attributes[1],
                        attributes[2],
                        attributes[3]);
                // adding client into ArrayList
                clientes.add(cliente);
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return clientes;
    }
}
