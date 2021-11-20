package ExceptionHandling;
import java.io.*;
class Myclass
{
	void method() throws IOException
	{
		throw new IOException("device error");
	}
}

public class ThrowsKeyword1
{

	public static void main(String[] args) 
	{
		 Myclass mc=new Myclass();
		 try
		 {
		 mc.method();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println("printing rest code");
		 

	}

}
