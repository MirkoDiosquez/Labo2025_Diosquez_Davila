import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteUDP {
    public static void main(String[] args) {
        System.out.println("Cliente");
        try {
            DatagramSocket SocketUDP = new DatagramSocket();
            int puerto = 6543;
            InetAddress host =  InetAddress.getByName("localhost");
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            String cad;
            cad = sc.readLine();
            byte [] mensaje = cad.getBytes();
            DatagramPacket peticion = new DatagramPacket(mensaje, cad.length(), host, puerto);
            SocketUDP.send(peticion);

        }catch (Exception e){

        }
    }
}
