package multithreadingEnhancement;

public class AllActiveThreadSystemGroup {

	public static void main(String[] args) 
	{
		ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();
		Thread[] t1=new Thread[system.activeCount()];
		system.enumerate(t1); //to copy all active threads in the this ThreadGroup into provided Thread array
		for(Thread t2:t1 )
		{
			System.out.print(t2.getName()+"... "+t2.isDaemon());
		}
		

	}

}
