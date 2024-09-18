/*
WAP to find sum and difference of two numbers. 
Use two text fields for input and a label for output.
Display the sum if user presses mouse and subtract if user releases mouse
*/
package java_ques;

import javax.swing.*;
import java.awt.event.*;
// Extend the MouseAdapter Class(Needs only required method to be implemented/overriden)
public class PastQuestion2 extends MouseAdapter {
    JFrame f;
    JTextField t1, t2;
    JLabel l1;

    PastQuestion2() {
        f = new JFrame("Add Sub with Mouse");

        t1 = new JTextField();
        t1.setBounds(20, 20, 100, 20);
        f.add(t1);

        t2 = new JTextField();
        t2.setBounds(20, 60, 100, 20);
        f.add(t2);

        l1 = new JLabel("Result: ");
        l1.setBounds(20, 100, 150, 20);
        f.add(l1);

        f.setSize(200, 200);
        f.setLayout(null);
        f.setVisible(true);
        
        // Add Event Listener
        f.addMouseListener(this);
    }

    public static void main(String[] args) {
        new PastQuestion2();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            l1.setText("Sum: " + (num1 + num2));
        } catch (NumberFormatException ex) {
            l1.setText("Invalid input!");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            l1.setText("Difference: " + (num1 - num2));
        } catch (NumberFormatException ex) {
            l1.setText("Invalid input!");
        }
    }
}
