package fitnesspowerinter;

import fitnesspower.bl.FacturaBL;
import fitnesspower.bl.ProductoBL;
import fitnesspower.ent.Factura;
import fitnesspower.ent.Producto;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

public class NuevaFacturaGUI extends javax.swing.JInternalFrame {

    ProductoBL productoBL = new ProductoBL();
    FacturaBL facturaBL = new FacturaBL();
    AgregarProductoGUI agregarProductoGUI;

    public static DefaultTableModel model;
    Producto producto;

    public NuevaFacturaGUI() {
        initComponents();
        idFacturaJL.setVisible(false);
        try {
            getData();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NuevaFacturaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        createTableListBill();
        createTableListValue();
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

    private void getData() throws ClassNotFoundException, SQLException {
        Calendar fecha = new GregorianCalendar();
        fechaJTF.setText(fecha.get(Calendar.YEAR) + "-" + (fecha.get(Calendar.MONTH) + 1) + "-" + fecha.get(Calendar.DAY_OF_MONTH));
        idFacturaJL.setText(String.valueOf(facturaBL.countRecords()));
    }

    public void resetFields() {
        idClienteJFT.setText("");
        nombreJTF.setText("");
        createTableListBill();
        createTableListValue();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        idClienteJFT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fechaJTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFJT = new javax.swing.JTable();
        agregarProductosJB = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaValorFJT = new javax.swing.JTable();
        guardarFacturaJB = new javax.swing.JButton();
        volverJB = new javax.swing.JButton();
        calcularJB = new javax.swing.JButton();
        vaciarJB = new javax.swing.JButton();
        idFacturaJL = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setClosable(true);
        setIconifiable(true);
        setTitle("Nueva Factura");

        jLabel1.setText("Id Cliente:");

        jLabel2.setText("Fecha:");

        jLabel3.setText("Nombre:");

        listaFJT.setToolTipText("");
        listaFJT.getTableHeader().setResizingAllowed(false);
        listaFJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(listaFJT);

        agregarProductosJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nuevoProducto.png"))); // NOI18N
        agregarProductosJB.setText("Agragar Productos");
        agregarProductosJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductosJBActionPerformed(evt);
            }
        });

        listaValorFJT.getTableHeader().setResizingAllowed(false);
        listaValorFJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(listaValorFJT);

        guardarFacturaJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/guardar.png"))); // NOI18N
        guardarFacturaJB.setText("Guardar Factura");
        guardarFacturaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFacturaJBActionPerformed(evt);
            }
        });

        volverJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/volver.png"))); // NOI18N
        volverJB.setText("Volver");
        volverJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverJBActionPerformed(evt);
            }
        });

        calcularJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calcular.png"))); // NOI18N
        calcularJB.setText("Calcular");
        calcularJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularJBActionPerformed(evt);
            }
        });

        vaciarJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/papelera.png"))); // NOI18N
        vaciarJB.setText("Vaciar");
        vaciarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(volverJB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarFacturaJB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(agregarProductosJB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(idFacturaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(fechaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vaciarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcularJB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idClienteJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idFacturaJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(fechaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaciarJB)
                    .addComponent(calcularJB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarFacturaJB)
                    .addComponent(volverJB))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarProductosJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductosJBActionPerformed
        agregarProductoGUI = new AgregarProductoGUI();
        Menu.escritorio.add(agregarProductoGUI);
        agregarProductoGUI.setVisible(true);
        agregarProductoGUI.setLocation(496, 0);
    }//GEN-LAST:event_agregarProductosJBActionPerformed

    private void volverJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJBActionPerformed
        agregarProductoGUI.close();
        this.dispose();
    }//GEN-LAST:event_volverJBActionPerformed

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

    private void vaciarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarJBActionPerformed
        resetFields();
    }//GEN-LAST:event_vaciarJBActionPerformed

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
                facturaBL.AgregarProductoPorFactura(factura, lp);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(NuevaFacturaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                facturaBL.createFactura(factura);
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
            AgregarProductoGUI.createTable();
            try {
                AgregarProductoGUI.loadData();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(NuevaFacturaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            resetFields();
        }
    }//GEN-LAST:event_guardarFacturaJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProductosJB;
    private javax.swing.JButton calcularJB;
    private javax.swing.JTextField fechaJTF;
    private javax.swing.JButton guardarFacturaJB;
    private javax.swing.JTextField idClienteJFT;
    private javax.swing.JLabel idFacturaJL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTable listaFJT;
    public static javax.swing.JTable listaValorFJT;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JButton vaciarJB;
    private javax.swing.JButton volverJB;
    // End of variables declaration//GEN-END:variables
}
