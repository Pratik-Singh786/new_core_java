package multithreading;

class Mythread1 extends Thread
{
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println("child thread");
	}
	}
}
public class DefiningThreadCase2 {

	public static void main(String[] args) 
	{
		Mythread1  mt1=new Mythread1 ();
				mt1.run();             // without start() it work like a normal method call
				for(int i=0;i<10;i++)
				{
					System.out.println("main thread");
				}
		

	}

}
