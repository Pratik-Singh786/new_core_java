package multithreading;
class MyRunnable1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}
}
public class DefiningThreadUsingInterface1 
{

	public static void main(String[] args) 
	{
		MyRunnable1 mr=new MyRunnable1();
		Thread t5=new Thread(mr);
		t5.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
		

	}

}