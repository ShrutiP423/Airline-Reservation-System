
package main;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Shruti Patel
 */
public class Add_Flight_Details extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
            
    /**
     * Creates new form Add_Flight_Details
     * @throws java.sql.SQLException
     */
    public Add_Flight_Details() throws SQLException {
        initComponents();
        con=Db_Con.db();
       // Show_flight_In_JTable();
       Random();
       fetch();
       
    }
    
    private void Random(){
        Random rd=new Random();
        fid.setText(""+rd.nextInt(1000+1));
        
    }
    
    private void fetch(){
        try{
            String sql="select * from flight ";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            jtable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    

    
    @SuppressWarnings("unchecked")
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JDesktopPane();
        dtime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        atime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        source = new javax.swing.JTextField();
        dest = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        add = new javax.swing.JButton();
        del = new javax.swing.JButton();
        update = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        search = new javax.swing.JButton();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mseats = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));

        pane.setBackground(new java.awt.Color(0, 102, 102));

        dtime.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        pane.add(dtime);
        dtime.setBounds(912, 149, 248, 29);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Departure Time:");
        pane.add(jLabel9);
        jLabel9.setBounds(750, 152, 142, 24);

        atime.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        pane.add(atime);
        atime.setBounds(912, 102, 248, 29);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Arrival Time:");
        pane.add(jLabel8);
        jLabel8.setBounds(750, 105, 115, 24);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Date:");
        pane.add(jLabel7);
        jLabel7.setBounds(191, 294, 68, 24);

        fname.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnameMouseClicked(evt);
            }
        });
        pane.add(fname);
        fname.setBounds(320, 149, 239, 29);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Flight Id:");
        pane.add(jLabel3);
        jLabel3.setBounds(191, 105, 109, 24);

        fid.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        pane.add(fid);
        fid.setBounds(320, 102, 239, 29);

        source.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        pane.add(source);
        source.setBounds(320, 195, 239, 29);

        dest.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        pane.add(dest);
        dest.setBounds(320, 242, 239, 29);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Destination:");
        pane.add(jLabel6);
        jLabel6.setBounds(191, 245, 105, 24);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Source:");
        pane.add(jLabel5);
        jLabel5.setBounds(191, 198, 109, 24);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Flight Name:");
        pane.add(jLabel4);
        jLabel4.setBounds(191, 152, 109, 24);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Flight Price:");
        pane.add(jLabel10);
        jLabel10.setBounds(750, 198, 104, 24);

        fprice.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        pane.add(fprice);
        fprice.setBounds(912, 195, 248, 29);

        jtable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jtable.setForeground(new java.awt.Color(0, 102, 0));
        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight_Id", "Flight_Name", "Source", "Destination", "Date", "Arrival Time", "Departure Time", "Price", "Maximum Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable.setEnabled(false);
        jScrollPane1.setViewportView(jtable);

        pane.add(jScrollPane1);
        jScrollPane1.setBounds(191, 346, 969, 201);

        add.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Add.jpg")); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        pane.add(add);
        add.setBounds(188, 565, 121, 32);

        del.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        del.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Delete.jpg")); // NOI18N
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        pane.add(del);
        del.setBounds(359, 565, 121, 32);

        update.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\update icon.png")); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        pane.add(update);
        update.setBounds(530, 565, 121, 32);

        exit.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Exit.png")); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        pane.add(exit);
        exit.setBounds(1043, 565, 121, 32);

        search.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Search.jpg")); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        pane.add(search);
        search.setBounds(701, 565, 121, 32);
        pane.add(Date);
        Date.setBounds(320, 289, 239, 29);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 37)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("  Add Flight Details  ");
        pane.add(jLabel1);
        jLabel1.setBounds(536, 29, 326, 43);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Max Seats:");
        pane.add(jLabel2);
        jLabel2.setBounds(750, 245, 112, 24);

        mseats.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        pane.add(mseats);
        mseats.setBounds(912, 242, 248, 29);

        refresh.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        refresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\refresh.png")); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        pane.add(refresh);
        refresh.setBounds(872, 565, 121, 32);

        home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Home.jpg")); // NOI18N
        home.setText("Home                      ");
        home.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jMenuBar2.add(home);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, 1211, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
                
        
        try{
            
            DateFormat da=new SimpleDateFormat("dd-MM-yyyy");
            String date=da.format(Date.getDate());

            String sql="insert into flight(Flight_Id,Flight_Name,Source,Destination,Date,Arrival_Time,Departure_Time,Flight_Price,Max_Seats)values(?,?,?,?,?,?,?,?,?)";
            pst=con.prepareStatement(sql);
            if(fid.getText().equals("") || fname.getText().equals("") || source.getText().equals("") || dest.getText().equals("") || date.equals("")  || atime.getText().equals("") || dtime.getText().equals("")  || fprice.getText().equals("") || mseats.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please add complete details");
            }
            else{
            
            pst.setString(1, fid.getText());
            pst.setString(2, fname.getText());
            pst.setString(3, source.getText());
            pst.setString(4, dest.getText());
            pst.setString(5,date);
            pst.setString(6, atime.getText());
            pst.setString(7, dtime.getText());
            pst.setString(8, fprice.getText());
            pst.setString(9, mseats.getText());
            
            
            pst.execute();
            fetch();
            
             
             
            JOptionPane.showMessageDialog(null, "Added successfully");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
         DateFormat da=new SimpleDateFormat("dd-MM-yyy");
        String date=da.format(Date.getDate());
        try{
            if(fid.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter valid Flight Id");
            
            }
            else{
            String sql="update flight set Flight_Name=?, Source=?, Destination=?, Date=?, Arrival_Time=?, Departure_Time=?, Flight_Price=?, Max_Seats=? where Flight_Id=?";
            pst=con.prepareStatement(sql);
            pst.setString(10, fid.getText());
            pst.setString(1, fname.getText());
            pst.setString(2, source.getText());
            pst.setString(3, dest.getText());
            pst.setString(4,date);
            pst.setString(5, atime.getText());
            pst.setString(6, dtime.getText());
            pst.setString(7, fprice.getText());
            pst.setString(8, mseats.getText());
            pst.executeUpdate();
             fetch();
            JOptionPane.showMessageDialog(null,"Update Successful");
            
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }                                      
    
   


    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        String sql="DELETE FROM flight WHERE Flight_Id=?";
         try {
              if(fid.getText().equals(" ")){
                  JOptionPane.showMessageDialog(null,"No Id entered");
              }  
                pst=con.prepareStatement(sql);
                int id = Integer.parseInt(fid.getText());
                 
                    pst.setInt(1, id);
                    pst.executeUpdate();
                    fetch();
                    
                    JOptionPane.showMessageDialog(null, "Flight Details Deleted");
                    
                    
                   
                    
                
                /*if(fid.getText().equals("")){
                int id = Integer.parseInt(fid.getText());
                String s = Integer.toString(id);
                pst.setString(1, s);
                pst.executeUpdate();
                fetch();
                JOptionPane.showMessageDialog(null, "Flight Details Deleted");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Product Not Deleted : No Id To Delete");
            
                }*/
                
                
                
            } 
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
            
      
    }//GEN-LAST:event_delActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       
        JFrame frame=new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","EXIT",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        
        try {
            setVisible(false);
            Admin ob = new Admin();
            ob.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Add_Flight_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        String sql="select * from flight where Flight Name=? and Source=? and Destination=?";
        try{
             pst=con.prepareStatement(sql);
             pst.setString(2, fname.getText());
             pst.setString(3, source.getText());
             pst.setString(4, dest.getText());
             rs=pst.executeQuery();
             if(rs.next()){
                String add1=rs.getString("Flight_Id");
                fid.setText(add1);
                String Dob=rs.getString("Date");
                java.util.Date date1 =   new SimpleDateFormat("dd-MM-yyyy").parse(Dob);
                Date.setDate(date1);
                String add5=rs.getString("Arrival_Time");
                atime.setText(add5);
                String add6=rs.getString("Departure_Time");
                dtime.setText(add6);
                String add7=rs.getString("Flight_Price");
                fprice.setText(add7);
                String add8=rs.getString("Max_Seats");
                mseats.setText(add8);
               
             }else{
                JOptionPane.showMessageDialog(null, "This flght id not registered");

            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        
        fid.setText(null);
        fid.setText(null);
        fname.setText(null);
        source.setText(null);
        dest.setText(null);
        Date.setDate(null);
        atime.setText(null);
        dtime.setText(null);
        fprice.setText(null);
        mseats.setText(null);
        Random();
    }//GEN-LAST:event_refreshActionPerformed

    private void fnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnameMouseClicked
        JOptionPane.showMessageDialog(null, "Fill details in Block letters.");
    }//GEN-LAST:event_fnameMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Add_Flight_Details().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Add_Flight_Details.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JButton add;
    private javax.swing.JTextField atime;
    private javax.swing.JButton del;
    private javax.swing.JTextField dest;
    private javax.swing.JTextField dtime;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fprice;
    private javax.swing.JMenu home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField mseats;
    private javax.swing.JDesktopPane pane;
    private javax.swing.JButton refresh;
    private javax.swing.JButton search;
    private javax.swing.JTextField source;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
