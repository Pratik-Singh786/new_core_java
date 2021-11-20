package multithreading;
class MyThread8 extends Thread
{
	public void run()
	{
		System.out.println("the name of child thread is:" +Thread.currentThread().getName());
	}
	
}

public class GettingAndSettingName {

	public static void main(String[] args) 
	{
		MyThread8 mt3=new MyThread8();
		mt3.start();
		
		System.out.println("the name of main thread is:" +Thread.currentThread().getName());
	
	}

}
