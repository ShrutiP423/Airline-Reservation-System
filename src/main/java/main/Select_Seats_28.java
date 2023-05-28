package main;

import main.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Shruti Patel
 */
public class Select_Seats_28 extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public static int[] btn = {11,12,13,14,21,22,23,24,31,32,33,34,41,42,43,44,51,52,53,54,61,62,63,64,71,72,73,74};
    public static JButton[] selected = new JButton[84];
    /**
     * Creates new form Select_Seats
     * @throws java.sql.SQLException
     */
    public Select_Seats_28() throws SQLException {
        initComponents();
        cid.setText(String.valueOf(User.cid));
        tno.setText(String.valueOf(User.tno));
        fdate.setText(String.valueOf(User.fDate));
        ftime.setText(String.valueOf(User.fTime));
        username.setText(String.valueOf(User.userId));
        txt.setText(null);
        con=Db_Con.db();
        
       
       if("Economy".equals(User.class2)){
       
        D1.setEnabled(false);D2.setEnabled(false);D3.setEnabled(false);D4.setEnabled(false);
        E1.setEnabled(false);E2.setEnabled(false);E3.setEnabled(false);E4.setEnabled(false);
        F1.setEnabled(false);F2.setEnabled(false);F3.setEnabled(false);F4.setEnabled(false);
        G1.setEnabled(false);G2.setEnabled(false);G3.setEnabled(false);G4.setEnabled(false);
       }else{}
       
        if("Business".equals(User.class2)){
            A1.setEnabled(false);A2.setEnabled(false);A3.setEnabled(false);A4.setEnabled(false);
            B1.setEnabled(false);B2.setEnabled(false);B3.setEnabled(false);B4.setEnabled(false);
            C1.setEnabled(false);C2.setEnabled(false);C3.setEnabled(false);C4.setEnabled(false);
            F1.setEnabled(false);F2.setEnabled(false);F3.setEnabled(false);F4.setEnabled(false);
            G1.setEnabled(false);G2.setEnabled(false);G3.setEnabled(false);G4.setEnabled(false);
        
        }else{}
        
        if("First".equals(User.class2)){
              A1.setEnabled(false);A2.setEnabled(false);A3.setEnabled(false);A4.setEnabled(false);
              B1.setEnabled(false);B2.setEnabled(false);B3.setEnabled(false);B4.setEnabled(false);
              C1.setEnabled(false);C2.setEnabled(false);C3.setEnabled(false);C4.setEnabled(false);
              D1.setEnabled(false);D2.setEnabled(false);D3.setEnabled(false);D4.setEnabled(false);
              E1.setEnabled(false);E2.setEnabled(false);E3.setEnabled(false);E4.setEnabled(false);
        
        }else{}
       
        String sql3="Select * from seat30 where Date=? and Time=?";
        pst=con.prepareStatement(sql3);
        pst.setString(1,User.fDate);
        pst.setString(2,User.fTime);
        rs=pst.executeQuery();
        while(rs.next()){
            int c1=rs.getInt("Sel_Seats");
            User.seat1= c1;
            
            if(User.seat1==11){
              A1.setEnabled(false);
            }else{}
            if(User.seat1==12){
              A2.setEnabled(false);
            }else{}
            if(User.seat1==13){
              A3.setEnabled(false);
            }else{}
            if(User.seat1==14){
              A4.setEnabled(false);
            }else{}
            if(User.seat1==21){
              B1.setEnabled(false);
            }else{}
            if(User.seat1==22){
              B2.setEnabled(false);
            }else{}
            if(User.seat1==23){
              B3.setEnabled(false);
            }else{}
            if(User.seat1==24){
              B4.setEnabled(false);
            }else{}
             
            
            
           
            if(User.seat1==31){
              C1.setEnabled(false);
            }else{}
            if(User.seat1==32){
              C2.setEnabled(false);
            }else{}
            if(User.seat1==33){
              C3.setEnabled(false);
            }else{}
            if(User.seat1==34){
              C4.setEnabled(false);
            }else{}
            if(User.seat1==41){
              D1.setEnabled(false);
            }else{}
            if(User.seat1==42){
              D2.setEnabled(false);
            }else{}
            if(User.seat1==43){
              D3.setEnabled(false);
            }else{}
            if(User.seat1==44){
              D4.setEnabled(false);
            }else{}
              
            
            
            if(User.seat1==51){
              E1.setEnabled(false);
            }else{}
            if(User.seat1==52){
              E2.setEnabled(false);
            }else{}
            if(User.seat1==53){
              E3.setEnabled(false);
            }else{}
            if(User.seat1==54){
              E4.setEnabled(false);
            }else{}
            
              
        }
             String sql="Select * from seat30 where Date=? and Time=?";
        pst=con.prepareStatement(sql);
        pst.setString(1,User.fDate);
        pst.setString(2,User.fTime);
        rs=pst.executeQuery();
             ResultSetMetaData rsm=rs.getMetaData();
             int c;
             c=rsm.getColumnCount();
             DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
             Df.setRowCount(0);
             while(rs.next()){
                 @SuppressWarnings("UseOfObsoleteCollectionType")
                 Vector v2=new Vector();
                 for(int i=1; i<=c; i++){
                     v2.add(rs.getString("Sel_Seats"));}
                 Df.addRow(v2);
                 
             }
       }
            
       
                    
    
    
    String grey = "-fx-background-color:#B2BEB5";
    String green = "-fx-background-color:#32CD32";
    String[] btn_clr = {grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey,grey};
//    Button[] all_btn = {r1c1}; //,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9,r1c10,r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9,r2c10,r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9,r5c10,r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9,r6c10,r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9,r7c10,r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9,r8c10,r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9,r9c10,r10c3,r10c4,r10c5,r10c6,r10c7,r10c8};
    int seats_val = 0;
    int ticket = 0;
    int count1=0;
    
    String clr;

    /**
     * This method used to appear GUI different colors in buttons
     * @param b is selected button
     * @param indx is index of button
     */
    public void setDisplay(JButton b, int indx){
        //get current color of button
        
        clr = btn_clr[indx];
        //if button is grey colored, then goes to this statement
        //this statement used to order a seat
        if(count1==0){
        if(clr.equals(grey)){
            txt.setText(null);
            b.setBackground(Color.GREEN);
            btn_clr[indx] = green;
            ticket++;
            count1++;
            
            selected[indx] = b;
             seats_val = 0;
            for(int i=0;i<28;i++){
                if(selected[i]!=null){
                    seats_val=btn[i];
                }
            }
            txt.setText(String.valueOf(seats_val));
        }
        }
        //if button color is green, go to this statement
        //this statement used to remove order
        
        else if(clr.equals(green)){
            txt.setText(null);
            count1--;
            b.setBackground(Color.GRAY);
            btn_clr[indx] = grey;
            ticket--;
            
            
            selected[indx] = null;
            seats_val = 0;
            for(int i=0;i<28;i++){
                if(selected[i]!=null){
                    seats_val=btn[i];
                }
            }
            txt.setText(String.valueOf(seats_val));
        }
        
    }
   
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        A1 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        c1 = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        r4 = new javax.swing.JLabel();
        cid = new javax.swing.JLabel();
        tno = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        A3 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        seat1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        r5 = new javax.swing.JLabel();
        E1 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        cid1 = new javax.swing.JLabel();
        cid2 = new javax.swing.JLabel();
        cid3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ftime = new javax.swing.JLabel();
        fdate = new javax.swing.JLabel();
        r6 = new javax.swing.JLabel();
        r7 = new javax.swing.JLabel();
        G1 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mHome = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        A1.setBackground(Color.GRAY
        );
        A1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        A1.setText("11");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Eras Demi ITC", 1, 24)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Save-icon.png")); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        c1.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1.setText("1");

        r1.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        r1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r1.setText("1");

        txt.setEditable(false);
        txt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        A2.setBackground(Color.GRAY
        );
        A2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        A2.setText("12");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B2.setBackground(Color.GRAY
        );
        B2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        B2.setText("22");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B1.setBackground(Color.GRAY
        );
        B1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        B1.setText("21");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C1.setBackground(Color.GRAY
        );
        C1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        C1.setText("31");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setBackground(Color.GRAY
        );
        C2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        C2.setText("32");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        D1.setBackground(Color.GRAY
        );
        D1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        D1.setText("41");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        D2.setBackground(Color.GRAY
        );
        D2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        D2.setText("42");
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        D4.setBackground(Color.GRAY
        );
        D4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        D4.setText("44");
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        C3.setBackground(Color.GRAY
        );
        C3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        C3.setText("33");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        D3.setBackground(Color.GRAY
        );
        D3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        D3.setText("43");
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        C4.setBackground(Color.GRAY
        );
        C4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        C4.setText("34");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        B3.setBackground(Color.GRAY
        );
        B3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        B3.setText("23");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(Color.GRAY
        );
        B4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        B4.setText("24");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        A4.setBackground(Color.GRAY
        );
        A4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        A4.setText("14");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        c2.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setText("3");

        c3.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3.setText("2");

        c4.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c4.setText("4");

        r2.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        r2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r2.setText("3");

        r3.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        r3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r3.setText("2");

        r4.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        r4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r4.setText("4");

        cid.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        tno.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        pay.setFont(new java.awt.Font("Eras Demi ITC", 1, 25)); // NOI18N
        pay.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Payment.png")); // NOI18N
        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 17)); // NOI18N
        jLabel1.setText("Registration No.:");

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 17)); // NOI18N
        jLabel2.setText("Customer Id:");

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 0, 17)); // NOI18N
        jLabel3.setText("Selected seat:: ");

        A3.setBackground(Color.GRAY
        );
        A3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        A3.setText("13");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Eras Demi ITC", 1, 25)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Exit.png")); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Economy Class");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("First Class");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Business Class");

        jTable1.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sold Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        r5.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        r5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r5.setText("5");

        E1.setBackground(Color.GRAY
        );
        E1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        E1.setText("51");
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        E2.setBackground(Color.GRAY
        );
        E2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        E2.setText("52");
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        E3.setBackground(Color.GRAY
        );
        E3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        E3.setText("53");
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        E4.setBackground(Color.GRAY
        );
        E4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        E4.setText("54");
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        B5.setBackground(Color.GREEN);
        B5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        C5.setBackground(Color.GRAY
        );
        C5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        C5.setEnabled(false);

        A5.setBackground(Color.GRAY
        );
        A5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        cid1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cid1.setText("Sold or Different Class Seat");

        cid2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cid2.setText("Selected Seat");

        cid3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cid3.setText("Available Seat");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("INDIGO AIRLINES");

        ftime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ftime.setForeground(new java.awt.Color(255, 255, 255));

        fdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fdate.setForeground(new java.awt.Color(255, 255, 255));

        r6.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        r6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r6.setText("6");

        r7.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        r7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r7.setText("7");

        G1.setBackground(Color.GRAY
        );
        G1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        G1.setText("71");
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        G2.setBackground(Color.GRAY
        );
        G2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        G2.setText("72");
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        G3.setBackground(Color.GRAY
        );
        G3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        G3.setText("73");
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });

        G4.setBackground(Color.GRAY
        );
        G4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        G4.setText("74");
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });

        F1.setBackground(Color.GRAY
        );
        F1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        F1.setText("61");
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        F2.setBackground(Color.GRAY
        );
        F2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        F2.setText("62");
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        F4.setBackground(Color.GRAY
        );
        F4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        F4.setText("64");
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        F3.setBackground(Color.GRAY
        );
        F3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        F3.setText("63");
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Logged in as :");

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("user");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(670, 670, 670)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel4)
                .addGap(228, 228, 228)
                .addComponent(fdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ftime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(182, 182, 182)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(cid3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(cid2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(cid1)))
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(seat1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223)
                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8)
                    .addComponent(username))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4))
                    .addComponent(fdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftime, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(c4)
                        .addGap(6, 6, 6)
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(cid3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cid2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cid1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(seat1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pay)
                        .addComponent(exit))))
        );

        mHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Home.jpg")); // NOI18N
        mHome.setText("Home              ");
        mHome.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        mHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(mHome);

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Contact us.jpg")); // NOI18N
        jMenu1.setText("Contact Us              ");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("+91 9909803211");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("+91 9909803223");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        mHelp.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Help.jpg")); // NOI18N
        mHelp.setText("Help          ");
        mHelp.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        mHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mHelpMouseClicked(evt);
            }
        });
        jMenuBar1.add(mHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mHomeMouseClicked
        try {
            Home ob=new Home();
            ob.setVisible(true);
            
            String sql4="DELETE FROM book WHERE Ticket_No = ?";
            pst=con.prepareStatement(sql4);
            int t1 = Integer.parseInt(tno.getText());
            
            pst.setInt(1, t1);
            pst.executeUpdate();
            
            
            String sql5="DELETE FROM customer WHERE id = ?";
            pst=con.prepareStatement(sql5);
            int id = Integer.parseInt(cid.getText());
            
            pst.setInt(1, id);
            pst.executeUpdate();  
            
            String sql6="DELETE FROM seat30 WHERE id = ?";
            pst=con.prepareStatement(sql6);
            // int t1 = Integer.parseInt(tno.getText());
            int id1 = Integer.parseInt(cid.getText());
            
            // pst.setInt(1, t1);
            pst.setInt(1, id1);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Select_Seats_28.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_mHomeMouseClicked

    private void mHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mHelpMouseClicked
        // TODO add your handling code here:
         this.toBack();
         User.count3=11;
        Help ob=new Help();
        ob.setVisible(true);
        ob.toFront();
    }//GEN-LAST:event_mHelpMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {      
            
          /*  for(int i=0;i<84;i++){
                if(selected_btn[i]!=null){
                    selected_btn[i].setBackground(Color.RED);
                    //after sold a seat, remove event handle part corresponding button
                    selected_btn[i].ActionPerformed( ActionEvent->{close();});
                    
                }
            }*/
            String sql1="select * from book where Ticket_No=?";
            pst=con.prepareStatement(sql1);
            pst.setString(1, User.tno);
            
            pst.execute();
            rs=pst.executeQuery();
            while(rs.next()){
                int s;
                s=rs.getInt("Seats");
                User.tseat = s;
            }
             } catch (SQLException ex) {
            
            Logger.getLogger(Select_Seats_28.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
             
            
            try {
                String sql="insert into seat30(Ticket_No,id,Date,Time,Sel_Seats)value(?,?,?,?,?)";
                pst=con.prepareStatement(sql);
                pst.setString(1, User.tno);
                pst.setString(2, String.valueOf(User.cid));
                pst.setString(3, User.fDate);
                pst.setString(4, User.fTime);
                pst.setString(5,txt.getText());
                pst.execute();
                pst.getResultSet();
                JOptionPane.showMessageDialog(null, "Seat selected successfully.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Seat not available!");
                Logger.getLogger(Select_Seats_28.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        for(int i=1; i<User.tseat; i++){
                if(User.count<User.tseat){
                    Add_Customer_Details ac=new Add_Customer_Details();
                    ac.setVisible(true);
                    User.count++;
                    break;
                }
        }
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        setDisplay(A1,0);
        
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        setDisplay(A2,1);
    }//GEN-LAST:event_A2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        setDisplay(B2,5);
    }//GEN-LAST:event_B2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        setDisplay(B1,4);
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        setDisplay(C1,8);
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        setDisplay(C2,9);
    }//GEN-LAST:event_C2ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        setDisplay(D1,12);
    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        setDisplay(D2,13);
    }//GEN-LAST:event_D2ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        setDisplay(D4,15);
    }//GEN-LAST:event_D4ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        setDisplay(C3,10);
    }//GEN-LAST:event_C3ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        setDisplay(D3,14);
    }//GEN-LAST:event_D3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        setDisplay(C4,11);
    }//GEN-LAST:event_C4ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        setDisplay(B3,6);
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        setDisplay(B4,7);
    }//GEN-LAST:event_B4ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        setDisplay(A4,3);
    }//GEN-LAST:event_A4ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        setDisplay(A3,2);
    }//GEN-LAST:event_A3ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        try {
            JFrame frame = new JFrame("EXIT");
            if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
            {
                System.exit(0);
            }
            
            String sql4="DELETE FROM book WHERE Ticket_No = ?";
            pst=con.prepareStatement(sql4);
            int t1 = Integer.parseInt(tno.getText());
            
            pst.setInt(1, t1);
            pst.executeUpdate();
            
            
            String sql5="DELETE FROM customer WHERE id = ?";
            pst=con.prepareStatement(sql5);
            int id = Integer.parseInt(cid.getText());
            
            pst.setInt(1, id);
            pst.executeUpdate();  
            
            String sql6="DELETE FROM seat30 WHERE id = ?";
            pst=con.prepareStatement(sql6);
            // int t1 = Integer.parseInt(tno.getText());
            int id1 = Integer.parseInt(cid.getText());
            
            // pst.setInt(1, t1);
            pst.setInt(1, id1);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Select_Seats_28.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_exitActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        if(User.count==User.tseat){
            PaymentOption po=new PaymentOption();
            po.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Add details and select seat for remaining passengers.");
        }
    }//GEN-LAST:event_payActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        setDisplay(E1,16);
    }//GEN-LAST:event_E1ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        setDisplay(E2,17);
    }//GEN-LAST:event_E2ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        setDisplay(E3,18);
    }//GEN-LAST:event_E3ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        setDisplay(E4,19);
    }//GEN-LAST:event_E4ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        setDisplay(G1,24);
    }//GEN-LAST:event_G1ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        setDisplay(G2,25);
    }//GEN-LAST:event_G2ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        setDisplay(G3,26);
    }//GEN-LAST:event_G3ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        setDisplay(G4,27);
    }//GEN-LAST:event_G4ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        setDisplay(F1,20);
    }//GEN-LAST:event_F1ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        setDisplay(F2,21);
    }//GEN-LAST:event_F2ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        setDisplay(F4,23);
    }//GEN-LAST:event_F4ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        setDisplay(F3,22);
    }//GEN-LAST:event_F3ActionPerformed
     
    
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
            java.util.logging.Logger.getLogger(Select_Seats_28.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select_Seats_28.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select_Seats_28.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select_Seats_28.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Select_Seats_28().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Select_Seats_28.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton A1;
    public static javax.swing.JButton A2;
    public static javax.swing.JButton A3;
    public static javax.swing.JButton A4;
    public static javax.swing.JButton A5;
    public static javax.swing.JButton B1;
    public static javax.swing.JButton B2;
    public static javax.swing.JButton B3;
    public static javax.swing.JButton B4;
    public static javax.swing.JButton B5;
    public static javax.swing.JButton C1;
    public static javax.swing.JButton C2;
    public static javax.swing.JButton C3;
    public static javax.swing.JButton C4;
    public static javax.swing.JButton C5;
    public static javax.swing.JButton D1;
    public static javax.swing.JButton D2;
    public static javax.swing.JButton D3;
    public static javax.swing.JButton D4;
    public static javax.swing.JButton E1;
    public static javax.swing.JButton E2;
    public static javax.swing.JButton E3;
    public static javax.swing.JButton E4;
    public static javax.swing.JButton F1;
    public static javax.swing.JButton F2;
    public static javax.swing.JButton F3;
    public static javax.swing.JButton F4;
    public static javax.swing.JButton G1;
    public static javax.swing.JButton G2;
    public static javax.swing.JButton G3;
    public static javax.swing.JButton G4;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel cid;
    private javax.swing.JLabel cid1;
    private javax.swing.JLabel cid2;
    private javax.swing.JLabel cid3;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fdate;
    private javax.swing.JLabel ftime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu mHelp;
    private javax.swing.JMenu mHome;
    private javax.swing.JButton pay;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel r3;
    private javax.swing.JLabel r4;
    private javax.swing.JLabel r5;
    private javax.swing.JLabel r6;
    private javax.swing.JLabel r7;
    private javax.swing.JButton save;
    private javax.swing.JLabel seat1;
    private javax.swing.JLabel tno;
    private javax.swing.JTextField txt;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
