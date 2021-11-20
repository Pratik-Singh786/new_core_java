package multithreading;
class Mythread16 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<10;i++)
			{
				System.out.println("i am lazy thread");
				Thread.sleep(4000); //if target is not in sleep state there is no impact of interrupt()
			}
		}
		catch(Exception e)
		{
			System.out.println("i got inetrrupted");
		}
	}
}
public class SleepMethod {

	public static void main(String[] args) 
	{
		Mythread16  my16=new Mythread16 ();
		my16.start();
		my16.interrupt();
		System.out.println("End of main");

	}

}
