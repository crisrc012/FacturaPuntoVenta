/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uam.view;

import cr.ac.uam.bl.Inventario;
import cr.ac.uam.domain.Cliente;
import cr.ac.uam.domain.Producto;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crobles
 */
public class frmFactura extends javax.swing.JFrame {

    // JFrames
    private static frmClientes frmclientes = null;
    private static frmInventario frminventario = null;

    // Variables globales
    public static Cliente clienteActual = null;
    public static Producto productoActual = null;
    private static Inventario Productos = null;

    /**
     * Creates new form Frame
     */
    public frmFactura() {
        initComponents();
        Productos = new Inventario(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnSeleccionarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFactura = new javax.swing.JTable();
        jBtnAgregarProducto = new javax.swing.JButton();
        jBtnQuitarProducto = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jLabelTotalValue = new javax.swing.JLabel();
        jLabelCedCliente = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabelCedValue = new javax.swing.JLabel();
        jLabelNomValue = new javax.swing.JLabel();
        jBtnadd = new javax.swing.JButton();
        jBtnrest = new javax.swing.JButton();
        jBtnEdit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnSeleccionarCliente.setText("Clientes");
        jBtnSeleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSeleccionarClienteActionPerformed(evt);
            }
        });

        jTableFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Precio Unitario", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableFactura);
        jTableFactura.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jBtnAgregarProducto.setText("Agregar");
        jBtnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarProductoActionPerformed(evt);
            }
        });

        jBtnQuitarProducto.setText("Quitar");
        jBtnQuitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnQuitarProductoActionPerformed(evt);
            }
        });

        jButton4.setText("Facturar");

        jLabelTotal.setText("Total:");

        jLabelTotalValue.setText("0");
        jLabelTotalValue.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelCedCliente.setText("Cédula:");

        jLabelNombreCliente.setText("Nombre:");

        jLabelCedValue.setText("-");

        jLabelNomValue.setText("-");

        jBtnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uam/view/+.png"))); // NOI18N

        jBtnrest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uam/view/-.png"))); // NOI18N

        jBtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uam/view/edit.png"))); // NOI18N
        jBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Imprimir factura a PDF");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombreCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomValue))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelCedCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelCedValue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnSeleccionarCliente))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jBtnAgregarProducto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBtnQuitarProducto))
                                        .addComponent(jButton4))
                                    .addGap(222, 222, 222)
                                    .addComponent(jLabelTotal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBtnrest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jBtnadd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtnEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSeleccionarCliente)
                    .addComponent(jLabelCedCliente)
                    .addComponent(jLabelCedValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreCliente)
                    .addComponent(jLabelNomValue))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTotal)
                                .addComponent(jLabelTotalValue))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBtnAgregarProducto)
                                    .addComponent(jBtnQuitarProducto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnrest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSeleccionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSeleccionarClienteActionPerformed
        if (frmclientes == null) {
            frmclientes = new frmClientes();
            frmclientes.setVisible(true);
        } else if (!frmclientes.isVisible()) {
            frmclientes.setVisible(true);
        }
        frmclientes.toFront();
    }//GEN-LAST:event_jBtnSeleccionarClienteActionPerformed

    private void jBtnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarProductoActionPerformed
        if (frminventario == null) {
            frminventario = new frmInventario();
            frminventario.setVisible(true);
        } else if (!frminventario.isVisible()) {
            frminventario.setVisible(true);
        }
        frminventario.toFront();
    }//GEN-LAST:event_jBtnAgregarProductoActionPerformed

    private void jBtnQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnQuitarProductoActionPerformed
        if (jTableFactura.getSelectedRowCount() != 1) {
            if (jTableFactura.getSelectedRowCount() < 0) {
                JOptionPane.showMessageDialog(null,
                        "Por favor seleccionar al menos un producto",
                        "Atención",
                        JOptionPane.ERROR_MESSAGE);
            }
            if (jTableFactura.getSelectedRowCount() > 1) {
                JOptionPane.showMessageDialog(null,
                        "Por favor seleccionar al unicamente un producto",
                        "Atención",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            int id = Integer.parseInt(
                    String.valueOf(
                            jTableFactura.getValueAt(
                                    jTableFactura.getSelectedRow(), 0)));
            Productos.removeProducto(id);
            setTotal();
            DefaultTableModel model = (DefaultTableModel) jTableFactura.getModel();
            model.removeRow(jTableFactura.getSelectedRow());
        }
    }//GEN-LAST:event_jBtnQuitarProductoActionPerformed

    private void jBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditActionPerformed
        if (jTableFactura.getSelectedRowCount() != 1) {
            if (jTableFactura.getSelectedRowCount() < 0) {
                JOptionPane.showMessageDialog(rootPane,
                        "Por favor seleccionar al menos un producto",
                        "Atención",
                        JOptionPane.ERROR_MESSAGE);
            }
            if (jTableFactura.getSelectedRowCount() > 1) {
                JOptionPane.showMessageDialog(rootPane,
                        "Por favor seleccionar al unicamente un producto",
                        "Atención",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                long cantidad = Long.valueOf(JOptionPane.showInputDialog(rootPane, "Digite la cantidad de productos:", "Editar cantidad", JOptionPane.INFORMATION_MESSAGE));
                int id = Integer.parseInt(
                        String.valueOf(
                                jTableFactura.getValueAt(
                                        jTableFactura.getSelectedRow(), 0)));
                Productos.editProducto(id, cantidad);
                setTotal();
                updateJTable();
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane,
                        "Por favor digite un número",
                        "Atención",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBtnEditActionPerformed

    public static void setclienteActual(Cliente cliente) {
        frmFactura.clienteActual = cliente;
        setClienteActualLabel();
    }

    public static void setproductoActual(Producto producto) {
        Productos.addProducto(producto);
        setTotal();
        updateJTable();
    }

    private static void updateJTable() {
        DefaultTableModel model = (DefaultTableModel) jTableFactura.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (int i = 0; i < Productos.getInventario().size(); i++) {
            model.addRow(new Object[]{Productos.getInventario().get(i).getId(),
                Productos.getInventario().get(i).getDescripcion(),
                Productos.getInventario().get(i).getValor(),
                Productos.getInventario().get(i).getCantidad()});
        }
    }

    private static void setClienteActualLabel() {
        jLabelCedValue.setText(clienteActual.getCedula());
        jLabelNomValue.
                setText(clienteActual.getNombre() + " " + clienteActual.getApellido());
    }

    private static void setTotal() {
        long total = 0;
        for (Producto producto : Productos.getInventario()) {
            total += producto.getCantidad() * producto.getValor();
        }
        jLabelTotalValue.setText(String.valueOf(total));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            String FeelAndLook = "GTK+";
            if (System.getProperty("os.name").contains("Windows")) {
                FeelAndLook = "Windows";
            }
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (FeelAndLook.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmFactura().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregarProducto;
    private javax.swing.JButton jBtnEdit;
    private javax.swing.JButton jBtnQuitarProducto;
    private javax.swing.JButton jBtnSeleccionarCliente;
    private javax.swing.JButton jBtnadd;
    private javax.swing.JButton jBtnrest;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabelCedCliente;
    private static javax.swing.JLabel jLabelCedValue;
    private static javax.swing.JLabel jLabelNomValue;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelTotal;
    private static javax.swing.JLabel jLabelTotalValue;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTableFactura;
    // End of variables declaration//GEN-END:variables
}