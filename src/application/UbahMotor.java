package application;

import java.sql.*;
import javax.swing.*;

public class UbahMotor extends javax.swing.JFrame {

    public UbahMotor() {
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

        jLabel8.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel8.setText("Plat Nomor");

        jLabel9.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel9.setText("No. Identitas");

        jLabel10.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel10.setText("Jenis Motor");

        jLabel11.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel11.setText("Merek Motor");

        jLabel12.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel12.setText("Model");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel13.setText("Kilometer");

        platno.setEditable(false);
        platno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        noidset.setEditable(false);
        noidset.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jenismotor.setEditable(false);
        jenismotor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        merek.setEditable(false);
        merek.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        model.setEditable(false);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(simpanmotor)
                .addContainerGap())
        );

        buattabbedpane.addTab("Data Motor", buatmotor);

        javax.swing.GroupLayout buatisipanelLayout = new javax.swing.GroupLayout(buatisipanel);
        buatisipanel.setLayout(buatisipanelLayout);
        buatisipanelLayout.setHorizontalGroup(
            buatisipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buattabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        buatisipanelLayout.setVerticalGroup(
            buatisipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buattabbedpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
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

    private void simpanmotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanmotorActionPerformed
        // TODO add your handling code here:
        String sm = platno.getText();
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            String sql ="UPDATE DataBengkel.Motor SET Plat_No=?, ID_Pemilik=?, Jenis_Motor=?, Merek=?, Model=?, KM_Tempuh=? WHERE Plat_No LIKE'"+sm+"'";
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
                JOptionPane.showMessageDialog(null,"Sukses mengubah data motor","Sukses",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(rootPane,"Gagal mengubah data motor!","Gagal",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_simpanmotorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new UbahMotor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel buatisipanel;
    public javax.swing.JPanel buatmotor;
    public javax.swing.JTabbedPane buattabbedpane;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JTextField jenismotor;
    public javax.swing.JTextField kilometer;
    public javax.swing.JTextField merek;
    public javax.swing.JTextField model;
    public javax.swing.JTextField noidset;
    public javax.swing.JTextField platno;
    public javax.swing.JButton simpanmotor;
    // End of variables declaration//GEN-END:variables
}
