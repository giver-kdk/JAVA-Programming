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
    public static void main(String[] s) throws Exception{
            
        try{
            DatagramSocket socket = new DatagramSocket(9999);
            while(true){
                byte[] byteData = new byte[100];    

                DatagramPacket packet = new DatagramPacket(byteData, byteData.length);
                socket.receive(packet);

                String msg = new String(packet.getData());
                System.out.println("Client Message: " + msg); 
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}