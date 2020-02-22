package fitnesspowerinter;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        Emergencias = new javax.swing.JButton();
        sugerenciasBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        menuBarJMB = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        productoJMI = new javax.swing.JMenuItem();
        facturaJMI = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PowerFitness - Menu");

        Emergencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emergencia.jpg"))); // NOI18N
        Emergencias.setText("Emergencia");
        Emergencias.setBorder(null);
        Emergencias.setBorderPainted(false);
        Emergencias.setContentAreaFilled(false);
        Emergencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Emergencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Emergencias.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emergencia2.jpg"))); // NOI18N
        Emergencias.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Emergencias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Emergencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmergenciasActionPerformed(evt);
            }
        });

        sugerenciasBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coment1.png"))); // NOI18N
        sugerenciasBTN.setText("Sugerencias");
        sugerenciasBTN.setBorder(null);
        sugerenciasBTN.setBorderPainted(false);
        sugerenciasBTN.setContentAreaFilled(false);
        sugerenciasBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sugerenciasBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sugerenciasBTN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coment.png"))); // NOI18N
        sugerenciasBTN.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sugerenciasBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sugerenciasBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugerenciasBTNActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otronove.jpg"))); // NOI18N
        jButton1.setText("Novedades");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/novedades2.0.jpg"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        escritorio.setLayer(Emergencias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(sugerenciasBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(0, 721, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Emergencias, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addComponent(sugerenciasBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sugerenciasBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addComponent(Emergencias, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logon.jpg"))); // NOI18N
        jMenu1.setText("GYM");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenu1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem1.setText("Cuentas ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Cerrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        menuBarJMB.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUARDAR.png"))); // NOI18N
        jMenu3.setText("Registro");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenu7.setText("Nuevo");

        jMenuItem6.setText("Cliente");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuItem7.setText("Instructor");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenu3.add(jMenu7);

        productoJMI.setText("Productos");
        productoJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoJMIActionPerformed(evt);
            }
        });
        jMenu3.add(productoJMI);

        facturaJMI.setText("Facturas");
        facturaJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaJMIActionPerformed(evt);
            }
        });
        jMenu3.add(facturaJMI);

        menuBarJMB.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pesa1.png"))); // NOI18N
        jMenu2.setText("Editar");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem4.setText("Dietas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Rutinas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem11.setText("Ejercicios ");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenu6.setText("Actualizar");

        jMenu5.setText("Cliente");

        jMenuItem10.setText("Medidas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenu6.add(jMenu5);

        jMenu2.add(jMenu6);

        menuBarJMB.add(jMenu2);

        setJMenuBar(menuBarJMB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RegistroCliente rg = new RegistroCliente();
        escritorio.add(rg);
        rg.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void productoJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoJMIActionPerformed
        ProductoGUI productoGUI = null;
        productoGUI = new ProductoGUI();
        productoGUI.setVisible(true);
    }//GEN-LAST:event_productoJMIActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Contabilidades cnt = new Contabilidades();
        escritorio.add(cnt);
        cnt.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Novedades nv = new Novedades();
        escritorio.add(nv);
        nv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Dietas diet = new Dietas();
        escritorio.add(diet);
        diet.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Medidas md = new Medidas();
        escritorio.add(md);
        md.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Rutina rut = new Rutina();
        escritorio.add(rut);
        rut.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Ejercicios ej = new Ejercicios();
        escritorio.add(ej);
        ej.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void facturaJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaJMIActionPerformed
        FacturaGUI facturaGUI = new FacturaGUI();
        escritorio.add(facturaGUI);
        facturaGUI.setVisible(true);

        menuBarJMB.setVisible(false);
        try {
            facturaGUI.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ProductoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_facturaJMIActionPerformed

    private void sugerenciasBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugerenciasBTNActionPerformed
        // TODO add your handling code here:
        SugerenciaG sg = new SugerenciaG();
        escritorio.add(sg);
        sg.setVisible(true);
    }//GEN-LAST:event_sugerenciasBTNActionPerformed

    private void EmergenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmergenciasActionPerformed
        // TODO add your handling code here:
        EmergenciaAc eac = new EmergenciaAc();
        escritorio.add(eac);
        eac.setVisible(true);
    }//GEN-LAST:event_EmergenciasActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
        RegistroAdministrador ra=new RegistroAdministrador();
        escritorio.add(ra);
        ra.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Emergencias;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem facturaJMI;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public static javax.swing.JMenuBar menuBarJMB;
    private javax.swing.JMenuItem productoJMI;
    private javax.swing.JButton sugerenciasBTN;
    // End of variables declaration//GEN-END:variables
}
