package multithreadingEnhancement;

public class ThreadGroupEx3  extends Thread
{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
	 ThreadGroupEx3 tgd=  new ThreadGroupEx3();
	 ThreadGroup tg=new ThreadGroup("Parent group"); // creating an thread group
	  Thread te=new Thread(tg, tgd,"first thread");
	 
	  Thread te1=new Thread(tg,tgd,"second thread");
	  Thread te2=new Thread(tg,tgd,"third thread");
	  System.out.println(tg.activeCount());
	  tg.list();
	  tgd.start();
	  

	}

}
