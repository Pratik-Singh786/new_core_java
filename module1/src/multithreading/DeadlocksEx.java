package multithreading;
class A
	{
		public synchronized void d1(B b)
		{
			System.out.println("Thread 1 starts the execution of d1()");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Thread 1 trying to call b's last method");
			b.last();
		}
		public synchronized void last()
		{
			System.out.println("Inside A this is last()");
		}
	}
	class B
	{
		public synchronized void d2(A a)
		{
			System.out.println("Thread-2 starts the execution of d2()");
			try
			{
			 	Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Thread 2 trying to call a's last()");
		}
		public synchronized void last()
		{
			System.out.println("Inside B this is last ()");
		}
	}
public class DeadlocksEx extends Thread
{
	A a =new A();
	B b=new B();
	public void m1()
	{
	  this.start();
		a.d1(b);
	}
	public void run()
	{
		b.d2(a);
	}
	
		
	public static void main(String[] args)
	{
		DeadlocksEx d1=new DeadlocksEx();
		d1.m1();
	}
}