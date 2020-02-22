package fitnesspowerinter;

import fitnesspower.bl.RegistroClientesBL;
import fitnesspower.ent.Cliente;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RegistroCliente extends javax.swing.JInternalFrame {

    private File imagen;
    public String sexo, apellido, nombre, correo, direccion, parentesco, nombreFamiliar, password, EPS, idCliente, fecha;
    public Integer peso, estatura, telefono, edad, telefonoFamiliar;
    char contra[] = new char[8];
    char confcon[] = new char[8];

    public RegistroCliente() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Registro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        apellidoJTF = new javax.swing.JTextField();
        idJTF = new javax.swing.JTextField();
        telefonoJTF = new javax.swing.JTextField();
        direccionJTF = new javax.swing.JTextField();
        correoJTF = new javax.swing.JTextField();
        nombreFamiliarJTF = new javax.swing.JTextField();
        telefonoFamiliarJTF = new javax.swing.JTextField();
        parentescoFamiliarJTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        siguieteBTN = new javax.swing.JButton();
        contrasenaJPF = new javax.swing.JPasswordField();
        confirmarJPF = new javax.swing.JPasswordField();
        cargarFotoBTN = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        edadJTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        pesoJTF = new javax.swing.JTextField();
        jlFoto = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        mR = new javax.swing.JRadioButton();
        fR = new javax.swing.JRadioButton();
        oR = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        epsJTF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        estaturaJTF = new javax.swing.JTextField();
        fechaJTF = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Registro Cliente");
        setToolTipText("");

        Registro.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        Registro.setText("Datos personales");

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel1.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel2.setText("Apellidos");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel3.setText("Identificacion");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel5.setText("Direccion");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel7.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel8.setText("Telefono");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel9.setText("Parentesco");

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel10.setText("Contraseña");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel11.setText("Confirmar contraseña");

        nombreJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJTFActionPerformed(evt);
            }
        });

        apellidoJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoJTFActionPerformed(evt);
            }
        });

        idJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idJTFActionPerformed(evt);
            }
        });

        telefonoJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoJTFActionPerformed(evt);
            }
        });

        direccionJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionJTFActionPerformed(evt);
            }
        });

        correoJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoJTFActionPerformed(evt);
            }
        });

        nombreFamiliarJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFamiliarJTFActionPerformed(evt);
            }
        });

        telefonoFamiliarJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoFamiliarJTFActionPerformed(evt);
            }
        });

        parentescoFamiliarJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentescoFamiliarJTFActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel14.setText("Datos familiar");

        siguieteBTN.setText("Guardar");
        siguieteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguieteBTNActionPerformed(evt);
            }
        });

        contrasenaJPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaJPFActionPerformed(evt);
            }
        });

        confirmarJPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarJPFActionPerformed(evt);
            }
        });

        cargarFotoBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/subirmejor.png"))); // NOI18N
        cargarFotoBTN.setText("Cargar Imagen");
        cargarFotoBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargarFotoBTN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cargarFotoBTN.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cargarFotoBTN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/subirmejor2.png"))); // NOI18N
        cargarFotoBTN.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cargarFotoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarFotoBTNActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel13.setText("Edad");

        edadJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadJTFActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel15.setText("Peso");

        pesoJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoJTFActionPerformed(evt);
            }
        });

        jlFoto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlFoto.setText("              IMAGEN");
        jlFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jLabel17.setText("Sexo");

        buttonGroup1.add(mR);
        mR.setText("M");
        mR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRActionPerformed(evt);
            }
        });

        buttonGroup1.add(fR);
        fR.setText("F");
        fR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fRActionPerformed(evt);
            }
        });

        buttonGroup1.add(oR);
        oR.setText("Otro");
        oR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oRActionPerformed(evt);
            }
        });

        jLabel12.setText("EPS");

        epsJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epsJTFActionPerformed(evt);
            }
        });

        jLabel16.setText("Fecha ");

        jLabel18.setText("Estatura ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(Registro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(idJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edadJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epsJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(apellidoJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(direccionJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(correoJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(pesoJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(estaturaJTF))
                        .addGap(64, 64, 64)
                        .addComponent(jlFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contrasenaJPF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(mR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(oR)))
                        .addGap(51, 51, 51)
                        .addComponent(cargarFotoBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(confirmarJPF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)
                        .addGap(35, 35, 35)
                        .addComponent(nombreFamiliarJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(telefonoFamiliarJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(parentescoFamiliarJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(siguieteBTN)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Registro)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(telefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(idJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(edadJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(epsJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apellidoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(direccionJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(correoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pesoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estaturaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jlFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(mR)
                            .addComponent(fR)
                            .addComponent(oR)
                            .addComponent(fechaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(contrasenaJPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(cargarFotoBTN)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(confirmarJPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(nombreFamiliarJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(telefonoFamiliarJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(parentescoFamiliarJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(siguieteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJTFActionPerformed

    private void nombreFamiliarJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFamiliarJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFamiliarJTFActionPerformed

    private void apellidoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoJTFActionPerformed

    private void idJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idJTFActionPerformed

    private void telefonoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoJTFActionPerformed

    private void direccionJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionJTFActionPerformed

    private void correoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoJTFActionPerformed

    private void telefonoFamiliarJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoFamiliarJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFamiliarJTFActionPerformed

    private void parentescoFamiliarJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentescoFamiliarJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentescoFamiliarJTFActionPerformed

    private void contrasenaJPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaJPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaJPFActionPerformed

    private void edadJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadJTFActionPerformed

    private void pesoJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoJTFActionPerformed

    private void confirmarJPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarJPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarJPFActionPerformed

    private void cargarFotoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarFotoBTNActionPerformed
        // TODO add your handling code here:

        int resultado;

        CargarFoto ventanta = new CargarFoto();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");

        ventanta.jfchCargarfoto.setFileFilter(filtro);

        resultado = ventanta.jfchCargarfoto.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado) {

            imagen = ventanta.jfchCargarfoto.getSelectedFile();

            try {

                ImageIcon icon = new ImageIcon(imagen.toString());

                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jlFoto.getWidth(), jlFoto.getHeight(), Image.SCALE_DEFAULT));

                jlFoto.setText(null);
                jlFoto.setIcon(icono);

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, " Error al abrir la imagen" + ex);

            }
        }


    }//GEN-LAST:event_cargarFotoBTNActionPerformed

    private void siguieteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguieteBTNActionPerformed
        try {
           
            CapturaPD();
            convertir();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       // ValidarContraseña();
        

    }//GEN-LAST:event_siguieteBTNActionPerformed

    private void mRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRActionPerformed
        if (mR.isSelected()) {
            sexo = "Masculino";
        }
    }//GEN-LAST:event_mRActionPerformed

    private void fRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRActionPerformed
        // TODO add your handling code here:
        if (fR.isSelected()) {
            sexo = "Femenino";
        }
    }//GEN-LAST:event_fRActionPerformed

    private void oRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oRActionPerformed
        // TODO add your handling code here:
        if (oR.isSelected()) {
            sexo = "Otro";
        }
    }//GEN-LAST:event_oRActionPerformed

    private void epsJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epsJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epsJTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Registro;
    private javax.swing.JTextField apellidoJTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cargarFotoBTN;
    private javax.swing.JPasswordField confirmarJPF;
    private javax.swing.JPasswordField contrasenaJPF;
    private javax.swing.JTextField correoJTF;
    private javax.swing.JTextField direccionJTF;
    private javax.swing.JTextField edadJTF;
    private javax.swing.JTextField epsJTF;
    private javax.swing.JTextField estaturaJTF;
    private javax.swing.JRadioButton fR;
    private javax.swing.JTextField fechaJTF;
    private javax.swing.JTextField idJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlFoto;
    private javax.swing.JRadioButton mR;
    private javax.swing.JTextField nombreFamiliarJTF;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JRadioButton oR;
    private javax.swing.JTextField parentescoFamiliarJTF;
    private javax.swing.JTextField pesoJTF;
    private javax.swing.JButton siguieteBTN;
    private javax.swing.JTextField telefonoFamiliarJTF;
    private javax.swing.JTextField telefonoJTF;
    // End of variables declaration//GEN-END:variables
private void CapturaPD() throws SQLException, ClassNotFoundException {

        nombre = nombreJTF.getText();
        apellido = apellidoJTF.getText();
        direccion = direccionJTF.getText();
        correo = correoJTF.getText();
        fecha=fechaJTF.getText();
        estatura = Integer.parseInt(estaturaJTF.getText());
        peso = Integer.parseInt(pesoJTF.getText());
        telefono = Integer.parseInt(telefonoJTF.getText());
        idCliente=idJTF.getText();
        edad = Integer.parseInt(edadJTF.getText());
        EPS = epsJTF.getText();
        char contra[] = contrasenaJPF.getPassword();
        char confcon[] = confirmarJPF.getPassword();
        nombreFamiliar = nombreFamiliarJTF.getText();
        parentesco = parentescoFamiliarJTF.getText();
        telefonoFamiliar = Integer.parseInt(telefonoFamiliarJTF.getText());
        Cliente m = new Cliente(idCliente, password, nombre, apellido, telefono, direccion, edad, sexo, EPS, correo, peso, estatura, sexo,fecha, nombreFamiliar, telefonoFamiliar, parentesco);
        RegistroClientesBL bl = new RegistroClientesBL();
        bl.CreateCliente(m);

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

    private void convertir() {

        password = String.valueOf(contra);

    }
}
