package multithreading;
public class DaemonThreadEx1 extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread running");
		}
		else
		{
			System.out.println("non-daemon thread is running");
		}
	}
	 public static void main(String [] args)
	 {
		DaemonThreadEx1 dt=new DaemonThreadEx1();
	    DaemonThreadEx1 dt1=new DaemonThreadEx1();
	    DaemonThreadEx1 dt2=new DaemonThreadEx1();
	    dt.setDaemon(true);
	    dt.start();
	    dt1.start();
	    dt2.start();
	 }
	
}
