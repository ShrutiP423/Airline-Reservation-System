/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shruti Patel
 */
public class View_Customer_Details extends javax.swing.JFrame {

    /**
     * Creates new form View_Customer_Details
     */
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    ResultSet rsp;
    ResultSet rsp1;
    ResultSet rsb;
    public byte[] pic;
    public static String s;
    public static String s1;
    
    public View_Customer_Details() {
        initComponents();
        con=Db_Con.db();
      
        
       try{
             String sql="select * from customer ";
             pst=con.prepareStatement(sql);
             rs=pst.executeQuery(sql);
            
             String sql1="select * from seat20";
             pst=con.prepareStatement(sql1);
             rsp=pst.executeQuery(sql1);
             
             String sql3="select * from seat30";
             pst=con.prepareStatement(sql3);
             rsp1=pst.executeQuery(sql3);
             
             String sql2="select * from book";
             pst=con.prepareStatement(sql2);
             rsb=pst.executeQuery(sql2);
             
             
             ResultSetMetaData rsm=rs.getMetaData();
             int c;
             c=rsm.getColumnCount();
             DefaultTableModel Df=(DefaultTableModel)jTable.getModel();
             Df.setRowCount(0);
             while(rs.next()){
            @SuppressWarnings("UseOfObsoleteCollectionType")
                 Vector v2=new Vector();
                 for(int i=1; i<=c; i++){
                     v2.add(rs.getString("Ticket_No"));
                     v2.add(rs.getString("id"));
                     v2.add(rs.getString("firstname"));
                     v2.add(rs.getString("lastname"));
                     
                     v2.add(rs.getString("Passport_Id"));
                     v2.add(rs.getString("Nic_No"));
                     v2.add(rs.getString("Dob"));
                     v2.add(rs.getString("Gender"));
                     v2.add(rs.getString("Contact"));
                    /* v2.add(rs.getBytes("photo"));
                     v2.add(rs.getBytes("passport"));*/
                     
                     }          
                   
                 Df.addRow(v2);
                
            }
            
             ResultSetMetaData rsm1=rsb.getMetaData();
             int c1;
             c1=rsm1.getColumnCount();
             DefaultTableModel Df1=(DefaultTableModel)jTable1.getModel();
             Df1.setRowCount(0);
             while(rsb.next()){
            @SuppressWarnings("UseOfObsoleteCollectionType")
                 Vector v2=new Vector();
                 for(int i=1; i<=c1; i++){
                     v2.add(rsb.getString("Username"));
                     v2.add(rsb.getString("Ticket_No"));
                     v2.add(rsb.getString("Flight_Id"));
                     v2.add(rsb.getString("Flight_Name"));
                     v2.add(rsb.getString("Source"));
                     v2.add(rsb.getString("Destination"));
                     v2.add(rsb.getString("Date"));
                     v2.add(rsb.getString("Seats"));
                     v2.add(rsb.getString("Total_Price"));
                     v2.add(rsb.getString("Class"));
                     v2.add(rsb.getString("b_date"));
                     v2.add(rsb.getString("payment"));
                     }          
                   
                 Df1.addRow(v2);
                
            }

             ResultSetMetaData rsm2=rsp.getMetaData();
             int c2;
             c2=rsm2.getColumnCount();
             DefaultTableModel Df2=(DefaultTableModel)jTable2.getModel();
             Df2.setRowCount(0);
             while(rsp.next()){
            @SuppressWarnings("UseOfObsoleteCollectionType")
                 Vector v2=new Vector();
                 for(int i=1; i<=c2; i++){
                     v2.add(rsp.getString("Ticket_No"));
                     v2.add(rsp.getString("id"));
                     v2.add(rsp.getString("Date"));
                     v2.add(rsp.getString("Time"));
                     v2.add(rsp.getString("Sel_Seats"));
                     
                     }          
                   
                 Df2.addRow(v2);
                
            }
             
             ResultSetMetaData rsm3=rsp1.getMetaData();
             int c3;
             c3=rsm3.getColumnCount();
             DefaultTableModel Df3=(DefaultTableModel)jTable3.getModel();
             Df3.setRowCount(0);
             while(rsp1.next()){
            @SuppressWarnings("UseOfObsoleteCollectionType")
                 Vector v2=new Vector();
                 for(int i=1; i<=c2; i++){
                    v2.add(rsp1.getString("Ticket_No"));
                     v2.add(rsp1.getString("id"));
                     v2.add(rsp1.getString("Date"));
                     v2.add(rsp1.getString("Time"));
                     v2.add(rsp1.getString("Sel_Seats"));
                     
                     }          
                   
                 Df3.addRow(v2);
                
            }

             
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
              
            
             
    
      
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Registration No", "Flight Id", "Flight Name", "Source", "Destination", "Date", "Seats", "Price", "Class", "Booking date", "Payment"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 209, 1088, 187));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Registration No", "Customer Id", "Date", "Time", "Seat No"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 907, 507, 162));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration No", "Customer Id", "Firstname", "Lastname", "Dob", "Passport Id", "Nic No", "Gender", "Contact"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 556, 1088, 169));

        delete.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Delete.jpg")); // NOI18N
        delete.setText("Delete Unpayed Tickets booked");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 1113, -1, 37));

        refresh.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        refresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\refresh.png")); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 1113, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Booked Ticket Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Customer Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 493, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Seat Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 822, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("<-- - Back");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane5.setEnabled(false);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Registration No", "Customer Id", "Date", "Time", "Seat No"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 907, 489, 162));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AIR INDIA AIRLINES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 868, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INDIGO AIRLINES");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 868, -1, -1));

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("DETAILS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 32, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1273, 1162));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        try {
            new Admin().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(View_Customer_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        try{
            String sql="select * from customer ";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery(sql);

            String sql1="select * from seat20";
            pst=con.prepareStatement(sql1);
            rsp=pst.executeQuery(sql1);

            String sql3="select * from seat30";
            pst=con.prepareStatement(sql3);
            rsp1=pst.executeQuery(sql3);

            String sql2="select * from book";
            pst=con.prepareStatement(sql2);
            rsb=pst.executeQuery(sql2);

            ResultSetMetaData rsm=rs.getMetaData();
            int c;
            c=rsm.getColumnCount();
            DefaultTableModel Df=(DefaultTableModel)jTable.getModel();
            Df.setRowCount(0);
            while(rs.next()){
                @SuppressWarnings("UseOfObsoleteCollectionType")
                Vector v2=new Vector();
                for(int i=1; i<=c; i++){
                    v2.add(rs.getString("Ticket_No"));
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("firstname"));
                    v2.add(rs.getString("lastname"));

                    v2.add(rs.getString("Passport_Id"));
                    v2.add(rs.getString("Nic_No"));
                    v2.add(rs.getString("Dob"));
                    v2.add(rs.getString("Gender"));
                    v2.add(rs.getString("Contact"));
                    /* v2.add(rs.getBytes("photo"));
                    v2.add(rs.getBytes("passport"));*/

                }

                Df.addRow(v2);

            }

            ResultSetMetaData rsm1=rsb.getMetaData();
            int c1;
            c1=rsm1.getColumnCount();
            DefaultTableModel Df1=(DefaultTableModel)jTable1.getModel();
            Df1.setRowCount(0);
            while(rsb.next()){
                @SuppressWarnings("UseOfObsoleteCollectionType")
                Vector v2=new Vector();
                for(int i=1; i<=c1; i++){
                    v2.add(rsb.getString("Username"));
                    v2.add(rsb.getString("Ticket_No"));
                    v2.add(rsb.getString("Flight_Id"));
                    v2.add(rsb.getString("Flight_Name"));
                    v2.add(rsb.getString("Source"));
                    v2.add(rsb.getString("Destination"));
                    v2.add(rsb.getString("Date"));
                    v2.add(rsb.getString("Seats"));
                    v2.add(rsb.getString("Total_Price"));
                    v2.add(rsb.getString("Class"));
                    v2.add(rsb.getString("b_date"));
                    v2.add(rsb.getString("payment"));
                }

                Df1.addRow(v2);

            }

            ResultSetMetaData rsm2=rsp.getMetaData();
            int c2;
            c2=rsm2.getColumnCount();
            DefaultTableModel Df2=(DefaultTableModel)jTable2.getModel();
            Df2.setRowCount(0);
            while(rsp.next()){
                @SuppressWarnings("UseOfObsoleteCollectionType")
                Vector v2=new Vector();
                for(int i=1; i<=c2; i++){
                    v2.add(rsp.getString("Ticket_No"));
                    v2.add(rsp.getString("id"));
                    v2.add(rsp.getString("Date"));
                    v2.add(rsp.getString("Time"));
                    v2.add(rsp.getString("Sel_Seats"));

                }

                Df2.addRow(v2);

            }

            ResultSetMetaData rsm3=rsp1.getMetaData();
            int c3;
            c3=rsm3.getColumnCount();
            DefaultTableModel Df3=(DefaultTableModel)jTable3.getModel();
            Df3.setRowCount(0);
            while(rsp1.next()){
                @SuppressWarnings("UseOfObsoleteCollectionType")
                Vector v2=new Vector();
                for(int i=1; i<=c2; i++){
                    v2.add(rsp1.getString("Ticket_No"));
                    v2.add(rsp1.getString("id"));
                    v2.add(rsp1.getString("Date"));
                    v2.add(rsp1.getString("Time"));
                    v2.add(rsp1.getString("Sel_Seats"));

                }

                Df3.addRow(v2);

            }

            JOptionPane.showMessageDialog(null, "Refreshed");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {

            int row=jTable1.getSelectedRow();
            String t =  jTable1.getModel().getValueAt(row,1).toString();
            String cell = jTable1.getModel().getValueAt(row,11).toString();
            //int cell1=Integer.parseInt(cell);
            if(cell.equals("0")){

                String sql3="DELETE FROM book WHERE Ticket_No='"+t+"'";
                pst=con.prepareStatement(sql3);
                pst.executeUpdate();

                String sql2="DELETE FROM customer WHERE Ticket_No='"+t+"'";
                pst=con.prepareStatement(sql2);

                pst.executeUpdate();

                String sql1="DELETE FROM seat20 WHERE Ticket_No='"+t+"'";
                pst=con.prepareStatement(sql1);
                pst.executeUpdate();

                String sql="DELETE FROM seat30 WHERE Ticket_No='"+t+"'";
                pst=con.prepareStatement(sql);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Deleted successfully.");

            } else{
                JOptionPane.showMessageDialog(null, "Nothing to delete");
            }

        } catch (SQLException ex) {
            Logger.getLogger(View_Customer_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(View_Customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Customer_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
