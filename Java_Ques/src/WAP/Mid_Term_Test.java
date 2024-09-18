/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WAP;
import java.util.Scanner;
/**
 *
 * @author Nagarjuna 14
 */
public class Mid_Term_Test {
    public static void main(String[] args)
    {
        try
        {
            System.out.print("Enter balance amount: ");
            Scanner s1 = new Scanner(System.in);
            double balance = Double.parseDouble(s1.nextLine());
            
            System.out.print("Enter withdraw amount: ");
            double withdraw = Double.parseDouble(s1.nextLine());
            if(withdraw > balance){
                throw new MyException("Withdraw amount is greater than balance");
            }
            else{
                System.out.println("Remaining Balance: " + (balance - withdraw));
            }
        }
        catch(MyException excep)
        {
            System.out.println(excep.getMessage());
        }
    }
}
