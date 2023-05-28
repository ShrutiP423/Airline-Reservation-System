package main;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Shruti Patel
 */
public class Search_Flight_Details extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form Add_Customer_Details
     * @throws java.sql.SQLException
     */
    public Search_Flight_Details() throws SQLException {
        initComponents();
        con=Db_Con.db();
        
        username.setText(String.valueOf(User.userId));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        fsource = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fdestination = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fdate = new com.toedter.calendar.JDateChooser();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(1370, 731));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1370, 731));
        jDesktopPane1.setRequestFocusEnabled(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 1080));
        jPanel2.setLayout(null);

        fsource.setBackground(new java.awt.Color(204, 204, 204));
        fsource.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel2.add(fsource);
        fsource.setBounds(240, 260, 230, 40);

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel6.setText("Destination:");
        jLabel6.setMaximumSize(new java.awt.Dimension(233, 54));
        jLabel6.setMinimumSize(new java.awt.Dimension(233, 54));
        jLabel6.setPreferredSize(new java.awt.Dimension(233, 54));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(80, 330, 140, 30);

        fdestination.setBackground(new java.awt.Color(204, 204, 204));
        fdestination.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jPanel2.add(fdestination);
        fdestination.setBounds(240, 330, 230, 40);

        jLabel7.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel7.setText("Date:");
        jLabel7.setMaximumSize(new java.awt.Dimension(233, 54));
        jLabel7.setMinimumSize(new java.awt.Dimension(233, 54));
        jLabel7.setPreferredSize(new java.awt.Dimension(233, 54));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(80, 400, 90, 30);

        fdate.setBackground(new java.awt.Color(204, 204, 204));
        fdate.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        fdate.setPreferredSize(new java.awt.Dimension(64, 22));
        jPanel2.add(fdate);
        fdate.setBounds(240, 400, 230, 40);

        search.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Search.jpg")); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search);
        search.setBounds(300, 580, 150, 30);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight_Id", "Flight_Name", "Source", "Destination", "Date", "Arrival_Time", "Departure_Time", "Price", "Gate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setMaximumSize(new java.awt.Dimension(600, 80));
        jTable.setMinimumSize(new java.awt.Dimension(600, 80));
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(5).setResizable(false);
            jTable.getColumnModel().getColumn(6).setResizable(false);
            jTable.getColumnModel().getColumn(7).setResizable(false);
            jTable.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(510, 250, 780, 250);

        back.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\back.png")); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back);
        back.setBounds(670, 580, 130, 30);

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel2.setText("Source:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 260, 100, 30);

        exit.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Exit.png")); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(970, 580, 130, 30);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search FLIGHT Details  ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(380, 30, 670, 91);

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("user");
        jPanel2.add(username);
        username.setBounds(1290, 10, 200, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Logged in as :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1200, 10, 90, 16);

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("*Click on the flight in the table you want to travel.");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(920, 500, 370, 18);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\search_bg.jpg")); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, -10, 1630, 730);

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1498, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        try{                                    
            
            Book_Ticket bt=new Book_Ticket();
            DefaultTableModel Df=(DefaultTableModel)jTable.getModel();
            int selIndex =jTable.getSelectedRow();
            bt.fid.setText(Df.getValueAt(selIndex, 0).toString());
            bt.fname.setText(Df.getValueAt(selIndex, 1).toString());
            bt.source.setText(Df.getValueAt(selIndex, 2).toString());
            bt.dest.setText(Df.getValueAt(selIndex, 3).toString());
            java.util.Date date=null;
            try{
                date=new SimpleDateFormat("dd-MM-yyyy").parse(Df.getValueAt(selIndex, 4).toString());
                
            }catch(ParseException ex) {
                Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE,null,ex);
            }
            bt.Date1.setDate(date);
            bt.atime.setText(Df.getValueAt(selIndex, 5).toString());
            bt.dtime.setText(Df.getValueAt(selIndex, 6).toString());
            bt.fprice.setText(Df.getValueAt(selIndex, 7).toString());
            this.toBack();
            bt.setVisible(true);
            bt.toFront();
        }catch(SQLException ex) {
            Logger.getLogger(Search_Flight_Details.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        
       try{
           
       
         String Source=fsource.getText();
       String destination=fdestination.getText();
       DateFormat da=new SimpleDateFormat("dd-MM-yyyy");
        String date=da.format(fdate.getDate());
        
       String sql="select * from flight where Source=? and Destination=? and Date=? ";
       try{
           pst=con.prepareStatement(sql);
            pst.setString(1,Source);
             pst.setString(2,destination);
             pst.setString(3,date);
             rs=pst.executeQuery();
             
             ResultSetMetaData rsm=rs.getMetaData();
             int c;
             c=rsm.getColumnCount();
             DefaultTableModel Df=(DefaultTableModel)jTable.getModel();
             Df.setRowCount(0);
             while(rs.next()){
                 @SuppressWarnings("UseOfObsoleteCollectionType")
                 Vector v2=new Vector();
                 for(int i=1; i<=c; i++){
                     v2.add(rs.getString("Flight_Id"));
                     v2.add(rs.getString("Flight_Name"));
                     v2.add(rs.getString("Source"));
                     v2.add(rs.getString("Destination"));
                     v2.add(rs.getString("Date"));
                     v2.add(rs.getString("Arrival_Time"));
                     v2.add(rs.getString("Departure_Time"));
                     
                     v2.add(rs.getString("Flight_Price"));
                     
                 }
                 Df.addRow(v2);
                 
                 
             }
             
       }
           
       
       catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
       }
       }catch(HeadlessException e){
       JOptionPane.showMessageDialog(null,"Fill all the Fields");
       }
    }//GEN-LAST:event_searchActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        try {
            setVisible(false);
            Home ob=new Home();
            ob.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Search_Flight_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        this.toBack();
        User.count3=9;
        Help ob=new Help();
        ob.setVisible(true);
        ob.toFront();
    }//GEN-LAST:event_helpMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        try {
            setVisible(false);
            Home ob=new Home();
            ob.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Search_Flight_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Search_Flight_Details().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Search_Flight_Details.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JMenu contact;
    private javax.swing.JButton exit;
    private com.toedter.calendar.JDateChooser fdate;
    private javax.swing.JTextField fdestination;
    private javax.swing.JTextField fsource;
    private javax.swing.JMenu help;
    private javax.swing.JMenu home;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton search;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
