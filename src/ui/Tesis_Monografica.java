/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ui;

/**
 *
 * @author erlin
 */
public class Tesis_Monografica extends javax.swing.JInternalFrame {

    /**
     * Creates new form Tesis
     */
    public Tesis_Monografica() {
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
        jBtnBorrarGra = new javax.swing.JButton();
        jBtnGuardarGra = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jTxtEva2Gra = new javax.swing.JTextField();
        jTxtEva1Gra = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTxtEva3Gra = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jBtnBuscarEvaGra3 = new javax.swing.JButton();
        jBtnBuscarEvaGra1 = new javax.swing.JButton();
        jBtnBuscarEvaGra2 = new javax.swing.JButton();
        jCheckPresidenteGra = new javax.swing.JCheckBox();
        jCheckSecretarioGra = new javax.swing.JCheckBox();
        jCheckVocalGra = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCmbModalidadGra = new javax.swing.JComboBox<>();
        jCmbCarreraGra = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCmbTutorPGra = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jCmbAsesorGra1 = new javax.swing.JComboBox<>();
        jCmbSemestreGra = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtTemaGra = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTxtResumenGra = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jBtnExaminarGra = new javax.swing.JButton();
        jCmbDiaGra = new javax.swing.JComboBox<>();
        jCmbMesGra = new javax.swing.JComboBox<>();
        jCmbAnioGra = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jTxtAutor2Gra1 = new javax.swing.JTextField();
        jTxtAutor1Gra1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jTxtAutor3Gra1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jBtnBuscarAutGrad3 = new javax.swing.JButton();
        jBtnBuscarAutGra1 = new javax.swing.JButton();
        jBtnBuscarAutGra2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(1265, 494));
        setPreferredSize(new java.awt.Dimension(1265, 494));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jBtnBorrarGra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnBorrarGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        jBtnBorrarGra.setText("Anular");
        jBtnBorrarGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBorrarGraActionPerformed(evt);
            }
        });

        jBtnGuardarGra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnGuardarGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_icon-icons.com_73702.png"))); // NOI18N
        jBtnGuardarGra.setText("Guardar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnGuardarGra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnBorrarGra)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardarGra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBorrarGra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 260, 60));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Evaluadores"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 50, 220, -1));

        jTxtEva2Gra.setBorder(null);
        jTxtEva2Gra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEva2GraActionPerformed(evt);
            }
        });
        jPanel5.add(jTxtEva2Gra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 220, 20));

        jTxtEva1Gra.setBorder(null);
        jTxtEva1Gra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEva1GraActionPerformed(evt);
            }
        });
        jPanel5.add(jTxtEva1Gra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 20));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 84, 220, -1));

        jTxtEva3Gra.setBorder(null);
        jTxtEva3Gra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEva3GraActionPerformed(evt);
            }
        });
        jPanel5.add(jTxtEva3Gra, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 101, 220, 19));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 120, 220, -1));

        jBtnBuscarEvaGra3.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarEvaGra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarEvaGra3.setText("Buscar");
        jBtnBuscarEvaGra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarEvaGra3ActionPerformed(evt);
            }
        });
        jPanel5.add(jBtnBuscarEvaGra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, -1));

        jBtnBuscarEvaGra1.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarEvaGra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarEvaGra1.setText("Buscar");
        jBtnBuscarEvaGra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarEvaGra1ActionPerformed(evt);
            }
        });
        jPanel5.add(jBtnBuscarEvaGra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 100, -1));

        jBtnBuscarEvaGra2.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarEvaGra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarEvaGra2.setText("Buscar");
        jBtnBuscarEvaGra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarEvaGra2ActionPerformed(evt);
            }
        });
        jPanel5.add(jBtnBuscarEvaGra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 100, -1));

        jCheckPresidenteGra.setText("Presidente");
        jPanel5.add(jCheckPresidenteGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jCheckSecretarioGra.setText("Secretario");
        jPanel5.add(jCheckSecretarioGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jCheckVocalGra.setText("Vocal");
        jPanel5.add(jCheckVocalGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 450, 150));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Modalidad");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 70, 22));

        jCmbModalidadGra.setBackground(new java.awt.Color(204, 204, 204));
        jCmbModalidadGra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Seminario", "Tesis Monografica", " ", " ", " " }));
        jCmbModalidadGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbModalidadGraActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbModalidadGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 140, 32));

        jCmbCarreraGra.setBackground(new java.awt.Color(204, 204, 204));
        jCmbCarreraGra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ing en sistemas de informacion", " ", " " }));
        jCmbCarreraGra.setSelectedIndex(1);
        jCmbCarreraGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbCarreraGraActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbCarreraGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 210, 32));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Carrera");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 70, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Tutor");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 15, 40, 25));

        jCmbTutorPGra.setBackground(new java.awt.Color(204, 204, 204));
        jCmbTutorPGra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", " " }));
        jCmbTutorPGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbTutorPGraActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbTutorPGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 240, 32));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Semestre");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1072, 15, 70, 25));

        jCmbAsesorGra1.setBackground(new java.awt.Color(204, 204, 204));
        jCmbAsesorGra1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", " " }));
        jCmbAsesorGra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbAsesorGra1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbAsesorGra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 200, 32));

        jCmbSemestreGra.setBackground(new java.awt.Color(204, 204, 204));
        jCmbSemestreGra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ", "1", "2", " " }));
        jCmbSemestreGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbSemestreGraActionPerformed(evt);
            }
        });
        jPanel6.add(jCmbSemestreGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 100, 32));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Asesor");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 15, 50, 25));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1250, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Tema");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 45, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Resumen");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTxtTemaGra.setBorder(null);
        jTxtTemaGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTemaGraActionPerformed(evt);
            }
        });
        jPanel7.add(jTxtTemaGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 22, 266, 19));
        jPanel7.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 266, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Fecha");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTxtResumenGra.setBorder(null);
        jTxtResumenGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtResumenGraActionPerformed(evt);
            }
        });
        jPanel7.add(jTxtResumenGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 102, 266, 19));
        jPanel7.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 266, -1));

        jBtnExaminarGra.setBackground(new java.awt.Color(204, 204, 204));
        jBtnExaminarGra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder.png"))); // NOI18N
        jBtnExaminarGra.setText("Examinar");
        jPanel7.add(jBtnExaminarGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jCmbDiaGra.setBackground(new java.awt.Color(204, 204, 204));
        jCmbDiaGra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        jPanel7.add(jCmbDiaGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jCmbMesGra.setBackground(new java.awt.Color(204, 204, 204));
        jCmbMesGra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes" }));
        jCmbMesGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbMesGraActionPerformed(evt);
            }
        });
        jPanel7.add(jCmbMesGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jCmbAnioGra.setBackground(new java.awt.Color(204, 204, 204));
        jCmbAnioGra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año" }));
        jPanel7.add(jCmbAnioGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 360, 180));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo Departamento.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, 50));

        jLabel13.setFont(new java.awt.Font("Centaur", 3, 14)); // NOI18N
        jLabel13.setText("¡A la libertad por la Universidad!");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 420, 190, 20));

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Registro tesis monográfica");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1320, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Autores"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 50, 266, -1));

        jTxtAutor2Gra1.setBorder(null);
        jTxtAutor2Gra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAutor2Gra1ActionPerformed(evt);
            }
        });
        jPanel8.add(jTxtAutor2Gra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 266, 20));

        jTxtAutor1Gra1.setBorder(null);
        jTxtAutor1Gra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAutor1Gra1ActionPerformed(evt);
            }
        });
        jPanel8.add(jTxtAutor1Gra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 266, 20));
        jPanel8.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 84, 266, -1));

        jTxtAutor3Gra1.setBorder(null);
        jTxtAutor3Gra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAutor3Gra1ActionPerformed(evt);
            }
        });
        jPanel8.add(jTxtAutor3Gra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 102, 266, 19));
        jPanel8.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 120, 266, -1));

        jBtnBuscarAutGrad3.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarAutGrad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarAutGrad3.setText("Buscar");
        jBtnBuscarAutGrad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarAutGrad3ActionPerformed(evt);
            }
        });
        jPanel8.add(jBtnBuscarAutGrad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 107, -1));

        jBtnBuscarAutGra1.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarAutGra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarAutGra1.setText("Buscar");
        jBtnBuscarAutGra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarAutGra1ActionPerformed(evt);
            }
        });
        jPanel8.add(jBtnBuscarAutGra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 107, -1));

        jBtnBuscarAutGra2.setBackground(new java.awt.Color(204, 204, 204));
        jBtnBuscarAutGra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/a-la-vista.png"))); // NOI18N
        jBtnBuscarAutGra2.setText("Buscar");
        jBtnBuscarAutGra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarAutGra2ActionPerformed(evt);
            }
        });
        jPanel8.add(jBtnBuscarAutGra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 107, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 410, 154));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1260, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBorrarGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBorrarGraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBorrarGraActionPerformed

    private void jTxtEva2GraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEva2GraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEva2GraActionPerformed

    private void jTxtEva1GraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEva1GraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEva1GraActionPerformed

    private void jTxtEva3GraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEva3GraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEva3GraActionPerformed

    private void jBtnBuscarEvaGra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarEvaGra3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarEvaGra3ActionPerformed

    private void jBtnBuscarEvaGra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarEvaGra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarEvaGra1ActionPerformed

    private void jBtnBuscarEvaGra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarEvaGra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarEvaGra2ActionPerformed

    private void jCmbModalidadGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbModalidadGraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbModalidadGraActionPerformed

    private void jCmbCarreraGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbCarreraGraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbCarreraGraActionPerformed

    private void jCmbTutorPGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbTutorPGraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbTutorPGraActionPerformed

    private void jCmbSemestreGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbSemestreGraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbSemestreGraActionPerformed

    private void jTxtTemaGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTemaGraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTemaGraActionPerformed

    private void jTxtResumenGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtResumenGraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtResumenGraActionPerformed

    private void jCmbMesGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbMesGraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbMesGraActionPerformed

    private void jTxtAutor2Gra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAutor2Gra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAutor2Gra1ActionPerformed

    private void jTxtAutor1Gra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAutor1Gra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAutor1Gra1ActionPerformed

    private void jTxtAutor3Gra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAutor3Gra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAutor3Gra1ActionPerformed

    private void jBtnBuscarAutGrad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarAutGrad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarAutGrad3ActionPerformed

    private void jBtnBuscarAutGra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarAutGra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarAutGra1ActionPerformed

    private void jBtnBuscarAutGra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarAutGra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarAutGra2ActionPerformed

    private void jCmbAsesorGra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbAsesorGra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbAsesorGra1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBorrarGra;
    private javax.swing.JButton jBtnBuscarAutGra1;
    private javax.swing.JButton jBtnBuscarAutGra2;
    private javax.swing.JButton jBtnBuscarAutGrad3;
    private javax.swing.JButton jBtnBuscarEvaGra1;
    private javax.swing.JButton jBtnBuscarEvaGra2;
    private javax.swing.JButton jBtnBuscarEvaGra3;
    private javax.swing.JButton jBtnExaminarGra;
    private javax.swing.JButton jBtnGuardarGra;
    private javax.swing.JCheckBox jCheckPresidenteGra;
    private javax.swing.JCheckBox jCheckSecretarioGra;
    private javax.swing.JCheckBox jCheckVocalGra;
    private javax.swing.JComboBox<String> jCmbAnioGra;
    private javax.swing.JComboBox<String> jCmbAsesorGra1;
    private javax.swing.JComboBox<String> jCmbCarreraGra;
    private javax.swing.JComboBox<String> jCmbDiaGra;
    private javax.swing.JComboBox<String> jCmbMesGra;
    private javax.swing.JComboBox<String> jCmbModalidadGra;
    private javax.swing.JComboBox<String> jCmbSemestreGra;
    private javax.swing.JComboBox<String> jCmbTutorPGra;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTxtAutor1Gra1;
    private javax.swing.JTextField jTxtAutor2Gra1;
    private javax.swing.JTextField jTxtAutor3Gra1;
    private javax.swing.JTextField jTxtEva1Gra;
    private javax.swing.JTextField jTxtEva2Gra;
    private javax.swing.JTextField jTxtEva3Gra;
    private javax.swing.JTextField jTxtResumenGra;
    private javax.swing.JTextField jTxtTemaGra;
    // End of variables declaration//GEN-END:variables
}
