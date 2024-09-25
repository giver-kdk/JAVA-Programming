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
public class udp_client {
    public static void main(String[] s) throws Exception{
        try{
            byte[] sendData = new byte[100];
            DatagramSocket socket = new DatagramSocket();
            InetAddress inet = InetAddress.getByName("localhost");
            
            String message = "Hello Server";
            DatagramPacket sendPacket = new DatagramPacket(message.getBytes(),message.getBytes().length,inet,9999);
            socket.send(sendPacket);
            
            socket.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}