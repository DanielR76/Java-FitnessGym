package fitnesspowerinter;

import fitnesspower.bl.ProductoBL;
import fitnesspower.ent.Producto;
import imagen.VistaImagenJPanel;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ModificarProductoGUI extends javax.swing.JInternalFrame {

    String pathFull = "src\\imagen\\defaultImage.PNG";
    ImageIcon img;

    Producto producto;
    ProductoBL productoBL = new ProductoBL();

    public ModificarProductoGUI() {
        initComponents();
        idProductoJL.setVisible(false);
    }

    public void validateKeysValor(java.awt.event.KeyEvent evt) {
        char validacion = evt.getKeyChar();
        if (((validacion == '.') && (valorJTF.getText().contains("."))) || ((validacion != '.') && !Character.isDigit(validacion))) {
            evt.consume();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        conceptoJTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        valorJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        imagenJL = new javax.swing.JLabel();
        cargarImagenJB = new javax.swing.JButton();
        GuardarJB = new javax.swing.JButton();
        volverJB = new javax.swing.JButton();
        idProductoJL = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modificar Producto");

        jLabel3.setText("Concepto:");

        jLabel4.setText("Valor:");

        valorJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorJTFKeyTyped(evt);
            }
        });

        jLabel5.setText("Imagen:");

        cargarImagenJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/agregarImagen.png"))); // NOI18N
        cargarImagenJB.setText("Cargar Imagen");
        cargarImagenJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarImagenJBActionPerformed(evt);
            }
        });

        GuardarJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/guardar.png"))); // NOI18N
        GuardarJB.setText("Guardar");
        GuardarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarJBActionPerformed(evt);
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
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conceptoJTF)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagenJL, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cargarImagenJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GuardarJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(volverJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idProductoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(valorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(conceptoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(valorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cargarImagenJB)
                            .addGap(18, 18, 18)
                            .addComponent(idProductoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GuardarJB)
                            .addGap(18, 18, 18)
                            .addComponent(volverJB))
                        .addComponent(imagenJL, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorJTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorJTFKeyTyped
        validateKeysValor(evt);
    }//GEN-LAST:event_valorJTFKeyTyped

    private void cargarImagenJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarImagenJBActionPerformed
        JFileChooser chooser = new javax.swing.JFileChooser("C:\\Users\\julia\\Pictures\\Imgenes Prueba");
        chooser.setAccessory(new VistaImagenJPanel(chooser));
        chooser.setDialogTitle("Insertar imagen");
        chooser.setFileFilter(new FileNameExtensionFilter("Todas las imagenes", "EMF", "WMF", "JPG", "JPEG", "JFIF", "JPE", "PNG", "BMP", "DIB", "RLE", "GIF", "EMZ", "WMZ", "PCZ", "TIF", "TIFF", "EPS", "PCT", "PICT", "WPG"));
        chooser.setAcceptAllFileFilterUsed(false);

        int i = chooser.showOpenDialog(this);
        chooser.setVisible(true);

        if (i == JFileChooser.APPROVE_OPTION) {
            pathFull = (chooser.getSelectedFile()).getAbsolutePath();
        } else {
        }
        img = new ImageIcon(pathFull);
        img = new ImageIcon(img.getImage().getScaledInstance(imagenJL.getWidth(), imagenJL.getHeight(), Image.SCALE_DEFAULT));
        imagenJL.setIcon(img);
    }//GEN-LAST:event_cargarImagenJBActionPerformed

    private void GuardarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarJBActionPerformed
        if (conceptoJTF.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Porfavor digite el concepto (Nombre)", "Porfavor digite el concepto (Nombre)", WIDTH);
        } else if (valorJTF.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Porfavor digite el precio", "Porfavor digite el precio", WIDTH);
        } else {
            producto = new Producto();
            producto.setConcepto(conceptoJTF.getText());
            producto.setValor(Float.parseFloat(valorJTF.getText()));
            producto.setIdProducto(Integer.parseInt(idProductoJL.getText()));
            if (!pathFull.equals("src\\imagen\\defaultImage.PNG")) {
                File imagen = new File(pathFull);
                producto.setImagen(imagen);
            } else {
            }
            try {
                productoBL.updateProducto(producto);
            } catch (ClassNotFoundException | SQLException | FileNotFoundException ex) {
                Logger.getLogger(ModificarProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "El producto se ha registrado satisfactoriamente", "Producto registrado", WIDTH);
            this.dispose();
            ProductoGUI.createTable();
            try {
                ProductoGUI.loadData();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ModificarProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_GuardarJBActionPerformed

    private void volverJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJBActionPerformed
        this.dispose();
    }//GEN-LAST:event_volverJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarJB;
    private javax.swing.JButton cargarImagenJB;
    public javax.swing.JTextField conceptoJTF;
    public javax.swing.JLabel idProductoJL;
    public javax.swing.JLabel imagenJL;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField valorJTF;
    private javax.swing.JButton volverJB;
    // End of variables declaration//GEN-END:variables
}
