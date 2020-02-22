package fitnesspowerinter;

import fitnesspower.bl.NovedadesBL;
import fitnesspower.ent.Novedad;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Novedades extends javax.swing.JInternalFrame {

    File fichero;
    public String nombreEvento, descripcion, ubicacionEvento;

    public Novedades() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subirjbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlFoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomEventJTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nomDesJTF = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        ubiJTF = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Novedades");

        subirjbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/subirmejor.png"))); // NOI18N
        subirjbt.setText("Cargar Imagen");
        subirjbt.setBorderPainted(false);
        subirjbt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subirjbt.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        subirjbt.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/subirmejor2.png"))); // NOI18N
        subirjbt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        subirjbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirjbtActionPerformed(evt);
            }
        });

        jLabel1.setText("Agregar Descripcion Del Evento:");

        jlFoto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlFoto.setText("                            Imagen");
        jlFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jlFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Nombre del evento:");

        nomEventJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomEventJTFActionPerformed(evt);
            }
        });

        jButton1.setText("Subir Nuevo Evento ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nomDesJTF.setColumns(20);
        nomDesJTF.setRows(5);
        jScrollPane1.setViewportView(nomDesJTF);

        jLabel3.setText("Ubicacion del evento:  ");

        jLabel4.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomEventJTF))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ubiJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subirjbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subirjbt)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomEventJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ubiJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subirjbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirjbtActionPerformed
        // Cargar foto

        int resultado;

        CargarFoto ventanta = new CargarFoto();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");

        ventanta.jfchCargarfoto.setFileFilter(filtro);

        resultado = ventanta.jfchCargarfoto.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado) {

            fichero = ventanta.jfchCargarfoto.getSelectedFile();

            try {

                ImageIcon icon = new ImageIcon(fichero.toString());

                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jlFoto.getWidth(), jlFoto.getHeight(), Image.SCALE_DEFAULT));

                jlFoto.setText(null);
                jlFoto.setIcon(icono);

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, " Error al abrir la imagen" + ex);

            }
        }

    }//GEN-LAST:event_subirjbtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Captura();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Novedades.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void nomEventJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomEventJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomEventJTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlFoto;
    private javax.swing.JTextArea nomDesJTF;
    private javax.swing.JTextField nomEventJTF;
    private javax.swing.JButton subirjbt;
    private javax.swing.JTextField ubiJTF;
    // End of variables declaration//GEN-END:variables
private void Captura() throws SQLException, ClassNotFoundException {

        nombreEvento = nomEventJTF.getText();
        descripcion = nomDesJTF.getText();
        ubicacionEvento = ubiJTF.getText();
     
        Novedad m = new Novedad(nombreEvento, descripcion,"fecha", ubicacionEvento);
        NovedadesBL bl = new NovedadesBL();
        bl.NovedadNueva(m);
        if (nombreEvento.equals("")) {

            int opcion = JOptionPane.showConfirmDialog(null, "Deseas continuar sin colocar un nombre?", "Aviso", JOptionPane.YES_NO_OPTION);

            if (opcion == 0) {

                //guardar en base de datos 
                dispose();
            }
        }

    }

}
