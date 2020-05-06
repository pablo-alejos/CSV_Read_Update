package caseta.vista;

import control.AdmD;
import control.AdmN;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author pablo.alejos
 */
public class WCaseta extends javax.swing.JFrame {

    int valor;

    public WCaseta() {
        initComponents();
        setLocationRelativeTo(null);
        valor = (int) spnSem2.getValue();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevaNota = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        cmbMes = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        spnDia = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        txtAmpm = new javax.swing.JToggleButton();
        spnMin = new javax.swing.JSpinner();
        spnHora = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cmbCalle3 = new javax.swing.JComboBox<>();
        cmbNum3 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        spnSem2 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAc1 = new javax.swing.JButton();
        btnCnl1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        buscarNota = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        btnConsGN = new javax.swing.JButton();
        cmbCalle4 = new javax.swing.JComboBox<>();
        cmbNum4 = new javax.swing.JComboBox<>();
        btnVolverBN = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        directorio = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        direcConsG = new javax.swing.JButton();
        cmbCalle2 = new javax.swing.JComboBox<>();
        cmbNum2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        config = new javax.swing.JDialog();
        formD = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        cmbNum = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cmbCalle = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        spnSem = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnAcptD = new javax.swing.JButton();
        btnCloseDFrm = new javax.swing.JButton();
        btnNueva = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnDirec = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();

        nuevaNota.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        nuevaNota.setTitle("Nueva nota");
        nuevaNota.setAlwaysOnTop(true);
        nuevaNota.setResizable(false);
        nuevaNota.setSize(new java.awt.Dimension(400, 380));
        nuevaNota.setLocationRelativeTo(null);
        nuevaNota.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                nuevaNotaWindowClosed(evt);
            }
        });
        nuevaNota.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Fecha");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -3, -1, 50));

        jCheckBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox1.setText("Actual");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, -1, -1, 50));

        cmbMes.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel2.add(cmbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, 30));

        cmbYear.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018" }));
        jPanel2.add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 10, 80, 30));

        spnDia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        spnDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanel2.add(spnDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 30));

        nuevaNota.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Hora");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -3, -1, 50));

        jCheckBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox2.setText("Actual");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 5, -1, 40));

        txtAmpm.setText("AM");
        txtAmpm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAmpmMouseClicked(evt);
            }
        });
        jPanel1.add(txtAmpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 80, 30));

        spnMin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        spnMin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel1.add(spnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, 30));

        spnHora.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        spnHora.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel1.add(spnHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 30));

        nuevaNota.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 400, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Nombre");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 60));

        txtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 280, 40));

        nuevaNota.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 87, 400, 60));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("Direccion");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        cmbCalle3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cmbCalle3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Llanos", "Lebrija", "Aldaz", "Fuenclara", "Eril", "Colomera", "Alcudia", "Valmaseda", "Moriana", "Mollina", "Penon", "Rodezno", "Torregrosa", "Albiz" }));
        cmbCalle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalle3ActionPerformed(evt);
            }
        });
        jPanel4.add(cmbCalle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 180, -1));

        cmbNum3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cmbNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNum3ActionPerformed(evt);
            }
        });
        jPanel4.add(cmbNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 80, -1));

        nuevaNota.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, 50));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setText("En la semana");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 160, 50));

        spnSem2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        spnSem2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 52, 1));
        spnSem2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSem2StateChanged(evt);
            }
        });
        spnSem2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnSem2PropertyChange(evt);
            }
        });
        spnSem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spnSem2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spnSem2KeyTyped(evt);
            }
        });
        jPanel5.add(spnSem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 5, 80, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("Total $");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        lblTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotal.setText("0");
        jPanel5.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        nuevaNota.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 400, 50));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAc1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnAc1.setText("Aceptar");
        btnAc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAc1MouseClicked(evt);
            }
        });
        jPanel6.add(btnAc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnCnl1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnCnl1.setText("Cancelar");
        btnCnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCnl1MouseClicked(evt);
            }
        });
        jPanel6.add(btnCnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel1.setText("Folio");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 74, 30, 20));

        lblFolio.setText("00000");
        jPanel6.add(lblFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 74, 110, 20));

        nuevaNota.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 400, 90));

        buscarNota.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        buscarNota.setTitle("Buscar nota");
        buscarNota.setAlwaysOnTop(true);
        buscarNota.setResizable(false);
        buscarNota.setSize(new java.awt.Dimension(1000, 600));
        buscarNota.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                buscarNotaWindowClosed(evt);
            }
        });
        buscarNota.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        btnConsGN.setText("Mas recientes");
        btnConsGN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsGNActionPerformed(evt);
            }
        });
        jPanel7.add(btnConsGN);

        cmbCalle4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbCalle4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Llanos", "Lebrija", "Aldaz", "Fuenclara", "Eril", "Colomera", "Alcudia", "Valmaseda", "Moriana", "Mollina", "Penon", "Rodezno", "Torregrosa", "Albiz" }));
        cmbCalle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalle4ActionPerformed(evt);
            }
        });
        jPanel7.add(cmbCalle4);

        cmbNum4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNum4ActionPerformed(evt);
            }
        });
        jPanel7.add(cmbNum4);

        btnVolverBN.setText("Volver");
        btnVolverBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverBNMouseClicked(evt);
            }
        });
        jPanel7.add(btnVolverBN);

        buscarNota.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel8.add(jScrollPane2);

        buscarNota.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, 550));

        directorio.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        directorio.setTitle("Directorio");
        directorio.setSize(new java.awt.Dimension(1000, 600));
        directorio.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                directorioWindowClosed(evt);
            }
        });
        directorio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));
        jPanel9.setLayout(new java.awt.GridLayout(1, 2));

        direcConsG.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        direcConsG.setText("Todas");
        direcConsG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direcConsGMouseClicked(evt);
            }
        });
        jPanel9.add(direcConsG);

        cmbCalle2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbCalle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Llanos", "Lebrija", "Aldaz", "Fuenclara", "Eril", "Colomera", "Alcudia", "Valmaseda", "Moriana", "Mollina", "Penon", "Rodezno", "Torregrosa", "Albiz" }));
        cmbCalle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalle2ActionPerformed(evt);
            }
        });
        jPanel9.add(cmbCalle2);

        cmbNum2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNum2ActionPerformed(evt);
            }
        });
        jPanel9.add(cmbNum2);

        directorio.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 985, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        directorio.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, 550));

        formD.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        formD.setAlwaysOnTop(true);
        formD.setSize(new java.awt.Dimension(400, 280));
        formD.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formDWindowClosed(evt);
            }
        });
        formD.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Semana actual");
        formD.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 50));

        cmbNum.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        formD.getContentPane().add(cmbNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 100, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setText("Calle");
        formD.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 50));

        cmbCalle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cmbCalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Llanos", "Lebrija", "Aldaz", "Fuenclara", "Eril", "Colomera", "Alcudia", "Valmaseda", "Moriana", "Mollina", "Penon", "Rodezno", "Torregrosa", "Albiz", " " }));
        cmbCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalleActionPerformed(evt);
            }
        });
        formD.getContentPane().add(cmbCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setText("Numero");
        formD.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 50));

        spnSem.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        formD.getContentPane().add(spnSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 80, -1));

        jLabel15.setText("solicitar confirmacion");
        formD.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcptD.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnAcptD.setText("Aceptar");
        btnAcptD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcptDMouseClicked(evt);
            }
        });
        jPanel10.add(btnAcptD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnCloseDFrm.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnCloseDFrm.setText("Cancelar");
        btnCloseDFrm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseDFrmMouseClicked(evt);
            }
        });
        jPanel10.add(btnCloseDFrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        formD.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 400, 90));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caseta Castillejo");
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));

        btnNueva.setBackground(new java.awt.Color(255, 255, 255));
        btnNueva.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-create-document-96.png"))); // NOI18N
        btnNueva.setText("Nueva nota");
        btnNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevaMouseClicked(evt);
            }
        });
        getContentPane().add(btnNueva);

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-view-96.png"))); // NOI18N
        btnBuscar.setText("Buscar nota");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(btnBuscar);

        btnDirec.setBackground(new java.awt.Color(255, 255, 255));
        btnDirec.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDirec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-open-book-96.png"))); // NOI18N
        btnDirec.setText("Directorio");
        btnDirec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDirecMouseClicked(evt);
            }
        });
        getContentPane().add(btnDirec);

        btnConfig.setBackground(new java.awt.Color(255, 255, 255));
        btnConfig.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-administrative-tools-96.png"))); // NOI18N
        btnConfig.setText("Config");
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMouseClicked(evt);
            }
        });
        getContentPane().add(btnConfig);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaMouseClicked
        nuevaNota.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btnNuevaMouseClicked

    private void nuevaNotaWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_nuevaNotaWindowClosed
        this.setEnabled(true);
    }//GEN-LAST:event_nuevaNotaWindowClosed

    private void buscarNotaWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_buscarNotaWindowClosed
        this.setEnabled(true);
    }//GEN-LAST:event_buscarNotaWindowClosed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        buscarNota.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnDirecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDirecMouseClicked
        directorio.setVisible(true);
        this.setEnabled(false);
        AdmD d = new AdmD();
        jTable1.setModel(d.leer());
    }//GEN-LAST:event_btnDirecMouseClicked

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked
        config.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btnConfigMouseClicked

    private void directorioWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_directorioWindowClosed
        this.setEnabled(true);
    }//GEN-LAST:event_directorioWindowClosed

    private void direcConsGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direcConsGMouseClicked
        AdmD d = new AdmD();
        jTable1.setModel(d.leer());
    }//GEN-LAST:event_direcConsGMouseClicked

    private void formDWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formDWindowClosed
        directorio.setEnabled(true);
    }//GEN-LAST:event_formDWindowClosed

    private void btnAcptDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcptDMouseClicked
        AdmD d = new AdmD();
        d.crear(cmbCalle.getItemAt(cmbCalle.getSelectedIndex()), Integer.parseInt(cmbNum.getItemAt(cmbNum.getSelectedIndex())), (int) spnSem.getValue());
        formD.dispose();
    }//GEN-LAST:event_btnAcptDMouseClicked

    private void cmbCalle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalle2ActionPerformed
        cmbNum2.setModel(modelCmb(cmbCalle2.getItemAt(cmbCalle2.getSelectedIndex())));
    }//GEN-LAST:event_cmbCalle2ActionPerformed

    private void btnCloseDFrmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseDFrmMouseClicked
        formD.dispose();
    }//GEN-LAST:event_btnCloseDFrmMouseClicked

    private void cmbCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalleActionPerformed
        cmbNum.setModel(modelCmb(cmbCalle.getItemAt(cmbCalle.getSelectedIndex())));
    }//GEN-LAST:event_cmbCalleActionPerformed

    private void cmbNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNum2ActionPerformed
        AdmD d = new AdmD();
        jTable1.setModel(d.leer(cmbCalle2.getItemAt(cmbCalle2.getSelectedIndex()), cmbNum2.getItemAt(cmbNum2.getSelectedIndex())));
    }//GEN-LAST:event_cmbNum2ActionPerformed

    private void btnCnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCnl1MouseClicked
        nuevaNota.dispose();
    }//GEN-LAST:event_btnCnl1MouseClicked

    private void btnAc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAc1MouseClicked
        AdmN n = new AdmN();
        String fecha = String.valueOf(spnDia.getValue()) + "-" + cmbMes.getItemAt(cmbMes.getSelectedIndex()) + "-" + cmbYear.getItemAt(cmbYear.getSelectedIndex());
        String hora = String.valueOf(spnHora.getValue()) + ":" + String.valueOf(spnMin.getValue()) + " " + txtAmpm.getText();
        String calle = cmbCalle3.getItemAt(cmbCalle3.getSelectedIndex());
        int numero = Integer.parseInt(cmbNum3.getItemAt(cmbNum3.getSelectedIndex()));
        String nombre = txtNombre.getText();
        int monto = Integer.parseInt(lblTotal.getText());
        Integer semana = (Integer) spnSem2.getValue();
        n.tiket(fecha, hora, calle, numero, nombre, "pago semanas", monto, semana);
        nuevaNota.dispose();
    }//GEN-LAST:event_btnAc1MouseClicked

    private void txtAmpmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAmpmMouseClicked
        if (txtAmpm.getText().equals("AM")) {
            txtAmpm.setText("PM");
        } else {
            txtAmpm.setText("AM");
        }
    }//GEN-LAST:event_txtAmpmMouseClicked

    private void cmbCalle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalle3ActionPerformed
        cmbNum3.setModel(modelCmb(cmbCalle3.getItemAt(cmbCalle3.getSelectedIndex())));
    }//GEN-LAST:event_cmbCalle3ActionPerformed

    private void cmbNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNum3ActionPerformed
        spnSem2.setValue(AdmD.buscar(cmbCalle3.getItemAt(cmbCalle3.getSelectedIndex()), cmbNum3.getItemAt(cmbNum3.getSelectedIndex())));
        SpinnerNumberModel model = new SpinnerNumberModel();
        int v = (int) spnSem2.getValue();
        model.setMaximum(52);
        model.setMinimum(v);
        model.setStepSize(1);
        spnSem2.setModel(model);
        spnSem2.setValue(AdmD.buscar(cmbCalle3.getItemAt(cmbCalle3.getSelectedIndex()), cmbNum3.getItemAt(cmbNum3.getSelectedIndex())));
    }//GEN-LAST:event_cmbNum3ActionPerformed

    private void spnSem2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnSem2PropertyChange
        int act = (int) spnSem2.getValue();
        int min = AdmD.buscar(cmbCalle3.getItemAt(cmbCalle3.getSelectedIndex()), cmbNum3.getItemAt(cmbNum3.getSelectedIndex()));
        lblTotal.setText(String.valueOf((act - min) * 40));
    }//GEN-LAST:event_spnSem2PropertyChange

    private void spnSem2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnSem2KeyPressed
        int act = (int) spnSem2.getValue();
        int min = AdmD.buscar(cmbCalle3.getItemAt(cmbCalle3.getSelectedIndex()), cmbNum3.getItemAt(cmbNum3.getSelectedIndex()));
        lblTotal.setText(String.valueOf((act - min) * 40));
    }//GEN-LAST:event_spnSem2KeyPressed

    private void spnSem2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSem2StateChanged
        int act = (int) spnSem2.getValue();
        int min = AdmD.buscar(cmbCalle3.getItemAt(cmbCalle3.getSelectedIndex()), cmbNum3.getItemAt(cmbNum3.getSelectedIndex()));
        lblTotal.setText(String.valueOf((act - min) * 40));
    }//GEN-LAST:event_spnSem2StateChanged

    private void spnSem2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnSem2KeyTyped
        int act = (int) spnSem2.getValue();
        int min = AdmD.buscar(cmbCalle3.getItemAt(cmbCalle3.getSelectedIndex()), cmbNum3.getItemAt(cmbNum3.getSelectedIndex()));
        lblTotal.setText(String.valueOf((act - min) * 40));
    }//GEN-LAST:event_spnSem2KeyTyped

    private void btnVolverBNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverBNMouseClicked
        buscarNota.dispose();
    }//GEN-LAST:event_btnVolverBNMouseClicked

    private void btnConsGNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsGNActionPerformed
        jTable2.setModel(AdmN.leer());
    }//GEN-LAST:event_btnConsGNActionPerformed

    private void cmbCalle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalle4ActionPerformed
        cmbNum4.setModel(modelCmb(cmbCalle4.getItemAt(cmbCalle4.getSelectedIndex())));
    }//GEN-LAST:event_cmbCalle4ActionPerformed

    private void cmbNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNum4ActionPerformed
        jTable2.setModel(AdmN.leer(cmbCalle4.getItemAt(cmbCalle4.getSelectedIndex()), cmbNum4.getItemAt(cmbNum4.getSelectedIndex())));
    }//GEN-LAST:event_cmbNum4ActionPerformed

    private DefaultComboBoxModel modelCmb(String calle) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        if (calle.equals("Llanos")) {
            model.insertElementAt("1027", 0);
            model.insertElementAt("1028", 1);
            model.insertElementAt("1029", 2);
            model.insertElementAt("1030", 3);
        }
        if (calle.equals("Lebrija")) {
            model.insertElementAt("1031", 0);
            model.insertElementAt("1032", 1);
            model.insertElementAt("1033", 2);
            model.insertElementAt("1034", 3);
        }
        if (calle.equals("Aldaz")) {
            model.insertElementAt("1035", 0);
            model.insertElementAt("1036", 1);
            model.insertElementAt("1037", 2);
            model.insertElementAt("1038", 3);
        }
        if (calle.equals("Fuenclara")) {
            model.insertElementAt("1039", 0);
            model.insertElementAt("1040", 1);
            model.insertElementAt("1041", 2);
            model.insertElementAt("1042", 3);
        }
        if (calle.equals("Eril")) {
            model.insertElementAt("1043", 0);
            model.insertElementAt("1044", 1);
            model.insertElementAt("1045", 2);
            model.insertElementAt("1046", 3);
        }
        if (calle.equals("Colomera")) {
            model.insertElementAt("1043", 0);
            model.insertElementAt("1048", 1);
            model.insertElementAt("1049", 2);
            model.insertElementAt("1050", 3);
            model.insertElementAt("1051", 4);
        }
        if (calle.equals("Alcudia")) {
            model.insertElementAt("1043", 0);
            model.insertElementAt("1052", 1);
            model.insertElementAt("1053", 2);
            model.insertElementAt("1054", 3);
            model.insertElementAt("1055", 4);
        }
        if (calle.equals("Valmaseda")) {
            model.insertElementAt("1043", 0);
            model.insertElementAt("1056", 1);
            model.insertElementAt("1057", 2);
            model.insertElementAt("1058", 3);
            model.insertElementAt("1059", 4);
        }
        if (calle.equals("Moriana")) {
            model.insertElementAt("1043", 0);
            model.insertElementAt("1060", 1);
            model.insertElementAt("1061", 2);
            model.insertElementAt("1062", 3);
            model.insertElementAt("1063", 4);
        }
        if (calle.equals("Mollina")) {
            model.insertElementAt("1043", 0);
            model.insertElementAt("1064", 1);
            model.insertElementAt("1065", 2);
            model.insertElementAt("1066", 3);
            model.insertElementAt("1067", 4);
        }
        if (calle.equals("Penon")) {
            model.insertElementAt("1043", 0);
            model.insertElementAt("1027", 1);
            model.insertElementAt("1028", 2);
            model.insertElementAt("1029", 3);
            model.insertElementAt("1030", 4);
        }
        if (calle.equals("Rodezno")) {
            model.insertElementAt("1043", 0);
            model.insertElementAt("1027", 1);
            model.insertElementAt("1028", 2);
            model.insertElementAt("1029", 3);
            model.insertElementAt("1030", 4);
        }
        if (calle.equals("Torregrosa")) {
            model.insertElementAt("1043", 0);
            model.insertElementAt("1027", 1);
            model.insertElementAt("1028", 2);
            model.insertElementAt("1029", 3);
            model.insertElementAt("1030", 4);
        }
        if (calle.equals("Albiz")) {
            model.insertElementAt("1043", 0);
            model.insertElementAt("1027", 1);
            model.insertElementAt("1028", 2);
            model.insertElementAt("1029", 3);
            model.insertElementAt("1030", 4);
        }
        return model;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAc1;
    private javax.swing.JButton btnAcptD;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCloseDFrm;
    private javax.swing.JButton btnCnl1;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnConsGN;
    private javax.swing.JButton btnDirec;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnVolverBN;
    private javax.swing.JDialog buscarNota;
    private javax.swing.JComboBox<String> cmbCalle;
    private javax.swing.JComboBox<String> cmbCalle2;
    private javax.swing.JComboBox<String> cmbCalle3;
    private javax.swing.JComboBox<String> cmbCalle4;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox<String> cmbNum;
    private javax.swing.JComboBox<String> cmbNum2;
    private javax.swing.JComboBox<String> cmbNum3;
    private javax.swing.JComboBox<String> cmbNum4;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JDialog config;
    private javax.swing.JButton direcConsG;
    private javax.swing.JDialog directorio;
    private javax.swing.JDialog formD;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JDialog nuevaNota;
    private javax.swing.JSpinner spnDia;
    private javax.swing.JSpinner spnHora;
    private javax.swing.JSpinner spnMin;
    private javax.swing.JSpinner spnSem;
    private javax.swing.JSpinner spnSem2;
    private javax.swing.JToggleButton txtAmpm;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
