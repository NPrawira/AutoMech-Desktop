package application;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class LihatSemuaData extends javax.swing.JFrame {

    public LihatSemuaData() {
        initComponents();
        pemilikAllData();
        motorAllData();
        servisAllData();
    }
    
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://localhost:1433;databaseName=AutoMech;user=sa;password=userjuga";
    
    public void pemilikAllData(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No. Identitas");
        tbl.addColumn("Tipe Identitas");
        tbl.addColumn("Nama");
        tbl.addColumn("Alamat");
        tbl.addColumn("No. Telepon");
        lihatpemiliktabel.setModel(tbl);
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            Statement stt = (Statement) con.createStatement();
            ResultSet res = stt.executeQuery("SELECT * FROM DataBengkel.Pemilik");
            while(res.next()){
                tbl.addRow(new Object []{               
                res.getString("ID_Pemilik"),
                res.getString("Tipe_ID"),
                res.getString("Nama"),
                res.getString("Alamat"),
                res.getString("No_Telepon")
            });
            lihatpemiliktabel.setModel(tbl);
            }
        }
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    public void motorAllData(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Plat Nomor");
        tbl.addColumn("No. Identitas Pemilik");
        tbl.addColumn("Jenis Motor");
        tbl.addColumn("Merek");
        tbl.addColumn("Model");
        tbl.addColumn("Kilometer Tempuh");
        lihatmotortabel.setModel(tbl);
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            Statement stt = (Statement) con.createStatement();
            ResultSet res = stt.executeQuery("SELECT * FROM DataBengkel.Motor");
            while(res.next()){
                tbl.addRow(new Object []{               
                res.getString("Plat_No"),
                res.getString("ID_Pemilik"),
                res.getString("Jenis_Motor"),
                res.getString("Merek"),
                res.getString("Model"),
                res.getString("KM_Tempuh")
            });
            lihatmotortabel.setModel(tbl);
            }
        }
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    public void servisAllData(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nota No.");
        tbl.addColumn("Plat Nomor");
        tbl.addColumn("ID Montir");
        tbl.addColumn("Keluhan");
        tbl.addColumn("Catatan Servis");
        lihatservistabel.setModel(tbl);
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            Statement stt = (Statement) con.createStatement();
            ResultSet res = stt.executeQuery("SELECT * FROM DataBengkel.Servis");
            while (res.next()){
                tbl.addRow(new Object []{               
                res.getString("Nota_No"),
                res.getString("Plat_No"),
                res.getString("ID_Montir"),
                res.getString("Keluhan"),
                res.getString("Catatan_Servis")
            });
            lihatservistabel.setModel(tbl);
            }
        }
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    UbahPemilik up = new UbahPemilik();
    UbahMotor um = new UbahMotor();
    UbahServis us = new UbahServis();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lihatpanel = new javax.swing.JPanel();
        lihattitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lihatisi = new javax.swing.JPanel();
        lihatisipanel = new javax.swing.JPanel();
        lihatisitabbedpane = new javax.swing.JTabbedPane();
        lihatpemilikpanel = new javax.swing.JPanel();
        lihatpemilikscrollpane = new javax.swing.JScrollPane();
        lihatpemiliktabel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        caridata1 = new javax.swing.JTextField();
        cari1 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        hapuspemilik = new javax.swing.JButton();
        lihatmotorpanel = new javax.swing.JPanel();
        lihatmotorscrollpane = new javax.swing.JScrollPane();
        lihatmotortabel = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        caridata2 = new javax.swing.JTextField();
        cari2 = new javax.swing.JButton();
        reset2 = new javax.swing.JButton();
        hapusmotor = new javax.swing.JButton();
        lihatservispanel = new javax.swing.JPanel();
        hapusservis = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        caridata3 = new javax.swing.JTextField();
        cari3 = new javax.swing.JButton();
        reset3 = new javax.swing.JButton();
        lihatservisscrollpane = new javax.swing.JScrollPane();
        lihatservistabel = new javax.swing.JTable();
        kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lihatpanel.setBackground(new java.awt.Color(153, 255, 153));

        lihattitle.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AutoMech Workshop");

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Satu Perhentian untuk Semua Perbaikan Motor Anda");

        javax.swing.GroupLayout lihattitleLayout = new javax.swing.GroupLayout(lihattitle);
        lihattitle.setLayout(lihattitleLayout);
        lihattitleLayout.setHorizontalGroup(
            lihattitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lihattitleLayout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addGroup(lihattitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(lihattitleLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lihattitleLayout.setVerticalGroup(
            lihattitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lihattitleLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        lihatisitabbedpane.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N

        lihatpemiliktabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lihatpemiliktabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No. Identitas", "Tipe Identitas", "Nama", "Alamat", "No. Telepon"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lihatpemiliktabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lihatpemiliktabelMouseClicked(evt);
            }
        });
        lihatpemilikscrollpane.setViewportView(lihatpemiliktabel);
        if (lihatpemiliktabel.getColumnModel().getColumnCount() > 0) {
            lihatpemiliktabel.getColumnModel().getColumn(0).setResizable(false);
            lihatpemiliktabel.getColumnModel().getColumn(1).setResizable(false);
            lihatpemiliktabel.getColumnModel().getColumn(2).setResizable(false);
            lihatpemiliktabel.getColumnModel().getColumn(3).setResizable(false);
            lihatpemiliktabel.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("Cari Data");

        caridata1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cari1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        cari1.setText("Cari");
        cari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari1ActionPerformed(evt);
            }
        });

        reset1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        hapuspemilik.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        hapuspemilik.setText("Hapus Data Terpilih");
        hapuspemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapuspemilikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lihatpemilikpanelLayout = new javax.swing.GroupLayout(lihatpemilikpanel);
        lihatpemilikpanel.setLayout(lihatpemilikpanelLayout);
        lihatpemilikpanelLayout.setHorizontalGroup(
            lihatpemilikpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihatpemilikscrollpane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(lihatpemilikpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caridata1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cari1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 834, Short.MAX_VALUE)
                .addComponent(hapuspemilik)
                .addContainerGap())
        );
        lihatpemilikpanelLayout.setVerticalGroup(
            lihatpemilikpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lihatpemilikpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lihatpemilikpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(caridata1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari1)
                    .addComponent(reset1)
                    .addComponent(hapuspemilik))
                .addGap(18, 18, 18)
                .addComponent(lihatpemilikscrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
        );

        lihatisitabbedpane.addTab("Lihat Data Pemilik", lihatpemilikpanel);

        lihatmotortabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lihatmotortabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Plat Nomor", "No. Identitas", "Jenis Motor", "Merek Motor", "Model", "Kilometer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lihatmotortabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lihatmotortabelMouseClicked(evt);
            }
        });
        lihatmotorscrollpane.setViewportView(lihatmotortabel);
        if (lihatmotortabel.getColumnModel().getColumnCount() > 0) {
            lihatmotortabel.getColumnModel().getColumn(0).setResizable(false);
            lihatmotortabel.getColumnModel().getColumn(1).setResizable(false);
            lihatmotortabel.getColumnModel().getColumn(2).setResizable(false);
            lihatmotortabel.getColumnModel().getColumn(3).setResizable(false);
            lihatmotortabel.getColumnModel().getColumn(4).setResizable(false);
            lihatmotortabel.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Cari Data");

        caridata2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cari2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        cari2.setText("Cari");
        cari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari2ActionPerformed(evt);
            }
        });

        reset2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        reset2.setText("Reset");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });

        hapusmotor.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        hapusmotor.setText("Hapus Data Terpilih");

        javax.swing.GroupLayout lihatmotorpanelLayout = new javax.swing.GroupLayout(lihatmotorpanel);
        lihatmotorpanel.setLayout(lihatmotorpanelLayout);
        lihatmotorpanelLayout.setHorizontalGroup(
            lihatmotorpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lihatmotorpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caridata2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cari2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 834, Short.MAX_VALUE)
                .addComponent(hapusmotor)
                .addContainerGap())
            .addComponent(lihatmotorscrollpane)
        );
        lihatmotorpanelLayout.setVerticalGroup(
            lihatmotorpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lihatmotorpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lihatmotorpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(caridata2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari2)
                    .addComponent(reset2)
                    .addComponent(hapusmotor))
                .addGap(18, 18, 18)
                .addComponent(lihatmotorscrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
        );

        lihatisitabbedpane.addTab("Lihat Data Motor", lihatmotorpanel);

        hapusservis.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        hapusservis.setText("Hapus Data Terpilih");

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Cari Data");

        caridata3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cari3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        cari3.setText("Cari");
        cari3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari3ActionPerformed(evt);
            }
        });

        reset3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        reset3.setText("Reset");
        reset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset3ActionPerformed(evt);
            }
        });

        lihatservistabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lihatservistabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nota No.", "Plat Nomor", "ID Montir", "Keluhan", "Catatan Servis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lihatservistabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lihatservistabelMouseClicked(evt);
            }
        });
        lihatservisscrollpane.setViewportView(lihatservistabel);
        if (lihatservistabel.getColumnModel().getColumnCount() > 0) {
            lihatservistabel.getColumnModel().getColumn(0).setResizable(false);
            lihatservistabel.getColumnModel().getColumn(1).setResizable(false);
            lihatservistabel.getColumnModel().getColumn(2).setResizable(false);
            lihatservistabel.getColumnModel().getColumn(3).setResizable(false);
            lihatservistabel.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout lihatservispanelLayout = new javax.swing.GroupLayout(lihatservispanel);
        lihatservispanel.setLayout(lihatservispanelLayout);
        lihatservispanelLayout.setHorizontalGroup(
            lihatservispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lihatservispanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caridata3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cari3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 834, Short.MAX_VALUE)
                .addComponent(hapusservis)
                .addContainerGap())
            .addComponent(lihatservisscrollpane)
        );
        lihatservispanelLayout.setVerticalGroup(
            lihatservispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lihatservispanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lihatservispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(caridata3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari3)
                    .addComponent(reset3)
                    .addComponent(hapusservis))
                .addGap(18, 18, 18)
                .addComponent(lihatservisscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lihatisitabbedpane.addTab("Lihat Data Servis", lihatservispanel);

        kembali.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        kembali.setText("Kembali ke Menu");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lihatisipanelLayout = new javax.swing.GroupLayout(lihatisipanel);
        lihatisipanel.setLayout(lihatisipanelLayout);
        lihatisipanelLayout.setHorizontalGroup(
            lihatisipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihatisitabbedpane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lihatisipanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kembali)
                .addContainerGap())
        );
        lihatisipanelLayout.setVerticalGroup(
            lihatisipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lihatisipanelLayout.createSequentialGroup()
                .addComponent(lihatisitabbedpane, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembali)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout lihatisiLayout = new javax.swing.GroupLayout(lihatisi);
        lihatisi.setLayout(lihatisiLayout);
        lihatisiLayout.setHorizontalGroup(
            lihatisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihatisipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lihatisiLayout.setVerticalGroup(
            lihatisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihatisipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout lihatpanelLayout = new javax.swing.GroupLayout(lihatpanel);
        lihatpanel.setLayout(lihatpanelLayout);
        lihatpanelLayout.setHorizontalGroup(
            lihatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihattitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lihatpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lihatisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        lihatpanelLayout.setVerticalGroup(
            lihatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lihatpanelLayout.createSequentialGroup()
                .addComponent(lihattitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lihatisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihatpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihatpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari1ActionPerformed
        // TODO add your handling code here:
        String cari01;
        cari01 = caridata1.getText();
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No. Identitas");
        tbl.addColumn("Tipe Identitas");
        tbl.addColumn("Nama");
        tbl.addColumn("Alamat");
        tbl.addColumn("No. Telepon");
        lihatpemiliktabel.setModel(tbl);
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            Statement stt = (Statement) con.createStatement();
            ResultSet res = stt.executeQuery
            ("SELECT * FROM DataBengkel.Pemilik WHERE ID_Pemilik LIKE '" + cari01 + "%'"
                + " OR Tipe_ID LIKE '" + cari01 + "%'"
                + " OR Nama LIKE '" + cari01 + "%'"
                + " OR Alamat LIKE '" + cari01 + "%'"
                + " OR No_Telepon LIKE '" + cari01 + "%'");
            while (res.next()){
                tbl.addRow(new Object []{
                    res.getString("ID_Pemilik"),
                    res.getString("Tipe_ID"),
                    res.getString("Nama"),
                    res.getString("Alamat"),
                    res.getString("No_Telepon")
                });
                lihatpemiliktabel.setModel(tbl);
            }
        }
        catch (ClassNotFoundException | NullPointerException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Data tidak ditemukan!","Gagal",JOptionPane.ERROR_MESSAGE);
            caridata1.setText(null);
        }
    }//GEN-LAST:event_cari1ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        // TODO add your handling code here:
        caridata1.setText(null);
        pemilikAllData();
    }//GEN-LAST:event_reset1ActionPerformed

    private void cari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari2ActionPerformed
        // TODO add your handling code here:
        String cari02;
        cari02 = caridata2.getText();
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Plat Nomor");
        tbl.addColumn("No. Identitas Pemilik");
        tbl.addColumn("Jenis Motor");
        tbl.addColumn("Merek");
        tbl.addColumn("Model");
        tbl.addColumn("Kilometer Tempuh");
        lihatmotortabel.setModel(tbl);
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            Statement stt = (Statement) con.createStatement();
            ResultSet res = stt.executeQuery
            ("SELECT * FROM DataBengkel.Motor WHERE Plat_No LIKE '" + cari02 + "%'"
                + " OR ID_Pemilik LIKE '" + cari02 + "%'"
                + " OR Jenis_Motor LIKE '" + cari02 + "%'"
                + " OR Merek LIKE '" + cari02 + "%'"
                + " OR Model LIKE '" + cari02 + "%'"
                + " OR KM_Tempuh LIKE '" + cari02 + "%'");
            while (res.next()){
                tbl.addRow(new Object []{
                    res.getString("Plat_No"),
                    res.getString("ID_Pemilik"),
                    res.getString("Jenis_Motor"),
                    res.getString("Merek"),
                    res.getString("Model"),
                    res.getString("KM_Tempuh")
                });
                lihatmotortabel.setModel(tbl);
            }
        }
        catch (ClassNotFoundException | NullPointerException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Data tidak ditemukan!","Gagal",JOptionPane.ERROR_MESSAGE);
            caridata2.setText(null);
        }
    }//GEN-LAST:event_cari2ActionPerformed

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
        // TODO add your handling code here:
        caridata2.setText(null);
        motorAllData();
    }//GEN-LAST:event_reset2ActionPerformed

    private void cari3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari3ActionPerformed
        // TODO add your handling code here:
        String cari03;
        cari03 = caridata3.getText();
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nota No.");
        tbl.addColumn("Plat Nomor");
        tbl.addColumn("ID Montir");
        tbl.addColumn("Keluhan");
        tbl.addColumn("Catatan Servis");
        lihatservistabel.setModel(tbl);
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            Statement stt = (Statement) con.createStatement();
            ResultSet res = stt.executeQuery
            ("SELECT * FROM DataBengkel.Servis WHERE Nota_No LIKE '" + cari03 + "%'"
                + " OR Plat_No LIKE '" + cari03 + "%'"
                + " OR ID_Montir LIKE '" + cari03 + "%'"
                + " OR Keluhan LIKE '" + cari03 + "%'"
                + " OR Catatan_Servis LIKE '" + cari03 + "%'");
            while (res.next()){
                tbl.addRow(new Object []{
                    res.getString("Nota_No"),
                    res.getString("Plat_No"),
                    res.getString("ID_Montir"),
                    res.getString("Keluhan"),
                    res.getString("Catatan_Servis")
                });
                lihatservistabel.setModel(tbl);
            }
        }
        catch (ClassNotFoundException | NullPointerException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Data tidak ditemukan!","Gagal",JOptionPane.ERROR_MESSAGE);
            caridata3.setText(null);
        }
    }//GEN-LAST:event_cari3ActionPerformed

    private void reset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset3ActionPerformed
        // TODO add your handling code here:
        caridata3.setText(null);
        servisAllData();
    }//GEN-LAST:event_reset3ActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setTitle("Main Menu");
        m.setVisible(true);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

    private void lihatpemiliktabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatpemiliktabelMouseClicked
        // TODO add your handling code here:
        int index = lihatpemiliktabel.getSelectedRow();
        TableModel tab = lihatpemiliktabel.getModel();
        final String ID_Pemilik = tab.getValueAt(index, 0).toString();
        String Tipe_ID = tab.getValueAt(index, 1).toString();
        String Nama = tab.getValueAt(index, 2).toString();
        String Alamat = tab.getValueAt(index, 3).toString();
        String No_Telepon = tab.getValueAt(index, 4).toString();
        
        up.setVisible(true);
        up.setResizable(false);
        up.setTitle("Ubah Data Pemilik");
        up.setLocationRelativeTo(null);
        up.pack();
        up.setExtendedState(up.getExtendedState() | JFrame.MAXIMIZED_VERT);
        up.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        up.noid.setText(ID_Pemilik);
        up.tipeid.setText(Tipe_ID);
        up.nama.setText(Nama);
        up.alamat.setText(Alamat);
        up.notel.setText(No_Telepon);
        
        hapuspemilik.addActionListener((ActionEvent x) -> {
            try{
                Class.forName(driver);
                Connection con = DriverManager.getConnection(url);
                Statement stt = (Statement) con.createStatement();
                PreparedStatement pst = con.prepareStatement("DELETE FROM DataBengkel.Pemilik WHERE ID_Pemilik ='"+ID_Pemilik+"'");
                pst.executeUpdate();
                pemilikAllData();
                JOptionPane.showMessageDialog(null,"Sukses menghapus data pemilik","Sukses",JOptionPane.INFORMATION_MESSAGE);
                up.noid.setText(null);
                up.tipeid.setText(null);
                up.nama.setText(null);
                up.alamat.setText(null);
                up.notel.setText(null);
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(rootPane,"Gagal menghapus data pemilik!\n"
                        + "Hapus data motor terpaut sebelum menghapus data pemilik!","Gagal",JOptionPane.ERROR_MESSAGE);
            }
        });
    }//GEN-LAST:event_lihatpemiliktabelMouseClicked

    private void lihatmotortabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatmotortabelMouseClicked
        // TODO add your handling code here:
        int index = lihatmotortabel.getSelectedRow();
        TableModel tab = lihatmotortabel.getModel();
        final String Plat_No = tab.getValueAt(index, 0).toString();
        String ID_Pemilik = tab.getValueAt(index, 1).toString();
        String Jenis_Motor = tab.getValueAt(index, 2).toString();
        String Merek = tab.getValueAt(index, 3).toString();
        String Model = tab.getValueAt(index, 4).toString();
        String KM_Tempuh = tab.getValueAt(index, 5).toString();
        
        um.setVisible(true);
        um.setResizable(false);
        um.setTitle("Ubah Data Motor");
        um.setLocationRelativeTo(null);
        um.pack();
        um.setExtendedState(um.getExtendedState() | JFrame.MAXIMIZED_VERT);
        um.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        um.platno.setText(Plat_No);
        
        um.noidset.setText(ID_Pemilik);
        um.jenismotor.setText(Jenis_Motor);
        um.merek.setText(Merek);
        um.model.setText(Model);
        um.kilometer.setText(KM_Tempuh);
        
        hapusmotor.addActionListener((ActionEvent y) -> {
            try{
                Class.forName(driver);
                Connection con = DriverManager.getConnection(url);
                Statement stt = (Statement) con.createStatement();
                PreparedStatement pst = con.prepareStatement("DELETE FROM DataBengkel.Motor WHERE Plat_No ='"+Plat_No+"'");
                pst.executeUpdate();
                motorAllData();
                JOptionPane.showMessageDialog(null,"Sukses menghapus data motor","Sukses",JOptionPane.INFORMATION_MESSAGE);
                um.platno.setText(null);
                um.noidset.setText(null);
                um.jenismotor.setText(null);
                um.merek.setText(null);
                um.model.setText(null);
                um.kilometer.setText(null);
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(rootPane,"Gagal menghapus data motor!\n"
                        + "Hapus data servis terpaut sebelum menghapus data motor!","Gagal",JOptionPane.ERROR_MESSAGE);
            }
        });
    }//GEN-LAST:event_lihatmotortabelMouseClicked

    private void lihatservistabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatservistabelMouseClicked
        // TODO add your handling code here:
        int index = lihatservistabel.getSelectedRow();
        TableModel tab = lihatservistabel.getModel();
        String Nota_No = tab.getValueAt(index, 0).toString();
        String Plat_No = tab.getValueAt(index, 1).toString();
        String ID_Montir = tab.getValueAt(index, 2).toString();
        String Keluhan = tab.getValueAt(index, 3).toString();
        String Catatan_Servis = tab.getValueAt(index, 4).toString();
        
        us.setVisible(true);
        us.setResizable(false);
        us.setTitle("Ubah Data Servis");
        us.setLocationRelativeTo(null);
        us.pack();
        us.setExtendedState(us.getExtendedState() | JFrame.MAXIMIZED_VERT);
        us.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        us.notano.setText(Nota_No);
        us.platnoset.setText(Plat_No);
        us.idmontirset.setSelectedItem(ID_Montir);
        us.keluhan.setText(Keluhan);
        us.catatanservis.setText(Catatan_Servis);
        
        hapusservis.addActionListener((ActionEvent z) -> {
            try{
                Class.forName(driver);
                Connection con = DriverManager.getConnection(url);
                Statement stt = (Statement) con.createStatement();
                PreparedStatement pst = con.prepareStatement("DELETE FROM DataBengkel.Servis WHERE Nota_No ='"+Nota_No+"'");
                pst.executeUpdate();
                servisAllData();
                JOptionPane.showMessageDialog(null,"Sukses menghapus data servis","Sukses",JOptionPane.INFORMATION_MESSAGE);
                us.notano.setText(null);
                us.platnoset.setText(null);
                us.idmontirset.setSelectedIndex(-1);
                us.keluhan.setText(null);
                us.catatanservis.setText(null);
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(rootPane,"Gagal menghapus data servis!","Gagal",JOptionPane.ERROR_MESSAGE);
            }
        });
    }//GEN-LAST:event_lihatservistabelMouseClicked

    private void hapuspemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapuspemilikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapuspemilikActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new LihatSemuaData().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cari1;
    public javax.swing.JButton cari2;
    public javax.swing.JButton cari3;
    public javax.swing.JTextField caridata1;
    public javax.swing.JTextField caridata2;
    public javax.swing.JTextField caridata3;
    public javax.swing.JButton hapusmotor;
    public javax.swing.JButton hapuspemilik;
    public javax.swing.JButton hapusservis;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JButton kembali;
    public javax.swing.JPanel lihatisi;
    public javax.swing.JPanel lihatisipanel;
    public javax.swing.JTabbedPane lihatisitabbedpane;
    public javax.swing.JPanel lihatmotorpanel;
    public javax.swing.JScrollPane lihatmotorscrollpane;
    public javax.swing.JTable lihatmotortabel;
    public javax.swing.JPanel lihatpanel;
    public javax.swing.JPanel lihatpemilikpanel;
    public javax.swing.JScrollPane lihatpemilikscrollpane;
    public javax.swing.JTable lihatpemiliktabel;
    public javax.swing.JPanel lihatservispanel;
    public javax.swing.JScrollPane lihatservisscrollpane;
    public javax.swing.JTable lihatservistabel;
    public javax.swing.JPanel lihattitle;
    public javax.swing.JButton reset1;
    public javax.swing.JButton reset2;
    public javax.swing.JButton reset3;
    // End of variables declaration//GEN-END:variables
}
