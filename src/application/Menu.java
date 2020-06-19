package application;

import javax.swing.JFrame;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menupanel = new javax.swing.JPanel();
        menutitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuisi = new javax.swing.JPanel();
        buat = new javax.swing.JButton();
        lihat = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menupanel.setBackground(new java.awt.Color(153, 255, 153));

        menutitle.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AutoMech Workshop");

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Satu Perhentian untuk Semua Perbaikan Motor Anda");

        javax.swing.GroupLayout menutitleLayout = new javax.swing.GroupLayout(menutitle);
        menutitle.setLayout(menutitleLayout);
        menutitleLayout.setHorizontalGroup(
            menutitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menutitleLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(menutitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(menutitleLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        menutitleLayout.setVerticalGroup(
            menutitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menutitleLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        buat.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        buat.setText("Buat Data Servis Baru");
        buat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatActionPerformed(evt);
            }
        });

        lihat.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lihat.setText("Lihat Semua Data Servis");
        lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatActionPerformed(evt);
            }
        });

        keluar.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuisiLayout = new javax.swing.GroupLayout(menuisi);
        menuisi.setLayout(menuisiLayout);
        menuisiLayout.setHorizontalGroup(
            menuisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuisiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar)
                .addContainerGap())
            .addGroup(menuisiLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(menuisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lihat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        menuisiLayout.setVerticalGroup(
            menuisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuisiLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(buat)
                .addGap(36, 36, 36)
                .addComponent(lihat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(keluar)
                .addContainerGap())
        );

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menutitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addComponent(menutitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatActionPerformed
        // TODO add your handling code here:
        BuatData bd = new BuatData();
        bd.setVisible(true);
        bd.setTitle("Buat Data Baru");
        bd.setLocationRelativeTo(null);
        bd.setResizable(false);
        bd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_buatActionPerformed

    private void lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatActionPerformed
        // TODO add your handling code here:
        LihatSemuaData ld = new LihatSemuaData();
        ld.setVisible(true);
        ld.setResizable(true);
        ld.setTitle("Lihat Semua Data");
        ld.setLocationRelativeTo(null);
        ld.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_lihatActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buat;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JButton keluar;
    public javax.swing.JButton lihat;
    public javax.swing.JPanel menuisi;
    public javax.swing.JPanel menupanel;
    public javax.swing.JPanel menutitle;
    // End of variables declaration//GEN-END:variables
}
