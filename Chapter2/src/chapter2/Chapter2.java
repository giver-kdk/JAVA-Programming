/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;
// Import the swing library
import javax.swing.*;
/**
 *
 * @author Nagarjuna 14
 */
// Inheriting the 'JFrame' class doesn't require us to create the 'JFrame' object in main method
//public class Chapter2 extends JFrame{
public class Chapter2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create the app window frame
        JFrame f = new JFrame("My App");
        
        JLabel l1 = new JLabel("Advanced JAVA");
        // 'setBounds(X-Axis, Y-Axis, Width, Height)'
        l1.setBounds(20,20, 200, 20);
        // Add components inside the frame
        f.add(l1);
        
        JLabel l2 = new JLabel("Name: ");                           // Create lable
        l2.setBounds(20,50, 200, 20);
        f.add(l2);
        JTextField input1 = new JTextField("", 20);                 // Create text box
        input1.setBounds(20, 80, 200, 20);
        f.add(input1);

        JLabel l3 = new JLabel("Address: ");
        l3.setBounds(20,110, 200, 20);
        f.add(l3);
        JTextField input2 = new JTextField("", 20);
        input2.setBounds(20, 140, 200, 20);
        f.add(input2);

        JLabel l4 = new JLabel("Email: ");
        l4.setBounds(20,170, 200, 20);
        f.add(l4);
        JTextField input3 = new JTextField("", 20);
        input3.setBounds(20, 200, 200, 20);
        f.add(input3);
        
        
        
        JButton submit = new JButton("Submit");                     // Create button
        submit.setBounds(50, 230, 100, 20);
        f.add(submit);
        
        
        // Set app window size
        f.setSize(300, 400);
        // Use default layout
        f.setLayout(null);
        // Display the frame manually. Default is 'false'
        f.setVisible(true);
    }
    
}
