package application;

import java.sql.*;
import javax.swing.*;

public class UbahPemilik extends javax.swing.JFrame {

    public UbahPemilik() {
        initComponents();
    }

    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=AutoMech;user=sa;password=userjuga";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AutoMech Workshop");

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Satu Perhentian untuk Semua Perbaikan Motor Anda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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

        noid.setEditable(false);
        noid.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tipeid.setEditable(false);
        tipeid.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        nama.setEditable(false);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(simpanpemilik)
                .addContainerGap())
        );

        buattabbedpane.addTab("Data Pemilik", buatpemilik);

        javax.swing.GroupLayout buatisipanelLayout = new javax.swing.GroupLayout(buatisipanel);
        buatisipanel.setLayout(buatisipanelLayout);
        buatisipanelLayout.setHorizontalGroup(
            buatisipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buattabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        buatisipanelLayout.setVerticalGroup(
            buatisipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buattabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(buatisipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(buatisipanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanpemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanpemilikActionPerformed
        // TODO add your handling code here:
        String sp = noid.getText();
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            String sql ="UPDATE DataBengkel.Pemilik SET ID_Pemilik=?, Tipe_ID=?, Nama=?, Alamat=?, No_Telepon=? WHERE ID_Pemilik LIKE'"+sp+"'";
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
                JOptionPane.showMessageDialog(null,"Sukses mengubah data pemilik","Sukses",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(rootPane,"Gagal mengubah data pemilik!","Gagal",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_simpanpemilikActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new UbahPemilik().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField alamat;
    public javax.swing.JPanel buatisipanel;
    public javax.swing.JPanel buatpemilik;
    public javax.swing.JTabbedPane buattabbedpane;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JTextField nama;
    public javax.swing.JTextField noid;
    public javax.swing.JTextField notel;
    public javax.swing.JButton simpanpemilik;
    public javax.swing.JTextField tipeid;
    // End of variables declaration//GEN-END:variables
}
