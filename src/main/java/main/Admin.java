
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shruti Patel
 *
 * */
public class Admin extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    
     // Creates new form Admin
     
    public Admin() throws SQLException {
        initComponents();
        con=Db_Con.db();
        
        
        String sql2="select count(*) from home";
         pst=con.prepareStatement(sql2);
         ResultSet rs=pst.executeQuery(sql2);
         rs.next();
         int h=rs.getInt(1);
        views.setText(String.valueOf(h));
        String sql="select count(*) from book";
         pst=con.prepareStatement(sql);
         rs=pst.executeQuery(sql);
         rs.next();
         int b=rs.getInt(1);
         book.setText(String.valueOf(b));
        String sql1="select Sum(Total_Price) from book";
         rs=pst.executeQuery(sql1);
         rs.next();
         Double sum=rs.getDouble("Sum(Total_Price)");
         sales.setText("Rs "+String.valueOf(sum));
        String sql3="select count(*) from seat20";
          rs=pst.executeQuery(sql3);
         rs.next();
         int a=rs.getInt(1);
         Air.setText(String.valueOf(a));
         String sql4="select count(*) from seat30";
          rs=pst.executeQuery(sql4);
         rs.next();
         int i=rs.getInt(1);
         Indi.setText(String.valueOf(i));
         float tot = Float.parseFloat(views.getText());
         float booked = Float.parseFloat(book.getText());
         float ratio=(booked/tot)*100;
         float airIndia=Float.parseFloat(Air.getText())*100/20;
         float indigo=Float.parseFloat(Indi.getText())*100/30;
        new Thread(() -> {
            for(float n=1;n<=100;n++){
                try {
                    bookRatio.UpdateProgress(ratio);
                    bookRatio.repaint();
                    AirIndia.UpdateProgress(airIndia);
                    AirIndia.repaint();
                    Indigo.UpdateProgress(indigo);
                    Indigo.repaint();
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        Flight = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        details = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sales = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        views = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        book = new javax.swing.JLabel();
        bookRatio = new main.CustomPanel1();
        jLabel7 = new javax.swing.JLabel();
        Indigo = new main.CustomPanel1();
        jLabel8 = new javax.swing.JLabel();
        Indi = new javax.swing.JLabel();
        AirIndia = new main.CustomPanel1();
        jLabel9 = new javax.swing.JLabel();
        Air = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("FLYHIGH");

        logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\logout.png")); // NOI18N
        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        Flight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Flight.setText("Add Flight Details");
        Flight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("Airline Reservation System");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\analytics.png")); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(260, 260));
        jLabel12.setMinimumSize(new java.awt.Dimension(260, 260));
        jLabel12.setPreferredSize(new java.awt.Dimension(260, 260));

        details.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        details.setText("View Details");
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Flight, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Flight, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel5.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\sales.jpg")); // NOI18N
        jPanel5.add(jLabel6);
        jLabel6.setBounds(70, 10, 140, 100);

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel1.setText("Total Sales");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(10, 130, 110, 26);

        sales.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jPanel5.add(sales);
        sales.setBounds(120, 130, 150, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(760, 130, 280, 160);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setLayout(null);

        label.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\views.jpg")); // NOI18N
        jPanel3.add(label);
        label.setBounds(30, 10, 190, 110);

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel4.setText("Total views");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 130, 110, 26);

        views.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jPanel3.add(views);
        views.setBounds(140, 130, 97, 25);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 130, 270, 160);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel3.setText("Flight booked");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 130, 140, 26);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\tickets_analytics.png")); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(60, 10, 160, 100);

        book.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jPanel4.add(book);
        book.setBounds(160, 130, 97, 20);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(390, 130, 277, 160);

        bookRatio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Tickets Booked");

        javax.swing.GroupLayout bookRatioLayout = new javax.swing.GroupLayout(bookRatio);
        bookRatio.setLayout(bookRatioLayout);
        bookRatioLayout.setHorizontalGroup(
            bookRatioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookRatioLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        bookRatioLayout.setVerticalGroup(
            bookRatioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookRatioLayout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(bookRatio);
        bookRatio.setBounds(49, 359, 230, 280);

        Indigo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("Indigo Tickets");

        Indi.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        Indi.setForeground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout IndigoLayout = new javax.swing.GroupLayout(Indigo);
        Indigo.setLayout(IndigoLayout);
        IndigoLayout.setHorizontalGroup(
            IndigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IndigoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(Indi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        IndigoLayout.setVerticalGroup(
            IndigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IndigoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IndigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(Indi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(Indigo);
        Indigo.setBounds(790, 360, 210, 280);

        AirIndia.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 153));
        jLabel9.setText("Air India Tickets");

        Air.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        Air.setForeground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout AirIndiaLayout = new javax.swing.GroupLayout(AirIndia);
        AirIndia.setLayout(AirIndiaLayout);
        AirIndiaLayout.setHorizontalGroup(
            AirIndiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AirIndiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(Air, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        AirIndiaLayout.setVerticalGroup(
            AirIndiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AirIndiaLayout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addGroup(AirIndiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(Air, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(AirIndia);
        AirIndia.setBounds(400, 360, 230, 280);

        jLabel11.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\dashboard.png")); // NOI18N
        jLabel11.setText("DashBoard");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 0, 310, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        try {
            this.dispose();
            new Login().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void FlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightActionPerformed
        try {
            Add_Flight_Details af=new Add_Flight_Details();
            af.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FlightActionPerformed

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
        new View_Customer_Details().setVisible(true);
    }//GEN-LAST:event_detailsActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Admin().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Air;
    private main.CustomPanel1 AirIndia;
    private javax.swing.JButton Flight;
    private javax.swing.JLabel Indi;
    private main.CustomPanel1 Indigo;
    private javax.swing.JLabel book;
    private main.CustomPanel1 bookRatio;
    private javax.swing.JButton details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label;
    private javax.swing.JButton logout;
    private javax.swing.JLabel sales;
    private javax.swing.JLabel views;
    // End of variables declaration//GEN-END:variables
}
