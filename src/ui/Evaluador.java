/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ui;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author erlin
 */
public class Evaluador extends javax.swing.JInternalFrame {

    /**
     * Creates new form Evaluador
     */
    public Evaluador() {
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
        jLabel2 = new javax.swing.JLabel();
        jTxtApellido2Evaluador = new javax.swing.JTextField();
        jTxtApellido1Evaluador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtNombresEvaluador = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBtnBuscarEvaluador = new javax.swing.JButton();
        jBtnGuardarEvaluador = new javax.swing.JButton();
        jBtnEliminarEvaluador = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jTxtINSSEvaluador = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblListarEvaluador = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(995, 503));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombres");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 70, -1));

        jTxtApellido2Evaluador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtApellido2Evaluador.setBorder(null);
        jTxtApellido2Evaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApellido2EvaluadorActionPerformed(evt);
            }
        });
        jTxtApellido2Evaluador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtApellido2EvaluadorKeyTyped(evt);
            }
        });
        jPanel2.add(jTxtApellido2Evaluador, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 150, 20));

        jTxtApellido1Evaluador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtApellido1Evaluador.setBorder(null);
        jTxtApellido1Evaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApellido1EvaluadorActionPerformed(evt);
            }
        });
        jTxtApellido1Evaluador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtApellido1EvaluadorKeyTyped(evt);
            }
        });
        jPanel2.add(jTxtApellido1Evaluador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 150, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Segundo Apellido");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Codigo INSS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jTxtNombresEvaluador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtNombresEvaluador.setBorder(null);
        jTxtNombresEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombresEvaluadorActionPerformed(evt);
            }
        });
        jTxtNombresEvaluador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNombresEvaluadorKeyTyped(evt);
            }
        });
        jPanel2.add(jTxtNombresEvaluador, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 150, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jBtnBuscarEvaluador.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarEvaluador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnBuscarEvaluador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        jBtnBuscarEvaluador.setText("Buscar");
        jBtnBuscarEvaluador.setMaximumSize(new java.awt.Dimension(114, 30));
        jBtnBuscarEvaluador.setMinimumSize(new java.awt.Dimension(114, 30));
        jBtnBuscarEvaluador.setPreferredSize(new java.awt.Dimension(114, 30));
        jBtnBuscarEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarEvaluadorActionPerformed(evt);
            }
        });

        jBtnGuardarEvaluador.setBackground(new java.awt.Color(204, 204, 204));
        jBtnGuardarEvaluador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnGuardarEvaluador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_icon-icons.com_73702.png"))); // NOI18N
        jBtnGuardarEvaluador.setText("Guardar");
        jBtnGuardarEvaluador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnGuardarEvaluador.setMaximumSize(new java.awt.Dimension(114, 30));
        jBtnGuardarEvaluador.setMinimumSize(new java.awt.Dimension(114, 30));
        jBtnGuardarEvaluador.setPreferredSize(new java.awt.Dimension(114, 30));
        jBtnGuardarEvaluador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnGuardarEvaluadorMouseEntered(evt);
            }
        });
        jBtnGuardarEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarEvaluadorActionPerformed(evt);
            }
        });

        jBtnEliminarEvaluador.setBackground(new java.awt.Color(204, 204, 204));
        jBtnEliminarEvaluador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnEliminarEvaluador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        jBtnEliminarEvaluador.setText("Eliminar");
        jBtnEliminarEvaluador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnEliminarEvaluadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnEliminarEvaluadorMouseExited(evt);
            }
        });
        jBtnEliminarEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarEvaluadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jBtnGuardarEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnBuscarEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jBtnEliminarEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEliminarEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscarEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGuardarEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 410, 70));

        jLabel9.setFont(new java.awt.Font("Centaur", 3, 14)); // NOI18N
        jLabel9.setText("¡A la libertad por la Universidad!");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 190, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo Departamento.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 240, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 150, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 150, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 150, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 150, -1));

        jTxtINSSEvaluador.setBorder(null);
        try {
            jTxtINSSEvaluador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtINSSEvaluador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtINSSEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtINSSEvaluadorActionPerformed(evt);
            }
        });
        jPanel2.add(jTxtINSSEvaluador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 150, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Datos Evaluador");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 120, -1));

        jTblListarEvaluador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Inss", "Nombres", "Apellidos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTblListarEvaluador.setFocusable(false);
        jTblListarEvaluador.setGridColor(new java.awt.Color(0, 0, 0));
        jTblListarEvaluador.setRowHeight(25);
        jTblListarEvaluador.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jTblListarEvaluador.setShowHorizontalLines(true);
        jTblListarEvaluador.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTblListarEvaluador);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 450, 340));

        jPanel1.setBackground(new java.awt.Color(245, 211, 17));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(225, 24));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Listado de evaluadores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel3)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 450, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Primer Apellido");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtApellido2EvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApellido2EvaluadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApellido2EvaluadorActionPerformed

    private void jTxtApellido2EvaluadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtApellido2EvaluadorKeyTyped
        // TODO add your handling code here:
        char validar =  evt.getKeyChar();
        if (Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtApellido2EvaluadorKeyTyped

    private void jTxtApellido1EvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApellido1EvaluadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApellido1EvaluadorActionPerformed

    private void jTxtApellido1EvaluadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtApellido1EvaluadorKeyTyped
        char validar =  evt.getKeyChar();
        if (Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtApellido1EvaluadorKeyTyped

    private void jTxtNombresEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombresEvaluadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombresEvaluadorActionPerformed

    private void jTxtNombresEvaluadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombresEvaluadorKeyTyped
        char validar =  evt.getKeyChar();
        if (Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtNombresEvaluadorKeyTyped

    private void jBtnBuscarEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarEvaluadorActionPerformed
        /*try {
            // Preparar los datos que se guardaran del tecnico:
            //ResultSet rst = Ctr_Tutor.buscar(this.jTxtINSS.getText());
            String inss = this.jTxtINSS.getText();
            String sql = "SELECT * FROM Tutor";
            cnx.

            if (rst > 0) {
                JOptionPane.showMessageDialog(this, "Registro grabado con exito"
                    , "Grabar Registro", JOptionPane.INFORMATION_MESSAGE);
            }//Fin de la instrucción if
        } catch(Exception ex){

        }*/
    }//GEN-LAST:event_jBtnBuscarEvaluadorActionPerformed

    private void jBtnGuardarEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarEvaluadorActionPerformed

    }//GEN-LAST:event_jBtnGuardarEvaluadorActionPerformed

    private void jBtnEliminarEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarEvaluadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnEliminarEvaluadorActionPerformed

    private void jTxtINSSEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtINSSEvaluadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtINSSEvaluadorActionPerformed

    private void jBtnGuardarEvaluadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnGuardarEvaluadorMouseEntered
       
    }//GEN-LAST:event_jBtnGuardarEvaluadorMouseEntered

    private void jBtnEliminarEvaluadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEliminarEvaluadorMouseEntered
        jBtnEliminarEvaluador.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_jBtnEliminarEvaluadorMouseEntered

    private void jBtnEliminarEvaluadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEliminarEvaluadorMouseExited
          jBtnEliminarEvaluador.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jBtnEliminarEvaluadorMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscarEvaluador;
    private javax.swing.JButton jBtnEliminarEvaluador;
    private javax.swing.JButton jBtnGuardarEvaluador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTblListarEvaluador;
    private javax.swing.JTextField jTxtApellido1Evaluador;
    private javax.swing.JTextField jTxtApellido2Evaluador;
    private javax.swing.JFormattedTextField jTxtINSSEvaluador;
    private javax.swing.JTextField jTxtNombresEvaluador;
    // End of variables declaration//GEN-END:variables
}