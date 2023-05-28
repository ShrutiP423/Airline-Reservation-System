package main;

import main.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shruti Patel
 */
public class DebitCard extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form PaymentOption
     */
    public DebitCard() {
        initComponents();
        con=Db_Con.db();
        amt.setText(String.valueOf(User.tprice));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        txtvalidity = new javax.swing.JTextField();
        txtcvv = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Pay = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcardno = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));
        jDesktopPane1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1390, 900));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Card Holder Name:");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(410, 130, 167, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Validity Year:");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(413, 257, 170, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Enter CVV:");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(413, 339, 141, 27);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Debit Card");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(581, 20, 275, 67);

        txtcname.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtcname);
        txtcname.setBounds(630, 130, 350, 30);

        txtvalidity.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtvalidity);
        txtvalidity.setBounds(628, 259, 350, 30);

        txtcvv.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtcvv);
        txtcvv.setBounds(628, 339, 350, 30);

        Back.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\back.png")); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Back);
        Back.setBounds(476, 506, 140, 40);

        Pay.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        Pay.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Payment.png")); // NOI18N
        Pay.setText("Pay");
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Pay);
        Pay.setBounds(705, 506, 150, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 255));
        jLabel5.setText("Amount:");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(413, 419, 167, 27);

        amt.setEditable(false);
        amt.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(amt);
        amt.setBounds(628, 419, 350, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("Card No.:");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(410, 200, 150, 27);

        txtcardno.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtcardno);
        txtcardno.setBounds(630, 200, 350, 30);

        home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Home.jpg")); // NOI18N
        home.setText("Home              ");
        home.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jMenuBar1.add(home);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        PaymentOption ob=new PaymentOption();
        ob.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
        try {
            if(txtcname.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Card Holder Name field is empty");
            }
            else if(txtcardno.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Card Number field is empty");
            }
            else if(txtvalidity.getText().equals("") || txtvalidity.getText().length()>4){
                JOptionPane.showMessageDialog(null, "Validity Year field is empty or not valid");
            }
            
            else if(txtcvv.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "CVV field is empty");
            }
            else if(txtcvv.getText().length()!=3){
                JOptionPane.showMessageDialog(null,"Enter valid 3 digit cvv.");
            }
            else{
                
                JOptionPane.showMessageDialog(null,"payment successful");
            
            Payment_Receipt pr=new Payment_Receipt();
            pr.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DebitCard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PayActionPerformed

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        this.toBack();
        User.count3=13;
        Help ob=new Help();
        ob.setVisible(true);
        ob.toFront();
    }//GEN-LAST:event_helpMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        try {
            setVisible(false);
            Home ob=new Home();
            ob.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DebitCard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeMouseClicked

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
            java.util.logging.Logger.getLogger(PaymentOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DebitCard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Pay;
    private javax.swing.JTextField amt;
    private javax.swing.JMenu contact;
    private javax.swing.JMenu help;
    private javax.swing.JMenu home;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JTextField txtcardno;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtcvv;
    private javax.swing.JTextField txtvalidity;
    // End of variables declaration//GEN-END:variables
}
