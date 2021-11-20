package networking;
import java.io.*;
import java.net.*;
public class MyServer {

	public static void main(String[] args) 
	{
		try
		{
			ServerSocket ss=new ServerSocket(6000);//6666 is the port number
			Socket s=ss.accept();// established the connection and waiting for the client
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("message="+str);
			ss.close();
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		

	}

}
