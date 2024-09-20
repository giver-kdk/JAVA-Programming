/*
 Write a program on TCP and UDP based socket programming
 */
package tcp_udp;
import java.io.*;
import java.net.*;
/**
 *
 * @author Nagarjuna 14
 */
public class tcp_client {
    public static void main(String[] s){
        try{
            Socket socket = new Socket("localhost",1234);
            System.out.println(socket + " Server is connected.");
            
            // Message sent to server
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            out.writeUTF("Hello Server");     
            String message = in.readUTF();
            System.out.println(message);
            
            socket.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}