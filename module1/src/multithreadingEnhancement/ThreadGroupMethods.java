package multithreadingEnhancement;
public class ThreadGroupMethods
{
	public static void main(String[] args)
	{
		ThreadGroup g1=new ThreadGroup("tg");
		Thread t1=new Thread(g1,"Thread-1");
		Thread t2=new Thread(g1,"Thread-2");
		g1.setMaxPriority(3);
		Thread  t3=new Thread(g1,"Thread-3");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		//=====================================================
		//some important methods
		
		System.out.println(t1.getName());// 1.getName()
		System.out.println(g1.getMaxPriority());//2.getMaxPriority()
		g1.setMaxPriority(10);//3.setMaxPriority()
		System.out.println(g1.getMaxPriority());
		System.out.println(g1.getParent());//4.
		g1.list();//5. prints information about the thread group
		System.out.println(g1.activeCount());//6.to print number of active threads in a thread group
		System.out.println(g1.activeGroupCount());//7.prints the number of active group present in current thread group
		System.out.println(g1.isDaemon());//10.
		g1.setDaemon(true);//11.to check whether the ThreadGroup is daemon or not.
		g1.interrupt();//12
		g1.destroy();//13
		
		
		
	}
}