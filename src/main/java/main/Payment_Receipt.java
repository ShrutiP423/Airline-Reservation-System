
package main;

import java.awt.print.PrinterException;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shruti Patel
 */
public class Payment_Receipt extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    
     
    Date currentDate = GregorianCalendar.getInstance().getTime();
    DateFormat df = DateFormat.getDateInstance();
    String dateString = df.format(currentDate);

    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    String timeString = sdf.format(d);
    String date = dateString+" "+ timeString;
            
    
     public static int cid;
    /**
     * Creates new form FeeSystem
     * @throws java.sql.SQLException
     */
    public Payment_Receipt() throws SQLException {
        initComponents();
        con=Db_Con.db();
        
        tno.setText(String.valueOf(User.tno));
        name.setText(String.valueOf(User.cname));
        cno.setText(String.valueOf(User.cnum));
        amt.setText(String.valueOf(User.tprice));
        username.setText(String.valueOf(User.userId));
        
        User.payment = true;
        String sql = "update book set b_date=?,payment=? where Ticket_No=?";
            pst=con.prepareStatement(sql);
            pst.setString(3,tno.getText());
            pst.setString(1,date);
            pst.setBoolean(2, User.payment );
            pst.execute();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        cno = new javax.swing.JTextField();
        greceipt = new javax.swing.JButton();
        preceipt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Payment Receipt");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 22, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Contact Number:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 291, 186, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Customer Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 208, 186, -1));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 207, 245, 33));

        cno.setEditable(false);
        cno.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 245, 33));

        greceipt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        greceipt.setText("Generate Receipt");
        greceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greceiptActionPerformed(evt);
            }
        });
        getContentPane().add(greceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 270, -1));

        preceipt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        preceipt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\print.jpg")); // NOI18N
        preceipt.setText("Print Receipt");
        preceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preceiptActionPerformed(evt);
            }
        });
        getContentPane().add(preceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 260, -1));

        area.setEditable(false);
        area.setBackground(new java.awt.Color(255, 153, 153));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        area.setForeground(new java.awt.Color(51, 0, 51));
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 124, 459, 371));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText(" Amount:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 374, 186, -1));

        amt.setEditable(false);
        amt.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 373, 245, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Registration No.:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 125, 186, -1));

        tno.setEditable(false);
        tno.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(tno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 124, 245, 33));

        jLabel6.setText("Logged in as :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 90, -1));

        username.setText("user");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 170, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preceiptActionPerformed
       
        try{
           
            if(area.print()){
                
                Home hm=new Home();
                hm.setVisible(true);
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Print the Receipt for future use.");
            }
            
           Booked_Ticket bt=new Booked_Ticket();
           bt.setVisible(true);
            
        }
        catch(PrinterException ex){
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Payment_Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_preceiptActionPerformed

    private void greceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greceiptActionPerformed
        try {
            
            area.setText("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            area.setText(area.getText()+"~                               Payment Receipt                             ~\n");
            area.setText(area.getText()+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            
            area.setText(area.getText()+"\n"+date+"\n\n");
            area.setText(area.getText()+"Registration No.:  "+tno.getText()+"\n");
            area.setText(area.getText()+"Customer Name:  "+name.getText()+"\n");
            area.setText(area.getText()+"Customer Ids: \n");
            String sql="select * from customer where Ticket_No=?";
            pst=con.prepareStatement(sql);
            pst.setString(1, tno.getText());
            rs=pst.executeQuery();
            while(rs.next()){
                cid=rs.getInt("id");
                User.cid=cid;
                area.setText(area.getText()+" "+User.cid+"\n");
            }
            
            area.setText(area.getText()+"Contact number:  "+cno.getText()+"\n");
            area.setText(area.getText()+"Amount Payed:  "+amt.getText()+"\n");
        } catch (SQLException ex) {
            Logger.getLogger(Payment_Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_greceiptActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        try {
            if(area.print()){
            setVisible(false);
            Home ob=new Home();
            ob.setVisible(true);}
            else{
            JOptionPane.showMessageDialog(null,"Print the Receipt for future use.");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Payment_Receipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PrinterException ex) {
            Logger.getLogger(Payment_Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        this.toBack();
        User.count3=7;
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
            java.util.logging.Logger.getLogger(Payment_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Payment_Receipt().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Payment_Receipt.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amt;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField cno;
    private javax.swing.JMenu contact;
    private javax.swing.JButton greceipt;
    private javax.swing.JMenu help;
    private javax.swing.JMenu home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JButton preceipt;
    private javax.swing.JTextField tno;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
