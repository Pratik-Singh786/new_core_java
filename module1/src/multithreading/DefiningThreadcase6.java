package multithreading;
class Mythread6 extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}
public class DefiningThreadcase6 
{
  
	public static void main(String[] args) 
	{
		Mythread6   m6=new Mythread6 ();
		m6.start();
		System.out.println("main method");   //we can't predict the order of execution

	}

}
