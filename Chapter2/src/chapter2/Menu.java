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
public class Menu {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Menu Example");
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        
        JMenuBar bar = new JMenuBar();
        bar.setSize(300, 20);
        bar.setVisible(true);
        // Add menubar in the app window
        f.add(bar);
        
        
        // 'fileMenu' is the menu options
        // ******* Fle Menu *******
        JMenu fileMenu = new JMenu("File");
        fileMenu.setSize(30, 20);
        fileMenu.setVisible(true);
        // Add the menu in the menu bar
        bar.add(fileMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem closeItem = new JMenuItem("Close");
        JMenuItem printItem = new JMenuItem("Print");
        // Add menu item option in the menu
        fileMenu.add(openItem);
        fileMenu.add(closeItem);
        fileMenu.add(printItem);
        
        // Adding Sub Menu Items
        JMenu subMenu = new JMenu("SubMenu");
        // Simply add a menu inside another menu to create sub-menu
        fileMenu.add(subMenu);
        JMenuItem item1 = new JMenuItem("Item1");
        JMenuItem item2 = new JMenuItem("Item2");
        JMenuItem item3 = new JMenuItem("Item3");
        // Simply add the menu item in the sub-menu item
        subMenu.add(item1);
        subMenu.add(item2);
        subMenu.add(item3);
        
        // ********* Sub-sub-menu *********
        JMenu subSubMenu = new JMenu("Sub Sub Menu");
        subMenu.add(subSubMenu);
        // Creating sub-sub items
        JMenuItem subItem1 = new JMenuItem("Sub Item1");
        JMenuItem subItem2 = new JMenuItem("Sub Item2");
        JMenuItem subItem3 = new JMenuItem("Sub Item3");
        // Add sub items in sub-sub menu 
        subSubMenu.add(subItem1);
        subSubMenu.add(subItem2);
        subSubMenu.add(subItem3);
        
        // ******* Edit Menu *******
        JMenu editMenu = new JMenu("Edit");
        editMenu.setBounds(30,0, 30, 20);
        editMenu.setSize(30, 20);
        editMenu.setVisible(true);
        // Add the menu in the menu bar
        bar.add(editMenu);
        
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        // Add menu item option in the menu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
    }
}
