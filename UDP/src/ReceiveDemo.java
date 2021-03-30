
import java.net.DatagramSocket;
import java.net.SocketException;
import java.io.IOException;
import java.net.DatagramPacket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(23456);
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		
		ds.receive(dp);
		
		byte[] datas = dp.getData();
		String dataString = new String(datas, 0, dp.getLength());
//		System.out.println(dataString.length());
		System.out.println("数据是："+dataString);
		ds.close();
	}
}
