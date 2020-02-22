package fitnesspowerinter;

import fitnesspower.bl.FacturaBL;
import fitnesspower.ent.Factura;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

public class FacturaGUI extends javax.swing.JInternalFrame {

    static FacturaBL facturaBL = new FacturaBL();

    static DefaultTableModel model;

    public FacturaGUI() {
        initComponents();
        createTable();
        try {
            loadData();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(FacturaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void createTable() {
        DefaultTableCellRenderer alinear = new DefaultTableCellHeaderRenderer();
        alinear.setHorizontalAlignment(SwingConstants.RIGHT);

        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return columna < 0;
            }
        };
        model.addColumn("IdFactura");
        model.addColumn("IdCliente");
        model.addColumn("Fecha");
        model.addColumn("ValorNeto");
        model.addColumn("valorDescuento");
        model.addColumn("valorTotal");

        listaJT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaJT.setModel(model);

        listaJT.getColumnModel().getColumn(0).setPreferredWidth(125);
        listaJT.getColumnModel().getColumn(1).setPreferredWidth(125);
        listaJT.getColumnModel().getColumn(2).setPreferredWidth(125);
        listaJT.getColumnModel().getColumn(3).setPreferredWidth(125);
        listaJT.getColumnModel().getColumn(4).setPreferredWidth(125);
        listaJT.getColumnModel().getColumn(5).setPreferredWidth(125);

        listaJT.getColumnModel().getColumn(0).setCellRenderer(alinear);
        listaJT.getColumnModel().getColumn(1).setCellRenderer(alinear);
        listaJT.getColumnModel().getColumn(2).setCellRenderer(alinear);
        listaJT.getColumnModel().getColumn(3).setCellRenderer(alinear);
        listaJT.getColumnModel().getColumn(4).setCellRenderer(alinear);
        listaJT.getColumnModel().getColumn(5).setCellRenderer(alinear);

        model = (DefaultTableModel) listaJT.getModel();
    }

    public static void loadData() throws SQLException, ClassNotFoundException {
        List<Factura> lf = new ArrayList<Factura>();
        lf = facturaBL.readAllFactura();
        for (Factura factura : lf) {
            Object[] data = {factura.getIdFactura(), factura.getIdCliente(), factura.getFecha(), factura.getValorNeto(), factura.getValorDescuento(), factura.getValorTotal()};
            model.addRow(data);
        }
        listaJT.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevaFacturaJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaJT = new javax.swing.JTable();
        actualizarJB = new javax.swing.JButton();
        eliminarFacturaJB = new javax.swing.JButton();
        volverJB = new javax.swing.JButton();

        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 0));
        setIconifiable(true);
        setResizable(true);
        setTitle("Factura");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        nuevaFacturaJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nuevoProducto.png"))); // NOI18N
        nuevaFacturaJB.setText("Nueva Factura");
        nuevaFacturaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaFacturaJBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        jLabel1.setText("Facturas");

        listaJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listaJT.setGridColor(new java.awt.Color(0, 0, 0));
        listaJT.setName("listaFacturas"); // NOI18N
        listaJT.getTableHeader().setResizingAllowed(false);
        listaJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(listaJT);

        actualizarJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actualizar.png"))); // NOI18N
        actualizarJB.setText("Actualizar");
        actualizarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarJBActionPerformed(evt);
            }
        });

        eliminarFacturaJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eliminarProducto.png"))); // NOI18N
        eliminarFacturaJB.setText("Eliminar Factura");
        eliminarFacturaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFacturaJBActionPerformed(evt);
            }
        });

        volverJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/volver.png"))); // NOI18N
        volverJB.setText("Volver");
        volverJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverJB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevaFacturaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarFacturaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(645, 645, 645)
                        .addComponent(actualizarJB))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarJB)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevaFacturaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarFacturaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 465, Short.MAX_VALUE)
                        .addComponent(volverJB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaFacturaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaFacturaJBActionPerformed
        NuevaFacturaGUI nuevaFacturaGUI = new NuevaFacturaGUI();
        Menu.escritorio.add(nuevaFacturaGUI);
        nuevaFacturaGUI.setVisible(true);
    }//GEN-LAST:event_nuevaFacturaJBActionPerformed

    private void actualizarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarJBActionPerformed
        createTable();
        try {
            loadData();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(FacturaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarJBActionPerformed

    private void eliminarFacturaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFacturaJBActionPerformed
        if (listaJT.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un producto", "Porfavor seleccione un producto", WIDTH);
        } else {
            if (JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar el producto?", "Eliminar Producto", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null) == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(String.valueOf(listaJT.getValueAt(listaJT.getSelectedRow(), 0)));
                try {
                    facturaBL.deleteForIdFactura(id);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(FacturaGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                createTable();
                try {
                    loadData();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_eliminarFacturaJBActionPerformed

    private void volverJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJBActionPerformed
        Menu.menuBarJMB.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarJB;
    private javax.swing.JButton eliminarFacturaJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable listaJT;
    private javax.swing.JButton nuevaFacturaJB;
    private javax.swing.JButton volverJB;
    // End of variables declaration//GEN-END:variables
}
