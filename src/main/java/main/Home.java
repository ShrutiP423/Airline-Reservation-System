
package main;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
public class Home extends javax.swing.JFrame {
    
    Connection con;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form Home
     * @throws java.sql.SQLException
     */
    public Home() throws SQLException {
        initComponents();
        con=Db_Con.db();
        username.setText(String.valueOf(User.userId));
        
        boolean enter=true;
        String sql="insert into home (Enter,Username)values(?,?)";
        pst=con.prepareStatement(sql);
        pst.setBoolean(1,enter);
        pst.setString(2,username.getText());
        pst.execute();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        booked = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        tw = new javax.swing.JLabel();
        ig = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SearchnBook = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        signout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenu();
        terms = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel4.setLayout(null);

        booked.setFont(new java.awt.Font("Bookman Old Style", 3, 15)); // NOI18N
        booked.setForeground(new java.awt.Color(0, 51, 255));
        booked.setText("Booked Ticket");
        booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookedMouseClicked(evt);
            }
        });
        jPanel4.add(booked);
        booked.setBounds(87, 124, 130, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Booked.png")); // NOI18N
        jPanel4.add(jLabel12);
        jLabel12.setBounds(97, 18, 97, 88);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(580, 410, 300, 170);

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\whatsapp.png")); // NOI18N
        jLabel8.setText("+91 9909803211");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 610, 180, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Logged in as :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1060, 10, 90, 16);

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("user");
        jPanel1.add(username);
        username.setBounds(1150, 10, 200, 16);

        tw.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\twitter.png")); // NOI18N
        tw.setText("www.twitter.com");
        tw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twMouseClicked(evt);
            }
        });
        jPanel1.add(tw);
        tw.setBounds(440, 610, 140, 30);

        ig.setBackground(new java.awt.Color(255, 255, 204));
        ig.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\insta.png")); // NOI18N
        ig.setText("www.instagram.com");
        ig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igMouseClicked(evt);
            }
        });
        jPanel1.add(ig);
        ig.setBounds(230, 610, 160, 30);

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("FLYHIGH");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 20, 230, 64);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("Airline Reservation System");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 90, 470, 50);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Life Is Short And The World Is Wide!");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(880, 120, 310, 25);

        jLabel14.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel14.setText("To get the best of your adventures you need to leave and");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(820, 150, 430, 20);

        jLabel15.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel15.setText("go where you like.");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(950, 170, 160, 20);

        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(1140, 610, 90, 23);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Cancel Ticket.jpg")); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(92, 9, 100, 107);

        cancel.setFont(new java.awt.Font("Bookman Old Style", 3, 15)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 51, 255));
        cancel.setText("Cancel Ticket");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel3.add(cancel);
        cancel.setBounds(80, 130, 120, 19);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("*No refund on cancellation");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(120, 150, 160, 16);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(990, 410, 280, 170);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Travel.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(100, 9, 107, 100);

        SearchnBook.setFont(new java.awt.Font("Bookman Old Style", 3, 15)); // NOI18N
        SearchnBook.setForeground(new java.awt.Color(0, 51, 255));
        SearchnBook.setText("Search Flight Ticket and Book Ticket");
        SearchnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchnBookMouseClicked(evt);
            }
        });
        jPanel2.add(SearchnBook);
        SearchnBook.setBounds(3, 115, 313, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 410, 310, 170);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Main.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-90, -10, 1600, 610);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Address:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(620, 610, 80, 20);

        jLabel11.setText("Faculty of Technology and Engineering,");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(710, 610, 270, 16);

        jLabel16.setText("Vadodara");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(710, 630, 80, 16);

        signout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signout.setText("Sign out");
        signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutActionPerformed(evt);
            }
        });
        jPanel1.add(signout);
        signout.setBounds(1250, 610, 90, 23);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        contact.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Contact us.jpg")); // NOI18N
        contact.setText("Contact us           ");
        contact.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setText("+91 9909803211");
        contact.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem4.setText("+91 9909803223");
        contact.add(jMenuItem4);

        jMenuBar1.add(contact);

        help.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Help.jpg")); // NOI18N
        help.setText(" Help               ");
        help.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        jMenuBar1.add(help);

        about.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\about us.png")); // NOI18N
        about.setText("About us           ");
        about.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(about);

        terms.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\privacy.jpg")); // NOI18N
        terms.setText("Terms and Privacy Policy");
        terms.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        terms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                termsMouseClicked(evt);
            }
        });
        jMenuBar1.add(terms);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1365, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchnBookMouseClicked
        try {
            setVisible(false);
            Search_Flight_Details ob = new Search_Flight_Details();
            ob.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SearchnBookMouseClicked

    private void termsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termsMouseClicked
        setVisible(false);
        Terms_Policy term = new Terms_Policy();
        term.setVisible(true);
    }//GEN-LAST:event_termsMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        setVisible(false);
        About_us a = new About_us();
        a.setVisible(true);
    }//GEN-LAST:event_aboutMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        this.toBack();
        User.count3=5;
        Help ob=new Help();
        ob.setVisible(true);
        ob.toFront();
    }//GEN-LAST:event_helpMouseClicked

    private void bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookedMouseClicked
        try {
            String Username= username.getText();
            String sql = "select * from book where Username = '"+Username+"' and payment='"+1+"'";
            pst=con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            if(rs.next()){
                setVisible(false);
                Booked_Ticket bt = new Booked_Ticket();
                bt.setVisible(true);
            
            }
            else{
                JOptionPane.showMessageDialog(null, "No ticket booked yet.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        
    }//GEN-LAST:event_bookedMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        try {                                    
            String Username= username.getText();
            String sql = "select * from book where Username = '"+Username+"' and payment='"+1+"'";
            pst=con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            if(rs.next()){
                setVisible(false);
                Cancel_Flight_Ticket c = new Cancel_Flight_Ticket();
                c.setVisible(true);
            
            }
            else{
                JOptionPane.showMessageDialog(null, "No ticket booked yet.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        try {
            this.dispose();
            new Login().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void igMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_igMouseClicked

    private void twMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.twitter.com"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_twMouseClicked

    private void signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutActionPerformed
        try {
            String sql="DELETE FROM account WHERE Username = ?";
            pst=con.prepareStatement(sql);
            String t1 = username.getText();
            
            pst.setString(1, t1);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Signed out");
            
            this.dispose();
            Registration r= new Registration();
            r.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_signoutActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Home().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SearchnBook;
    private javax.swing.JMenu about;
    private javax.swing.JLabel booked;
    private javax.swing.JLabel cancel;
    private javax.swing.JMenu contact;
    private javax.swing.JMenu help;
    private javax.swing.JLabel ig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logout;
    private javax.swing.JButton signout;
    private javax.swing.JMenu terms;
    private javax.swing.JLabel tw;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
