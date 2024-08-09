/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;
// Importing Package in JAVA. Requires to specify the class name too
import College.Student;


/**
 *
 * @author Nagarjuna 14
 */
public class Chapter1 extends Student{
    public Chapter1()
    {
        // Calling parent  class constructor inside child class constructor
        super("Hello Parent Class!");
    }
    // Method Overriding
    @Override public void Show(){
        // 'super' is similar to 'base' keyword in C#
        System.out.print("Parent Show Method: ");
        super.Show();
        System.out.println("This is child Show Method");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
        Student s1 = new Student();
        s1.Show();
        
        // Inheritance from package class
        Chapter1 c1 = new Chapter1();
        c1.Show();
        
    }
    
}
