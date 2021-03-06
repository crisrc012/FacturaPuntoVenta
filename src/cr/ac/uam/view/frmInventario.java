/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uam.view;

import cr.ac.uam.bl.Inventario;
import cr.ac.uam.domain.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crisrc012
 */
public class frmInventario extends javax.swing.JFrame {

    public Producto productoActual = null;
    public Inventario Inventario = null;

    /**
     * Creates new form frmInventario
     */
    public frmInventario() {
        initComponents();
        Inventario = new Inventario(false);
        updateJTabel();
    }

    public Inventario getInventario() {
        return Inventario;
    }

    public void setInventario(Inventario Inventario) {
        this.Inventario = Inventario;
    }
    
    public void updateJTabel(){
        DefaultTableModel model = (DefaultTableModel) jTableProductos.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (Producto producto : Inventario.getInventario()) {
            model.addRow(new Object[]{producto.getId(),
                producto.getDescripcion(),
                producto.getValor(),
                producto.getCantidad()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBtnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableProductos);

        jLabel1.setText("Inventario de Productos");

        jBtnSeleccionar.setText("Seleccionar");
        jBtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnSeleccionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSeleccionar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSeleccionarActionPerformed
        if (jTableProductos.getSelectedRowCount() != 1) {
            if (jTableProductos.getSelectedRowCount() < 0) {
                JOptionPane.showMessageDialog(rootPane,
                        "Por favor seleccionar al menos un producto",
                        "Atención",
                        JOptionPane.ERROR_MESSAGE);
            }
            if (jTableProductos.getSelectedRowCount() > 1) {
                JOptionPane.showMessageDialog(rootPane,
                        "Por favor seleccionar al unicamente un producto",
                        "Atención",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            productoActual = new Producto();
            this.productoActual.
                    setId(Integer.valueOf(String.valueOf(
                            jTableProductos.getModel().getValueAt(
                                    jTableProductos.getSelectedRow(), 0))));
            this.productoActual.
                    setDescripcion(String.valueOf(
                            jTableProductos.getModel().getValueAt(
                                    jTableProductos.getSelectedRow(), 1)));
            this.productoActual.
                    setValor(Double.valueOf(String.valueOf(
                            jTableProductos.getModel().getValueAt(
                                    jTableProductos.getSelectedRow(), 2))));
            this.productoActual.
                    setCantidad(Integer.valueOf(String.valueOf(
                            jTableProductos.getModel().getValueAt(
                                    jTableProductos.getSelectedRow(), 3))));
            if (this.productoActual.getCantidad() <= 0) {
                JOptionPane.showMessageDialog(this,
                        "No hay producto disponible",
                        "Atención",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                Inventario.getInventario().get(productoActual.getId() - 1).setCantidad(this.productoActual.getCantidad() - 1);
                this.productoActual.setCantidad(1);
                frmFactura.setproductoActual(productoActual);
                updateJTabel();
                this.dispose();
            }
        }
    }//GEN-LAST:event_jBtnSeleccionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables
}
