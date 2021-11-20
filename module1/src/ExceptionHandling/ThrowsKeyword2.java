package ExceptionHandling;

import java.io.IOException;

public class ThrowsKeyword2 {
	public void m1() throws IOException   //works only for checked exceptions and deligate the responsibility of exception handling to calling method
	{
		throw new IOException("device error");  
	
	}


	public static void main(String[] args) throws IOException
	{

		ThrowsKeyword2  tk2=new ThrowsKeyword2 ();
		try 
		{
			tk2.m1();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}

	}

}
