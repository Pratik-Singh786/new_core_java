package multithreading;
class MyThread10 extends Thread
{
	
}
public class GettingAndSettingPriorites {

	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());// by default main priority is 5
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		MyThread10 mt5=new MyThread10();
		System.out.println(mt5.getPriority());
		

	}

}
