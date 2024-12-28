//package event_handling;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//class mouseEv {
//
//    public static void main(String[] args) {
//        JFrame f = new JFrame("Adder Subtractor App");
//        JTextField t1 = new JTextField();
//        JTextField t2 = new JTextField();
//        JButton b = new JButton("Add/Subtract");
//        JLabel l = new JLabel("Result: ");
//
//        t1.setBounds(10, 20, 200, 30);
//        t2.setBounds(10, 60, 200, 30);
//        b.setBounds(10, 100, 200, 30);
//        l.setBounds(10, 140, 200, 30);
//
//        b.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                int n1 = Integer.parseInt(t1.getText());
//                int n2 = Integer.parseInt(t2.getText());
//                int sum = n1 + n2;
//                l.setText("Result: " + sum);
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                int n1 = Integer.parseInt(t1.getText());
//                int n2 = Integer.parseInt(t2.getText());
//                int diff = n1 - n2;
//                l.setText("Result: " + diff);
//            }
//        });
//
//        f.setLayout(null);
//        f.add(t1);
//        f.add(t2);
//        f.add(b);
//        f.add(l);
//        f.setSize(300, 250);
//        f.setVisible(true);
//    }
//}
package event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mouseEv {

    public static void main(String[] args) {
        JFrame f = new JFrame("Adder Subtractor App");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JLabel l = new JLabel("Result: ");
        
        JCheckBox addCheckbox = new JCheckBox("Addition");
        JCheckBox subtractCheckbox = new JCheckBox("Subtraction");

        t1.setBounds(10, 20, 200, 30);
        t2.setBounds(10, 60, 200, 30);
        t3.setBounds(10, 100, 200, 30);
        l.setBounds(10, 140, 200, 30);
        addCheckbox.setBounds(10, 180, 100, 30);
        subtractCheckbox.setBounds(120, 180, 100, 30);

        // Handle KeyEvent for t3 (Add/Subtract based on key pressed/released)
        t3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int sum = n1 + n2;
                l.setText("Result: " + sum);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int diff = n1 - n2;
                l.setText("Result: " + diff);
            }
        });

        // Handle WindowEvent (when the window is closed)
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closed");
//                System.exit(0); // Terminate the program when the window is closed
            }
        });

        // Handle ItemEvent using ItemAdapter
        addCheckbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (addCheckbox.isSelected()) {
                    System.out.println("Addition Selected");
                } else {
                    System.out.println("Addition Unselected");
                }
            }
        });

        subtractCheckbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (subtractCheckbox.isSelected()) {
                    System.out.println("Subtraction Selected");
                } else {
                    System.out.println("Subtraction Unselected");
                }
            }
        });

        // Set up JFrame properties
        f.setLayout(null);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(l);
        f.add(addCheckbox);
        f.add(subtractCheckbox);
        f.setSize(300, 250);
        f.setVisible(true);
    }
}
