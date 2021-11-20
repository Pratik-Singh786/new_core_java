package multithreadingEnhancement;
class CustomerThread extends Thread
{
	static Integer custId=0;
	private static ThreadLocal tl=new ThreadLocal()
			{
		     protected Integer initialValue()
		     {
		    	 return ++custId;
		     }
		
			};
			
			CustomerThread(String name)
			{
				super(name);
			}
			public void run()
			{
				System.out.println(Thread.currentThread().getName()+"executing with customer id"+tl.get());
			}
	
}
public class ThreadLocalEx1 {

	public static void main(String[] args) 
	{
		CustomerThread ct=new CustomerThread("CustomerThread-1");
		CustomerThread ct1=new CustomerThread("CustomerThread-2");
		CustomerThread ct2=new CustomerThread("CustomerThread-3");
		CustomerThread ct3=new CustomerThread("CustomerThread-4");
	ct.start();
	ct1.start();
	ct2.start();
	ct3.start();
	
		

	}

}
