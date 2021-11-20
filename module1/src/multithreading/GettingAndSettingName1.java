package multithreading;
import java.lang.*;
class MyThread9 extends Thread
{
	public void run()
	{
		
	}
}
public class GettingAndSettingName1 {

	public static void main(String[] args) 
	{
	 System.out.println(Thread.currentThread().getName());// main
	 MyThread9 mt4=new MyThread9();
	 System.out.println(mt4.getName()); //Thread-0
	 MyThread9 mt5=new MyThread9();
	 System.out.println(mt5.getName());// Thread-1
	 Thread.currentThread().setName("prabhas") ;
	 System.out.println(Thread.currentThread().getName()); 
	}

}
