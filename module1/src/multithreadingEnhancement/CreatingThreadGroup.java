package multithreadingEnhancement;

public class CreatingThreadGroup {

	public static void main(String[] args) 
	{
	  ThreadGroup tg=new ThreadGroup("FirstGroup");
	  ThreadGroup tg1=new ThreadGroup(tg,"Second Group");
	  System.out.println(tg1.getParent().getName());//first group

	}

}
