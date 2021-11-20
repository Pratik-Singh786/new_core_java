package multithreading;
class Mythread17 extends Thread
{
	public void run()
	{
		
		
			for(int i=1;i<10;i++)
			{
				System.out.println("i am lazy thread");
				; //if target is not in sleep state there is no impact of interrupt()
			}
			System.out.println("i am entering into sleeping state");
		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			System.out.println("i got inetrrupted");
		}
	}
}
public class SleepMethod1 
{
	

	public static void main(String[] args) 
	{
		Mythread17  my17=new Mythread17();
		my17.start();
		my17.interrupt();
		System.out.println("End of main");

	}

}
