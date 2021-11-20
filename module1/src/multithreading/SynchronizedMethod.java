package multithreading;
class Table1
{
  public synchronized void  PrintTable(int n)
  {
	 for(int i=1;i<=5;i++) 
	 {
		 System.out.println(n*i);
	 }
	 try
	 {
		 Thread.sleep(2000);
	 }
	 catch(Exception e)
	 {
		
	 }
  }
}
class MyOwnThread extends Thread
{
	Table1 t;
	int n;
	MyOwnThread(Table1 t,int n)
	{
		this.t=t;
		this.n=n;
	}
	public void run()
	{
	t.PrintTable(n);
	}
	
}
public class SynchronizedMethod {

	public static void main(String[] args) 
	{
		 Table1 pt=new  Table1();
		 MyOwnThread mot=new MyOwnThread(pt ,10);
		 mot.start();
		
		

	}

}
