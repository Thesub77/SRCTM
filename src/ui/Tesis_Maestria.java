/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ui;

/**
 *
 * @author erlin
 */
public class Tesis_Maestria extends javax.swing.JInternalFrame {

    /**
     * Creates new form Tesis_Maestria
     */
    public Tesis_Maestria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jBtnBorrarTesMaes = new javax.swing.JButton();
        jBtnGuardarTesMaes = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTxtAutorTesMaes = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jBtnBuscarAutTesMaes = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jCmbTutorTesMaes = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jCmbAsesorTesMaes = new javax.swing.JComboBox<>();
        jCmbSemestreGra = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtTemaTesMaes = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTxtResumenTesMaes = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jBtnExaminarTesMaes = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jTxtEva2Prot = new javax.swing.JTextField();
        jTxtEva1Prot = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTxtEva3Prot = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jBtnBuscarAutProt3 = new javax.swing.JButton();
        jBtnBuscarAutProt1 = new javax.swing.JButton();
        jBtnBuscarAutProt2 = new javax.swing.JButton();
        jCheckPresidente = new javax.swing.JCheckBox();
        jCheckSecretario = new javax.swing.JCheckBox();
        jCheckVocal = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(1116, 494));
        setPreferredSize(new java.awt.Dimension(1116, 494));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jBtnBorrarTesMaes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnBorrarTesMaes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        jBtnBorrarTesMaes.setText("Anular");
        jBtnBorrarTesMaes.setMaximumSize(new java.awt.Dimension(1280, 650));
        jBtnBorrarTesMaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBorrarTesMaesActionPerformed(evt);
            }
        });

        jBtnGuardarTesMaes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnGuardarTesMaes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_icon-icons.com_73702.png"))); // NOI18N
        jBtnGuardarTesMaes.setText("Registrar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnGuardarTesMaes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnBorrarTesMaes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardarTesMaes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBorrarTesMaes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 260, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 65, 1, -1));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 95, 1, -1));

        jTxtAutorTesMaes.setBorder(null);
        jTxtAutorTesMaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAutorTesMaesActionPerformed(evt);
            }
        });
        jPanel5.add(jTxtAutorTesMaes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 19));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, -1));

        jBtnBuscarAutTesMaes.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarAutTesMaes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarAutTesMaes.setText("Buscar");
        jPanel5.add(jBtnBuscarAutTesMaes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 107, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 270, 150));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Tutor");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 25));

        jCmbTutorTesMaes.setBackground(new java.awt.Color(204, 204, 204));
        jCmbTutorTesMaes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jCmbTutorTesMaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbTutorTesMaesActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbTutorTesMaes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 240, 32));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Asesor");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 50, 25));

        jCmbAsesorTesMaes.setBackground(new java.awt.Color(204, 204, 204));
        jCmbAsesorTesMaes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jCmbAsesorTesMaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbAsesorTesMaesActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbAsesorTesMaes, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 240, 32));

        jCmbSemestreGra.setBackground(new java.awt.Color(204, 204, 204));
        jCmbSemestreGra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2" }));
        jCmbSemestreGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbSemestreGraActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbSemestreGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 100, 32));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Semestre");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 70, 25));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1100, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Tema");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 45, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Resumen");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 100, -1, -1));

        jTxtTemaTesMaes.setBorder(null);
        jTxtTemaTesMaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTemaTesMaesActionPerformed(evt);
            }
        });
        jPanel7.add(jTxtTemaTesMaes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 266, 19));
        jPanel7.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 34, 266, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Fecha");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 60, -1, -1));

        jTxtResumenTesMaes.setBorder(null);
        jTxtResumenTesMaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtResumenTesMaesActionPerformed(evt);
            }
        });
        jPanel7.add(jTxtResumenTesMaes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 96, 266, 19));
        jPanel7.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 114, 266, -1));

        jBtnExaminarTesMaes.setBackground(new java.awt.Color(204, 204, 204));
        jBtnExaminarTesMaes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder.png"))); // NOI18N
        jBtnExaminarTesMaes.setText("Examinar");
        jPanel7.add(jBtnExaminarTesMaes, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 135, -1, -1));
        jPanel7.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 260, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 360, 180));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo Departamento.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, 50));

        jLabel13.setFont(new java.awt.Font("Centaur", 3, 14)); // NOI18N
        jLabel13.setText("¡A la libertad por la Universidad!");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, 190, 20));

        jPanel8.setBackground(new java.awt.Color(51, 0, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Registro tesis de maestría");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1220, 40));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Evaluadores"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 50, 220, -1));

        jTxtEva2Prot.setBorder(null);
        jTxtEva2Prot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEva2ProtActionPerformed(evt);
            }
        });
        jPanel9.add(jTxtEva2Prot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 220, 20));

        jTxtEva1Prot.setBorder(null);
        jTxtEva1Prot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEva1ProtActionPerformed(evt);
            }
        });
        jPanel9.add(jTxtEva1Prot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 20));
        jPanel9.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 84, 220, -1));

        jTxtEva3Prot.setBorder(null);
        jTxtEva3Prot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEva3ProtActionPerformed(evt);
            }
        });
        jPanel9.add(jTxtEva3Prot, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 101, 220, 19));
        jPanel9.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 120, 220, -1));

        jBtnBuscarAutProt3.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarAutProt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarAutProt3.setText("Buscar");
        jBtnBuscarAutProt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarAutProt3ActionPerformed(evt);
            }
        });
        jPanel9.add(jBtnBuscarAutProt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, -1));

        jBtnBuscarAutProt1.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarAutProt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarAutProt1.setText("Buscar");
        jBtnBuscarAutProt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarAutProt1ActionPerformed(evt);
            }
        });
        jPanel9.add(jBtnBuscarAutProt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 100, -1));

        jBtnBuscarAutProt2.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarAutProt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarAutProt2.setText("Buscar");
        jBtnBuscarAutProt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarAutProt2ActionPerformed(evt);
            }
        });
        jPanel9.add(jBtnBuscarAutProt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 100, -1));

        jCheckPresidente.setText("Presidente");
        jPanel9.add(jCheckPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jCheckSecretario.setText("Secretario");
        jPanel9.add(jCheckSecretario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jCheckVocal.setText("Vocal");
        jPanel9.add(jCheckVocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 450, 150));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBorrarTesMaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBorrarTesMaesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBorrarTesMaesActionPerformed

    private void jCmbTutorTesMaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbTutorTesMaesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbTutorTesMaesActionPerformed

    private void jTxtTemaTesMaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTemaTesMaesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTemaTesMaesActionPerformed

    private void jTxtResumenTesMaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtResumenTesMaesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtResumenTesMaesActionPerformed

    private void jTxtAutorTesMaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAutorTesMaesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAutorTesMaesActionPerformed

    private void jCmbAsesorTesMaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbAsesorTesMaesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbAsesorTesMaesActionPerformed

    private void jTxtEva2ProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEva2ProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEva2ProtActionPerformed

    private void jTxtEva1ProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEva1ProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEva1ProtActionPerformed

    private void jTxtEva3ProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEva3ProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEva3ProtActionPerformed

    private void jBtnBuscarAutProt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarAutProt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarAutProt3ActionPerformed

    private void jBtnBuscarAutProt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarAutProt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarAutProt1ActionPerformed

    private void jBtnBuscarAutProt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarAutProt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarAutProt2ActionPerformed

    private void jCmbSemestreGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbSemestreGraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbSemestreGraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBorrarTesMaes;
    private javax.swing.JButton jBtnBuscarAutProt1;
    private javax.swing.JButton jBtnBuscarAutProt2;
    private javax.swing.JButton jBtnBuscarAutProt3;
    private javax.swing.JButton jBtnBuscarAutTesMaes;
    private javax.swing.JButton jBtnExaminarTesMaes;
    private javax.swing.JButton jBtnGuardarTesMaes;
    private javax.swing.JCheckBox jCheckPresidente;
    private javax.swing.JCheckBox jCheckSecretario;
    private javax.swing.JCheckBox jCheckVocal;
    private javax.swing.JComboBox<String> jCmbAsesorTesMaes;
    private javax.swing.JComboBox<String> jCmbSemestreGra;
    private javax.swing.JComboBox<String> jCmbTutorTesMaes;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTxtAutorTesMaes;
    private javax.swing.JTextField jTxtEva1Prot;
    private javax.swing.JTextField jTxtEva2Prot;
    private javax.swing.JTextField jTxtEva3Prot;
    private javax.swing.JTextField jTxtResumenTesMaes;
    private javax.swing.JTextField jTxtTemaTesMaes;
    // End of variables declaration//GEN-END:variables
}
