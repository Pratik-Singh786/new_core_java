package multithreading;
class MyThread7 extends Thread
{
	public void run()
	{
		System.out.println("child thread");
	}
}
public class DefiningThread1 {

	public static void main(String[] args)
	{
		MyThread7 myt2=new MyThread7();
		myt2.start();

	  System.out.println("main thread");
				

	}

}
