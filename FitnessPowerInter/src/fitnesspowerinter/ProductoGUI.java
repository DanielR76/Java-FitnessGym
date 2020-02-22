package fitnesspowerinter;

import fitnesspower.bl.ProductoBL;
import fitnesspower.ent.Producto;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

public final class ProductoGUI extends javax.swing.JFrame {

    NuevoProductoGUI nuevoProductoGUI;
    ModificarProductoGUI modificarProductoGUI;

    Producto producto;
    static ProductoBL productoBL = new ProductoBL();

    ImageIcon img;

    static DefaultTableModel model;

    public ProductoGUI() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        createTable();
        try {
            loadData();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
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
        model.addColumn("IdProducto");
        model.addColumn("Concepto");
        model.addColumn("Valor");

        listaJT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaJT.setModel(model);

        listaJT.getColumnModel().getColumn(0).setPreferredWidth(125);
        listaJT.getColumnModel().getColumn(1).setPreferredWidth(405);
        listaJT.getColumnModel().getColumn(2).setPreferredWidth(125);

        listaJT.getColumnModel().getColumn(0).setCellRenderer(alinear);
        listaJT.getColumnModel().getColumn(2).setCellRenderer(alinear);

        model = (DefaultTableModel) listaJT.getModel();
    }

    public static void loadData() throws SQLException, ClassNotFoundException {
        List<Producto> lp = new ArrayList<Producto>();
        lp = productoBL.readAllProducto();
        for (Producto p : lp) {
            Object[] data = {p.getIdProducto(), p.getConcepto(), p.getValor()};
            model.addRow(data);
        }
        listaJT.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productosJDP = new javax.swing.JDesktopPane();
        tituloProductos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaJT = new javax.swing.JTable();
        nuevoJB = new javax.swing.JButton();
        modificarJB = new javax.swing.JButton();
        volverJB = new javax.swing.JButton();
        eliminarJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagenJL = new javax.swing.JLabel();
        actualizarJB = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivoJMB = new javax.swing.JMenu();
        nuevoProductoJMI = new javax.swing.JMenuItem();
        modificarProductoJMI = new javax.swing.JMenuItem();
        eliminarProductoJMI = new javax.swing.JMenuItem();
        volverJMI = new javax.swing.JMenuItem();
        ayudaJMB = new javax.swing.JMenu();
        contactoJMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("productoJFRAME"); // NOI18N

        tituloProductos.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        tituloProductos.setForeground(new java.awt.Color(255, 255, 255));
        tituloProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloProductos.setText("PRODUCTOS:");

        listaJT.setGridColor(new java.awt.Color(0, 0, 0));
        listaJT.setName("listaProductos"); // NOI18N
        listaJT.getTableHeader().setResizingAllowed(false);
        listaJT.getTableHeader().setReorderingAllowed(false);
        listaJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listaJTMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(listaJT);

        nuevoJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nuevoProducto.png"))); // NOI18N
        nuevoJB.setText("Nuevo");
        nuevoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoJBActionPerformed(evt);
            }
        });

        modificarJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/modificarProducto.png"))); // NOI18N
        modificarJB.setText("Modificar");
        modificarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarJBActionPerformed(evt);
            }
        });

        volverJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/volver.png"))); // NOI18N
        volverJB.setText("Volver");
        volverJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverJBActionPerformed(evt);
            }
        });

        eliminarJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eliminarProducto.png"))); // NOI18N
        eliminarJB.setText("Eliminar");
        eliminarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarJBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Imagen:");

        imagenJL.setBackground(new java.awt.Color(0, 0, 0));

        actualizarJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actualizar.png"))); // NOI18N
        actualizarJB.setText("Actualizar");
        actualizarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productosJDPLayout = new javax.swing.GroupLayout(productosJDP);
        productosJDP.setLayout(productosJDPLayout);
        productosJDPLayout.setHorizontalGroup(
            productosJDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productosJDPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productosJDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productosJDPLayout.createSequentialGroup()
                        .addComponent(actualizarJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(productosJDPLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(productosJDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(imagenJL, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(productosJDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarJB, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(nuevoJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(volverJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        productosJDPLayout.setVerticalGroup(
            productosJDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productosJDPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productosJDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarJB))
                .addGap(18, 18, 18)
                .addGroup(productosJDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productosJDPLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(productosJDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productosJDPLayout.createSequentialGroup()
                                .addComponent(nuevoJB)
                                .addGap(18, 18, 18)
                                .addComponent(modificarJB)
                                .addGap(18, 18, 18)
                                .addComponent(eliminarJB))
                            .addComponent(imagenJL, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addComponent(volverJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        productosJDP.setLayer(tituloProductos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productosJDP.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productosJDP.setLayer(nuevoJB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productosJDP.setLayer(modificarJB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productosJDP.setLayer(volverJB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productosJDP.setLayer(eliminarJB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productosJDP.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productosJDP.setLayer(imagenJL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productosJDP.setLayer(actualizarJB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        archivoJMB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/archivo.png"))); // NOI18N
        archivoJMB.setText("Archivo");
        archivoJMB.setToolTipText("");

        nuevoProductoJMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nuevoProducto.png"))); // NOI18N
        nuevoProductoJMI.setText("Nuevo Producto");
        nuevoProductoJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoProductoJMIActionPerformed(evt);
            }
        });
        archivoJMB.add(nuevoProductoJMI);

        modificarProductoJMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/modificarProducto.png"))); // NOI18N
        modificarProductoJMI.setText("Modificar Producto");
        modificarProductoJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProductoJMIActionPerformed(evt);
            }
        });
        archivoJMB.add(modificarProductoJMI);

        eliminarProductoJMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eliminarProducto.png"))); // NOI18N
        eliminarProductoJMI.setText("Eliminar Producto");
        eliminarProductoJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoJMIActionPerformed(evt);
            }
        });
        archivoJMB.add(eliminarProductoJMI);

        volverJMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/volver.png"))); // NOI18N
        volverJMI.setText("Volver");
        volverJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverJMIActionPerformed(evt);
            }
        });
        archivoJMB.add(volverJMI);

        jMenuBar1.add(archivoJMB);

        ayudaJMB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ayuda.png"))); // NOI18N
        ayudaJMB.setText("Ayuda");

        contactoJMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/contacto.png"))); // NOI18N
        contactoJMI.setText("Contacto");
        contactoJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactoJMIActionPerformed(evt);
            }
        });
        ayudaJMB.add(contactoJMI);

        jMenuBar1.add(ayudaJMB);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productosJDP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productosJDP, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoProductoJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoProductoJMIActionPerformed
        nuevoProductoGUI = new NuevoProductoGUI();
        productosJDP.add(nuevoProductoGUI);
        nuevoProductoGUI.setVisible(true);
        img = new ImageIcon();
        img = productoBL.defaultImage();
        img = new ImageIcon(img.getImage().getScaledInstance(nuevoProductoGUI.imagenJL.getWidth(), nuevoProductoGUI.imagenJL.getHeight(), Image.SCALE_DEFAULT));
        nuevoProductoGUI.imagenJL.setIcon(img);
    }//GEN-LAST:event_nuevoProductoJMIActionPerformed

    private void modificarProductoJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProductoJMIActionPerformed
        if (listaJT.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un producto", "Porfavor seleccione un producto", WIDTH);
        } else {
            modificarProductoGUI = new ModificarProductoGUI();
            productosJDP.add(modificarProductoGUI);
            modificarProductoGUI.setVisible(true);

            producto = new Producto();
            int id = Integer.parseInt(String.valueOf(listaJT.getValueAt(listaJT.getSelectedRow(), 0)));

            try {
                producto = productoBL.readForIdProducto(id);
            } catch (ClassNotFoundException | SQLException | IOException ex) {
                Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            modificarProductoGUI.idProductoJL.setText(Integer.toString(producto.getIdProducto()));
            modificarProductoGUI.conceptoJTF.setText(producto.getConcepto());
            modificarProductoGUI.valorJTF.setText(Float.toString(producto.getValor()));

            if (producto.getImagen() == null) {
                img = new ImageIcon();
                img = productoBL.defaultImage();
            } else {
                img = new ImageIcon(producto.getImagen().getPath());
            }
            img = new ImageIcon(img.getImage().getScaledInstance(modificarProductoGUI.imagenJL.getWidth(), modificarProductoGUI.imagenJL.getHeight(), Image.SCALE_DEFAULT));
            modificarProductoGUI.imagenJL.setIcon(img);
        }
    }//GEN-LAST:event_modificarProductoJMIActionPerformed

    private void contactoJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactoJMIActionPerformed
    }//GEN-LAST:event_contactoJMIActionPerformed

    private void nuevoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoJBActionPerformed
        nuevoProductoGUI = new NuevoProductoGUI();
        productosJDP.add(nuevoProductoGUI);
        nuevoProductoGUI.setVisible(true);
        img = new ImageIcon();
        img = productoBL.defaultImage();
        img = new ImageIcon(img.getImage().getScaledInstance(nuevoProductoGUI.imagenJL.getWidth(), nuevoProductoGUI.imagenJL.getHeight(), Image.SCALE_DEFAULT));
        nuevoProductoGUI.imagenJL.setIcon(img);
    }//GEN-LAST:event_nuevoJBActionPerformed

    private void modificarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarJBActionPerformed
        if (listaJT.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un producto", "Porfavor seleccione un producto", WIDTH);
        } else {
            modificarProductoGUI = new ModificarProductoGUI();
            productosJDP.add(modificarProductoGUI);
            modificarProductoGUI.setVisible(true);

            producto = new Producto();
            int id = Integer.parseInt(String.valueOf(listaJT.getValueAt(listaJT.getSelectedRow(), 0)));

            try {
                producto = productoBL.readForIdProducto(id);
            } catch (ClassNotFoundException | SQLException | IOException ex) {
                Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            modificarProductoGUI.idProductoJL.setText(Integer.toString(producto.getIdProducto()));
            modificarProductoGUI.conceptoJTF.setText(producto.getConcepto());
            modificarProductoGUI.valorJTF.setText(Float.toString(producto.getValor()));

            if (producto.getImagen() == null) {
                img = new ImageIcon();
                img = productoBL.defaultImage();
            } else {
                img = new ImageIcon(producto.getImagen().getPath());
            }
            img = new ImageIcon(img.getImage().getScaledInstance(modificarProductoGUI.imagenJL.getWidth(), modificarProductoGUI.imagenJL.getHeight(), Image.SCALE_DEFAULT));
            modificarProductoGUI.imagenJL.setIcon(img);
        }
    }//GEN-LAST:event_modificarJBActionPerformed

    private void volverJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJBActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverJBActionPerformed

    private void eliminarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJBActionPerformed
        if (listaJT.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un producto", "Porfavor seleccione un producto", WIDTH);
        } else {
            if (JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar el producto?", "Eliminar Producto", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null) == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(String.valueOf(listaJT.getValueAt(listaJT.getSelectedRow(), 0)));
                try {
                    productoBL.deleteForIdProducto(id);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                createTable();
                try {
                    loadData();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_eliminarJBActionPerformed

    private void eliminarProductoJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoJMIActionPerformed
        if (listaJT.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un producto", "Porfavor seleccione un producto", WIDTH);
        } else {
            if (JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar el producto?", "Eliminar Producto", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null) == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(String.valueOf(listaJT.getValueAt(listaJT.getSelectedRow(), 0)));
                try {
                    productoBL.deleteForIdProducto(id);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                createTable();
                try {
                    loadData();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_eliminarProductoJMIActionPerformed

    private void volverJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJMIActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverJMIActionPerformed

    private void actualizarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarJBActionPerformed
        createTable();
        try {
            loadData();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarJBActionPerformed

    private void listaJTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaJTMouseReleased
        int id = Integer.parseInt(String.valueOf(listaJT.getValueAt(listaJT.getSelectedRow(), 0)));
        ImageIcon icon = null;

        try {
            if (productoBL.readImageProducto(id).getPath() == null) {
                icon = productoBL.defaultImage();
            } else {
                icon = new ImageIcon(productoBL.readImageProducto(id).getPath());
            }
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        icon = new ImageIcon(icon.getImage().getScaledInstance(imagenJL.getWidth(), imagenJL.getHeight(), Image.SCALE_DEFAULT));
        imagenJL.setIcon(icon);
    }//GEN-LAST:event_listaJTMouseReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProductoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarJB;
    private javax.swing.JMenu archivoJMB;
    private javax.swing.JMenu ayudaJMB;
    private javax.swing.JMenuItem contactoJMI;
    private javax.swing.JButton eliminarJB;
    private javax.swing.JMenuItem eliminarProductoJMI;
    private javax.swing.JLabel imagenJL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable listaJT;
    private javax.swing.JButton modificarJB;
    private javax.swing.JMenuItem modificarProductoJMI;
    private javax.swing.JButton nuevoJB;
    private javax.swing.JMenuItem nuevoProductoJMI;
    public static javax.swing.JDesktopPane productosJDP;
    private javax.swing.JLabel tituloProductos;
    private javax.swing.JButton volverJB;
    private javax.swing.JMenuItem volverJMI;
    // End of variables declaration//GEN-END:variables
}
