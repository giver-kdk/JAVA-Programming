/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_database;
// Import 'sql' for accessing 'Connection', 'Statement' classes
import java.sql.*;
import java.io.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

/**
 *
 * @author Nagarjuna 14
 */
public class JAVA_Database {
    static final String url="jdbc:mysql://localhost:3306/";
    static final String db="ajp_ncit";
    static final String user="root";
    static final String pw="";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException
    {
        
        JFrame f = new JFrame("JAVA with Database");
        f.setLayout(null);

        // Create and set bounds for the label
        JLabel l1 = new JLabel("Name: ");
        l1.setBounds(20, 20, 250, 30);
        
        // Create and set bounds for text fields
        JTextField t = new JTextField();
        t.setBounds(20, 50, 250, 20);

        // Create and set bounds for the label
        JLabel l2 = new JLabel("Email: ");
        l2.setBounds(20, 75, 250, 30);
        
        JTextField t2 = new JTextField();
        t2.setBounds(20, 105, 250, 20);

        // Create and set bounds for buttons
        JButton b1 = new JButton("Insert");
        b1.setBounds(20, 150, 250, 30);
        
        // DB Operation
        b1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            Connection con = null;
            Statement st;
            try{
                con=DriverManager.getConnection(url + db, user, pw);
                con.setAutoCommit(true);
                if(con != null)
                {
                    System.out.println("Connected!");
                }
                st = con.createStatement();
                
                String name = t.getText();
                String email = t2.getText();
                st.executeUpdate("INSERT INTO student(name, email) VALUES('" + name + "', '" + email + "')");

                // Read Query
                String query = "SELECT * FROM student"; // query to be run

                ResultSet rs = st.executeQuery(query); // Execute query

                while(rs.next())
                {
                    System.out.println(rs.getString("name"));
                    System.out.println(rs.getString("email"));
                }

                st.close(); // close statement
                con.close(); // close connection
                System.out.println("Connection Closed....");

                con.commit();
            }
            catch(SQLException ex){

                // con.rollback();
            }
        }  
        });  

        // Add components to the frame
        f.add(l1);
        f.add(l2);
        f.add(t);
        f.add(t2);
        f.add(b1);
       

        // Set frame properties
        f.setSize(300, 250); // Adjust frame size to fit all components
        f.setVisible(true); // Make the frame visible
        
        
    }
    
}
