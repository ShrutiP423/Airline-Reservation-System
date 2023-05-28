
package main;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Shruti Patel
 */
public class Booked_Ticket extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form Booked_Ticket
     * @throws java.sql.SQLException
     */
    public Booked_Ticket() throws SQLException {
        initComponents();
        con=Db_Con.db();
        username.setText(String.valueOf(User.userId));
    }

    public static BufferedImage getScreenShot(Component component){
    
        BufferedImage image = new BufferedImage(component.getWidth(),component.getHeight(),BufferedImage.TYPE_INT_RGB);
        component.paint(image.getGraphics());
        return image;
    }
    
    public static void SaveScreenShot(Component component,String filename) throws IOException{
    
    BufferedImage img = getScreenShot(component );
    ImageIO.write(img,"png",new File (filename));
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        cid1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        ticket = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        preceipt = new javax.swing.JButton();
        greceipt = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Customer Id:");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(132, 53, 108, 25);
        jDesktopPane1.add(cid1);
        cid1.setBounds(304, 51, 134, 34);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Ticket No. : ");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(629, 53, 102, 25);
        jDesktopPane1.add(tno);
        tno.setBounds(758, 52, 135, 32);

        ticket.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ticket.setText("Ticket");
        ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketActionPerformed(evt);
            }
        });
        jDesktopPane1.add(ticket);
        ticket.setBounds(960, 50, 150, 32);

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("user");
        jDesktopPane1.add(username);
        username.setBounds(1220, 0, 200, 16);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Logged in as :");
        jDesktopPane1.add(jLabel16);
        jLabel16.setBounds(1140, 0, 90, 16);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(290, 110, 570, 400);

        preceipt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        preceipt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\print.jpg")); // NOI18N
        preceipt.setText("Print Receipt");
        preceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preceiptActionPerformed(evt);
            }
        });
        jDesktopPane1.add(preceipt);
        preceipt.setBounds(730, 550, 189, 39);

        greceipt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        greceipt.setText("Generate Receipt");
        greceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greceiptActionPerformed(evt);
            }
        });
        jDesktopPane1.add(greceipt);
        greceipt.setBounds(280, 550, 213, 39);

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
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketActionPerformed
      
        try {
            String sql = "select * from customer where id=?";
            pst=con.prepareStatement(sql);
            pst.setString(1, cid1.getText());
            rs=pst.executeQuery();
            while(rs.next()){
                String firname = rs.getString("firstname");
                User.fiName = firname;
                String lasname = rs.getString("lastname");
                User.lName = lasname;
                int cid = rs.getInt("id");
                User.cid = cid;
                
            }
            String sql1 = "Select * from book where Ticket_No=?";    
            pst=con.prepareStatement(sql1);
            pst.setString(1, tno.getText());
            rs=pst.executeQuery();
            while(rs.next()){
                String flight2 = rs.getString("Flight_Name");
                User.fName = flight2;
                String source = rs.getString("Source");
                User.fFrom = source;
                String dest = rs.getString("Destination");
                User.fTo = dest;
                String date3 = rs.getString("Date");
                User.fDate = date3;
                String atime = rs.getString("Arrival_Time");
                User.fTime = atime;
                String class3 = rs.getString("Class");
                User.class2 = class3;
            }
            
            if("AIR INDIA".equals(User.fName)){
                String sql2="select * from seat20 where id='"+cid1.getText()+"'";
                pst=con.prepareStatement(sql2);
                
                rs=pst.executeQuery();
                while(rs.next()){
                    
                    int add9=rs.getInt("Sel_Seats");
                    User.seatno=add9;
                }
            }
            
            else if("INDIGO".equals(User.fName)){
                String sql3="select * from seat30 where id='"+cid1.getText()+"'";
                pst=con.prepareStatement(sql3);
                
                rs=pst.executeQuery();
                while(rs.next()){
                    
                    int add9=rs.getInt("Sel_Seats");
                    User.seatno=add9;
                }
                
              
              
            }
            
            /*id.setText(String.valueOf(User.cid));
            cname2.setText(String.valueOf(User.lName));
            cname.setText(String.valueOf(User.fiName));
            cname3.setText(String.valueOf(User.lName));
            cname1.setText(String.valueOf(User.fiName));
            flight.setText(String.valueOf(User.fName));
            flight1.setText(String.valueOf(User.fName));
            date.setText(String.valueOf(User.fDate));
            date1.setText(String.valueOf(User.fDate));
            from.setText(String.valueOf(User.fFrom));
            from1.setText(String.valueOf(User.fFrom));
            to.setText(String.valueOf(User.fTo));
            to1.setText(String.valueOf(User.fTo));
            time.setText(String.valueOf(User.fTime));
            time1.setText(String.valueOf(User.fTime));
            gate.setText(String.valueOf(User.fGate));
            gate1.setText(String.valueOf(User.fGate));
            class1.setText(String.valueOf(User.class2));
            seat.setText(String.valueOf(User.seatno));
            }
            catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
            }*/
        } catch (SQLException ex) {
            Logger.getLogger(Booked_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          area.setText("_______________________________________________________________________________\n");
                area.setText(area.getText()+"~                                          e Ticket Receipt                                   ~\n");
                area.setText(area.getText()+"_______________________________________________________________________________\n");
                
                area.setText(area.getText()+"Customer Name:  "+User.fiName+" "+User.lName+"\n");
                area.setText(area.getText()+"_______________________________________________________________________________\n");
                area.setText(area.getText()+"Customer Id: "+ User.cid+"\n");
                area.setText(area.getText()+"Registration No.:  "+tno.getText()+"\n");
                area.setText(area.getText()+"Flight Name:"+ User.fName+"\n");
                area.setText(area.getText()+"From: "+ User.fFrom+"\n");
                area.setText(area.getText()+"To: "+ User.fTo+"\n");
                area.setText(area.getText()+"Date: "+ User.fDate+"\n");
                area.setText(area.getText()+"Time: "+ User.fTime+"\n");
                area.setText(area.getText()+"Class: "+ User.class2+"\n");
                area.setText(area.getText()+"Seat No.:  "+User.seatno+"\n");
    }//GEN-LAST:event_ticketActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        try {
            setVisible(false);
            Home ob=new Home();
            ob.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Booked_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        this.toBack();
        User.count3=3;
        Help ob=new Help();
        ob.setVisible(true);
        ob.toFront();
    }//GEN-LAST:event_helpMouseClicked

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
          
              
    }//GEN-LAST:event_greceiptActionPerformed

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
            java.util.logging.Logger.getLogger(Booked_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Booked_Ticket().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Booked_Ticket.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JTextField cid1;
    private javax.swing.JMenu contact;
    private javax.swing.JButton greceipt;
    private javax.swing.JMenu help;
    private javax.swing.JMenu home;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton preceipt;
    private javax.swing.JButton ticket;
    private javax.swing.JTextField tno;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
