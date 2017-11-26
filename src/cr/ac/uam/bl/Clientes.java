/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uam.bl;

import cr.ac.uam.data.CSVReader;
import cr.ac.uam.domain.Cliente;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Clientes {

    private ArrayList<Cliente> Clientes = null;

    public Clientes() {
        CSVReader clientes = new CSVReader();
        this.Clientes = clientes.readClientesFromCSV();
    }

    public Clientes(ArrayList<Cliente> clientes) {
        this.Clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }

    public void addCliente(Cliente cliente) {
        this.Clientes.add(cliente);
    }
}
