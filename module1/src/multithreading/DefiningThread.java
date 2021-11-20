package multithreading;
import java.io.*;
class Mythread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}

public class DefiningThread
{
   public static void main(String[] args) throws IOException
	{
	   
	   Mythread  t=new  Mythread ();
	   t.start();
	   for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	   
	}
	
	

}
