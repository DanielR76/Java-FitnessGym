package fitnesspowerinter;

import fitnesspower.bl.InstructorBL;
import fitnesspower.ent.Instructor;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistroAdministrador extends javax.swing.JInternalFrame {

    char contra[] = new char[8];
    char confcon[] = new char[8];
    public String nombre, apellido,idInstructor,direccion,correo, sexo, password;
    public int telefono;

    public RegistroAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        idJTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fR = new javax.swing.JRadioButton();
        mR = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        oR = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        direccionJTF = new javax.swing.JTextField();
        telefonoJTF = new javax.swing.JTextField();
        nombreJTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        confirmarJPF = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apellidoJTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contrasenaJPF = new javax.swing.JPasswordField();
        correoJTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Registro Administrador ");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel6.setText("Identificacion");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel3.setText("Direccion");

        buttonGroup1.add(fR);
        fR.setText("F");
        fR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fRActionPerformed(evt);
            }
        });

        buttonGroup1.add(mR);
        mR.setText("M");
        mR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRActionPerformed(evt);
            }
        });

        jLabel9.setText("Sexo");

        buttonGroup1.add(oR);
        oR.setText("Otro");
        oR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oRActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel5.setText("Telefono");

        telefonoJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoJTFActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel1.setText("Registro");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel8.setText("Confirmar contraseña");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel7.setText("Contraseña");

        contrasenaJPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaJPFActionPerformed(evt);
            }
        });

        jLabel10.setText("Correo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addComponent(direccionJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addComponent(apellidoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(telefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(idJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jLabel9)
                .addGap(45, 45, 45)
                .addComponent(mR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(fR)
                .addGap(10, 10, 10)
                .addComponent(oR))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jButton1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(correoJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(contrasenaJPF))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(45, 45, 45)
                .addComponent(confirmarJPF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(direccionJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(apellidoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(telefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(idJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(mR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(fR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(oR)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(contrasenaJPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(confirmarJPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(17, 17, 17)
                .addComponent(jButton1))
        );

        jTabbedPane1.addTab("Registro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contrasenaJPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaJPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaJPFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Capturar();
            convertir();
            ValidarContraseña();
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente c:");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegistroAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //crear registros
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void telefonoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoJTFActionPerformed

    private void oRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oRActionPerformed
        // TODO add your handling code here:
        if(oR.isSelected()){
            sexo="Otro";
        }
    }//GEN-LAST:event_oRActionPerformed

    private void mRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRActionPerformed
        // TODO add your handling code here:
        if(mR.isSelected()){
            sexo="Masculino";
        }
    }//GEN-LAST:event_mRActionPerformed

    private void fRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRActionPerformed
        // TODO add your handling code here:
        if(fR.isSelected()){
            sexo="Femenino";
        }
    }//GEN-LAST:event_fRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoJTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmarJPF;
    private javax.swing.JPasswordField contrasenaJPF;
    private javax.swing.JTextField correoJTF;
    private javax.swing.JTextField direccionJTF;
    private javax.swing.JRadioButton fR;
    private javax.swing.JTextField idJTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton mR;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JRadioButton oR;
    private javax.swing.JTextField telefonoJTF;
    // End of variables declaration//GEN-END:variables
private void Capturar() throws SQLException, ClassNotFoundException {

        nombre=nombreJTF.getText();
        apellido=apellidoJTF.getText();
        idInstructor=idJTF.getText();
        direccion=direccionJTF.getText();
        telefono=Integer.parseInt(telefonoJTF.getText());
        correo=correoJTF.getText();
        char contra[] = contrasenaJPF.getPassword();
        char confcon[] = confirmarJPF.getPassword();
        Instructor m = new Instructor(idInstructor, nombre, apellido, correo, direccion, telefono, sexo, password);
        InstructorBL bl = new InstructorBL();
        bl.CreateInstructor(m);

    }

    private void ValidarContraseña() {

        if ((contra == null || contra.length == 0) || (confcon == null || confcon.length == 0)) {
            JOptionPane.showMessageDialog(null, "Coloque una contraseña valida");
            contrasenaJPF.setText(null);
            confirmarJPF.setText(null);
        } else {
            boolean comparacion1 = Arrays.equals(contra, confcon);

            if (comparacion1) {

                System.out.println(String.valueOf(contra));
                System.out.println("continuar");
                // guardar contraseña
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                contrasenaJPF.setText(null);
                confirmarJPF.setText(null);
            }
        }
    }
    
    private void convertir(){
    
        password = String.valueOf(contra);
    
    }
}
