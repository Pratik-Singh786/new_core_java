package networking;
import java.net.*;
public class URLEx {

	public static void main(String[] args) 
	{
		try
		{
			URL url=new URL("https://www.javatpoint.com:80/java-tutorial");
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Host Name: "+url.getHost());
			System.out.println("Port number: "+url.getPort());
			System.out.println("file: "+url.getFile());
			System.out.println("file: "+url.getQuery());			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
			
		}
	

	}

}
