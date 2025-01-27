package tcp_udp;
import java.net.*;

class udp_server {
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