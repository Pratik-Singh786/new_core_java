package innerClasses;
class MyRunnable3 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("hi");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
	}
	
	
}
public class AnonymousClass2 {

	public static void main(String[] args) 
	{
		MyRunnable3 m3=new MyRunnable3();
		Thread t=new Thread(m3);
		t.start();
		
		
	

	}

}
