package multithreading;
class MyDaemonThread extends Thread
{

}
public class DaemonThreadEx 
{
	public static void main(String[] args)  throws Exception
	 {


    System.out.println(Thread.currentThread().isDaemon());
    Thread.currentThread().setDaemon(true); // we can't change the non-daemon nature of main thread because e it is  already started  by jvm
    MyDaemonThread mdt=new  MyDaemonThread();
    System.out.println( mdt.isDaemon());// by default false
    mdt.setDaemon(true);
    System.out.println(mdt.isDaemon());
	 }

}