/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vowel_Consonent;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author Nagarjuna 14
 */
public class Vowel_Consonent_Splitter {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a string:");
        // Take user input and convert to lower case
        String input = scanner.nextLine().toLowerCase();
        
        // Initialize strings to hold vowels and consonants
        String vowels = "";
        String consonants = "";

        // Define vowels for comparison
        String vowelsList = "aeiouAEIOU";

        // Process each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                vowels += c;
            }
            else{
                consonants += c;
            }                
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        
        // Write vowels to vowel.txt
        File vf = new File("vowel.txt");
        File cf = new File("consonant.txt");
        // Create files if they don't exist
        if(!vf.exists()){
            vf.createNewFile();
        }
        if(!cf.exists()){
            cf.createNewFile();
        }
        
        FileWriter vowelWriter = new FileWriter("vowel.txt");
        vowelWriter.write(vowels.toString().trim());
        System.out.println("Vowels have been written to vowel.txt");
        // Write consonants to consonant.txt
        FileWriter consonantWriter = new FileWriter("consonant.txt");
        consonantWriter.write(consonants.toString().trim());
        System.out.println("Consonants have been written to vowel.txt");
        // Close the scanner
        scanner.close();
        
        vowelWriter.close();
        consonantWriter.close();
    }
}
