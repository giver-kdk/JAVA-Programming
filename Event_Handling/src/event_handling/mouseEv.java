package event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mouseEv {

    public static void main(String[] args) {
        JFrame f = new JFrame("Adder Subtractor App");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("Add/Subtract");
        JLabel l = new JLabel("Result: ");

        t1.setBounds(10, 20, 200, 30);
        t2.setBounds(10, 60, 200, 30);
        b.setBounds(10, 100, 200, 30);
        l.setBounds(10, 140, 200, 30);

        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int sum = n1 + n2;
                l.setText("Result: " + sum);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int diff = n1 - n2;
                l.setText("Result: " + diff);
            }
        });

        f.setLayout(null);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(l);
        f.setSize(300, 250);
        f.setVisible(true);
    }
}
