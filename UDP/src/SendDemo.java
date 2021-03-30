import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.InetAddress;
import java.io.IOException;
import java.net.DatagramPacket;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		
		byte[] bys = "hello udp, I am comming!".getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("172.25.198.153");
		int port = 23456;
		
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
	
		ds.send(dp);
//		System.out.println("hello world!");
		ds.close();
	}
}
