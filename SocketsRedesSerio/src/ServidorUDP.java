import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUDP {
    public static void main(String[] args) {
        System.out.println("Servidor");

        try {
            DatagramSocket SocketUDP = new DatagramSocket(6543);
            byte[] bufer = new byte[10000];
            while (true) {
                DatagramPacket peticion = new DatagramPacket(bufer, bufer.length);
                SocketUDP.receive(peticion);
                System.out.println(" Datos " + new String(peticion.getData()));
            }
        }catch (Exception e){

        }
    }
}
