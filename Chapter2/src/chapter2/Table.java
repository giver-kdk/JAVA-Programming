/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;
import javax.swing.*;

/**
 *
 * @author Nagarjuna 14
 */
public class Table {
     public static void main(String[] args)
    {
        JFrame f = new JFrame("Table Example");

        // 1D Array for table columns
        String column[] = {"NAME", "ADDRESS", "EMAIL"};
        
        // 2D Array for table data
        String data[][] = {
            {"Ravi", "Lalitpur", "ravi789@gmail.com"},
            {"Sita", "Bhaktapur", "sita101@gmail.com"},
            {"Gita", "Jorpati", "gita202@gmail.com"},
        };
        
        // Create the table with given column and data
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        
        // Create scroll pane for handling data overflow while providing JTable as a parameter
        JScrollPane sp = new JScrollPane(jt);
        // Add scroll pane in the frame
        f.add(sp);
        // Add table in the scroll pane
        
        f.setSize(300, 400);
        // f.setLayout(null);                   // Comment the 'null' layout for table
        f.setVisible(true);
    }
}
