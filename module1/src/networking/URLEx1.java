package networking;
import java.net.*;
public class URLEx1 {

	public static void main(String[] args) 
	{
		try
		{
		  URL url=new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
		  System.out.println("protocol: "+ url.getProtocol());
		  System.out.println("Host name : "+ url.getHost());
		  System.out.println("Port Number: "+ url.getPort());
		  System.out.println("Default port number: "+ url.getDefaultPort());
		  System.out.println("Query String: "+ url.getQuery());
		  System.out.println("Path: "+ url.getPath());
		  System.out.println("File: "+ url.getFile());
		  
		}
		catch(Exception e)
		{
			
		}

	}

}
