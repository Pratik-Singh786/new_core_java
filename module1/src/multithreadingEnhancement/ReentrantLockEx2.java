package multithreadingEnhancement;
import java.util.concurrent.locks.*;
class MyTHreadEx2 extends Thread
{
	static ReentrantLock l1=new ReentrantLock();
	MyTHreadEx2(String name)
	{
		super(name);
		
	}
	public void run()
	{
		if(l1.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+"..."+"got the lock and performing safe operation");
			
		
		  try
		  {
		  	Thread.sleep(1000);
		  }
		  catch(Exception e) 
		   {
		     System.out.println(e)	;
		   }
		
		 l1.unlock();
	   }
		else
		{
			System.out.println(Thread.currentThread().getName()+"... "+ "unable to get the lock hence performing alternative operations");
		}
	}
	
}
public class ReentrantLockEx2

{
	public static void main(String [] args)
	{
		MyTHreadEx2 mex=new MyTHreadEx2("First Thread");
		MyTHreadEx2 mex1=new MyTHreadEx2("First Thread");
		mex.start();
		mex1.start();
		
		
	}
	
	
}