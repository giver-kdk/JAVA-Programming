package event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Adder {

    public static void main(String[] args) {
        JFrame f = new JFrame("Adder App");

        JTextField t1 = new JTextField();
        t1.setBounds(10, 20, 200, 30);
        f.add(t1);
        JTextField t2 = new JTextField();
        t2.setBounds(10, 60, 200, 30);
        f.add(t2);
        JButton b = new JButton("Add");
        b.setBounds(10, 100, 200, 30);
        f.add(b);
        JLabel l = new JLabel("Result: ");
        l.setBounds(10, 140, 200, 30);
        f.add(l);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                l.setText("Result: " + sum);
            }
        });

        f.setLayout(null);
        f.setSize(300, 250);
        f.setVisible(true);
    }
}
