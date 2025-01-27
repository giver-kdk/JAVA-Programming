package tcp_udp;
import java.net.*;

class udp_client {
    public static void main(String[] s) throws Exception{
        try{
            DatagramSocket socket = new DatagramSocket();
            InetAddress inet = InetAddress.getByName("localhost");
            
            String message = "Hello Server";
            DatagramPacket packet = new DatagramPacket(message.getBytes(),message.getBytes().length,inet,9999);
            socket.send(packet);
            
            socket.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}