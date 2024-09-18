/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;
import javax.swing.*;
// Needs to be added manually
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Nagarjuna 14
 */
public class Tree {
     public static void main(String[] args)
    {
        JFrame f = new JFrame("Tree Example");

        // Create root node
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        
        // Create 1st level tree nodes
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        
        // Create 2nd level tree node
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode yellow = new DefaultMutableTreeNode("yellow");
        DefaultMutableTreeNode purple = new DefaultMutableTreeNode("purple");
        
        // Link 1st level tree nodes to root node
        style.add(color);
        style.add(font);
        
        // Link 2nd level tree nodes to 1st level tree node
        color.add(red);
        color.add(green);
        color.add(blue);
        color.add(yellow);
        color.add(purple);
        
        // Pass root node as parameter in the tree
        JTree jt = new JTree(style);
        f.add(jt);                              // Add tree in the frame
        
        f.setSize(300, 400);
        // f.setLayout(null);                   // Comment the 'null' layout for tree
        f.setVisible(true);
    }
}
