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
public class ForgotPass extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form 
     * @throws java.sql.SQLException
     */
    public ForgotPass() throws SQLException {
        super("Forgot Password");
        initComponents();
         con=Db_Con.db();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        que = new javax.swing.JTextField();
        ans = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        retrieve = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        pwd = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(245, 231, 101, 27);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Security Question:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(245, 328, 173, 27);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Answer:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(245, 379, 75, 27);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("Your Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(245, 431, 144, 27);

        user.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel1.add(user);
        user.setBounds(451, 231, 281, 30);

        que.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel1.add(que);
        que.setBounds(451, 328, 281, 30);

        ans.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel1.add(ans);
        ans.setBounds(451, 379, 281, 30);

        back.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\back.png")); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(362, 532, 87, 40);

        search.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Search.jpg")); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(784, 231, 130, 31);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel5.setText("Forgot Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(334, 40, 436, 64);

        retrieve.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        retrieve.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\refresh.png")); // NOI18N
        retrieve.setText("Retrieve");
        retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveActionPerformed(evt);
            }
        });
        jPanel1.add(retrieve);
        retrieve.setBounds(784, 376, 130, 37);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("Name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(245, 280, 101, 27);

        name.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel1.add(name);
        name.setBounds(451, 280, 281, 30);

        pwd.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel1.add(pwd);
        pwd.setBounds(451, 431, 281, 30);

        exit.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Exit.png")); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(614, 532, 100, 40);

        contact.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Contact us.jpg")); // NOI18N
        contact.setText(" Contact us              ");
        contact.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setText("+91 9909803211");
        contact.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setText("+91 9909803223");
        contact.add(jMenuItem4);

        jMenuBar1.add(contact);

        help.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Help.jpg")); // NOI18N
        help.setText("Help                      ");
        help.setActionCommand("          Username    ");
        help.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1147, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if(user.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Username field is empty");
            }
        
        
        
        String sql1="select * from account where Username =?";
        try{
            
            pst=con.prepareStatement(sql1);
            pst.setString(1,user.getText());
            rs=pst.executeQuery();
        if(rs.next()){
            que.setText(rs.getString("Sec_Q"));
            name.setText(rs.getString("Name"));
            rs.close();
            pst.close();
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect Username");
        }
        
        }catch(HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null,e);
                }
        
       
    }//GEN-LAST:event_searchActionPerformed

    private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveActionPerformed
       
        try {
            if(ans.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Answer field is empty");
            }
            String sql="select * from account where Username=? and Answer=?";
            
            
            pst=con.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2,ans.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                pwd.setText(rs.getString("Password"));
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect ");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPass.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_retrieveActionPerformed

       
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        try {
           
            setVisible(false);
            Login ob = new Login();
            ob.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
       this.toBack();
       User.count3=15;
        Help ob=new Help();
        ob.setVisible(true);
        ob.toFront();
    }//GEN-LAST:event_helpMouseClicked

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
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ForgotPass().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ForgotPass.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JButton back;
    private javax.swing.JMenu contact;
    private javax.swing.JButton exit;
    private javax.swing.JMenu help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pwd;
    private javax.swing.JTextField que;
    private javax.swing.JButton retrieve;
    private javax.swing.JButton search;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
