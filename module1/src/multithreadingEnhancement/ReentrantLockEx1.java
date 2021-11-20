package multithreadingEnhancement;
import java.util.concurrent.locks.*;
class Display
{
	ReentrantLock l=new ReentrantLock();
	public void wish(String name)
	{
		l.lock();
		for(int i=0;i<=10;i++)
		{
			System.out.print("Good morning :");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(name);
		}
		l.unlock();
	}
}
 class ThreadEx1  extends Thread
 {
	 Display d;
	 String name;
	 ThreadEx1(Display d,String name)
	 {
		 this.d=d;
		 this.name=name;
		 
	 }
	 public void run()
	 {
		 d.wish(name);
	 }
 }
public class ReentrantLockEx1
{
	public static void main(String [] args)
	{
		Display d=new Display();
		ThreadEx1 tex=new ThreadEx1(d,"kohli");
		ThreadEx1 tex1=new ThreadEx1(d,"yuvraj");
		ThreadEx1 tex2=new ThreadEx1(d,"dhoni");
		tex.start();
		tex1.start();
		tex2.start();
		
		
	}
	
	
}