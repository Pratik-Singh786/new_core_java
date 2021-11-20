package multithreading;
class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}
}
public class DefiningThreadUsingInterface {

	public static void main(String[] args) 
	{
		MyRunnable mr=new MyRunnable();
		Thread t5=new Thread(mr);
		t5.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
		

	}

}
