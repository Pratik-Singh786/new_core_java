package multithreading;
 class Display1
 {
	 public synchronized void displayn()
	 {
		 for(int i=0;i<=10;i++)
		 {
			 System.out.println(i);
			 try
			 {
				 Thread.sleep(1000);
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
					 
		 }
	 }
	 public synchronized void displayc()
	 {
		 for(int i=65;i<=75;i++)
		 {
			 System.out.println((char)i);
		 }
		 try
		 {
			 Thread.sleep(1000);
		 }
		 catch(InterruptedException e)
		 {
			System.out.println(e) ;
		 }
	 }
 }
 class Thread1  extends Thread
 {
	 Display1 d1;
	 Thread1(Display1 d1)
	 {
		 this.d1=d1;
	 }
	 public void run()
	 {
		 d1.displayn();
	 }
 }
 class Thread2 extends Thread
 {
	 Display1 d2;
	 Thread2(Display1 d2)
	 {
		 this.d2=d2;
	 }
	 public void run()
	 {
		 d2.displayc();
	 }
 }
public class SynchronizationDemo1 
{

	public static void main(String[] args) 
	{
		Display1 dis=new Display1();
		Thread1 th=new Thread1(dis);
		Thread2 th1=new Thread2(dis);
		th.start();
		th1.start();
		

	}

}
