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
public class exception_handling {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 0;
        int c = 0;
        try{
           if(b == 0)
           {
               throw new CustomException("Divide By Zero Error");
           }
           else{
               c = a/b;
               System.out.println("Division Result: " + c);
           }
            
        }
        catch(CustomException err){
            System.out.println(err.getMessage());
        }
    }
}
