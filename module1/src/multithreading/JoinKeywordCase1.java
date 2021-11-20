package multithreading;
import java.io.*;
class MyThread13 extends Thread
{
	public  void run()
	{
		for(int i=1;i<10;i++)
		{
			
		  try
		  {
			Thread.sleep(1000);
			
		  }
		  catch(InterruptedException e)
		  {
			
		  }
		System.out.println("child Thread");
		
	
		}
		
	}	
}
public class JoinKeywordCase1 {

	public static void main(String[] args)  throws InterruptedException
	{
		MyThread13 m13=new MyThread13();
		m13.start();
		m13.join();   //here we calling join method inside main so child thread will execute first
		for(int i=1;i<10;i++)
		{
			System.out.println("main Thread");
		}

	}

}
