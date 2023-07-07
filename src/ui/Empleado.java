/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ui;

import controlador.CtrlEmpleado;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell Latitude 7490
 */
public class Empleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Empleado
     */
    public Empleado() {
        initComponents();
        jTblListarEmpleado.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTblListarEmpleado.getTableHeader().setOpaque(false);
        jTblListarEmpleado.getTableHeader().setBackground(Color.black);
        jTblListarEmpleado.getTableHeader().setForeground(Color.BLACK);
        jTblListarEmpleado.setRowHeight(30);
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
        jTxtApellido2Emp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtApellido1Emp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtNombresEmp = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBtnBuscarEmp = new javax.swing.JButton();
        jBtnGuardarEmp = new javax.swing.JButton();
        jBtnEliminarEmp = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jTxtINSSEmp = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblListarEmpleado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(995, 503));
        setPreferredSize(new java.awt.Dimension(995, 503));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombres");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 70, -1));

        jTxtApellido2Emp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtApellido2Emp.setBorder(null);
        jTxtApellido2Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApellido2EmpActionPerformed(evt);
            }
        });
        jTxtApellido2Emp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtApellido2EmpKeyTyped(evt);
            }
        });
        jPanel2.add(jTxtApellido2Emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 150, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Primer Apellido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 20));

        jTxtApellido1Emp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtApellido1Emp.setBorder(null);
        jTxtApellido1Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApellido1EmpActionPerformed(evt);
            }
        });
        jTxtApellido1Emp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtApellido1EmpKeyTyped(evt);
            }
        });
        jPanel2.add(jTxtApellido1Emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 150, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Segundo Apellido");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Codigo INSS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jTxtNombresEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtNombresEmp.setBorder(null);
        jTxtNombresEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombresEmpActionPerformed(evt);
            }
        });
        jTxtNombresEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNombresEmpKeyTyped(evt);
            }
        });
        jPanel2.add(jTxtNombresEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 150, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jBtnBuscarEmp.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarEmp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnBuscarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        jBtnBuscarEmp.setText("Buscar");
        jBtnBuscarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarEmpActionPerformed(evt);
            }
        });

        jBtnGuardarEmp.setBackground(new java.awt.Color(204, 204, 204));
        jBtnGuardarEmp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnGuardarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_icon-icons.com_73702.png"))); // NOI18N
        jBtnGuardarEmp.setText("Guardar");
        jBtnGuardarEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnGuardarEmp.setMaximumSize(new java.awt.Dimension(107, 30));
        jBtnGuardarEmp.setMinimumSize(new java.awt.Dimension(107, 30));
        jBtnGuardarEmp.setPreferredSize(new java.awt.Dimension(107, 30));
        jBtnGuardarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarEmpActionPerformed(evt);
            }
        });

        jBtnEliminarEmp.setBackground(new java.awt.Color(204, 204, 204));
        jBtnEliminarEmp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnEliminarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        jBtnEliminarEmp.setText("Anular");
        jBtnEliminarEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnEliminarEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnEliminarEmpMouseExited(evt);
            }
        });
        jBtnEliminarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jBtnGuardarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnBuscarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jBtnEliminarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEliminarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGuardarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 410, 70));

        jLabel9.setFont(new java.awt.Font("Centaur", 3, 14)); // NOI18N
        jLabel9.setText("¡A la libertad por la Universidad!");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 190, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo Departamento.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 150, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 150, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 150, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 150, -1));

        jTxtINSSEmp.setBorder(null);
        try {
            jTxtINSSEmp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtINSSEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtINSSEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtINSSEmpActionPerformed(evt);
            }
        });
        jPanel2.add(jTxtINSSEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 150, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Datos Empleado");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 17, 120, 20));

        jTblListarEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        jTblListarEmpleado.setFocusable(false);
        jTblListarEmpleado.setGridColor(new java.awt.Color(0, 0, 0));
        jTblListarEmpleado.setRowHeight(25);
        jTblListarEmpleado.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jTblListarEmpleado.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTblListarEmpleado);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 450, 360));

        jPanel1.setBackground(new java.awt.Color(245, 211, 17));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(225, 24));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Listado de empleados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel3)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 450, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtApellido2EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApellido2EmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApellido2EmpActionPerformed

    private void jTxtApellido2EmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtApellido2EmpKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtApellido2EmpKeyTyped

    private void jTxtApellido1EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApellido1EmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApellido1EmpActionPerformed

    private void jTxtApellido1EmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtApellido1EmpKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtApellido1EmpKeyTyped

    private void jTxtNombresEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombresEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombresEmpActionPerformed

    private void jTxtNombresEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombresEmpKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtNombresEmpKeyTyped

    private void jBtnBuscarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarEmpActionPerformed
        try {
            // Validamos que el campo INSS sea rellenado
            // Ya que es el insumo para realizar la busqueda de un Empleado en la Base de datos
            if (jTxtINSSEmp.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Realizar el filtrado de un registro indicado por inns:            
                String value = this.jTxtINSSEmp.getText();
                negocio.emp em = CtrlEmpleado.leerRegistro(value);
                //Si se obtuvo el registro, se muestra
                if (em != null) {
                    this.jTxtNombresEmp.setText(em.getNombre());
                    this.jTxtApellido1Emp.setText(em.getP_apellido());
                    this.jTxtApellido2Emp.setText(em.getS_apellido());
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
    }//GEN-LAST:event_jBtnBuscarEmpActionPerformed

    private void jBtnGuardarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarEmpActionPerformed
        try {
            if (!validateForm()) {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Preparar los datos que se guardaran del Empleado
                int ans = CtrlEmpleado.insertar_empleado(
                        this.jTxtINSSEmp.getText(),
                        this.jTxtNombresEmp.getText().toUpperCase(),
                        this.jTxtApellido1Emp.getText().toUpperCase(),
                        this.jTxtApellido2Emp.getText().toUpperCase());

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
        }//Fin 
    }//GEN-LAST:event_jBtnGuardarEmpActionPerformed

    private void jBtnEliminarEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEliminarEmpMouseEntered
        jBtnEliminarEmp.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_jBtnEliminarEmpMouseEntered

    private void jBtnEliminarEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEliminarEmpMouseExited
        jBtnEliminarEmp.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jBtnEliminarEmpMouseExited

    private void jBtnEliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarEmpActionPerformed
        int opc; //Determina el boton seleccionado en el mensaje de confirmación        
        try {
            if (jTxtINSSEmp.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese el INSS "
                        + "del registro que desea anular", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                negocio.emp em = CtrlEmpleado.leerRegistro(this.jTxtINSSEmp.getText());

                if (em != null) {
                    opc = JOptionPane.showConfirmDialog(this, "Esta intentando eliminar"
                            + " un registro que contiene más \n"
                            + " vinculaciones con otros datos"
                            + " ¿Esta seguro de continuar?",
                            "Eliminar", JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                    if (opc == JOptionPane.YES_OPTION) {
                        // Enviamos el INSS al controlador para realizar la anulacion del registro
                        CtrlEmpleado.eliminar(this.jTxtINSSEmp.getText());

                        // Mostramos un mensaje que confirma la anulacion del registro
                        JOptionPane.showMessageDialog(this, "El registro del Empleado: "
                                + this.jTxtINSSEmp.getText()
                                + "\n ha sido removido", "Eliminar",
                                JOptionPane.INFORMATION_MESSAGE);

                        // Limpiamos los campos del formulario
                        this.clearForm();
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "El registro que desea eliminar no existe "
                            + "\n Numero de INSS: "
                            + this.jTxtINSSEmp.getText()
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
    }//GEN-LAST:event_jBtnEliminarEmpActionPerformed

    private void jTxtINSSEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtINSSEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtINSSEmpActionPerformed

    // Metodo para limpiar los campos del formulario
    private void clearForm() {
        this.jTxtINSSEmp.setText("");
        this.jTxtNombresEmp.setText("");
        this.jTxtApellido1Emp.setText("");
        this.jTxtApellido2Emp.setText("");
    }// Fin

    // Metodo para validar que los campos del formulario sean rellenados
    private boolean validateForm() {
        boolean t = true;

        if (jTxtINSSEmp.getText().isBlank()
                || jTxtNombresEmp.getText().isBlank()
                || jTxtApellido1Emp.getText().isBlank()) {

            // Si alguno de los campos esta vacio retorna falso
            t = false;
        }

        return t;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscarEmp;
    private javax.swing.JButton jBtnEliminarEmp;
    private javax.swing.JButton jBtnGuardarEmp;
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
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTblListarEmpleado;
    private javax.swing.JTextField jTxtApellido1Emp;
    private javax.swing.JTextField jTxtApellido2Emp;
    private javax.swing.JFormattedTextField jTxtINSSEmp;
    private javax.swing.JTextField jTxtNombresEmp;
    // End of variables declaration//GEN-END:variables
}
