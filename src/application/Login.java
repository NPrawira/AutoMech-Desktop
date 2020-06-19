package application;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    
    public String user(String u){
        return u;
    }
    
    public String pass(String p){
        return p;
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginpanel = new javax.swing.JPanel();
        logintitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginisi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginpanel.setBackground(new java.awt.Color(153, 255, 153));

        logintitle.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AutoMech Workshop");

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Satu Perhentian untuk Semua Perbaikan Motor Anda");

        javax.swing.GroupLayout logintitleLayout = new javax.swing.GroupLayout(logintitle);
        logintitle.setLayout(logintitleLayout);
        logintitleLayout.setHorizontalGroup(
            logintitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logintitleLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(logintitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(logintitleLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        logintitleLayout.setVerticalGroup(
            logintitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logintitleLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        jLabel3.setText("LOGIN");

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jLabel5.setText("Password");

        username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        login.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        exit.setText("Keluar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginisiLayout = new javax.swing.GroupLayout(loginisi);
        loginisi.setLayout(loginisiLayout);
        loginisiLayout.setHorizontalGroup(
            loginisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginisiLayout.createSequentialGroup()
                .addGroup(loginisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginisiLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel3))
                    .addGroup(loginisiLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(loginisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginisiLayout.createSequentialGroup()
                                .addComponent(login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                                .addComponent(exit))
                            .addGroup(loginisiLayout.createSequentialGroup()
                                .addGroup(loginisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(loginisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(password))))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        loginisiLayout.setVerticalGroup(
            loginisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginisiLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addGroup(loginisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(loginisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(loginisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(exit))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logintitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addComponent(logintitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String user = user("admin@automech.com");
        String pass = pass("Auto123");
        if(user.equals(username.getText()) && pass.equals(password.getText())) {
            Menu m = new Menu();
            m.setTitle("Main Menu");
            m.setVisible(true);
            m.setResizable(false);
            m.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(null,"Username dan/atau password yang Anda masukkan salah!","Gagal",JOptionPane.ERROR_MESSAGE);
            password.setText(null);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton exit;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JButton login;
    public javax.swing.JPanel loginisi;
    public javax.swing.JPanel loginpanel;
    public javax.swing.JPanel logintitle;
    public javax.swing.JPasswordField password;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
