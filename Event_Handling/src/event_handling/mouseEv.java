/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_handling;

/**
 *
 * @author Nagarjuna 14
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouseEv extends MouseAdapter {
    JFrame f;
    JTextField tf1, tf2;
    JLabel label;

    mouseEv() {


        f = new JFrame("Mouse Event Example");


        tf1 = new JTextField(15);
        tf2 = new JTextField(15);

        // Create label
        label = new JLabel("Result");


        f.add(tf1);
        f.add(tf2);
        f.add(label);


        f.addMouseListener(this);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new mouseEv();
    }
    @Override
    public void mousePressed(MouseEvent e) {
        int num_1 = Integer.parseInt(tf1.getText());
        int num_2 = Integer.parseInt(tf2.getText());
        int sum = num_1 + num_2;
        label.setText("Result : " + sum);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int num_1 = Integer.parseInt(tf1.getText());
        int num_2 = Integer.parseInt(tf2.getText());
        int diff = num_1 - num_2;
        label.setText("Result : " + diff);

    }

}
