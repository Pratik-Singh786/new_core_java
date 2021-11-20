package networking;
import java.net.*;
public class DatagramSocketSender {

	public static void main(String[] args)  throws Exception
	{
		DatagramSocket ds=new DatagramSocket();// DatagramSocket  is used as sender and receiver as well
		String str="Welcome to neptel";
		InetAddress ip=InetAddress.getByName("127.0.0.1");
		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		ds.send(dp);
		ds.close();
	}
}