package java_ques;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PastQuestion1 implements ActionListener {
    JFrame f;
    JTextField t;
    JTextField t2;
    JLabel l3;

    PastQuestion1() {
        f = new JFrame("Add Sub Test");
        f.setLayout(null);

        // Create and set bounds for text fields
        t = new JTextField();
        t.setBounds(20, 20, 100, 20);

        t2 = new JTextField();
        t2.setBounds(20, 60, 100, 20);

        // Create and set bounds for buttons
        JButton b1 = new JButton("Add");
        b1.setBounds(20, 100, 100, 30);
        b1.addActionListener(this);

        JButton b2 = new JButton("Sub");
        b2.setBounds(130, 100, 100, 30);
        b2.addActionListener(this);

        // Create and set bounds for the label
        l3 = new JLabel("Result : ");
        l3.setBounds(20, 150, 200, 30);

        // Add components to the frame
        f.add(t);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(l3);

        // Set frame properties
        f.setSize(300, 250); // Adjust frame size to fit all components
        f.setVisible(true); // Make the frame visible
    }
    public void actionPerformed(ActionEvent e) { 
 
            // Get the text from the text fields and parse it
            int num1 = Integer.parseInt(t.getText());
            int num2 = Integer.parseInt(t2.getText());
            if (e.getActionCommand().equals("Add")) {
            int value=num1+num2;
                l3.setText(""+value);
              }
                if (e.getActionCommand().equals("Sub")) {
                 int value=num1-num2;
                l3.setText(""+value);
              }
        
        
    }

    public static void main(String[] args) {
        new PastQuestion1();
    }
}
