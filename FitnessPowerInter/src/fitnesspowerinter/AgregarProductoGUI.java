package fitnesspowerinter;

import fitnesspower.bl.ProductoBL;
import fitnesspower.ent.Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

public class AgregarProductoGUI extends javax.swing.JInternalFrame {

    static ProductoBL productoBL = new ProductoBL();

    static DefaultTableModel model;

    public AgregarProductoGUI() {
        initComponents();
        createTable();
        try {
            loadData();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AgregarProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void createTable() {
        DefaultTableCellRenderer alinearDerecha = new DefaultTableCellHeaderRenderer();
        alinearDerecha.setHorizontalAlignment(SwingConstants.RIGHT);

        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return columna <= 1;
            }
        };
        model.addColumn("Agregar");
        model.addColumn("Cantidad");
        model.addColumn("Id");
        model.addColumn("Concepto");
        model.addColumn("Valor");

        listaPJT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaPJT.setModel(model);

        listaPJT.getColumnModel().getColumn(0).setPreferredWidth(60);
        listaPJT.getColumnModel().getColumn(1).setPreferredWidth(70);
        listaPJT.getColumnModel().getColumn(2).setPreferredWidth(70);
        listaPJT.getColumnModel().getColumn(3).setPreferredWidth(185);
        listaPJT.getColumnModel().getColumn(4).setPreferredWidth(115);

        listaPJT.getColumnModel().getColumn(1).setCellRenderer(alinearDerecha);
        listaPJT.getColumnModel().getColumn(2).setCellRenderer(alinearDerecha);
        listaPJT.getColumnModel().getColumn(4).setCellRenderer(alinearDerecha);

        model = (DefaultTableModel) listaPJT.getModel();
        listaPJT.setModel(model);

        listaPJT.getColumnModel().getColumn(0).setCellEditor(new CellCheckBox());
        listaPJT.getColumnModel().getColumn(0).setCellRenderer(new RenderCheckBox());
    }

    public static void loadData() throws ClassNotFoundException, SQLException {
        List<Producto> lp = new ArrayList<Producto>();
        lp = productoBL.readAllProducto();

        for (Producto producto : lp) {
            Object[] data = {false, 1, producto.getIdProducto(), producto.getConcepto(), producto.getValor()};
            model.addRow(data);
        }
        listaPJT.setModel(model);
    }

    public static List<Producto> selectedProducts() {
        List<Producto> listProductos = new ArrayList<Producto>();
        for (int i = 0; i < listaPJT.getRowCount(); i++) {
            boolean check = (Boolean) listaPJT.getValueAt(i, 0);
            if (check == true) {
                Producto producto = new Producto();
                producto.setCantidad(Integer.valueOf(String.valueOf(listaPJT.getValueAt(i, 1))));
                producto.setIdProducto((Integer.valueOf(String.valueOf(listaPJT.getValueAt(i, 2)))));
                producto.setConcepto(String.valueOf(listaPJT.getValueAt(i, 3)));
                producto.setValor(Float.valueOf(String.valueOf(listaPJT.getValueAt(i, 4))));

                listProductos.add(producto);
            } else {
            }
        }
        return listProductos;
    }

    public void close() {
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaPJT = new javax.swing.JTable();
        agregarJB = new javax.swing.JButton();
        volverJB = new javax.swing.JButton();

        setClosable(true);
        setTitle("AgragarProducto");

        listaPJT.getTableHeader().setResizingAllowed(false);
        listaPJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(listaPJT);

        agregarJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nuevoProducto.png"))); // NOI18N
        agregarJB.setText("Agregar");
        agregarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarJBActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volverJB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarJB)
                    .addComponent(volverJB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarJBActionPerformed
        listaPJT.clearSelection();
        NuevaFacturaGUI.createTableListBill();
        NuevaFacturaGUI.loadDataListBill();
        NuevaFacturaGUI.createTableListValue();
        NuevaFacturaGUI.loadDataListValue();
    }//GEN-LAST:event_agregarJBActionPerformed

    private void volverJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJBActionPerformed
        this.dispose();
    }//GEN-LAST:event_volverJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarJB;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable listaPJT;
    private javax.swing.JButton volverJB;
    // End of variables declaration//GEN-END:variables
}
