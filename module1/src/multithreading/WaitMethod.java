package multithreading;
class ThreadB extends Thread
{
	int total=0;
	public  void run()
	{
		synchronized(this)
		{
			System.out.println("child thread starts calculation");
			for(int i=0;i<=100;i++)
			{
				total=total+i;
			}
			System.out.println("child thread giving notification");
			this.notify();
		}
	}
}
public class WaitMethod
{
	public static void main(String []args)  throws Exception
	{
		ThreadB b=new ThreadB();
		b.start();
		synchronized(b)
		{
			System.out.println("Main thread calling wait");
			b.wait();
			System.out.println("main thread got the notification");
			System.out.println(b.total);
			
		}
		
	}
}