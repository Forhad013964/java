
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        byte[] buf = sc.nextLine().getBytes();

        InetAddress ip = InetAddress.getByName("127.0.0.1");
        ds.send(new DatagramPacket(buf, buf.length, ip, 9876));

        byte[] rBuf = new byte[1024];
        DatagramPacket rDp = new DatagramPacket(rBuf, rBuf.length);
        ds.receive(rDp);

        System.out.println("Response: " +
            new String(rDp.getData(), 0, rDp.getLength()));

        ds.close();
        sc.close();
    }
}
