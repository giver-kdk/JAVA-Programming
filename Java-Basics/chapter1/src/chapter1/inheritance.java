/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 *
 * @author Nagarjuna 14
 */
class GrandFather
{
    public void GrandFunction()
    {
        System.out.println("I am a grand father");
    }
}
// 'extends' keyword performs inheritance
class Father extends GrandFather
{
    public void FatherFunction()
    {
        System.out.println("I am a father");
    }
}
class Son extends Father
{
    public static void Greet()
    {
        System.out.println("Greetings!");
    }
    public void SonFunction()
    {
        System.out.println("I am a son");
    }
    // Method Overriding with '@Override' keyword
    @Override public void FatherFunction()
    {
        System.out.println("I am a son of father");
    }
    // Inner class
    class Son1
    {
        public void Son1Function()
        {
            System.out.println("I am a son one");
        }
    }
     // Inner class
    class Son2
    {
        public void Son2Function()
        {
            System.out.println("I am a son two");
        }
    }
            
}
public class inheritance {
    public static void main(String[] args)
    {
        GrandFather g1 = new GrandFather();
        g1.GrandFunction();
        System.out.println();
        
        Father f1 = new Father();
        f1.GrandFunction();
        f1.FatherFunction();
        System.out.println();
        
        Son.Greet();
        Son s1 = new Son();
        s1.GrandFunction();
        s1.FatherFunction();
        s1.SonFunction();
        System.out.println();
        
        // Instanciatign Inner Class requires two 'new' keywords
        Son.Son1 ss1 = new Son().new Son1();
        ss1.Son1Function();
        System.out.println();
        
        // Instanciating Inner Class with superclass instance
        Son.Son2 ss2 = s1.new Son2();
        ss2.Son2Function();
    }
}
