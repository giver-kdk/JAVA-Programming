/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_database;
// Import 'sql' for accessing 'Connection', 'Statement' classes
import java.sql.*;
import java.io.*;


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
        // 
        Connection con = null;

        Statement st;
        try{
            con=DriverManager.getConnection(url + db, user, pw);
            con.setAutoCommit(true);
            if(con != null)
            {
                System.out.println("Connected!");
            }
            // String query = "INSERT INTO students VALUES(2, 'Hari Shretsha', 'hari123@gmail.com')"; // query to be run
            String query = "select *from students"; // query to be run
            st = con.createStatement();
            ResultSet rs = st.executeQuery(query); // Execute query
            rs.next();
            String name = rs.getString("name"); // Retrieve name from db

            
            System.out.println(name); // Print result on console
            st.close(); // close statement
            con.close(); // close connection
            System.out.println("Connection Closed....");

            con.commit();
        }
        catch(SQLException ex){
            
            // con.rollback();
        }
        
    }
    
}
