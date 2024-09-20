/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp_udp;
import java.net.*;
import java.io.*;
/**
 *
 * @author Nagarjuna 14
 */
public class tcp_server {
    public static void main(String[] s){
        try{
            ServerSocket server = new ServerSocket(1234);
            Socket client = server.accept();
            System.out.println(client + " Client is connected.");
            
            DataInputStream input = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            String message =(String) input.readUTF();
            System.out.println(message);  
            out.writeUTF("Hello Client");
            
            client.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}