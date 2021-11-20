package multithreadingEnhancement;
import java.util.concurrent.*;
class PrintJob implements Runnable
{
	String name;
	PrintJob(String name)
	{
		this.name=name;
		
	}
	public void run()
	{
		System.out.println(name+ "..."+"job startred by the thread "+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		System.out.println(name+ "..."+"job completed by the thread "+Thread.currentThread().getName());
	}
	
}
public class ThreadPoolEx
{
	public static void main(String[] args)
	{
		PrintJob[] jobs= {new  PrintJob("rahul"),new  PrintJob("ritik"),new  PrintJob("pratik")};
		ExecutorService  service =Executors.newFixedThreadPool(3);
		for(PrintJob job:jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}
}