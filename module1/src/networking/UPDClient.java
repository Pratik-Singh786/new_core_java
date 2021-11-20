package networking;
import java.net.*;
import java.io.*;
import java.util.*;
public class UPDClient {

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		DatagramSocket ds=new DatagramSocket();
		InetAddress ip=InetAddress.getLocalHost();
		byte buf[]=null;
		while(true)
		{
			String inp=sc.nextLine();
			buf=inp.getBytes();
			DatagramPacket Dpspeed=new DatagramPacket(buf,buf.length,ip,1234);
			if(inp.equals("bye"))
				break;
		}

	}

}
