package multithreading;
class MyThread11 extends Thread
{
	public  void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("child Thread");
		}
	}
}

public class GetttingAndSettingPriorities1 
{
   
	public static void main(String[] args)
	{
		
		 MyThread11  m11=new  MyThread11();
		 m11.start();
		 m11.setPriority(10); //main thread have priority of 5 but we setting here the priority of child is 10 so child will get more chances
		
		for(int i=1;i<10;i++)
		{
			System.out.println("main Thread");
		}
	}

}
