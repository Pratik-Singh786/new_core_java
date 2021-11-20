package networking;
import java.io.*;
import java.net.*;
public class URlConnectionEx {

	public static void main(String[] args) 
	{
		try
		{
	      URL url=new URL("http://www.javatpoint.com/java-tutorial");// to read its HTML structure
	      URLConnection urlcon=url.openConnection();
	      InputStream stream=urlcon.getInputStream();
	      int i;
	      while((i=stream.read())!=-1)
	      {
	    	  System.out.print((char)i);
	    	  
	      }
		}
		catch(Exception e)
		{
			
		}
		

	}

}
