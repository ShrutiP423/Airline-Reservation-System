package main;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Random;


/**
 *
 * @author Shruti Patel
 */
public class Add_Customer_Details extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String filename=null;
    byte[] photo1=null;
    byte[] photo2=null;
    /**
     * Creates new form Add_Customer_Details
     */
    public Add_Customer_Details() {
        initComponents();
        con=Db_Con.db();
        tno.setText(String.valueOf(User.tno));
        username.setText(String.valueOf(User.userId));
        
        Random();
    }
        
      private void Random(){
        Random rd=new Random();
        txtid.setText(""+rd.nextInt(10000+1));
        
    }
      
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtlName = new javax.swing.JTextField();
        txtnic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpassport = new javax.swing.JTextField();
        txtdob = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        txtphoto = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        txtfName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        path = new javax.swing.JLabel();
        tno = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        browse1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        path1 = new javax.swing.JLabel();
        tno1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        contact = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Customer Id:");
        jLabel2.setMaximumSize(new java.awt.Dimension(180, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(180, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(180, 40));
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(50, 120, 155, 40);

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("First Name:");
        jLabel3.setMaximumSize(new java.awt.Dimension(180, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(180, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(180, 40));
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(50, 210, 155, 30);

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Last Name:");
        jLabel4.setMaximumSize(new java.awt.Dimension(180, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(180, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(180, 40));
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(50, 290, 155, 40);

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("NIC No:");
        jLabel5.setMaximumSize(new java.awt.Dimension(180, 40));
        jLabel5.setMinimumSize(new java.awt.Dimension(180, 40));
        jLabel5.setPreferredSize(new java.awt.Dimension(180, 40));
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(580, 210, 143, 30);

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtid);
        txtid.setBounds(250, 130, 202, 30);

        txtlName.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtlName);
        txtlName.setBounds(250, 300, 202, 30);

        txtnic.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtnic);
        txtnic.setBounds(740, 210, 211, 30);

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Passport Id:");
        jLabel6.setMaximumSize(new java.awt.Dimension(180, 40));
        jLabel6.setMinimumSize(new java.awt.Dimension(180, 40));
        jLabel6.setPreferredSize(new java.awt.Dimension(180, 40));
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(580, 130, 143, 30);

        txtpassport.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtpassport);
        txtpassport.setBounds(740, 130, 214, 30);

        txtdob.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtdob.setPreferredSize(new java.awt.Dimension(64, 22));
        jDesktopPane1.add(txtdob);
        txtdob.setBounds(250, 380, 202, 37);

        jLabel8.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Gender:");
        jLabel8.setMaximumSize(new java.awt.Dimension(233, 54));
        jLabel8.setMinimumSize(new java.awt.Dimension(233, 54));
        jLabel8.setPreferredSize(new java.awt.Dimension(233, 54));
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(580, 290, 143, 40);

        jLabel9.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Contact No:");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(580, 380, 143, 37);

        txtcontact.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtcontact);
        txtcontact.setBounds(740, 390, 211, 30);

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Segoe UI Emoji", 0, 17)); // NOI18N
        male.setText("Male");
        jDesktopPane1.add(male);
        male.setBounds(740, 304, 100, 30);

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe UI Emoji", 0, 17)); // NOI18N
        female.setText("Female");
        jDesktopPane1.add(female);
        female.setBounds(840, 304, 120, 30);

        exit.setFont(new java.awt.Font("Eras Demi ITC", 1, 25)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Exit.png")); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jDesktopPane1.add(exit);
        exit.setBounds(925, 571, 140, 43);

        back.setFont(new java.awt.Font("Eras Demi ITC", 1, 25)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\back.png")); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jDesktopPane1.add(back);
        back.setBounds(298, 571, 160, 43);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Add Customer Details  ");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(406, 24, 592, 54);

        save.setFont(new java.awt.Font("Eras Demi ITC", 1, 25)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kiran Kumar Patel\\OneDrive\\Desktop\\New folder\\Airline-Reservation-System\\src\\Images\\Save-icon.png")); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jDesktopPane1.add(save);
        save.setBounds(607, 570, 160, 43);

        txtphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jDesktopPane1.add(txtphoto);
        txtphoto.setBounds(1010, 120, 123, 117);

        browse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jDesktopPane1.add(browse);
        browse.setBounds(1160, 180, 109, 31);

        txtfName.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jDesktopPane1.add(txtfName);
        txtfName.setBounds(250, 210, 202, 30);

        jLabel10.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("DOB:");
        jLabel10.setMaximumSize(new java.awt.Dimension(233, 54));
        jLabel10.setMinimumSize(new java.awt.Dimension(233, 54));
        jLabel10.setPreferredSize(new java.awt.Dimension(233, 54));
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(50, 380, 155, 39);

        path.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDesktopPane1.add(path);
        path.setBounds(1029, 274, 232, 22);

        tno.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tno.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(tno);
        tno.setBounds(192, 15, 95, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Insert Photo");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(1160, 140, 87, 21);

        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jDesktopPane1.add(pass);
        pass.setBounds(1010, 300, 123, 120);

        browse1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        browse1.setText("Browse");
        browse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(browse1);
        browse1.setBounds(1160, 350, 109, 31);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Insert Passport");
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(1160, 310, 106, 21);

        path1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDesktopPane1.add(path1);
        path1.setBounds(1029, 456, 239, 22);

        tno1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tno1.setForeground(new java.awt.Color(255, 255, 255));
        tno1.setText("Registration No.:");
        jDesktopPane1.add(tno1);
        tno1.setBounds(58, 15, 128, 20);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Logged in as :");
        jDesktopPane1.add(jLabel12);
        jLabel12.setBounds(1148, 0, 90, 16);

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("user");
        jDesktopPane1.add(username);
        username.setBounds(1256, 0, 200, 16);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
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
                int id = Integer.parseInt(txtid.getText());
                
                pst.setInt(1, id);
                pst.executeUpdate();  
        }  
        catch (SQLException ex) {
            Logger.getLogger(Add_Customer_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if(User.count==1){
        try {
            this.toBack();
            setVisible(false);
            Book_Ticket bt=new Book_Ticket();
            bt.toFront();
            bt.setState(java.awt.Frame.NORMAL);
            User.count1++;
        } catch (SQLException ex) {
            Logger.getLogger(Add_Customer_Details.class.getName()).log(Level.SEVERE, null, ex);
        }}
        else{
         JOptionPane.showMessageDialog(null, "Cannot go back after customer details added once.");
        }
    }//GEN-LAST:event_backActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
                
                    
        try {
                String id = txtid.getText();
                String firstname = txtfName.getText();
                String lastname = txtlName.getText();
                String Nic_No = txtnic.getText();
                String passport = txtpassport.getText();
               
                DateFormat da=new SimpleDateFormat("yyyy-MM-dd");
                String Dob = da.format(txtdob.getDate());
                String Gender;
                if(male.isSelected())
                {
                    Gender = "Male";
                }
                else
                {
                    Gender = "Female";
                }
                String Contact = txtcontact.getText();
                
                
                    pst=con.prepareStatement("insert into customer(Ticket_No,id,firstname,lastname,Nic_No,Passport_Id,Dob,Gender,Contact,photo,passport)values(?,?,?,?,?,?,?,?,?,?,?)");
                     pst.setString(1, User.tno);
                    pst.setString(2, id);
                    pst.setString(3, firstname);
                    pst.setString(4, lastname);
                   
                    pst.setString(5, Nic_No);
                    pst.setString(6, passport);
                    pst.setString(7, Dob);
                    pst.setString(8, Gender);
                    pst.setString(9, Contact);
                   
                    pst.setBytes(10,photo1);
                    pst.setBytes(11,photo2);
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(null, "Details added successfully.");
                
               
                String sql="select * from customer where id=? and Passport_Id=?";
                pst=con.prepareStatement(sql);
                pst.setString(1, id);
                pst.setString(2, passport);
                pst.execute();
                rs=pst.executeQuery();
                while(rs.next()){
                    
                int id1;
                id1=rs.getInt("id");
                User.cid=id1;
                String cnu=rs.getString("Contact");
                User.cnum=cnu;
                }
                
            String sql1="select * from book where Ticket_No=?";
            pst=con.prepareStatement(sql1);
            pst.setString(1, User.tno);
            pst.execute();
            rs=pst.executeQuery();
            while(rs.next()){
                String tn;
                tn=rs.getString("Ticket_No");
                User.tno=tn;
                int ts=rs.getInt("Seats");
                User.tseat=ts;
                String s;
                s=rs.getString("Class");
                User.class2=s;
                User.fName=rs.getString("Flight_Name");
                String d;
                d=rs.getString("Date");
                User.fDate=d;
                String t;
                t=rs.getString("Departure_Time");
                User.fTime=t;
                }
            
            if("AIR INDIA".equals(User.fName)){
                this.toBack();
                Select_Seats_20 ss = new Select_Seats_20();
                ss.setVisible(true);
                ss.toFront();
                
            }
            else if("INDIGO".equals(User.fName)){
                this.toBack();
                Select_Seats_28 ss1 = new Select_Seats_28();
                ss1.setVisible(true);
                ss1.toFront();
            
            
            }
                pst.close();
                rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Add_Customer_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_saveActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
       JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
         
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            txtphoto.setIcon(new ImageIcon(selectedImageFile.toString()));
            filename=selectedImageFile.getAbsolutePath();
            path.setText(filename);
               JOptionPane.showMessageDialog(null, filename);
           
            ImageIcon ii = new ImageIcon(filename);

            Image image1 = ii.getImage().getScaledInstance(txtphoto.getWidth(), txtphoto.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i2 = new ImageIcon(image1);
            txtphoto.setIcon(i2);
            try {
            File image=new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readnum; (readnum=fis.read(buf)) !=-1;)
            {            
                baos.write(buf,0,readnum);                
            }
            photo1=baos.toByteArray();
            
        } catch (IOException e) {
        }       
    
         
             
            
            
        }
            
            
    }//GEN-LAST:event_browseActionPerformed

    private void browse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse1ActionPerformed
        
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
         
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            pass.setIcon(new ImageIcon(selectedImageFile.toString()));
            filename=selectedImageFile.getAbsolutePath();
            path1.setText(filename);
               JOptionPane.showMessageDialog(null, filename);
           
            ImageIcon ii = new ImageIcon(filename);

            Image image1 = ii.getImage().getScaledInstance(pass.getWidth(), pass.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i2 = new ImageIcon(image1);
            pass.setIcon(i2);
            try {
            File image=new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readnum; (readnum=fis.read(buf)) !=-1;)
            {            
                baos.write(buf,0,readnum);                
            }
            photo2=baos.toByteArray();
            
        } catch (IOException e) {
        }       
        }
    }//GEN-LAST:event_browse1ActionPerformed

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
            Logger.getLogger(Add_Customer_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
         this.toBack();
         User.count3=1;
        Help ob=new Help();
        ob.setVisible(true);
        ob.toFront();
    }//GEN-LAST:event_helpMouseClicked
        

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
            new Add_Customer_Details().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton browse;
    private javax.swing.JButton browse1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu contact;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton female;
    private javax.swing.JMenu help;
    private javax.swing.JMenu home;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel path;
    private javax.swing.JLabel path1;
    private javax.swing.JButton save;
    private javax.swing.JLabel tno;
    private javax.swing.JLabel tno1;
    private javax.swing.JTextField txtcontact;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtfName;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlName;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtpassport;
    private javax.swing.JLabel txtphoto;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
