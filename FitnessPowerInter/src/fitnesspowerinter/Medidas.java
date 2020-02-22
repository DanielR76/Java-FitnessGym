package fitnesspowerinter;

import fitnesspower.bl.MedidaBL;
import fitnesspower.ent.Medida;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Medidas extends javax.swing.JInternalFrame {

    public String estatura, hombros, pecho, cintura, cuello, cadera, biceps, antebrazo, gemelo, musloSuperior, gemelos, imc, observacion;

    public Medidas() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estaturaJL = new javax.swing.JLabel();
        hombroJL = new javax.swing.JLabel();
        pechoJL = new javax.swing.JLabel();
        cinturaJL = new javax.swing.JLabel();
        cuelloJL = new javax.swing.JLabel();
        bicepsJL = new javax.swing.JLabel();
        estaturaJTF = new javax.swing.JTextField();
        hombroJTF = new javax.swing.JTextField();
        pechoJTF = new javax.swing.JTextField();
        cinturaJTF = new javax.swing.JTextField();
        cuelloJTF = new javax.swing.JTextField();
        bicepsJTF = new javax.swing.JTextField();
        antebrazoJL = new javax.swing.JLabel();
        caderaJL = new javax.swing.JLabel();
        gemelosJL = new javax.swing.JLabel();
        musloSuperiorJL = new javax.swing.JLabel();
        imcJL = new javax.swing.JLabel();
        observacionJL = new javax.swing.JLabel();
        antebrazoJTF = new javax.swing.JTextField();
        caderaJTF = new javax.swing.JTextField();
        gemelosJTF = new javax.swing.JTextField();
        musloSuperiorJTF = new javax.swing.JTextField();
        imcJTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacionTP = new javax.swing.JTextPane();
        fechaJL = new javax.swing.JLabel();
        enviarJB = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Medidas ");

        estaturaJL.setText("Estatura:");

        hombroJL.setText("Hombros:");

        pechoJL.setText("Pecho:");

        cinturaJL.setText("Cintura: ");

        cuelloJL.setText("Cuello:");

        bicepsJL.setText("Biceps:");

        estaturaJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estaturaJTFActionPerformed(evt);
            }
        });

        hombroJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hombroJTFActionPerformed(evt);
            }
        });

        cinturaJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinturaJTFActionPerformed(evt);
            }
        });

        antebrazoJL.setText("Antebrazo:");

        caderaJL.setText("Cadera:");

        gemelosJL.setText("Gemelos:");

        musloSuperiorJL.setText("MusloSuperior:");

        imcJL.setText("IMC:");

        observacionJL.setText("Observaciones:");

        antebrazoJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antebrazoJTFActionPerformed(evt);
            }
        });

        caderaJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caderaJTFActionPerformed(evt);
            }
        });

        gemelosJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemelosJTFActionPerformed(evt);
            }
        });

        imcJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imcJTFActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(observacionTP);

        fechaJL.setText("Fecha:");

        enviarJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.jpg"))); // NOI18N
        enviarJB.setText("Guardar");
        enviarJB.setBorder(null);
        enviarJB.setBorderPainted(false);
        enviarJB.setContentAreaFilled(false);
        enviarJB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarJB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enviarJB.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar2.jpg"))); // NOI18N
        enviarJB.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        enviarJB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        enviarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(estaturaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(estaturaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(pechoJL)
                                                        .addGap(35, 35, 35))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(hombroJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(18, 18, 18)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(pechoJTF)
                                                    .addComponent(hombroJTF)
                                                    .addComponent(cinturaJTF)
                                                    .addComponent(cuelloJTF)
                                                    .addComponent(bicepsJTF))))
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(antebrazoJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(caderaJL, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(gemelosJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(imcJL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bicepsJL)
                                            .addGap(186, 186, 186)
                                            .addComponent(fechaJL))))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cuelloJL)
                                    .addComponent(cinturaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(musloSuperiorJL, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(antebrazoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caderaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gemelosJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(imcJTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(musloSuperiorJTF, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(observacionJL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enviarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(estaturaJL)
                        .addComponent(estaturaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(antebrazoJL)
                        .addComponent(antebrazoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hombroJL)
                                .addComponent(hombroJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(caderaJL)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(caderaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pechoJL)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(gemelosJL)
                                .addComponent(gemelosJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pechoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cinturaJL)
                        .addComponent(cinturaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(musloSuperiorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(musloSuperiorJL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cuelloJL)
                        .addComponent(cuelloJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(imcJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imcJL)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bicepsJL)
                        .addComponent(bicepsJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechaJL))
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(observacionJL)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estaturaJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estaturaJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estaturaJTFActionPerformed

    private void hombroJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombroJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hombroJTFActionPerformed

    private void cinturaJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinturaJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinturaJTFActionPerformed

    private void antebrazoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antebrazoJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antebrazoJTFActionPerformed

    private void caderaJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caderaJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caderaJTFActionPerformed

    private void gemelosJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemelosJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gemelosJTFActionPerformed
    private void Capturar() throws SQLException, FileNotFoundException, ClassNotFoundException {

        estatura = estaturaJTF.getText();
        hombros = hombroJTF.getText();
        pecho = pechoJTF.getText();
        cintura = cinturaJTF.getText();
        cuello = cuelloJTF.getText();
        biceps = bicepsJTF.getText();
        antebrazo = antebrazoJTF.getText();
        cadera = caderaJTF.getText();
        gemelos = gemelosJTF.getText();
        musloSuperior = musloSuperiorJTF.getText();
        imc = imcJTF.getText();
        observacion = observacionTP.getText();
        Medida m = new Medida(12, estatura, hombros, pecho, cintura, cuello, biceps, antebrazo, cadera, gemelos, musloSuperior, imc, "fecha", observacion);
        MedidaBL bl = new MedidaBL();
        bl.CreateMedida(m);

    }
    private void enviarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarJBActionPerformed
        try {
            Capturar();
        } catch (SQLException | FileNotFoundException | ClassNotFoundException ex) {
            Logger.getLogger(Medidas.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_enviarJBActionPerformed

    private void imcJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imcJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imcJTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antebrazoJL;
    private javax.swing.JTextField antebrazoJTF;
    private javax.swing.JLabel bicepsJL;
    private javax.swing.JTextField bicepsJTF;
    private javax.swing.JLabel caderaJL;
    private javax.swing.JTextField caderaJTF;
    private javax.swing.JLabel cinturaJL;
    private javax.swing.JTextField cinturaJTF;
    private javax.swing.JLabel cuelloJL;
    private javax.swing.JTextField cuelloJTF;
    private javax.swing.JButton enviarJB;
    private javax.swing.JLabel estaturaJL;
    private javax.swing.JTextField estaturaJTF;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaJL;
    private javax.swing.JLabel gemelosJL;
    private javax.swing.JTextField gemelosJTF;
    private javax.swing.JLabel hombroJL;
    private javax.swing.JTextField hombroJTF;
    private javax.swing.JLabel imcJL;
    private javax.swing.JTextField imcJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel musloSuperiorJL;
    private javax.swing.JTextField musloSuperiorJTF;
    private javax.swing.JLabel observacionJL;
    private javax.swing.JTextPane observacionTP;
    private javax.swing.JLabel pechoJL;
    private javax.swing.JTextField pechoJTF;
    // End of variables declaration//GEN-END:variables

}
