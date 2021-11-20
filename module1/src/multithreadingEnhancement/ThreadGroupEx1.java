package multithreadingEnhancement;

public class ThreadGroupEx1 
{

	public static void main(String[] args)
	{
		ThreadGroup g1=new ThreadGroup("First group");
		System.out.println(g1.getParent().getName());
		ThreadGroup g2=new ThreadGroup(g1,"SecondGroup");
		

	}
}

