package fitnesspowerinter;

import fitnesspower.bl.FacturaBL;
import fitnesspower.ent.Factura;
import fitnesspower.ent.Producto;
import java.sql.SQLException;
import java.sql.Timestamp;
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

public class ModificarFacturaGUI extends javax.swing.JInternalFrame {
    
    Producto producto;
    AgregarProductoGUI agregarProductoGUI;
    FacturaBL facturaBL = new FacturaBL();
    
    public static DefaultTableModel model;

    public ModificarFacturaGUI() {
        initComponents();
    }

    public static void createTableListBill() {
        DefaultTableCellRenderer alinear = new DefaultTableCellHeaderRenderer();
        alinear.setHorizontalAlignment(SwingConstants.RIGHT);

        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return columna <= 0;
            }
        };
        model.addColumn("Cantidad");
        model.addColumn("Id");
        model.addColumn("Concepto");
        model.addColumn("Valor Unitario");
        model.addColumn("Valor Total");

        listaFJT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaFJT.setModel(model);

        listaFJT.getColumnModel().getColumn(0).setPreferredWidth(60);
        listaFJT.getColumnModel().getColumn(1).setPreferredWidth(40);
        listaFJT.getColumnModel().getColumn(2).setPreferredWidth(185);
        listaFJT.getColumnModel().getColumn(3).setPreferredWidth(90);
        listaFJT.getColumnModel().getColumn(4).setPreferredWidth(90);

        listaFJT.getColumnModel().getColumn(0).setCellRenderer(alinear);
        listaFJT.getColumnModel().getColumn(1).setCellRenderer(alinear);
        listaFJT.getColumnModel().getColumn(3).setCellRenderer(alinear);
        listaFJT.getColumnModel().getColumn(4).setCellRenderer(alinear);

        model = (DefaultTableModel) listaFJT.getModel();
    }

    public static void createTableListValue() {
        DefaultTableCellRenderer alinear = new DefaultTableCellHeaderRenderer();
        alinear.setHorizontalAlignment(SwingConstants.RIGHT);

        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return columna == 1;
            }
        };
        model.addColumn("Valor Neto");
        model.addColumn("Valor Descuento");
        model.addColumn("Valor Total");

        listaValorFJT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaValorFJT.setModel(model);

        listaValorFJT.getColumnModel().getColumn(0).setPreferredWidth(155);
        listaValorFJT.getColumnModel().getColumn(1).setPreferredWidth(155);
        listaValorFJT.getColumnModel().getColumn(2).setPreferredWidth(155);

        listaValorFJT.getColumnModel().getColumn(0).setCellRenderer(alinear);
        listaValorFJT.getColumnModel().getColumn(1).setCellRenderer(alinear);
        listaValorFJT.getColumnModel().getColumn(2).setCellRenderer(alinear);

        model = (DefaultTableModel) listaValorFJT.getModel();
    }

    public static void loadDataListBill() {
        List<Producto> listaProductos = new ArrayList<Producto>();

        listaProductos = AgregarProductoGUI.selectedProducts();
        for (Producto lId : listaProductos) {
            Object[] data = {lId.getCantidad(), lId.getIdProducto(), lId.getConcepto(), lId.getValor(), lId.getCantidad() * lId.getValor()};
            model.addRow(data);
        }
        listaFJT.setModel(model);
    }

    public static void loadDataListValue() {
        float valorNeto = 0;
        for (int i = 0; i < listaFJT.getRowCount(); i++) {
            String valorParcial = String.valueOf(listaFJT.getValueAt(i, 3));
            valorNeto = valorNeto + Float.valueOf(valorParcial);
        }
        Object[] data = {valorNeto, 0, valorNeto};
        model.addRow(data);
        listaValorFJT.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volverJB = new javax.swing.JButton();
        volverJB1 = new javax.swing.JButton();
        calcularJB = new javax.swing.JButton();
        guardarFacturaJB = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaValorFJT = new javax.swing.JTable();
        idClienteJFT = new javax.swing.JTextField();
        idFactura = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        agregarProductosJB = new javax.swing.JButton();
        nombreJTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fechaJTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFJT = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        volverJB.setText("Volver");
        volverJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverJBActionPerformed(evt);
            }
        });

        volverJB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/volver.png"))); // NOI18N
        volverJB1.setText("Volver");
        volverJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverJB1ActionPerformed(evt);
            }
        });

        calcularJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calcular.png"))); // NOI18N
        calcularJB.setText("Calcular");
        calcularJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularJBActionPerformed(evt);
            }
        });

        guardarFacturaJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/guardar.png"))); // NOI18N
        guardarFacturaJB.setText("Guardar Factura");
        guardarFacturaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFacturaJBActionPerformed(evt);
            }
        });

        listaValorFJT.getTableHeader().setResizingAllowed(false);
        listaValorFJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(listaValorFJT);

        jLabel2.setText("Id Cliente:");

        agregarProductosJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nuevoProducto.png"))); // NOI18N
        agregarProductosJB.setText("Agragar Productos");
        agregarProductosJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductosJBActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Fecha:");

        listaFJT.setToolTipText("");
        listaFJT.getTableHeader().setResizingAllowed(false);
        listaFJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(listaFJT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volverJB)
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(volverJB1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guardarFacturaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(idFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(fechaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(idClienteJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(agregarProductosJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(calcularJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(20, 20, 20)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(595, Short.MAX_VALUE)
                .addComponent(volverJB)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(idFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fechaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(idClienteJFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(agregarProductosJB)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(calcularJB)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(guardarFacturaJB)
                        .addComponent(volverJB1))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJBActionPerformed
        this.dispose();
    }//GEN-LAST:event_volverJBActionPerformed

    private void volverJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJB1ActionPerformed
        agregarProductoGUI.close();
        this.dispose();
    }//GEN-LAST:event_volverJB1ActionPerformed

    private void calcularJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularJBActionPerformed
        if (listaFJT.getRowCount() <= 0) {
            JOptionPane.showMessageDialog(this, "No hay productos agregados", "No hay productos agregados", WIDTH);
        } else {
            float valorNeto = 0;
            for (int i = 0; i < listaFJT.getRowCount(); i++) {
                String valorParcial = String.valueOf(listaFJT.getValueAt(i, 3));
                valorNeto = valorNeto + Float.valueOf(valorParcial);
            }
            String valorDescuento = String.valueOf(listaValorFJT.getValueAt(0, 1));

            createTableListValue();

            Float valorTotal = valorNeto - (Float.valueOf(valorDescuento));
            Object[] data = {valorNeto, valorDescuento, valorTotal};
            model.addRow(data);
            listaValorFJT.setModel(model);
        }
    }//GEN-LAST:event_calcularJBActionPerformed

    private void guardarFacturaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFacturaJBActionPerformed
        if (listaValorFJT.getRowCount() <= 0) {
            JOptionPane.showMessageDialog(this, "Por Favor Agrege Productos", "Por Favor Agrege Productos", WIDTH);
        } else if ((idClienteJFT.getText().equals("")) || (fechaJTF.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Por Favor verifique los datos ingresados", "Por Favor verifique los datos ingresados", WIDTH);
        } else {
            ArrayList<Producto> lp = new ArrayList<Producto>();

            Factura factura = new Factura();
            try {
                factura.setIdFactura(facturaBL.countRecords() + 1);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(NuevaFacturaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            factura.setIdCliente(Integer.valueOf(idClienteJFT.getText()));
            factura.setFecha(Timestamp.valueOf(fechaJTF.getText() + " " + "00:00:00"));

            for (int i = 0; i < listaFJT.getRowCount(); i++) {
                producto = new Producto();

                producto.setCantidad(Integer.valueOf(String.valueOf(listaFJT.getValueAt(i, 0))));
                producto.setIdProducto(Integer.valueOf(String.valueOf(listaFJT.getValueAt(i, 1))));
                producto.setConcepto(String.valueOf(listaFJT.getValueAt(i, 2)));
                producto.setValor(Float.valueOf(String.valueOf(listaFJT.getValueAt(i, 3))));
                lp.add(producto);
            }
            factura.setListaProducto(lp);
            factura.setValorNeto(Float.valueOf(String.valueOf(listaValorFJT.getValueAt(0, 0))));
            factura.setValorDescuento(Float.valueOf(String.valueOf(listaValorFJT.getValueAt(0, 1))));
            factura.setValorTotal(Float.valueOf(String.valueOf(listaValorFJT.getValueAt(0, 2))));
            try {
                facturaBL.createFactura(factura);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(NuevaFacturaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                facturaBL.AgregarProductoPorFactura(factura, lp);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(NuevaFacturaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "La factura se ha registrado satisfactoriamente", "La factura se ha registrado satisfactoriamente", WIDTH);

            FacturaGUI.createTable();
            try {
                FacturaGUI.loadData();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(NuevaFacturaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
    }//GEN-LAST:event_guardarFacturaJBActionPerformed

    private void agregarProductosJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductosJBActionPerformed
        agregarProductoGUI = new AgregarProductoGUI();
        ProductoGUI.productosJDP.add(agregarProductoGUI);
        agregarProductoGUI.setVisible(true);
        agregarProductoGUI.setLocation(496, 0);
    }//GEN-LAST:event_agregarProductosJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProductosJB;
    private javax.swing.JButton calcularJB;
    private javax.swing.JTextField fechaJTF;
    private javax.swing.JButton guardarFacturaJB;
    private javax.swing.JTextField idClienteJFT;
    private javax.swing.JLabel idFactura;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable listaFJT;
    public static javax.swing.JTable listaValorFJT;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JButton volverJB;
    private javax.swing.JButton volverJB1;
    // End of variables declaration//GEN-END:variables
}
