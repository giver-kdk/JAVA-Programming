/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp_udp;
import java.net.*;

/**
 *
 * @author Nagarjuna 14
 */
public class udp_server {
    public static void main(String[] s){
            
        try{
            DatagramSocket socket = new DatagramSocket(9999);
            while(true){
            byte[] receiveData = new byte[100];    
            
            DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
            socket.receive(receivePacket);
            
            String receiveMessage = new String(receivePacket.getData());
            System.out.println("Client Message: " + receiveMessage); 
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}