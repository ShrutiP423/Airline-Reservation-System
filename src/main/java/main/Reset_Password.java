package main;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Shruti Patel
 */
public class Reset_Password extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form login
     * @throws java.sql.SQLException
     */
    public Reset_Password() throws SQLException {
        initComponents();
         con=Db_Con.db();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        Pass = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        pwd = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        newpwd = new javax.swing.JPasswordField();
        jlabel1 = new javax.swing.JLabel();
        cfpwd = new javax.swing.JPasswordField();
        back = new javax.swing.JLabel();

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 210, 120, 30);

        jlabel.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jlabel.setText("New Password:");
        jPanel1.add(jlabel);
        jlabel.setBounds(480, 360, 170, 23);

        uname.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel1.add(uname);
        uname.setBounds(680, 210, 240, 30);

        update.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\update icon.png")); // NOI18N
        update.setText("Update ");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(520, 560, 160, 40);

        pwd.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel1.add(pwd);
        pwd.setBounds(680, 290, 240, 30);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel4.setText("Reset password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(500, 70, 410, 64);

        exit.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Exit.png")); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(770, 560, 100, 40);

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel3.setText("Old Password:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 290, 150, 23);

        newpwd.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel1.add(newpwd);
        newpwd.setBounds(680, 360, 240, 30);

        jlabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jlabel1.setText("Confirm Password:");
        jPanel1.add(jlabel1);
        jlabel1.setBounds(480, 440, 190, 23);

        cfpwd.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel1.add(cfpwd);
        cfpwd.setBounds(680, 430, 240, 30);

        back.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        back.setText("<--- Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(0, 0, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1542, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        try {
            String Username= uname.getText();
            String Password=pwd.getText();
           
            if(uname.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Username field is empty");
            }
            else if(pwd.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Password field is empty");
            }
            else if(Username.equals("Admin2022")){
                if(newpwd.getText().equals(cfpwd.getText())){
                 String sql = "update account set Password='"+newpwd.getText()+"' where Username = '"+Username+"' and Password ='"+Password+"'";
                    pst=con.prepareStatement(sql);
                     pst.executeUpdate();  
                    
                    JOptionPane.showMessageDialog(null, "Update successfull");
                    new Login().setVisible(true);
                   
                 }
                else{
                     JOptionPane.showMessageDialog(null, "Confirm password is incorrect");
                }
               
            
            }
            else{
            if(newpwd.getText().equals(cfpwd.getText())){
            String sql = "update account set Password='"+newpwd.getText()+"' where Username = '"+Username+"' and Password ='"+Password+"'";
            pst=con.prepareStatement(sql);
            
             pst.executeUpdate();  
            
            
               JOptionPane.showMessageDialog(null, "Update successfull");
               new Login().setVisible(true);
                
            }
            else {
               JOptionPane.showMessageDialog(null, "Confirm password is incorrect");
            
            }
            }
            
           
            
            }
            catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }    
                     
        
    }//GEN-LAST:event_updateActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        try {
            new Login().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Reset_Password.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reset_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Reset_Password().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Reset_Password.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pass;
    private javax.swing.JLabel back;
    private javax.swing.JPasswordField cfpwd;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JPasswordField newpwd;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField uname;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
