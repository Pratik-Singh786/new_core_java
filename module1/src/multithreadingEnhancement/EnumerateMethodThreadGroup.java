package multithreadingEnhancement;

public class EnumerateMethodThreadGroup {

	public static void main(String[] args) 
	{
		ThreadGroup tgp=new ThreadGroup("parent ThreadGroup");
		Thread [] t=new Thread[10];
		tgp.enumerate(t);
		for(Thread t1:t)
		{
			System.out.println(t1.getName());
		}
		

	}

}
