
package main;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shruti Patel
 */
public class Cancel_Flight_Ticket extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public static int no1;
   public static String d1;
   public static String d2;
    /**
     * Creates new form Cancel_Flight_Ticket
     * @throws java.sql.SQLException
     */
    public Cancel_Flight_Ticket() throws SQLException {
        initComponents();
        con=Db_Con.db();
        username.setText(String.valueOf(User.userId));
    }

     
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        fid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        source = new javax.swing.JTextField();
        dest = new javax.swing.JTextField();
        atime = new javax.swing.JTextField();
        dtime = new javax.swing.JTextField();
        fprice = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        cdate = new com.toedter.calendar.JDateChooser();
        cancelt = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        seat = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        seatno = new javax.swing.JTextField();
        search1 = new javax.swing.JButton();
        bdate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Ticket No.");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Flight Id.:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Flight Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Source:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Destination:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Date:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Arrival Time:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Departure Time:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Price:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Seats:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Customer Name:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 255));
        jLabel12.setText("Cancellation Date:");

        tno.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        fid.setEditable(false);
        fid.setBackground(new java.awt.Color(204, 204, 204));
        fid.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        fname.setEditable(false);
        fname.setBackground(new java.awt.Color(204, 204, 204));
        fname.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        source.setEditable(false);
        source.setBackground(new java.awt.Color(204, 204, 204));
        source.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        dest.setEditable(false);
        dest.setBackground(new java.awt.Color(204, 204, 204));
        dest.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        atime.setEditable(false);
        atime.setBackground(new java.awt.Color(204, 204, 204));
        atime.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        dtime.setEditable(false);
        dtime.setBackground(new java.awt.Color(204, 204, 204));
        dtime.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        fprice.setEditable(false);
        fprice.setBackground(new java.awt.Color(204, 204, 204));
        fprice.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        cname.setEditable(false);
        cname.setBackground(new java.awt.Color(204, 204, 204));
        cname.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        cancelt.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        cancelt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\cancel_t.png")); // NOI18N
        cancelt.setText("Cancel Ticket");
        cancelt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceltActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Exit.png")); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 102));
        jLabel13.setText("Cancel Ticket");

        search.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Search.jpg")); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        seat.setEditable(false);
        seat.setBackground(new java.awt.Color(204, 204, 204));
        seat.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        back.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\back.png")); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 255));
        jLabel14.setText("Customer Id:");

        cid.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText("Seat No.:");

        seatno.setEditable(false);
        seatno.setBackground(new java.awt.Color(204, 204, 204));
        seatno.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        search1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        search1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Search.jpg")); // NOI18N
        search1.setText("Search");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        bdate.setEditable(false);
        bdate.setBackground(new java.awt.Color(204, 204, 204));
        bdate.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Logged in as :");

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("user");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(source, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(dest, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(atime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(dtime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fprice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cancelt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(exit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(search, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(seat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(back, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(seatno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(search1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(99, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(89, 89, 89)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search1))
                            .addComponent(fname)
                            .addComponent(fid)
                            .addComponent(source)
                            .addComponent(dest)
                            .addComponent(bdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))))
                .addGap(42, 42, 42)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fprice, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(atime)
                        .addComponent(dtime)
                        .addComponent(seat)
                        .addComponent(seatno)
                        .addComponent(cname)
                        .addComponent(cdate, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(username))
                .addGap(11, 11, 11)
                .addComponent(jLabel13)
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(search)))
                        .addGap(28, 28, 28)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search1))
                        .addGap(27, 27, 27)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(fprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel15)
                            .addComponent(seatno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(dest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(bdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(35, 35, 35)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(10, 10, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(28, 28, 28))
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
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canceltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceltActionPerformed
        try{                                        
            String sql1="select * from book where Ticket_No=?";
            pst=con.prepareStatement(sql1);
            pst.setString(1, tno.getText());
            
            pst.execute();
            rs=pst.executeQuery();
            while(rs.next()){
                d1=rs.getString("Date");
                d2=rs.getString("b_date");
                int no;
                no=rs.getInt("Seats");
                no1=no-1;
            }
            
            
            bdate.setText(d2);
            DateFormat daa=new SimpleDateFormat("dd-MM-yyyy");
            String date1=daa.format(cdate.getDate());
            String sql="insert into cancel(Ticket_No,id,Flight_Id,Flight_Name,Source,Destination,Date,Arrival_Time,Departure_Time,Price,Sel_Seats,C_Name,b_date,Return_D)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1, tno.getText());
                pst.setString(2,cid.getText());
                pst.setString(3, fid.getText());
                pst.setString(4, fname.getText());
                pst.setString(5, source.getText());
                pst.setString(6, dest.getText());
                pst.setString(7,d1);
                pst.setString(8, atime.getText());
                pst.setString(9, dtime.getText());
                pst.setString(10, fprice.getText());
                pst.setString(11, seatno.getText());
                pst.setString(12, cname.getText());
                pst.setString(13,d2);
                pst.setString(14,date1);
                pst.execute();
                
                
                
                
                
                if(no1>0){
                    String s = Integer.toString(no1);
                    String sql3="update book set Seats='"+s+"' where Ticket_No='"+tno.getText()+"'";
                    pst=con.prepareStatement(sql3);
                   
                    pst.executeUpdate();
                    
                }
                
                else{
                    String sql4="DELETE FROM book WHERE Ticket_No = ?";
                    pst=con.prepareStatement(sql4);
                    int t1 = Integer.parseInt(tno.getText());
                    
                    pst.setInt(1, t1);
                    pst.executeUpdate();
                    
                    while(rs.next()){
                        String f;
                        f=rs.getString("Flight_Name");
                        User.fName=f;
                        
                    }
                    
                    
                    
                }
                String sql5="DELETE FROM customer WHERE id = ?";
                pst=con.prepareStatement(sql5);
                int id = Integer.parseInt(cid.getText());
                
                pst.setInt(1, id);
                pst.executeUpdate();  
                
                if("AIR INDIA".equals(User.fName)){
                    String sql6="DELETE FROM seat20 WHERE id = ?";
                    pst=con.prepareStatement(sql6);
                    // int t1 = Integer.parseInt(tno.getText());
                    int id1 = Integer.parseInt(cid.getText());
                    
                    // pst.setInt(1, t1);
                    pst.setInt(1, id1);
                    pst.executeUpdate();
                }
                else if("INDIGO".equals(User.fName)){
                    String sql7="DELETE FROM seat30 WHERE id = ?";
                    pst=con.prepareStatement(sql7);
                    // int t1 = Integer.parseInt(tno.getText());
                    int id2 = Integer.parseInt(cid.getText());
                    
                    // pst.setInt(1, t1);
                    pst.setInt(1, id2);
                    pst.executeUpdate();
            
                }
                
                JOptionPane.showMessageDialog(null,"Ticket Cancel");
                new Home().setVisible(true);
            }
            catch(HeadlessException | NumberFormatException | SQLException e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
        catch(SQLException ex){
             Logger.getLogger(Cancel_Flight_Ticket.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_canceltActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        JFrame frame=new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","EXIT",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String sql="select * from book where Ticket_No=?";
        try{
           pst=con.prepareStatement(sql);
           pst.setString(1, tno.getText());
           rs=pst.executeQuery();
           if(rs.next()){
               String add1=rs.getString("Flight_Id");
               fid.setText(add1);
               String add2=rs.getString("Flight_Name");
               fname.setText(add2);
               String add3=rs.getString("Source");
               source.setText(add3);
               String add4=rs.getString("Destination");
               dest.setText(add4);
               
               String add6=rs.getString("Arrival_Time");
               atime.setText(add6);
               String add7=rs.getString("Departure_Time");
               dtime.setText(add7);
               String add8=rs.getString("Total_Price");
               fprice.setText(add8);
               String add9=rs.getString("Seats");
               seat.setText(add9);
               String date=rs.getString("b_date");
               //java.util.Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(date);
               bdate.setText(date);
               
           }
            else{
                JOptionPane.showMessageDialog(null, "This id not registered");

            }
           
       }
       catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   
    }//GEN-LAST:event_searchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        try {
            setVisible(false);
            Home ob = new Home();
            ob.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Cancel_Flight_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        try {
            String sql4="select * FROM book WHERE Ticket_No = ?";        
            pst=con.prepareStatement(sql4);
            int t1 = Integer.parseInt(tno.getText()); 
            pst.setInt(1, t1);
            rs=pst.executeQuery();
            while(rs.next()){
                String f;
                f=rs.getString("Flight_Name");
                User.fName=f;
                
                }
                
            if("AIR INDIA".equals(User.fName)){
            String sql1="select * from seat20 where id='"+cid.getText()+"'";
            pst=con.prepareStatement(sql1);
            rs=pst.executeQuery();
            while(rs.next()){ 
               int add9=rs.getInt("Sel_Seats");
               seatno.setText(String.valueOf(add9));
              }
            }
            
            else if("INDIGO".equals(User.fName)){
            String sql1="select * from seat30 where id='"+cid.getText()+"'";
            pst=con.prepareStatement(sql1);
            rs=pst.executeQuery();
            while(rs.next()){
                int add9=rs.getInt("Sel_Seats");
                seatno.setText(String.valueOf(add9));
              }
            }
            
            String sql2="select * from customer where id=?";
            pst=con.prepareStatement(sql2);
            pst.setString(1, cid.getText());
            rs=pst.executeQuery();
            while(rs.next()){
              cname.setText(rs.getString("firstname"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cancel_Flight_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search1ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        try {
            setVisible(false);
            Home ob=new Home();
            ob.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Cancel_Flight_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        this.toBack();
        User.count3=4;
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
            java.util.logging.Logger.getLogger(Cancel_Flight_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Cancel_Flight_Ticket().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Cancel_Flight_Ticket.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField atime;
    private javax.swing.JButton back;
    private javax.swing.JTextField bdate;
    private javax.swing.JButton cancelt;
    private com.toedter.calendar.JDateChooser cdate;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JMenu contact;
    private javax.swing.JTextField dest;
    private javax.swing.JTextField dtime;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fprice;
    private javax.swing.JMenu help;
    private javax.swing.JMenu home;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    private javax.swing.JTextField seat;
    private javax.swing.JTextField seatno;
    private javax.swing.JTextField source;
    private javax.swing.JTextField tno;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
