/*
 WAP to take user input and store in "csit.txt", also read data from the file and perform random access write & read
 */
package JavaIO;
// Package for Java IO operations
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Nagarjuna 14
 */
public class file_io {
    public static void WriteMethod(File fp, String text)
    {
        // Exception Handling is compulsary for File Handling
        try{
            // Write on file
            FileWriter fw = new FileWriter(fp);
            // FileWriter fw = new FileWriter("C:\\Users\\Nagarjuna 14\\Documents\\Java-Programming\\chapter1\\src\\JavaIO\\csit.txt");
            fw.write(text);
            fw.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void ReadMethod(File fp)
    {
        try{
             // Read from file
            FileReader fr = new FileReader(fp);
            // FileReader fw = new FileReader("C:\\Users\\Nagarjuna 14\\Documents\\Java-Programming\\chapter1\\src\\JavaIO\\csit.txt");
            char[] result  = new char[100];                 // FileReader returns array of character
            fr.read(result);
            System.out.print("File Read Data: ");
            // Print the character array separately to have a correct encoding format of the data
            System.out.println(result);
            fr.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void RandomAccessWrite(File fp)
    {
        try{
            // RandomAccessFile constructor requires the file path and mode
            RandomAccessFile raf = new RandomAccessFile(fp.getAbsolutePath(), "rw");
            // Move cursor 40 characters forward
            raf.seek(40);
            String text = "Java Programming";
            // RandomAccessFile takes array of bytes to write
            raf.write(text.getBytes());
            raf.close();
            System.out.println("File Randomly Written Successfully!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void RandomAccessRead(File fp)
    {
        try{
            // RandomAccessFile constructor requires the file path
            RandomAccessFile raf = new RandomAccessFile(fp.getAbsolutePath(), "r");
            raf.seek(45);                           // Move cursor to 45 steps forward
            // RandomAccessFile returns array of byte for Reading
            byte[] result = new byte[100];
            // RandomAccessFile takes array of bytes to write
            raf.read(result);
            // Convert byte array to string and display result
            String resultText = new String(result);
            System.out.print("Random Acess Read:");
            System.out.println(resultText);
            raf.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try{
            // Take user input
            System.out.print("Enter Text: ");
            String text = scan.nextLine();
            
            // Create file
            File fp = new File("C:\\Users\\Nagarjuna 14\\Documents\\Java-Programming\\chapter1\\src\\JavaIO\\csit.txt");
            if(!fp.exists()){
                fp.createNewFile();
                System.out.println("File Created");
            }
            
           WriteMethod(fp, text);
           ReadMethod(fp);
           RandomAccessWrite(fp);
           RandomAccessRead(fp);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
