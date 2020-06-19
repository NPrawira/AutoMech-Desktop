package application;

import javax.swing.JFrame;

public class AutoMech {

    public static void main(String[] args) {
        Login lo = new Login();
        lo.setVisible(true);
        lo.setTitle("Login");
        lo.setResizable(false);
        lo.setLocationRelativeTo(null);
        lo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
