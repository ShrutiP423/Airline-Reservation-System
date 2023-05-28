package main;


import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author Shruti Patel
 */
public class Registration extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form registration
     * @throws java.sql.SQLException
     */
    public Registration() throws SQLException {
        initComponents();
        con=Db_Con.db();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        cpwd = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        que = new javax.swing.JComboBox<>();
        note = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel2.setText("Name:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(460, 250, 110, 25);

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel3.setText("Password:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(460, 430, 120, 25);

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(460, 490, 190, 25);

        name.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jPanel3.add(name);
        name.setBounds(680, 240, 240, 30);

        uname.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jPanel3.add(uname);
        uname.setBounds(680, 180, 240, 30);

        cpwd.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jPanel3.add(cpwd);
        cpwd.setBounds(680, 490, 240, 30);

        signup.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        signup.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Login in.jpg")); // NOI18N
        signup.setText("SignUp");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel3.add(signup);
        signup.setBounds(350, 580, 150, 30);

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel1.setText("Username:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(460, 190, 140, 25);

        pwd.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwdMouseClicked(evt);
            }
        });
        jPanel3.add(pwd);
        pwd.setBounds(680, 420, 240, 30);

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel5.setText("Security Question:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(460, 300, 200, 30);

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel6.setText("Answer:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(460, 370, 120, 20);

        ans.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jPanel3.add(ans);
        ans.setBounds(680, 360, 240, 30);

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 102));
        jLabel8.setText("Sign Up");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(600, 40, 200, 64);

        exit.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Exit.png")); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel3.add(exit);
        exit.setBounds(890, 580, 120, 30);

        que.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favourite colour?", "Which is your favourite movie?", "What is your school name?" }));
        jPanel3.add(que);
        que.setBounds(680, 300, 240, 30);

        note.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        note.setText("*Password must have atleast 8 characters.");
        note.setEnabled(false);
        jPanel3.add(note);
        note.setBounds(680, 460, 240, 16);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Login in.jpg")); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(650, 580, 120, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\signup_login_bg.jpg")); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(-80, -100, 1500, 880);

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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        try {
            if(uname.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Username field is empty");
            }
            else if(name.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Name field is empty");
            }
            else if(uname.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Username field is empty");
            }
            else if(que.getSelectedItem().equals("")){
               JOptionPane.showMessageDialog(null, "Security Question field is empty");
            }
            else if(ans.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Answer field is empty");
            }
            else if(pwd.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Password field is empty");
            }
            else if(pwd.getText().length()<8){
               JOptionPane.showMessageDialog(null, "Please enter atleast 8 characters password");
               note.setForeground(Color.red);
            }
            else if(cpwd.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Confirm Password field is empty");
            }
            
            
            else if(pwd.getText().equals(cpwd.getText())){
            String sql = "insert into account( Username,Name,Password,Sec_Q,Answer)values(?,?,?,?,?)";
            pst=con.prepareStatement(sql);
            pst.setString(1,uname.getText());
            pst.setString(2,name.getText());
            pst.setString(3,pwd.getText());
            pst.setString(4,que.getSelectedItem().toString());
            pst.setString(5,ans.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "New Account Created");
            
            Login l = new Login();
            l.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Confirm password again");
            }
        } 
        catch(SQLIntegrityConstraintViolationException ex){
        JOptionPane.showMessageDialog(null, "Existing username.Try another.");
        }
        catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signupActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        this.toBack();
        User.count3=8;
        Help ob=new Help();
        ob.setVisible(true);
        ob.toFront();
    }//GEN-LAST:event_helpMouseClicked

    private void pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwdMouseClicked
        
        note.setEnabled(true);
        
    }//GEN-LAST:event_pwdMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new Login().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
        
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Registration().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JMenu contact;
    private javax.swing.JPasswordField cpwd;
    private javax.swing.JButton exit;
    private javax.swing.JMenu help;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JLabel note;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JComboBox<String> que;
    private javax.swing.JButton signup;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
