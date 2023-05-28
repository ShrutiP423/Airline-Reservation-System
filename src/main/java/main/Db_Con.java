package main;


import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;


public class Db_Con {
           Connection con;
       public static Connection db() {
           try{
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dbcon","root","");
               JOptionPane.showMessageDialog(null, "Connected Sucessfully");
               return con;
           }catch(HeadlessException | ClassNotFoundException | SQLException e){
               JOptionPane.showMessageDialog(null, e);
               return null;
               
               
        }

    }

}
