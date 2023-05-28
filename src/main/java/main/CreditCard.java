package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Shruti Patel
 */
public class CreditCard extends javax.swing.JFrame {
 Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form PaymentOption
     */
    public CreditCard() {
        initComponents();
        con=Db_Con.db();
        amt.setText(String.valueOf(User.tprice));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Credit_Card = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcardname = new javax.swing.JTextField();
        txtcardno = new javax.swing.JTextField();
        txtmonth = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        txtcvv = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Pay = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));
        jDesktopPane1.setForeground(new java.awt.Color(204, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1307, 475));

        Credit_Card.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        Credit_Card.setForeground(new java.awt.Color(255, 255, 255));
        Credit_Card.setText(" Credit Card");
        Credit_Card.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jDesktopPane1.add(Credit_Card);
        Credit_Card.setBounds(598, 39, 320, 63);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Card No:");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(324, 219, 325, 27);
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(209, 180, 0, 0);
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(209, 209, 0, 0);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Card Holder Name:");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(324, 151, 181, 27);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Month:");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(324, 279, 66, 27);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Year:");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(324, 339, 47, 27);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("CVV No:");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(324, 399, 78, 27);

        txtcardname.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtcardname.setText(" ");
        jDesktopPane1.add(txtcardname);
        txtcardname.setBounds(685, 151, 350, 35);

        txtcardno.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtcardno);
        txtcardno.setBounds(685, 219, 350, 35);

        txtmonth.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtmonth);
        txtmonth.setBounds(685, 279, 350, 35);

        txtyear.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtyear);
        txtyear.setBounds(685, 339, 350, 35);

        txtcvv.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtcvv);
        txtcvv.setBounds(685, 399, 350, 35);

        Back.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\back.png")); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Back);
        Back.setBounds(403, 547, 180, 45);

        Pay.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        Pay.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Payment.png")); // NOI18N
        Pay.setText("Pay");
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Pay);
        Pay.setBounds(668, 547, 170, 45);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Amount:");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(324, 467, 81, 27);

        amt.setEditable(false);
        amt.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(amt);
        amt.setBounds(685, 459, 350, 35);

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
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1373, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        PaymentOption ob=new PaymentOption();
        ob.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
        if(txtcardname.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Card Holder Name field is empty");
            }
        else if(txtcardno.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Card Number field is empty");
            }
        else if(txtmonth.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Month field is empty");
            }
        else if(txtyear.getText().equals("") || txtyear.getText().length()>4){
               JOptionPane.showMessageDialog(null, "Year field is empty or not valid");
            }
        else if(txtcvv.getText().equals("")){
               
               JOptionPane.showMessageDialog(null, "CVV field is empty");
            }
        else if(txtcvv.getText().length()!=3){
            JOptionPane.showMessageDialog(null,"Enter valid 3 digit cvv.");
        }
        else{
            try {
                JOptionPane.showMessageDialog(null,"payment successful");
                Payment_Receipt pr=new Payment_Receipt();
                pr.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_PayActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
     try {
         setVisible(false);
         Home ob=new Home();
         ob.setVisible(true);
     } catch (SQLException ex) {
         Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_homeMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        this.toBack();
        User.count3=12;
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
            java.util.logging.Logger.getLogger(PaymentOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     //</editor-fold>
     //</editor-fold>
     
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreditCard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Credit_Card;
    private javax.swing.JButton Pay;
    private javax.swing.JTextField amt;
    private javax.swing.JMenu contact;
    private javax.swing.JMenu help;
    private javax.swing.JMenu home;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JTextField txtcardname;
    private javax.swing.JTextField txtcardno;
    private javax.swing.JTextField txtcvv;
    private javax.swing.JTextField txtmonth;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
