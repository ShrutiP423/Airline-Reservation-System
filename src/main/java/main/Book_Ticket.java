
package main;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shruti Patel
 */
public class Book_Ticket extends javax.swing.JFrame {

     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public static int a1;
    public static int c1;
    /**
     * Creates new form Book_Ticket
     * @throws java.sql.SQLException
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Book_Ticket() throws SQLException {
        initComponents();
        con=Db_Con.db();
        
        username.setText(String.valueOf(User.userId));
        
        Random();
        
        
    }
    
    public void Random(){
        Random rd=new Random();
        tno.setText(""+rd.nextInt(10000+1));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        jLabel13 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        fid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        source = new javax.swing.JTextField();
        dest = new javax.swing.JTextField();
        dtime = new javax.swing.JTextField();
        atime = new javax.swing.JTextField();
        fprice = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        tprice = new javax.swing.JTextField();
        book = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Date1 = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        cseat = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        aseat = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        fclass = new javax.swing.JComboBox<>();
        Back = new javax.swing.JButton();
        bdate = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(249, 241, 79));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText(" Book Ticket");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(840, 30, 308, 64);

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel2.setText("Registration No. :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(350, 110, 180, 23);

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel3.setText("Flight Id :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 180, 130, 23);

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel4.setText("Flight Name :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(110, 250, 140, 23);

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel5.setText("Source :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 310, 90, 23);

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel6.setText("Destination :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(110, 370, 140, 23);

        jLabel7.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel7.setText("Arrival Time :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(110, 500, 140, 23);

        jLabel8.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel8.setText("Departure Time :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 560, 170, 23);

        jLabel9.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel9.setText("Price :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(770, 190, 70, 23);

        jLabel10.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel10.setText("Seats :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(770, 310, 80, 23);

        jLabel11.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel11.setText("Total Price :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(770, 500, 120, 23);

        jLabel12.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel12.setText("Date :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(110, 430, 60, 23);

        jLabel13.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel13.setText("Customer Name :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(770, 560, 170, 23);

        tno.setEditable(false);
        tno.setBackground(new java.awt.Color(255, 255, 255));
        tno.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        jPanel2.add(tno);
        tno.setBounds(620, 110, 290, 30);

        fid.setEditable(false);
        fid.setBackground(new java.awt.Color(204, 204, 204));
        fid.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        jPanel2.add(fid);
        fid.setBounds(290, 180, 290, 29);

        fname.setEditable(false);
        fname.setBackground(new java.awt.Color(204, 204, 204));
        fname.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        jPanel2.add(fname);
        fname.setBounds(290, 250, 290, 29);

        source.setEditable(false);
        source.setBackground(new java.awt.Color(204, 204, 204));
        source.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        jPanel2.add(source);
        source.setBounds(290, 310, 290, 29);

        dest.setEditable(false);
        dest.setBackground(new java.awt.Color(204, 204, 204));
        dest.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        jPanel2.add(dest);
        dest.setBounds(290, 370, 290, 29);

        dtime.setEditable(false);
        dtime.setBackground(new java.awt.Color(204, 204, 204));
        dtime.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        jPanel2.add(dtime);
        dtime.setBounds(290, 560, 290, 29);

        atime.setEditable(false);
        atime.setBackground(new java.awt.Color(204, 204, 204));
        atime.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        jPanel2.add(atime);
        atime.setBounds(290, 500, 290, 29);

        fprice.setEditable(false);
        fprice.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(fprice);
        fprice.setBounds(960, 180, 270, 30);
        jPanel2.add(cname);
        cname.setBounds(970, 560, 260, 30);

        tprice.setEditable(false);
        tprice.setBackground(new java.awt.Color(204, 204, 204));
        tprice.setText("0");
        jPanel2.add(tprice);
        tprice.setBounds(970, 500, 260, 30);

        book.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        book.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\customer.png")); // NOI18N
        book.setText("Customer Details");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        jPanel2.add(book);
        book.setBounds(253, 630, 290, 30);

        exit.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Exit.png")); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(870, 630, 130, 30);

        Date1.setBackground(new java.awt.Color(204, 204, 204));
        Date1.setEnabled(false);
        jPanel2.add(Date1);
        Date1.setBounds(290, 430, 290, 30);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel20.setText("Adult(above 18 yrs.)");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(930, 310, 150, 21);

        cseat.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        cseat.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cseatStateChanged(evt);
            }
        });
        jPanel2.add(cseat);
        cseat.setBounds(1110, 370, 120, 22);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel21.setText("Children ");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(930, 370, 136, 21);

        aseat.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        aseat.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aseatStateChanged(evt);
            }
        });
        jPanel2.add(aseat);
        aseat.setBounds(1110, 310, 120, 22);

        jLabel23.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel23.setText("Total Seats :");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(770, 430, 130, 23);

        jLabel24.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel24.setText("Class :");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(770, 250, 70, 23);

        fclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "First" }));
        fclass.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fclassItemStateChanged(evt);
            }
        });
        jPanel2.add(fclass);
        fclass.setBounds(960, 240, 270, 30);

        Back.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\back.png")); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back);
        Back.setBounds(630, 630, 130, 29);
        jPanel2.add(bdate);
        bdate.setBounds(40, 10, 0, 0);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("0");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(970, 430, 260, 30);

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Logged in as :");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(1090, 0, 90, 16);

        username.setForeground(new java.awt.Color(102, 102, 102));
        username.setText("user");
        jPanel2.add(username);
        username.setBounds(1170, 0, 140, 16);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\book_bg.jpg")); // NOI18N
        jLabel14.setMaximumSize(new java.awt.Dimension(1500, 700));
        jLabel14.setMinimumSize(new java.awt.Dimension(1500, 700));
        jLabel14.setPreferredSize(new java.awt.Dimension(1500, 700));
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, -160, 1510, 1040);

        jMenuBar2.setBackground(new java.awt.Color(204, 255, 255));

        home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Home.jpg")); // NOI18N
        home.setText("Home              ");
        home.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jMenuBar2.add(home);

        contact.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Contact us.jpg")); // NOI18N
        contact.setText(" Contact us              ");
        contact.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setText("+91 9909803211");
        contact.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setText("+91 9909803223");
        contact.add(jMenuItem4);

        jMenuBar2.add(contact);

        help.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Help.jpg")); // NOI18N
        help.setText("Help                      ");
        help.setActionCommand("          Username    ");
        help.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        jMenuBar2.add(help);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1314, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        
        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String dateString = df.format(currentDate);

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeString = sdf.format(d);
        String date1 = dateString+" "+ timeString;
        bdate.setText(date1);
        DateFormat da=new SimpleDateFormat("dd-MM-yyyy");
        String date=da.format(Date1.getDate());
        String seat=jTextField1.getText();
        int ts = Integer.parseInt(jTextField1.getText());
        String class1=fclass.getSelectedItem().toString();
        try {
           
            if(ts>4){
              JOptionPane.showMessageDialog(null, "You can book maximum 4 tickets at a time.");
            
            }
            else if(User.count1>0){
             String sql="update book set Username=?,Flight_Id=?,Flight_Name=?,Source=?,Destination=?,Date=?,Arrival_Time=?,Departure_Time=?,Total_Price=?,Seats=?,Class=?,C_Name=?,b_date=?,payment=? where Ticket_No=?";
            pst=con.prepareStatement(sql);
            pst.setString(16, tno.getText());
            pst.setString(1, username.getText());
            pst.setString(2, fid.getText());
            pst.setString(3, fname.getText());
            pst.setString(4, source.getText());
            pst.setString(5, dest.getText());
            pst.setString(6,date);
            pst.setString(7, atime.getText());
            pst.setString(8, dtime.getText());
            pst.setString(9, tprice.getText());
            pst.setString(10,seat);
            pst.setString(11,class1);
            pst.setString(12, cname.getText());
            pst.setString(13,bdate.getText() );
            pst.setBoolean(14, User.payment);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update Succesfull.");
            
            String sql1="select * from book where Ticket_No=?";
                pst=con.prepareStatement(sql1);
                pst.setString(1, tno.getText());
                
                pst.execute();
                rs=pst.executeQuery();
                while(rs.next()){
                String t1;
                t1=rs.getString("Ticket_No");
                User.tno=t1;
                int amt=rs.getInt("Total_Price");
                User.tprice=amt;
                String cn=rs.getString("C_Name");
                User.cname=cn;
               
                }
            
            this.toBack();
             Add_Customer_Details ac = new Add_Customer_Details();
             ac.setVisible(true);
             ac.toFront();
            
            }
            else{
            String sql="insert into book(Username,Ticket_No,Flight_Id,Flight_Name,Source,Destination,Date,Arrival_Time,Departure_Time,Total_Price,Seats,Class,C_Name,b_date,payment)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pst=con.prepareStatement(sql);
            pst.setString(1, username.getText());
            pst.setString(2, tno.getText());
            pst.setString(3, fid.getText());
            pst.setString(4, fname.getText());
            pst.setString(5, source.getText());
            pst.setString(6, dest.getText());
            pst.setString(7,date);
            pst.setString(8, atime.getText());
            pst.setString(9, dtime.getText());
            pst.setString(10, tprice.getText());
            pst.setString(11,seat);
            pst.setString(12,class1);
            pst.setString(13, cname.getText());
            pst.setString(14,bdate.getText() );
            pst.setBoolean(15, User.payment);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registered");
            
            
             String sql1="select * from book where Ticket_No=?";
                pst=con.prepareStatement(sql1);
                pst.setString(1, tno.getText());
                
                pst.execute();
                rs=pst.executeQuery();
                while(rs.next()){
                String t1;
                t1=rs.getString("Ticket_No");
                User.tno=t1;
                int amt=rs.getInt("Total_Price");
                User.tprice=amt;
                String cn=rs.getString("C_Name");
                User.cname=cn;
               
                }
            
            this.toBack();
             Add_Customer_Details ac = new Add_Customer_Details();
             ac.setVisible(true);
             ac.toFront();
            }
           
                
              
                
            
             
             
            
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bookActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
         try {
             
             JFrame frame=new JFrame("EXIT");
             if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","EXIT",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
             {
                 System.exit(0);
             }
             
             String sql4="DELETE FROM book WHERE Ticket_No = ?";
             pst=con.prepareStatement(sql4);
             int t1 = Integer.parseInt(tno.getText());
             
             pst.setInt(1, t1);
             pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_exitActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
         try {
             
             setVisible(false);
             Home ob=new Home();
             ob.setVisible(true);
             
             String sql4="DELETE FROM book WHERE Ticket_No = ?";
             pst=con.prepareStatement(sql4);
             int t1 = Integer.parseInt(tno.getText());
             
             pst.setInt(1, t1);
             pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_homeMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        
         this.toBack();
         User.count3=2;
        Help ob=new Help();
        ob.setVisible(true);
        ob.toFront();
    }//GEN-LAST:event_helpMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
         try {
             
             this.toBack();
             setVisible(false);
             Search_Flight_Details sf=new Search_Flight_Details();
             sf.toFront();
             sf.setState(java.awt.Frame.NORMAL);
         } catch (SQLException ex) {
             Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }//GEN-LAST:event_BackActionPerformed

    private void fclassItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fclassItemStateChanged
     
             
             long price = Long.parseLong(fprice.getText());
             
             long qty =Long.parseLong(jTextField1.getText());
             long tot = 0;
             if("Economy".equals(fclass.getSelectedItem())){
                 tot = price * qty;
             }
             else if("Business".equals(fclass.getSelectedItem())){
                 tot = (price+500)*qty;
             }
             else if("First".equals(fclass.getSelectedItem())){
                 tot = (price + 800)*qty;
             }
             tprice.setText(String.valueOf(tot));
             

    }//GEN-LAST:event_fclassItemStateChanged

    private void aseatStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aseatStateChanged
        
       a1=Integer.parseInt(aseat.getValue().toString());
       long tot=a1+c1;
      
       long price = Long.parseLong(fprice.getText());

        long qty =tot;
        long tot1 = 0;
        if("Economy".equals(fclass.getSelectedItem())){
            tot1 = price * qty;
        }
        else if("Business".equals(fclass.getSelectedItem())){
            tot1 = (price+500)*qty;
        }
        else if("First".equals(fclass.getSelectedItem())){
            tot1 = (price + 800)*qty;
        }
        tprice.setText(String.valueOf(tot1));
               
       jTextField1.setText(String.valueOf(tot));
    }//GEN-LAST:event_aseatStateChanged

    private void cseatStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cseatStateChanged
       
        c1=Integer.parseInt(cseat.getValue().toString());
       long tot=a1+c1;
      
       long price = Long.parseLong(fprice.getText());

        long qty =tot;
        long tot1 = 0;
        if("Economy".equals(fclass.getSelectedItem())){
            tot1 = price * qty;
        }
        else if("Business".equals(fclass.getSelectedItem())){
            tot1 = (price+500)*qty;
        }
        else if("First".equals(fclass.getSelectedItem())){
            tot1 = (price + 800)*qty;
        }
        tprice.setText(String.valueOf(tot1));
               
       jTextField1.setText(String.valueOf(tot));
    }//GEN-LAST:event_cseatStateChanged

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
            java.util.logging.Logger.getLogger(Book_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
         
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Book_Ticket().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    public com.toedter.calendar.JDateChooser Date1;
    private javax.swing.JSpinner aseat;
    public javax.swing.JTextField atime;
    private javax.swing.JLabel bdate;
    private javax.swing.JButton book;
    private javax.swing.JTextField cname;
    private javax.swing.JMenu contact;
    private javax.swing.JSpinner cseat;
    protected javax.swing.JTextField dest;
    public javax.swing.JTextField dtime;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> fclass;
    public javax.swing.JTextField fid;
    public javax.swing.JTextField fname;
    public javax.swing.JTextField fprice;
    private javax.swing.JMenu help;
    private javax.swing.JMenu home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    protected javax.swing.JTextField source;
    private javax.swing.JTextField tno;
    protected javax.swing.JTextField tprice;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
