package main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shruti Patel
 */
public class Help extends javax.swing.JFrame {

    /**
     * Creates new form Help
     */
    public Help() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Help");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("   How to use?\n1. Sign in if you are new user.\n2. If you have already sign in then Login to enter. If you have forgotten password click on Forgot Password.\n3. Once you enter Home screen click on Search Flight Details.\n4. Search the Flight according to your requirement. Click on the Flight that you want to book.\n5. Select the number of seats you want and add customer details.\n6. Select the seat you want.\n7. Then process with payment.\n8. Print your payment receipt to confirm your booking.\n9. Once you have your receipt the ticket will be available. Print it.\n10. Your Ticket will also be available in Booked Ticket on Home Screen.You can enter your Customer Id and Ticket Number to view it.");
        jScrollPane1.setViewportView(jTextArea1);

        home.setIcon(new javax.swing.ImageIcon("C:\\Users\\vidhi\\OneDrive\\Desktop\\Airline_Reservation_System\\src\\Images\\back.png")); // NOI18N
        home.setText("Back");
        home.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jMenuBar1.add(home);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(651, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(453, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        try {
            
            setVisible(false);
            
            if(User.count3==1){
                this.toBack();
             setVisible(false);
               Add_Customer_Details ad= new Add_Customer_Details();
             ad.toFront();
             ad.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==2){
                this.toBack();
             setVisible(false);
               Book_Ticket bt= new Book_Ticket();
                        bt.toFront();
             bt.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==3){
                this.toBack();
             setVisible(false);
               Booked_Ticket tb= new Booked_Ticket();
               tb.toFront();
             tb.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==4){
                this.toBack();
             setVisible(false);
               Cancel_Flight_Ticket cf= new Cancel_Flight_Ticket();
               cf.toFront();
             cf.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==5){
                this.toBack();
             setVisible(false);
                new Home().setVisible(true);
            }
            else if(User.count3==6){
                this.toBack();
             setVisible(false);
                Login lg=new Login();
                lg.toFront();
                lg.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==7){
                this.toBack();
             setVisible(false);
               Payment_Receipt pr= new Payment_Receipt();
               pr.toFront();
             pr.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==8){
                this.toBack();
             setVisible(false);
                new Registration().setVisible(true);
            }
            else if(User.count3==9){
                this.toBack();
             setVisible(false);
             Search_Flight_Details sf=new Search_Flight_Details();
             sf.toFront();
             sf.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==10){
                this.toBack();
             setVisible(false);
                Select_Seats_20 s2=new Select_Seats_20();
                s2.toFront();
             s2.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==11){
                this.toBack();
             setVisible(false);
                Select_Seats_28 s3=new Select_Seats_28();
                s3.toFront();
             s3.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==12){
                this.toBack();
             setVisible(false);
               CreditCard cc= new CreditCard();
               cc.toFront();
             cc.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==13){
                this.toBack();
             setVisible(false);
                DebitCard db=new DebitCard();
               db.toFront();
             db.setState(java.awt.Frame.NORMAL);
            }
            else if(User.count3==14){
                this.toBack();
             setVisible(false);
                new PaymentOption().setVisible(true);
            }
            else if(User.count3==15){
                this.toBack();
             setVisible(false);
                new ForgotPass().setVisible(true);
            }
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeMouseClicked

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
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Help().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
