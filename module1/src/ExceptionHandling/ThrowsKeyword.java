package ExceptionHandling;
import java.io.*;
public class ThrowsKeyword 
{
	void m() throws IOException  // works on checked exception and customized 
	{
		throw new IOException("device error");
		
	}
   void n() throws IOException
   {
	   m();
   }
   void p()
   {
	   try
	   {
		   n();
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception handled");
	   }
   }
   
	public static void main(String[] args)
	{
		ThrowsKeyword  tk=new ThrowsKeyword ();
		tk.p();
		System.out.println("rest code");

	}

}
