package multithreadingEnhancement;

public class ThreadGroupEx2 {

	public static void main(String[] args) 
	{
		ThreadGroup tg=new ThreadGroup("parent group");
		System.out.println(tg.getParent());//main
		ThreadGroup tg1=new ThreadGroup(tg,"child group");
		System.out.println(tg1.getParent());//parent group
		Thread t1=new Thread(tg,"thread_0");
		Thread t2=new Thread(tg,"thread_1");
		tg.setMaxPriority(3);
		Thread t3=new Thread(tg,"thread_3");
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5
		System.out.println(t3.getPriority());//3
		
		


	}

}
