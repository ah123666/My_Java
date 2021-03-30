import java.net.InetAddress;
import java.net.UnknownHostException;

public class udpDemo {
	public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("DESKTOP-0977UU0");
        InetAddress address = InetAddress.getByName("172.25.198.153");
        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println("主机名："+name);
        System.out.println("ip地址："+ip);
	}
}
