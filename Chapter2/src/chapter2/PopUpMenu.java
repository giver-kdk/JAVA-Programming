/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;
import javax.swing.*;
// Package for event handling
import java.awt.event.*;

/**
 *
 * @author Nagarjuna 14
 */
public class PopUpMenu {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Menu Example");
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        
        // 'fileMenu' is the menu options
        // ******* Fle Menu *******
        JPopupMenu popupFileMenu = new JPopupMenu("File");
        popupFileMenu.setSize(30, 20);
        popupFileMenu.setVisible(true);
        
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem closeItem = new JMenuItem("Close");
        JMenuItem printItem = new JMenuItem("Print");
        // Add menu item option in the menu
        popupFileMenu.add(openItem);
        popupFileMenu.add(closeItem);
        popupFileMenu.add(printItem);
        
        
        // Show the popup menu when mouse clicked
        f.addMouseListener(new MouseAdapter(){
           // Mouse Click event handler method
           public void mouseClicked(MouseEvent e){
               // Put the popup menu in the mouse cursor coordinate
               popupFileMenu.show(f, e.getX(), e.getY());
           }
        });
    }
}
