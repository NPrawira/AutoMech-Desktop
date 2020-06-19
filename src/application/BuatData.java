package application;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class BuatData extends javax.swing.JFrame {

    public BuatData() {
        initComponents();
        montirAllData();
        setIDMontir();
    }
    
    public String noid(String noid){
        return noid;
    }
    
    public String tipeid(String tipeid){
        return tipeid;
    }
    
    public String nama(String nama){
        return nama;
    }
    
    public String alamat(String alamat){
        return alamat;
    }
    
    public String notel(String notel){
        return notel;
    }
    
    public String platno(String platno){
        return platno;
    }
    
    public String jenismotor(String jenismotor){
        return jenismotor;
    }
    
    public String merek(String merek){
        return merek;
    }
    
    public String model(String model){
        return model;
    }
    
    public String kilometer(String kilometer){
        return kilometer;
    }
    
    public String notano(String notano){
        return notano;
    }
    
    public String idmontir(String idmontir){
        return idmontir;
    }
    
    public String keluhan(String keluhan){
        return keluhan;
    }
    
    public String catatanservis(String catatanservis){
        return catatanservis;
    }
    
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=AutoMech;user=sa;password=userjuga";
    
    public void montirAllData(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Montir");
        tbl.addColumn("Nama Montir");
        tbl.addColumn("Spesialisasi");
        montirtabel.setModel(tbl);
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            Statement stt = (Statement) con.createStatement();
            ResultSet res = stt.executeQuery("SELECT * FROM DataBengkel.Montir");
            while(res.next()){
                tbl.addRow(new Object []{
                res.getString("ID_Montir"),
                res.getString("Nama_Montir"),
                res.getString("Spesialisasi")
            });
            montirtabel.setModel(tbl);
            }
        }
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    public void setIDMontir(){
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            Statement stt = (Statement) con.createStatement();
            ResultSet idm = stt.executeQuery("SELECT ID_Montir FROM DataBengkel.Montir");
            while(idm.next())
            {
                idmontirset.addItem(idm.getString("ID_Montir"));
            }
            this.setVisible(false);
        }
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buatpanel = new javax.swing.JPanel();
        buattitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buatisi = new javax.swing.JPanel();
        buatisipanel = new javax.swing.JPanel();
        buattabbedpane = new javax.swing.JTabbedPane();
        buatpemilik = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        noid = new javax.swing.JTextField();
        tipeid = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        notel = new javax.swing.JTextField();
        simpanpemilik = new javax.swing.JButton();
        buatmotor = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        platno = new javax.swing.JTextField();
        noidset = new javax.swing.JTextField();
        jenismotor = new javax.swing.JTextField();
        merek = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        kilometer = new javax.swing.JTextField();
        simpanmotor = new javax.swing.JButton();
        buatmontir = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        montirscrollpane = new javax.swing.JScrollPane();
        montirtabel = new javax.swing.JTable();
        buatservis = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        notano = new javax.swing.JTextField();
        platnoset = new javax.swing.JTextField();
        idmontirset = new javax.swing.JComboBox<>();
        keluhan = new javax.swing.JTextField();
        catatanservis = new javax.swing.JTextField();
        simpanservis = new javax.swing.JButton();
        kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buatpanel.setBackground(new java.awt.Color(153, 255, 153));

        buattitle.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AutoMech Workshop");

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Satu Perhentian untuk Semua Perbaikan Motor Anda");

        javax.swing.GroupLayout buattitleLayout = new javax.swing.GroupLayout(buattitle);
        buattitle.setLayout(buattitleLayout);
        buattitleLayout.setHorizontalGroup(
            buattitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buattitleLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(buattitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(buattitleLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buattitleLayout.setVerticalGroup(
            buattitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buattitleLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        buattabbedpane.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("No. Identitas");

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Tipe Identitas");

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Nama");

        jLabel6.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel6.setText("Alamat");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel7.setText("No. Telepon");

        noid.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tipeid.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        nama.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        alamat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        notel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        simpanpemilik.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        simpanpemilik.setText("Simpan");
        simpanpemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanpemilikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buatpemilikLayout = new javax.swing.GroupLayout(buatpemilik);
        buatpemilik.setLayout(buatpemilikLayout);
        buatpemilikLayout.setHorizontalGroup(
            buatpemilikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatpemilikLayout.createSequentialGroup()
                .addGroup(buatpemilikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buatpemilikLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buatpemilikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(buatpemilikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipeid, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(buatpemilikLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(simpanpemilik)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        buatpemilikLayout.setVerticalGroup(
            buatpemilikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatpemilikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buatpemilikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(noid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatpemilikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatpemilikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatpemilikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatpemilikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(notel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(simpanpemilik)
                .addContainerGap())
        );

        buattabbedpane.addTab("Data Pemilik", buatpemilik);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel8.setText("Plat Nomor");

        jLabel9.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel9.setText("No. Identitas");

        jLabel10.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel10.setText("Jenis Motor");

        jLabel11.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel11.setText("Merek");

        jLabel12.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel12.setText("Model");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel13.setText("Kilometer");

        platno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        noidset.setEditable(false);
        noidset.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jenismotor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        merek.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        model.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        kilometer.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        simpanmotor.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        simpanmotor.setText("Simpan");
        simpanmotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanmotorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buatmotorLayout = new javax.swing.GroupLayout(buatmotor);
        buatmotor.setLayout(buatmotorLayout);
        buatmotorLayout.setHorizontalGroup(
            buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatmotorLayout.createSequentialGroup()
                .addGroup(buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buatmotorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(merek, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(noidset)
                            .addComponent(model)
                            .addComponent(jenismotor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kilometer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(platno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(buatmotorLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(simpanmotor)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        buatmotorLayout.setVerticalGroup(
            buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatmotorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(platno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(noidset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jenismotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(merek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatmotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(kilometer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(simpanmotor)
                .addContainerGap())
        );

        buattabbedpane.addTab("Data Motor", buatmotor);

        jLabel14.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel14.setText("Pilih montir dari tabel :");

        montirtabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        montirtabel.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null}
            },
            new String [] {
                "ID Montir", "Nama Montir", "Spesialisasi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        montirtabel.getTableHeader().setReorderingAllowed(false);
        montirtabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                montirtabelMouseClicked(evt);
            }
        });
        montirscrollpane.setViewportView(montirtabel);
        if (montirtabel.getColumnModel().getColumnCount() > 0) {
            montirtabel.getColumnModel().getColumn(0).setResizable(false);
            montirtabel.getColumnModel().getColumn(1).setResizable(false);
            montirtabel.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout buatmontirLayout = new javax.swing.GroupLayout(buatmontir);
        buatmontir.setLayout(buatmontirLayout);
        buatmontirLayout.setHorizontalGroup(
            buatmontirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatmontirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buatmontirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buatmontirLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 438, Short.MAX_VALUE))
                    .addComponent(montirscrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE))
                .addContainerGap())
        );
        buatmontirLayout.setVerticalGroup(
            buatmontirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatmontirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(montirscrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        buattabbedpane.addTab("Pilih Montir", buatmontir);

        jLabel18.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel18.setText("Nota No.");

        jLabel19.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel19.setText("Plat Nomor");

        jLabel20.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel20.setText("ID Montir");

        jLabel21.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel21.setText("Keluhan");

        jLabel22.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel22.setText("Catatan Servis");
        jLabel22.setToolTipText("");

        notano.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        platnoset.setEditable(false);
        platnoset.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        idmontirset.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        keluhan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        catatanservis.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        simpanservis.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        simpanservis.setText("Simpan");
        simpanservis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanservisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buatservisLayout = new javax.swing.GroupLayout(buatservis);
        buatservis.setLayout(buatservisLayout);
        buatservisLayout.setHorizontalGroup(
            buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatservisLayout.createSequentialGroup()
                .addGroup(buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(buatservisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catatanservis)
                            .addGroup(buatservisLayout.createSequentialGroup()
                                .addGroup(buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(platnoset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(keluhan, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idmontirset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(notano, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(buatservisLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(simpanservis)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        buatservisLayout.setVerticalGroup(
            buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatservisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(notano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(platnoset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(idmontirset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(keluhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buatservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(catatanservis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(simpanservis)
                .addContainerGap())
        );

        buattabbedpane.addTab("Nota Servis", buatservis);

        javax.swing.GroupLayout buatisipanelLayout = new javax.swing.GroupLayout(buatisipanel);
        buatisipanel.setLayout(buatisipanelLayout);
        buatisipanelLayout.setHorizontalGroup(
            buatisipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buattabbedpane)
        );
        buatisipanelLayout.setVerticalGroup(
            buatisipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buattabbedpane)
        );

        kembali.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        kembali.setText("Kembali ke Menu");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buatisiLayout = new javax.swing.GroupLayout(buatisi);
        buatisi.setLayout(buatisiLayout);
        buatisiLayout.setHorizontalGroup(
            buatisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buatisiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kembali)
                .addContainerGap())
            .addComponent(buatisipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buatisiLayout.setVerticalGroup(
            buatisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buatisiLayout.createSequentialGroup()
                .addComponent(buatisipanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kembali)
                .addContainerGap())
        );

        javax.swing.GroupLayout buatpanelLayout = new javax.swing.GroupLayout(buatpanel);
        buatpanel.setLayout(buatpanelLayout);
        buatpanelLayout.setHorizontalGroup(
            buatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buattitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buatpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buatisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        buatpanelLayout.setVerticalGroup(
            buatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatpanelLayout.createSequentialGroup()
                .addComponent(buattitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buatisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buatpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buatpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanpemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanpemilikActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            String sql ="INSERT INTO DataBengkel.Pemilik (ID_Pemilik,Tipe_ID,Nama,Alamat,No_Telepon) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, noid.getText());
            pst.setString(2, tipeid.getText());
            pst.setString(3, nama.getText());
            pst.setString(4, alamat.getText());
            pst.setString(5, notel.getText());
            if(noid.getText().isEmpty() || tipeid.getText().isEmpty() || nama.getText().isEmpty() || alamat.getText().isEmpty() || notel.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane,"Masukkan seluruh data sebelum lanjut!","Gagal",JOptionPane.ERROR_MESSAGE);
            }else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Sukses memasukkan data pemilik","Sukses",JOptionPane.INFORMATION_MESSAGE);
                noidset.setText(noid.getText());
                buattabbedpane.setSelectedIndex(1);
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(rootPane,"Gagal memasukkan data pemilik!","Gagal",JOptionPane.ERROR_MESSAGE);
            noid.setText(null);
            tipeid.setText(null);
            nama.setText(null);
            alamat.setText(null);
            notel.setText(null);
        }
    }//GEN-LAST:event_simpanpemilikActionPerformed

    private void simpanmotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanmotorActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            String sql ="INSERT INTO DataBengkel.Motor (Plat_No,ID_Pemilik,Jenis_Motor,Merek,Model,KM_Tempuh) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, platno.getText());
            pst.setString(2, noidset.getText());
            pst.setString(3, jenismotor.getText());
            pst.setString(4, merek.getText());
            pst.setString(5, model.getText());
            pst.setString(6, kilometer.getText());
            if(platno.getText().isEmpty() || noidset.getText().isEmpty() || jenismotor.getText().isEmpty() || merek.getText().isEmpty() || model.getText().isEmpty() || kilometer.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane,"Masukkan seluruh data sebelum lanjut!","Gagal",JOptionPane.ERROR_MESSAGE);
            }else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Sukses memasukkan data motor","Sukses",JOptionPane.INFORMATION_MESSAGE);
                platnoset.setText(platno.getText());
                buattabbedpane.setSelectedIndex(2);
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(rootPane,"Gagal memasukkan data motor!","Gagal",JOptionPane.ERROR_MESSAGE);
            platno.setText(null);
            jenismotor.setText(null);
            merek.setText(null);
            model.setText(null);
            kilometer.setText(null);
        }
    }//GEN-LAST:event_simpanmotorActionPerformed

    private void simpanservisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanservisActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            String sql ="INSERT INTO DataBengkel.Servis (Nota_No,Plat_No,ID_Montir,Keluhan,Catatan_Servis) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, notano.getText());
            pst.setString(2, platnoset.getText());
            String idm = (String) idmontirset.getSelectedItem();
            pst.setString(3, idm);
            pst.setString(4, keluhan.getText());
            pst.setString(5, catatanservis.getText());
            if(notano.getText().isEmpty() || platnoset.getText().isEmpty() || keluhan.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane,"Masukkan seluruh data sebelum lanjut!","Gagal",JOptionPane.ERROR_MESSAGE);
            }else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Sukses memasukkan data servis","Sukses",JOptionPane.INFORMATION_MESSAGE);
            }   
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(rootPane,"Gagal memasukkan data servis!","Gagal",JOptionPane.ERROR_MESSAGE);
            notano.setText(null);
            keluhan.setText(null);
            catatanservis.setText(null);
        }
    }//GEN-LAST:event_simpanservisActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setTitle("Main Menu");
        m.setVisible(true);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

    private void montirtabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_montirtabelMouseClicked
        // TODO add your handling code here:
        int pilih = montirtabel.getSelectedRow();
        String id = (String) montirtabel.getValueAt(pilih, 0);
        idmontirset.setSelectedItem(id);
        buattabbedpane.setSelectedIndex(3);
    }//GEN-LAST:event_montirtabelMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new BuatData().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField alamat;
    public javax.swing.JPanel buatisi;
    public javax.swing.JPanel buatisipanel;
    public javax.swing.JPanel buatmontir;
    public javax.swing.JPanel buatmotor;
    public javax.swing.JPanel buatpanel;
    public javax.swing.JPanel buatpemilik;
    public javax.swing.JPanel buatservis;
    public javax.swing.JTabbedPane buattabbedpane;
    public javax.swing.JPanel buattitle;
    public javax.swing.JTextField catatanservis;
    public javax.swing.JComboBox<String> idmontirset;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jenismotor;
    public javax.swing.JTextField keluhan;
    public javax.swing.JButton kembali;
    public javax.swing.JTextField kilometer;
    public javax.swing.JTextField merek;
    public javax.swing.JTextField model;
    public javax.swing.JScrollPane montirscrollpane;
    public javax.swing.JTable montirtabel;
    public javax.swing.JTextField nama;
    public javax.swing.JTextField noid;
    public javax.swing.JTextField noidset;
    public javax.swing.JTextField notano;
    public javax.swing.JTextField notel;
    public javax.swing.JTextField platno;
    public javax.swing.JTextField platnoset;
    public javax.swing.JButton simpanmotor;
    public javax.swing.JButton simpanpemilik;
    public javax.swing.JButton simpanservis;
    public javax.swing.JTextField tipeid;
    // End of variables declaration//GEN-END:variables
}
