/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ui;

import controlador.CtrlTutor;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
//import negocio.Tutor;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import servicios.Conexion;

/**
 *
 * @author erlin
 */
public class Tutor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Tutor
     */
    public Tutor() {
        initComponents();
        jTblListarTutor.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTblListarTutor.getTableHeader().setOpaque(false);
        jTblListarTutor.getTableHeader().setBackground(Color.black);
        jTblListarTutor.getTableHeader().setForeground(Color.black);
        jTblListarTutor.setRowHeight(30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator8 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTxtApellido2Tutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtApellido1Tutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtNombresTutor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBtnBuscarTutor = new javax.swing.JButton();
        jBtnGuardarTutor = new javax.swing.JButton();
        jBtnEliminarTutor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jTxtINSSTutor = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblListarTutor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombres");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 70, -1));

        jTxtApellido2Tutor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTxtApellido2Tutor.setBorder(null);
        jTxtApellido2Tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApellido2TutorActionPerformed(evt);
            }
        });
        jTxtApellido2Tutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtApellido2TutorKeyTyped(evt);
            }
        });
        jPanel2.add(jTxtApellido2Tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 150, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Primer Apellido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 20));

        jTxtApellido1Tutor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTxtApellido1Tutor.setBorder(null);
        jTxtApellido1Tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApellido1TutorActionPerformed(evt);
            }
        });
        jTxtApellido1Tutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtApellido1TutorKeyTyped(evt);
            }
        });
        jPanel2.add(jTxtApellido1Tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 150, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Segundo Apellido");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Codigo INSS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jTxtNombresTutor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTxtNombresTutor.setBorder(null);
        jTxtNombresTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombresTutorActionPerformed(evt);
            }
        });
        jTxtNombresTutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNombresTutorKeyTyped(evt);
            }
        });
        jPanel2.add(jTxtNombresTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 150, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jBtnBuscarTutor.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarTutor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnBuscarTutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        jBtnBuscarTutor.setText("Buscar");
        jBtnBuscarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarTutorActionPerformed(evt);
            }
        });

        jBtnGuardarTutor.setBackground(new java.awt.Color(204, 204, 204));
        jBtnGuardarTutor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnGuardarTutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_icon-icons.com_73702.png"))); // NOI18N
        jBtnGuardarTutor.setText("Guardar");
        jBtnGuardarTutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnGuardarTutor.setMaximumSize(new java.awt.Dimension(107, 30));
        jBtnGuardarTutor.setMinimumSize(new java.awt.Dimension(107, 30));
        jBtnGuardarTutor.setPreferredSize(new java.awt.Dimension(107, 30));
        jBtnGuardarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarTutorActionPerformed(evt);
            }
        });

        jBtnEliminarTutor.setBackground(new java.awt.Color(204, 204, 204));
        jBtnEliminarTutor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnEliminarTutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        jBtnEliminarTutor.setText("Anular");
        jBtnEliminarTutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnEliminarTutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnEliminarTutorMouseExited(evt);
            }
        });
        jBtnEliminarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarTutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jBtnGuardarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnBuscarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jBtnEliminarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEliminarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGuardarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 410, 70));

        jLabel9.setFont(new java.awt.Font("Centaur", 3, 14)); // NOI18N
        jLabel9.setText("¡A la libertad por la Universidad!");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 190, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo Departamento.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 150, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 150, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 150, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 150, -1));

        jTxtINSSTutor.setBorder(null);
        try {
            jTxtINSSTutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtINSSTutor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTxtINSSTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtINSSTutorActionPerformed(evt);
            }
        });
        jPanel2.add(jTxtINSSTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 150, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Datos Tutor");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 87, -1));

        jTblListarTutor.setModel(new javax.swing.table.DefaultTableModel(
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
        jTblListarTutor.setFocusable(false);
        jTblListarTutor.setGridColor(new java.awt.Color(0, 0, 0));
        jTblListarTutor.setRowHeight(25);
        jTblListarTutor.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jTblListarTutor.setShowHorizontalLines(true);
        jTblListarTutor.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTblListarTutor);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 450, 360));

        jPanel1.setBackground(new java.awt.Color(245, 211, 17));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(225, 24));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Listado de tutores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel3)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 450, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarTutorActionPerformed
        try {
            if (!validateForm()) {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Preparar los datos que se guardaran del Tutor
                int ans = CtrlTutor.insertar_tutor(
                        this.jTxtINSSTutor.getText(),
                        this.jTxtNombresTutor.getText().toUpperCase(),
                        this.jTxtApellido1Tutor.getText().toUpperCase(),
                        this.jTxtApellido2Tutor.getText().toUpperCase());

                // Validamos si se guardo el registro
                if (ans > 0) {
                    JOptionPane.showMessageDialog(this, "Registro grabado con exito",
                            "Grabar Registro", JOptionPane.INFORMATION_MESSAGE);
                    this.clearForm(); //Limpiar los campos del formulario
                }//Fin de la instrucción if
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al intentar guardar "
                    + "el \n registro, no se encuentra una librería",
                    "Librería no Encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(this, "Se ha producido una falla al "
                    + "hacer referencia \n de una instancia",
                    "Instancia no Encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(this, "Se ha denegado el acceso al  "
                    + "intentar utilizar \n la librería o instancia para guardar",
                    "Acceso Ilegal a un Recurso", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Se ha producido una falla con "
                    + "el manejo de la solicitud \n al intentar registrar datos "
                    + "\n" + ex.getMessage(),
                    "Error al Procesar Datos", JOptionPane.ERROR_MESSAGE);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error,
                    "Registro/actualizacion fallido", JOptionPane.ERROR_MESSAGE);
        }//Fin de instrucción catch
    }//GEN-LAST:event_jBtnGuardarTutorActionPerformed

    private void jBtnBuscarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarTutorActionPerformed
        try {
            // Validamos que el campo INSS sea rellenado
            // Ya que es el insumo para realizar la busqueda de un Tutor en la Base de datos
            if (jTxtINSSTutor.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Realizar el filtrado de un registro indicado por inns:            
                String value = this.jTxtINSSTutor.getText();
                negocio.Tutor tut = CtrlTutor.leerRegistro(value);
                //Si se obtuvo el registro, se muestra
                if (tut != null) {
                    this.jTxtNombresTutor.setText(tut.getNombre());
                    this.jTxtApellido1Tutor.setText(tut.getP_apellido());
                    this.jTxtApellido2Tutor.setText(tut.getS_apellido());
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado "
                            + "el \n registro, revise los datos e intente nuevamente",
                            "Registro no Encontrado", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al intentar guardar "
                    + "el \n registro, no se encuentra una librería",
                    "Librería no Encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(this, "Se ha producido una falla al "
                    + "hacer referencia \n de una instancia",
                    "Instancia no Encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(this, "Se ha denegado el acceso al  "
                    + "intentar utilizar \n la librería o instancia para guardar",
                    "Acceso Ilegal a un Recurso", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Se ha producido una falla con "
                    + "el manejo de la solicitud \n en recurso de Base de Datos"
                    + ex.getMessage(),
                    "Error al Procesar Datos", JOptionPane.ERROR_MESSAGE);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error,
                    "Registro/actualizacion fallido", JOptionPane.ERROR_MESSAGE);
        } // Fin
    }//GEN-LAST:event_jBtnBuscarTutorActionPerformed

    private void jTxtNombresTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombresTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombresTutorActionPerformed

    private void jTxtApellido1TutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApellido1TutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApellido1TutorActionPerformed

    private void jTxtApellido2TutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApellido2TutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApellido2TutorActionPerformed

    private void jTxtApellido2TutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtApellido2TutorKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtApellido2TutorKeyTyped

    private void jTxtNombresTutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombresTutorKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtNombresTutorKeyTyped

    private void jTxtApellido1TutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtApellido1TutorKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtApellido1TutorKeyTyped

    private void jTxtINSSTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtINSSTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtINSSTutorActionPerformed

    private void jBtnEliminarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarTutorActionPerformed
        // TODO add your handling code here:
        int opc; //Determina el boton seleccionado en el mensaje de confirmación        
        try {
            if (jTxtINSSTutor.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese el INSS "
                        + "del registro que desea anular", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                negocio.Tutor t = CtrlTutor.leerRegistro(this.jTxtINSSTutor.getText());

                if (t != null) {
                    opc = JOptionPane.showConfirmDialog(this, "Esta intentando eliminar"
                            + " un registro que contiene más \n"
                            + " vinculaciones con otros datos"
                            + " ¿Esta seguro de continuar?",
                            "Eliminar", JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                    if (opc == JOptionPane.YES_OPTION) {
                        // Enviamos el INSS al controlador para realizar la anulacion del registro
                        CtrlTutor.eliminar(this.jTxtINSSTutor.getText());

                        // Mostramos un mensaje que confirma la anulacion del registro
                        JOptionPane.showMessageDialog(this, "El registro del Tutor:"
                                + this.jTxtINSSTutor.getText()
                                + "\n ha sido removido", "Eliminar",
                                JOptionPane.INFORMATION_MESSAGE);

                        // Limpiamos los campos del formulario
                        this.clearForm();
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "El registro que desea eliminar no existe "
                            + "\n Numero de INSS: "
                            + this.jTxtINSSTutor.getText()
                            + " \n Asegurese de haberlo escrito correctamente",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    
                    this.clearForm();
                }
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al intentar guardar "
                    + "el \n registro, no se encuentra una librería",
                    "Librería no Encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(this, "Se ha producido una falla al "
                    + "hacer referencia \n de una instancia",
                    "Instancia no Encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(this, "Se ha denegado el acceso al  "
                    + "intentar utilizar \n la librería o instancia para guardar",
                    "Acceso Ilegal a un Recurso", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Se ha producido una falla con "
                    + "el manejo de la solicitud \n al intentar registrar datos "
                    + ex.getMessage(),
                    "Error al Procesar Datos", JOptionPane.ERROR_MESSAGE);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error,
                    "Registro/actualizacion fallido", JOptionPane.ERROR_MESSAGE);
        }//Fin
    }//GEN-LAST:event_jBtnEliminarTutorActionPerformed

    private void jBtnEliminarTutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEliminarTutorMouseEntered
        jBtnEliminarTutor.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_jBtnEliminarTutorMouseEntered

    private void jBtnEliminarTutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEliminarTutorMouseExited
        jBtnEliminarTutor.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jBtnEliminarTutorMouseExited

    // Metodo para limpiar los campos del formulario
    private void clearForm() {
        this.jTxtINSSTutor.setText("");
        this.jTxtNombresTutor.setText("");
        this.jTxtApellido1Tutor.setText("");
        this.jTxtApellido2Tutor.setText("");
    }// Fin

    // Metodo para validar que los campos del formulario sean rellenados
    private boolean validateForm() {
        boolean t = true;

        if (jTxtINSSTutor.getText().isBlank()
                || jTxtNombresTutor.getText().isBlank()
                || jTxtApellido1Tutor.getText().isBlank()) {

            // Si alguno de los campos esta vacio retorna falso
            t = false;
        }

        return t;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscarTutor;
    private javax.swing.JButton jBtnEliminarTutor;
    private javax.swing.JButton jBtnGuardarTutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTblListarTutor;
    private javax.swing.JTextField jTxtApellido1Tutor;
    private javax.swing.JTextField jTxtApellido2Tutor;
    private javax.swing.JFormattedTextField jTxtINSSTutor;
    private javax.swing.JTextField jTxtNombresTutor;
    // End of variables declaration//GEN-END:variables
}
