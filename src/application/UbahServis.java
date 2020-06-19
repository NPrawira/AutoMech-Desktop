package application;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class UbahServis extends javax.swing.JFrame {

    public UbahServis() {
        initComponents();
        montirAllData();
        setIDMontir();
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
       while(idm.next()){
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

        ubahservispanel = new javax.swing.JPanel();
        ubahservistitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ubahservisisi = new javax.swing.JPanel();
        ubahisipanel = new javax.swing.JPanel();
        ubahtabbedpane = new javax.swing.JTabbedPane();
        ubahservis = new javax.swing.JPanel();
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
        montirscrollpane = new javax.swing.JScrollPane();
        montirtabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ubahservispanel.setBackground(new java.awt.Color(153, 255, 153));

        ubahservistitle.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AutoMech Workshop");

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Satu Perhentian untuk Semua Perbaikan Motor Anda");

        javax.swing.GroupLayout ubahservistitleLayout = new javax.swing.GroupLayout(ubahservistitle);
        ubahservistitle.setLayout(ubahservistitleLayout);
        ubahservistitleLayout.setHorizontalGroup(
            ubahservistitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ubahservistitleLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(ubahservistitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(ubahservistitleLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ubahservistitleLayout.setVerticalGroup(
            ubahservistitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ubahservistitleLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        ubahtabbedpane.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N

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

        notano.setEditable(false);
        notano.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        platnoset.setEditable(false);
        platnoset.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        idmontirset.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N

        keluhan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        catatanservis.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        simpanservis.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        simpanservis.setText("Simpan");
        simpanservis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanservisActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout ubahservisLayout = new javax.swing.GroupLayout(ubahservis);
        ubahservis.setLayout(ubahservisLayout);
        ubahservisLayout.setHorizontalGroup(
            ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ubahservisLayout.createSequentialGroup()
                .addGroup(ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ubahservisLayout.createSequentialGroup()
                        .addGroup(ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ubahservisLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catatanservis)
                                    .addGroup(ubahservisLayout.createSequentialGroup()
                                        .addGroup(ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(notano, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(platnoset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(keluhan, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idmontirset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(ubahservisLayout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(simpanservis)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ubahservisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(montirscrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ubahservisLayout.setVerticalGroup(
            ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ubahservisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(montirscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(notano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(platnoset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(idmontirset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(keluhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ubahservisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(catatanservis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(simpanservis)
                .addContainerGap())
        );

        ubahtabbedpane.addTab("Nota Servis", ubahservis);

        javax.swing.GroupLayout ubahisipanelLayout = new javax.swing.GroupLayout(ubahisipanel);
        ubahisipanel.setLayout(ubahisipanelLayout);
        ubahisipanelLayout.setHorizontalGroup(
            ubahisipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubahtabbedpane)
        );
        ubahisipanelLayout.setVerticalGroup(
            ubahisipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubahtabbedpane)
        );

        javax.swing.GroupLayout ubahservisisiLayout = new javax.swing.GroupLayout(ubahservisisi);
        ubahservisisi.setLayout(ubahservisisiLayout);
        ubahservisisiLayout.setHorizontalGroup(
            ubahservisisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubahisipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ubahservisisiLayout.setVerticalGroup(
            ubahservisisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubahisipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ubahservispanelLayout = new javax.swing.GroupLayout(ubahservispanel);
        ubahservispanel.setLayout(ubahservispanelLayout);
        ubahservispanelLayout.setHorizontalGroup(
            ubahservispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubahservistitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ubahservispanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ubahservisisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ubahservispanelLayout.setVerticalGroup(
            ubahservispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ubahservispanelLayout.createSequentialGroup()
                .addComponent(ubahservistitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ubahservisisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubahservispanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubahservispanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void montirtabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_montirtabelMouseClicked
        // TODO add your handling code here:
        int pilih = montirtabel.getSelectedRow();
        String id = (String) montirtabel.getValueAt(pilih, 0);
        idmontirset.setSelectedItem(id);
    }//GEN-LAST:event_montirtabelMouseClicked

    private void simpanservisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanservisActionPerformed
        // TODO add your handling code here:
        String ss = notano.getText();
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            String sql ="UPDATE DataBengkel.Servis SET Nota_No=?, Plat_No=?, ID_Montir=?, Keluhan=?, Catatan_Servis=? WHERE Nota_No LIKE'"+ss+"'";
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
                JOptionPane.showMessageDialog(null,"Sukses mengubah data servis","Sukses",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(rootPane,"Gagal mengubah data servis!","Gagal",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_simpanservisActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new UbahServis().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField catatanservis;
    public javax.swing.JComboBox<String> idmontirset;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JTextField keluhan;
    public javax.swing.JScrollPane montirscrollpane;
    public javax.swing.JTable montirtabel;
    public javax.swing.JTextField notano;
    public javax.swing.JTextField platnoset;
    public javax.swing.JButton simpanservis;
    public javax.swing.JPanel ubahisipanel;
    public javax.swing.JPanel ubahservis;
    public javax.swing.JPanel ubahservisisi;
    public javax.swing.JPanel ubahservispanel;
    public javax.swing.JPanel ubahservistitle;
    public javax.swing.JTabbedPane ubahtabbedpane;
    // End of variables declaration//GEN-END:variables
}
