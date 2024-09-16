package foodi;
import static foodi.Sign_In.userName;
import java.awt.Component;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class MenuandCart extends javax.swing.JFrame {


    public MenuandCart() {
        
        initComponents();
        addTableHeader();
        getTotal();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logoLb = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        upChB = new javax.swing.JCheckBox();
        pepsiChB = new javax.swing.JCheckBox();
        mirindaChB = new javax.swing.JCheckBox();
        upLbl = new javax.swing.JLabel();
        mirindaLbl = new javax.swing.JLabel();
        pepsiLbl = new javax.swing.JLabel();
        upCombo = new javax.swing.JComboBox<>();
        pepsiCombo = new javax.swing.JComboBox<>();
        mirindaCombo = new javax.swing.JComboBox<>();
        upAdd = new javax.swing.JButton();
        pepsiAdd = new javax.swing.JButton();
        mirindaAdd = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        friesChB = new javax.swing.JCheckBox();
        nuggChB = new javax.swing.JCheckBox();
        potatoChB = new javax.swing.JCheckBox();
        potatoLbl = new javax.swing.JLabel();
        nugLbl = new javax.swing.JLabel();
        friesCombo = new javax.swing.JComboBox<>();
        nuggCombo = new javax.swing.JComboBox<>();
        potatoCombo = new javax.swing.JComboBox<>();
        potatoAdd = new javax.swing.JButton();
        NuggetsAdd = new javax.swing.JButton();
        FriesAdd = new javax.swing.JButton();
        friesLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dbbLbl = new javax.swing.JLabel();
        bbLbl = new javax.swing.JLabel();
        ChickBurgerLbl = new javax.swing.JLabel();
        ChickenChB = new javax.swing.JCheckBox();
        dbbChB = new javax.swing.JCheckBox();
        dbbCombo = new javax.swing.JComboBox<>();
        DubleBeefADD = new javax.swing.JButton();
        bbChB = new javax.swing.JCheckBox();
        bbCombo = new javax.swing.JComboBox<>();
        BeefAdd = new javax.swing.JButton();
        ChieckenAdd = new javax.swing.JButton();
        ChiBuCombo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        OrderBt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CancelBt = new javax.swing.JButton();
        paymentMethod = new javax.swing.JLabel();
        CashBt = new javax.swing.JRadioButton();
        CreditBt = new javax.swing.JRadioButton();
        address = new javax.swing.JLabel();
        locations = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 750));

        jPanel6.setBackground(new java.awt.Color(229, 229, 255));

        jPanel1.setBackground(new java.awt.Color(229, 229, 255));

        logoLb.setBackground(new java.awt.Color(229, 229, 255));

        jPanel3.setBackground(new java.awt.Color(229, 229, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1204, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(229, 229, 255));

        upChB.setText("7 UP");

        pepsiChB.setText("Pepsi ");

        mirindaChB.setText("Orange Mirinda");

        upLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        upLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        upLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodi/7UP.png"))); // NOI18N
        upLbl.setText("8");

        mirindaLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        mirindaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mirindaLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodi/mirinda.png"))); // NOI18N
        mirindaLbl.setText("8");
        mirindaLbl.setToolTipText("");

        pepsiLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        pepsiLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodi/pepsi.png"))); // NOI18N
        pepsiLbl.setText("7");

        upCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "3", " " }));

        pepsiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        mirindaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        upAdd.setBackground(new java.awt.Color(237, 79, 74));
        upAdd.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        upAdd.setText("Add");
        upAdd.setBorder(null);
        upAdd.setPreferredSize(new java.awt.Dimension(30, 20));
        upAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upAddActionPerformed(evt);
            }
        });

        pepsiAdd.setBackground(new java.awt.Color(237, 79, 74));
        pepsiAdd.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        pepsiAdd.setText("Add");
        pepsiAdd.setBorder(null);
        pepsiAdd.setPreferredSize(new java.awt.Dimension(30, 20));
        pepsiAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiAddActionPerformed(evt);
            }
        });

        mirindaAdd.setBackground(new java.awt.Color(237, 79, 74));
        mirindaAdd.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        mirindaAdd.setText("Add");
        mirindaAdd.setBorder(null);
        mirindaAdd.setPreferredSize(new java.awt.Dimension(30, 20));
        mirindaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirindaAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(upCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)
                                .addComponent(pepsiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mirindaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(upLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(upChB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(pepsiLbl))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(pepsiChB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mirindaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mirindaChB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(upAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259)
                        .addComponent(pepsiAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mirindaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pepsiLbl)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(upLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(upChB)
                            .addComponent(pepsiChB)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(mirindaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mirindaChB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pepsiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mirindaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pepsiAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mirindaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(upCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(229, 229, 255));

        friesChB.setText("French Fries");

        nuggChB.setText("Chicken Nuggets");

        potatoChB.setText("Potato Wedges");

        potatoLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        potatoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        potatoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodi/SeekPng.com_potatos-png_4273573.png"))); // NOI18N
        potatoLbl.setText("10");
        potatoLbl.setToolTipText("");

        nugLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        nugLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodi/kindpng_458830.png"))); // NOI18N
        nugLbl.setText("12");

        friesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "3", " " }));

        nuggCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        potatoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        potatoAdd.setBackground(new java.awt.Color(237, 79, 74));
        potatoAdd.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        potatoAdd.setText("Add");
        potatoAdd.setBorder(null);
        potatoAdd.setPreferredSize(new java.awt.Dimension(30, 20));
        potatoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potatoAddActionPerformed(evt);
            }
        });

        NuggetsAdd.setBackground(new java.awt.Color(237, 79, 74));
        NuggetsAdd.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        NuggetsAdd.setText("Add");
        NuggetsAdd.setBorder(null);
        NuggetsAdd.setPreferredSize(new java.awt.Dimension(30, 20));
        NuggetsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuggetsAddActionPerformed(evt);
            }
        });

        FriesAdd.setBackground(new java.awt.Color(237, 79, 74));
        FriesAdd.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        FriesAdd.setText("Add");
        FriesAdd.setBorder(null);
        FriesAdd.setPreferredSize(new java.awt.Dimension(30, 20));
        FriesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FriesAddActionPerformed(evt);
            }
        });

        friesLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        friesLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        friesLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodi/side1.png"))); // NOI18N
        friesLbl.setText("10");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(FriesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296)
                        .addComponent(NuggetsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)
                        .addComponent(potatoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(friesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(friesChB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(165, 165, 165)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(nuggCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(potatoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(nuggChB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146)
                                .addComponent(potatoChB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(friesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(nugLbl)
                        .addGap(103, 103, 103)
                        .addComponent(potatoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(potatoLbl)
                        .addComponent(nugLbl))
                    .addComponent(friesLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(friesChB)
                    .addComponent(nuggChB)
                    .addComponent(potatoChB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(friesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuggCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potatoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FriesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuggetsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potatoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodi/home (1).png"))); // NOI18N
        jButton1.setToolTipText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dbbLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dbbLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dbbLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodi/Burger1.png"))); // NOI18N
        dbbLbl.setText("15");

        bbLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        bbLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodi/Burger2.png"))); // NOI18N
        bbLbl.setText("10");

        ChickBurgerLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        ChickBurgerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChickBurgerLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodi/Burger3.png"))); // NOI18N
        ChickBurgerLbl.setText("12");

        ChickenChB.setText("Chicken Burger");

        dbbChB.setText("Double Beef Burger");

        dbbCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "3", " " }));

        DubleBeefADD.setBackground(new java.awt.Color(237, 79, 74));
        DubleBeefADD.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        DubleBeefADD.setText("Add");
        DubleBeefADD.setBorder(null);
        DubleBeefADD.setPreferredSize(new java.awt.Dimension(30, 20));
        DubleBeefADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DubleBeefADDActionPerformed(evt);
            }
        });

        bbChB.setText("Beef Burger");

        bbCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        BeefAdd.setBackground(new java.awt.Color(237, 79, 74));
        BeefAdd.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        BeefAdd.setText("Add");
        BeefAdd.setBorder(null);
        BeefAdd.setPreferredSize(new java.awt.Dimension(30, 20));
        BeefAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeefAddActionPerformed(evt);
            }
        });

        ChieckenAdd.setBackground(new java.awt.Color(237, 79, 74));
        ChieckenAdd.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        ChieckenAdd.setText("Add");
        ChieckenAdd.setBorder(null);
        ChieckenAdd.setPreferredSize(new java.awt.Dimension(30, 20));
        ChieckenAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChieckenAddActionPerformed(evt);
            }
        });

        ChiBuCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        jPanel2.setBackground(new java.awt.Color(229, 229, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTable1.setFont(new java.awt.Font("Raanana", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        OrderBt.setBackground(new java.awt.Color(237, 79, 74));
        OrderBt.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        OrderBt.setText("Order");
        OrderBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderBtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Raanana", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cart");

        CancelBt.setBackground(new java.awt.Color(237, 79, 74));
        CancelBt.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        CancelBt.setText("Cancel");
        CancelBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtActionPerformed(evt);
            }
        });

        paymentMethod.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        paymentMethod.setText("Payment Method");

        buttonGroup1.add(CashBt);
        CashBt.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        CashBt.setText("Cash");

        buttonGroup1.add(CreditBt);
        CreditBt.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        CreditBt.setText("Credit Card");

        address.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        address.setText("Address");

        locations.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        locations.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dammam", "Khobar", "Qatif" }));

        jLabel5.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        jLabel5.setText("Total Price");

        totalLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        totalLabel.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrderBt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CancelBt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paymentMethod))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(locations, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CashBt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CreditBt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(address)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentMethod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CashBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreditBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(address)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(locations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelBt)
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dbbCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(dbbChB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(101, 101, 101)
                                                .addComponent(bbChB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(120, 120, 120)
                                                .addComponent(ChickenChB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dbbLbl)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(bbCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(144, 144, 144)
                                                .addComponent(ChiBuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(bbLbl)
                                                .addGap(33, 33, 33)
                                                .addComponent(ChickBurgerLbl))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(DubleBeefADD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(174, 174, 174)
                                        .addComponent(BeefAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(248, 248, 248)
                                        .addComponent(ChieckenAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(logoLb))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 803, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(4592, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dbbLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bbLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dbbChB)
                                    .addComponent(bbChB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dbbCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bbCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DubleBeefADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BeefAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ChickBurgerLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChickenChB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChiBuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChieckenAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logoLb)
                                .addGap(34, 34, 34)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(336, 336, 336)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1378, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 929, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1057, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(848, 848, 848))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addTableHeader() 
    {
        model = (DefaultTableModel) jTable1.getModel();
        Object[] newIdentifiers = new Object[]{"Item Name", "Price (SR)", "Quantity"};
        model.setColumnIdentifiers(newIdentifiers);
        
 
    }
    int total=0;
    public void getTotal()
      {
      int price=0,quantity=0;
      
      
      for (int i= 0 ; i<jTable1.getRowCount() ; i++)
      {
          price=Integer.parseInt(jTable1.getValueAt(i,1).toString());
          quantity=Integer.parseInt(jTable1.getValueAt(i,2).toString());
          total+=(price*quantity);
      }
      totalLabel.setText(Integer.toString(total)+" SR");
              
  }
    DefaultTableModel model;
    String itemName="";
    String itemPrice="";
    String Quantity="";
    String DeliveryMethod="",PaymentMethod="",addressChoice="",totalPrice="",orderid="";
    int max=0;
    private void OrderBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderBtActionPerformed
//        // TODO add your handling code here:
       try
       {
        
           if(CashBt.isSelected())
           {
               PaymentMethod = CashBt.getText();
           }
           else if (CreditBt.isSelected())
           {
               PaymentMethod = CreditBt.getText();
           }
           //Address
           addressChoice= locations.getSelectedItem().toString();
           
                      if( addressChoice.isEmpty()||PaymentMethod.isEmpty()||model.getRowCount()==0)
           {
               JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Error",JOptionPane.ERROR_MESSAGE);
           }
           else 
           {

                  //  DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OOPFoodiFD","APP"," ");
                    Statement st =con.createStatement();
                    ResultSet rs = null;
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
                   LocalDateTime now = LocalDateTime.now();  
                    
                    
                    
                    
                   if (JOptionPane.showConfirmDialog(null,"Confirm The Order ?" , "Confirm",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
                    {
                        
                        con.setAutoCommit(false); 
                        java.util.Date date=new java.util.Date();
                        java.sql.Date sqlDate=new java.sql.Date(date.getTime());
                        java.sql.Time sqlTime=new java.sql.Time(date.getTime());
                        String insertOrderQuery = "insert into OrderInfo(OrderStatusID,CustomerUserName,BranchID,CreatedTime,CreatedDate) VALUES (1,'"+userName+"',1 ,'"+sqlTime+"','"+sqlDate+"')";
                        st.executeUpdate(insertOrderQuery);
                        rs = (ResultSet) st.executeQuery("SELECT MAX(OrderID) FROM OrderInfo");
                        
                    
                        if (rs.next()) {
                            max= rs.getInt(1);
                            orderid=String.valueOf(max);
                            
         
//                            System.out.println(max);
                        }
                        
                        for(int i = 0; i<model.getRowCount();i++)
                        {
                            itemName=model.getValueAt(i, 0).toString();
//                            System.out.println(itemName);
                            Quantity=model.getValueAt(i, 2).toString();
                            String insertInfoQuery = "insert into OrderContainItems values (?,?,?)";
                            java.sql.PreparedStatement prstatment = con.prepareStatement(insertInfoQuery);
                            prstatment.setString(1,orderid);
                            prstatment.setString(2,itemName);
                            prstatment.setString(3,Quantity);
                            prstatment.execute();
                        }
                        String insertPaymentQuery = "insert into payment (amount,methods,orderid)values("+total+",'"+PaymentMethod+"',"+orderid+")";
                        st.executeUpdate(insertPaymentQuery);
                        con.commit();  
                      JOptionPane.showMessageDialog(null, "Data Inserted");
                      model.setRowCount(0);
                      getTotal();
                      buttonGroup1.clearSelection();
                      buttonGroup2.clearSelection();
                      locations.setSelectedIndex(0);
                      total=0;
                      getTotal();
                      st.close();
                    con.close();

                    } 
           }
              
           }

        catch(SQLException ex)
              {
                 
               JOptionPane.showMessageDialog(null,ex.getMessage(),"Error in INSERT",JOptionPane.ERROR_MESSAGE);
              }
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_OrderBtActionPerformed

    private void CancelBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null,"Cancel and Empty the Cart ? " , "Cancel",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
       
          model.setRowCount(0);
          total=0;
          getTotal();
          buttonGroup1.clearSelection();
          buttonGroup2.clearSelection();
          locations.setSelectedIndex(0);
        
        }
        
    }//GEN-LAST:event_CancelBtActionPerformed

    private void ChieckenAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChieckenAddActionPerformed
        // TODO add your handling code here:
        if(ChickenChB.isSelected()){itemName=ChickenChB.getText();}
        Quantity = ChiBuCombo.getSelectedItem().toString();
        itemPrice=ChickBurgerLbl.getText();
 
        if (itemName.isEmpty() || Quantity.isEmpty() || itemPrice.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Error",JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {

            model.addRow(new Object[]{itemName, itemPrice, Quantity});
            JOptionPane.showMessageDialog(null, "Data Inserted");
            ChiBuCombo.setSelectedIndex(0);
            ChickenChB.setSelected(false);
            itemName="";
            getTotal();
        }
    }//GEN-LAST:event_ChieckenAddActionPerformed

    private void BeefAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeefAddActionPerformed
        // TODO add your handling code here:
        if(bbChB.isSelected()){itemName=bbChB.getText();}
        Quantity = bbCombo.getSelectedItem().toString();
        itemPrice=bbLbl.getText();
 
        if (itemName.isEmpty() || Quantity.isEmpty() || itemPrice.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Error",JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {

            model.addRow(new Object[]{itemName, itemPrice, Quantity});
            JOptionPane.showMessageDialog(null, "Data Inserted");
            bbCombo.setSelectedIndex(0);
            bbChB.setSelected(false);
            itemName="";
            getTotal();
        }
        
    }//GEN-LAST:event_BeefAddActionPerformed

    private void DubleBeefADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DubleBeefADDActionPerformed
        // TODO add your handling code here:
        if(dbbChB.isSelected()){itemName=dbbChB.getText();}
        Quantity = dbbCombo.getSelectedItem().toString();
        itemPrice=dbbLbl.getText();
 
        if (itemName.isEmpty() || Quantity.isEmpty() || itemPrice.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Error",JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {

            model.addRow(new Object[]{itemName, itemPrice, Quantity});
            JOptionPane.showMessageDialog(null, "Data Inserted");
            dbbCombo.setSelectedIndex(0);
            dbbChB.setSelected(false);
            itemName="";
            getTotal();
            
        }
        
    }//GEN-LAST:event_DubleBeefADDActionPerformed

    private void FriesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FriesAddActionPerformed
        // TODO add your handling code here:
        if(friesChB.isSelected()){itemName=friesChB.getText();}
        Quantity = friesCombo.getSelectedItem().toString();
        itemPrice=friesLbl.getText();
 
        if (itemName.isEmpty() || Quantity.isEmpty() || itemPrice.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Error",JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {

            model.addRow(new Object[]{itemName, itemPrice, Quantity});
            JOptionPane.showMessageDialog(null, "Data Inserted");
            friesCombo.setSelectedIndex(0);
            friesChB.setSelected(false);
            itemName="";
            getTotal();
        }
    }//GEN-LAST:event_FriesAddActionPerformed

    private void NuggetsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuggetsAddActionPerformed
        // TODO add your handling code here:
        if(nuggChB.isSelected()){itemName=nuggChB.getText();}
        Quantity = nuggCombo.getSelectedItem().toString();
        itemPrice=nugLbl.getText();
 
        if (itemName.isEmpty() || Quantity.isEmpty() || itemPrice.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Error",JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {

            model.addRow(new Object[]{itemName, itemPrice, Quantity});
            JOptionPane.showMessageDialog(null, "Data Inserted");
            nuggCombo.setSelectedIndex(0);
            nuggChB.setSelected(false);
            itemName="";
            getTotal();
        }
    }//GEN-LAST:event_NuggetsAddActionPerformed

    private void potatoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potatoAddActionPerformed
        // TODO add your handling code here:
        if(potatoChB.isSelected()){itemName=potatoChB.getText();}
        Quantity = potatoCombo.getSelectedItem().toString();
        itemPrice=potatoLbl.getText();
 
        if (itemName.isEmpty() || Quantity.isEmpty() || itemPrice.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Error",JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {

            model.addRow(new Object[]{itemName, itemPrice, Quantity});
            JOptionPane.showMessageDialog(null, "Data Inserted");
            potatoCombo.setSelectedIndex(0);
            potatoChB.setSelected(false);
            itemName="";
            getTotal();
        }
    }//GEN-LAST:event_potatoAddActionPerformed

    private void upAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upAddActionPerformed
        // TODO add your handling code here:
        if(upChB.isSelected()){itemName=upChB.getText();}
        Quantity = upCombo.getSelectedItem().toString();
        itemPrice=upLbl.getText();
 
        if (itemName.isEmpty() || Quantity.isEmpty() || itemPrice.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Error",JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {

            model.addRow(new Object[]{itemName, itemPrice, Quantity});
            JOptionPane.showMessageDialog(null, "Data Inserted");
            upCombo.setSelectedIndex(0);
            upChB.setSelected(false);
            itemName="";
            getTotal();
        }
    }//GEN-LAST:event_upAddActionPerformed

    private void pepsiAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiAddActionPerformed
        // TODO add your handling code here:
        if(pepsiChB.isSelected()){itemName=pepsiChB.getText();}
        Quantity = pepsiCombo.getSelectedItem().toString();
        itemPrice=pepsiLbl.getText();
 
        if (itemName.isEmpty() || Quantity.isEmpty() || itemPrice.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Error",JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {

            model.addRow(new Object[]{itemName, itemPrice, Quantity});
            JOptionPane.showMessageDialog(null, "Data Inserted");
            pepsiCombo.setSelectedIndex(0);
            pepsiChB.setSelected(false);
            itemName="";
            getTotal();
        }
    }//GEN-LAST:event_pepsiAddActionPerformed

    private void mirindaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirindaAddActionPerformed
        // TODO add your handling code here:
        if(mirindaChB.isSelected()){itemName=mirindaChB.getText();}
        Quantity = mirindaCombo.getSelectedItem().toString();
        itemPrice=mirindaLbl.getText();
 
        if (itemName.isEmpty() || Quantity.isEmpty() || itemPrice.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Error",JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {

            model.addRow(new Object[]{itemName, itemPrice, Quantity});
            JOptionPane.showMessageDialog(null, "Data Inserted");
            mirindaCombo.setSelectedIndex(0);
            mirindaChB.setSelected(false);
            itemName="";
            getTotal();
        }
    }//GEN-LAST:event_mirindaAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null,"Log OUT? " , "Cancel",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
        userName="";
        Sign_In si = new Sign_In();
        si.show();
        dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuandCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuandCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuandCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuandCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuandCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BeefAdd;
    private javax.swing.JButton CancelBt;
    private javax.swing.JRadioButton CashBt;
    private javax.swing.JComboBox<String> ChiBuCombo;
    private javax.swing.JLabel ChickBurgerLbl;
    private javax.swing.JCheckBox ChickenChB;
    private javax.swing.JButton ChieckenAdd;
    private javax.swing.JRadioButton CreditBt;
    private javax.swing.JButton DubleBeefADD;
    private javax.swing.JButton FriesAdd;
    private javax.swing.JButton NuggetsAdd;
    private javax.swing.JButton OrderBt;
    private javax.swing.JLabel address;
    private javax.swing.JCheckBox bbChB;
    private javax.swing.JComboBox<String> bbCombo;
    private javax.swing.JLabel bbLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox dbbChB;
    private javax.swing.JComboBox<String> dbbCombo;
    private javax.swing.JLabel dbbLbl;
    private javax.swing.JCheckBox friesChB;
    private javax.swing.JComboBox<String> friesCombo;
    private javax.swing.JLabel friesLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> locations;
    private javax.swing.JLabel logoLb;
    private javax.swing.JButton mirindaAdd;
    private javax.swing.JCheckBox mirindaChB;
    private javax.swing.JComboBox<String> mirindaCombo;
    private javax.swing.JLabel mirindaLbl;
    private javax.swing.JLabel nugLbl;
    private javax.swing.JCheckBox nuggChB;
    private javax.swing.JComboBox<String> nuggCombo;
    private javax.swing.JLabel paymentMethod;
    private javax.swing.JButton pepsiAdd;
    private javax.swing.JCheckBox pepsiChB;
    private javax.swing.JComboBox<String> pepsiCombo;
    private javax.swing.JLabel pepsiLbl;
    private javax.swing.JButton potatoAdd;
    private javax.swing.JCheckBox potatoChB;
    private javax.swing.JComboBox<String> potatoCombo;
    private javax.swing.JLabel potatoLbl;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton upAdd;
    private javax.swing.JCheckBox upChB;
    private javax.swing.JComboBox<String> upCombo;
    private javax.swing.JLabel upLbl;
    // End of variables declaration//GEN-END:variables
}
