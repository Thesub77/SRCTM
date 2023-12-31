/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author erlin
 */
public class Protocolo extends javax.swing.JInternalFrame {

    /**
     * Creates new form Protocolo
     */
    public Protocolo() {
        initComponents();
        //  jTxtTemaProt1.setText (FechaParaTxt());
         
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jBtnBorrarProt = new javax.swing.JButton();
        jBtnGuardarProt = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCmbModalidadProt = new javax.swing.JComboBox<>();
        jCmbCarreraProt = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCmbTutorProt = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jCmbAsesorProt = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtTemaProt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTxtResumenProt = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jBtnExaminarProt = new javax.swing.JButton();
        jCmbDiaProt = new javax.swing.JComboBox<>();
        jCmbMesProt = new javax.swing.JComboBox<>();
        jCmbAnioProt = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jTxtAutor2Prot1 = new javax.swing.JTextField();
        jTxtAutor1Prot1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jTxtAutor3Prot1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jBtnBuscarAutProt4 = new javax.swing.JButton();
        jBtnBuscarAutProt5 = new javax.swing.JButton();
        jBtnBuscarAutProt6 = new javax.swing.JButton();

        jSeparator2.setBackground(new java.awt.Color(51, 255, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo Departamento.png"))); // NOI18N

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(1185, 494));
        setPreferredSize(new java.awt.Dimension(1185, 494));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jBtnBorrarProt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnBorrarProt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        jBtnBorrarProt.setText("Anular");
        jBtnBorrarProt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBorrarProtActionPerformed(evt);
            }
        });

        jBtnGuardarProt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnGuardarProt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_icon-icons.com_73702.png"))); // NOI18N
        jBtnGuardarProt.setText("Registrar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnGuardarProt)
                .addGap(18, 18, 18)
                .addComponent(jBtnBorrarProt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardarProt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBorrarProt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 280, 60));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Modalidad");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 70, 22));

        jCmbModalidadProt.setBackground(new java.awt.Color(204, 204, 204));
        jCmbModalidadProt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jCmbModalidadProt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbModalidadProtActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbModalidadProt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 233, 32));

        jCmbCarreraProt.setBackground(new java.awt.Color(204, 204, 204));
        jCmbCarreraProt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jCmbCarreraProt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbCarreraProtActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbCarreraProt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 233, 32));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Carrera");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 70, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Tutor");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 40, 25));

        jCmbTutorProt.setBackground(new java.awt.Color(204, 204, 204));
        jCmbTutorProt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jCmbTutorProt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbTutorProtActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbTutorProt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 230, 32));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Asesor");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 50, 25));

        jCmbAsesorProt.setBackground(new java.awt.Color(204, 204, 204));
        jCmbAsesorProt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jCmbAsesorProt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbAsesorProtActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbAsesorProt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 233, 32));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 330, 230));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Tema");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 45, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Resumen");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTxtTemaProt.setBorder(null);
        jTxtTemaProt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTemaProtActionPerformed(evt);
            }
        });
        jPanel7.add(jTxtTemaProt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 22, 266, 19));
        jPanel7.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 266, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Fecha");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTxtResumenProt.setBorder(null);
        jTxtResumenProt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtResumenProtActionPerformed(evt);
            }
        });
        jPanel7.add(jTxtResumenProt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 102, 266, 19));
        jPanel7.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 266, -1));

        jBtnExaminarProt.setBackground(new java.awt.Color(204, 204, 204));
        jBtnExaminarProt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder.png"))); // NOI18N
        jBtnExaminarProt.setText("Examinar");
        jPanel7.add(jBtnExaminarProt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jCmbDiaProt.setBackground(new java.awt.Color(204, 204, 204));
        jCmbDiaProt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        jPanel7.add(jCmbDiaProt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jCmbMesProt.setBackground(new java.awt.Color(204, 204, 204));
        jCmbMesProt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes" }));
        jCmbMesProt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbMesProtActionPerformed(evt);
            }
        });
        jPanel7.add(jCmbMesProt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jCmbAnioProt.setBackground(new java.awt.Color(204, 204, 204));
        jCmbAnioProt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año" }));
        jPanel7.add(jCmbAnioProt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 360, 180));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo Departamento.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, 50));

        jLabel13.setFont(new java.awt.Font("Centaur", 3, 14)); // NOI18N
        jLabel13.setText("¡A la libertad por la Universidad!");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 420, 190, 20));

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Registro de Protocolos");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1320, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Autores"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 50, 266, -1));

        jTxtAutor2Prot1.setBorder(null);
        jTxtAutor2Prot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAutor2Prot1ActionPerformed(evt);
            }
        });
        jPanel8.add(jTxtAutor2Prot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 266, 20));

        jTxtAutor1Prot1.setBorder(null);
        jTxtAutor1Prot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAutor1Prot1ActionPerformed(evt);
            }
        });
        jPanel8.add(jTxtAutor1Prot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 266, 20));
        jPanel8.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 84, 266, -1));

        jTxtAutor3Prot1.setBorder(null);
        jTxtAutor3Prot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAutor3Prot1ActionPerformed(evt);
            }
        });
        jPanel8.add(jTxtAutor3Prot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 102, 266, 19));
        jPanel8.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 120, 266, -1));

        jBtnBuscarAutProt4.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarAutProt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarAutProt4.setText("Buscar");
        jBtnBuscarAutProt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarAutProt4ActionPerformed(evt);
            }
        });
        jPanel8.add(jBtnBuscarAutProt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 107, -1));

        jBtnBuscarAutProt5.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarAutProt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarAutProt5.setText("Buscar");
        jBtnBuscarAutProt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarAutProt5ActionPerformed(evt);
            }
        });
        jPanel8.add(jBtnBuscarAutProt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 107, -1));

        jBtnBuscarAutProt6.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarAutProt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarAutProt6.setText("Buscar");
        jBtnBuscarAutProt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarAutProt6ActionPerformed(evt);
            }
        });
        jPanel8.add(jBtnBuscarAutProt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 107, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 410, 154));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1190, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBorrarProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBorrarProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBorrarProtActionPerformed

    private void jCmbTutorProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbTutorProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbTutorProtActionPerformed

    private void jTxtTemaProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTemaProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTemaProtActionPerformed

    private void jTxtResumenProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtResumenProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtResumenProtActionPerformed

    private void jCmbMesProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbMesProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbMesProtActionPerformed

    private void jCmbAsesorProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbAsesorProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbAsesorProtActionPerformed

    private void jCmbCarreraProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbCarreraProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbCarreraProtActionPerformed

    private void jCmbModalidadProtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbModalidadProtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbModalidadProtActionPerformed

    private void jTxtAutor2Prot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAutor2Prot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAutor2Prot1ActionPerformed

    private void jTxtAutor1Prot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAutor1Prot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAutor1Prot1ActionPerformed

    private void jTxtAutor3Prot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAutor3Prot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAutor3Prot1ActionPerformed

    private void jBtnBuscarAutProt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarAutProt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarAutProt4ActionPerformed

    private void jBtnBuscarAutProt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarAutProt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarAutProt5ActionPerformed

    private void jBtnBuscarAutProt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarAutProt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarAutProt6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBorrarProt;
    private javax.swing.JButton jBtnBuscarAutProt4;
    private javax.swing.JButton jBtnBuscarAutProt5;
    private javax.swing.JButton jBtnBuscarAutProt6;
    private javax.swing.JButton jBtnExaminarProt;
    private javax.swing.JButton jBtnGuardarProt;
    private javax.swing.JComboBox<String> jCmbAnioProt;
    private javax.swing.JComboBox<String> jCmbAsesorProt;
    private javax.swing.JComboBox<String> jCmbCarreraProt;
    private javax.swing.JComboBox<String> jCmbDiaProt;
    private javax.swing.JComboBox<String> jCmbMesProt;
    private javax.swing.JComboBox<String> jCmbModalidadProt;
    private javax.swing.JComboBox<String> jCmbTutorProt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTxtAutor1Prot1;
    private javax.swing.JTextField jTxtAutor2Prot1;
    private javax.swing.JTextField jTxtAutor3Prot1;
    private javax.swing.JTextField jTxtResumenProt;
    private javax.swing.JTextField jTxtTemaProt;
    // End of variables declaration//GEN-END:variables
}
