package multithreadingEnhancement;

class ThreadEx extends Thread
{
	ThreadEx(ThreadGroup g ,String name)
	{
		super(g,name);
	}
	public void run()
	{
		System.out.println("Child Thread");
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
public class ThreadGroupEx4
{

	public static void main(String[] args) throws Exception
	{
		ThreadGroup pg=new ThreadGroup("parentgroup");
		ThreadGroup cg=new ThreadGroup(pg,"childgroup");
		ThreadEx te=new ThreadEx(pg,"child group");
		ThreadEx te1=new ThreadEx(pg,"child group");
		te.start();
		te1.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(1000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		

	}

}
