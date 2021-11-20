package multithreading;
import java.util.*;
public class WaitNotifyNotifyAll1
{
	public static class SendAndReceieve
	{
		public void sendMesaage() throws InterruptedException
		{
		 synchronized(this)
		  {
			System.out.println("ready to send message");
			wait();
			System.out.println("sending message...");
		  }
			
		}
		public void receieveMessage() throws InterruptedException
		{
			synchronized(this)
			{
				System.out.println("receieving the message");
				Scanner sc=new Scanner(System.in);
				System.out.println("press any key to continue...");
				notifyAll();
				System.out.println("getting the notification");
			}
			
			
		}
		
	}
	public static void main(String [] args) throws Exception
	{
		final SendAndReceieve sr=new SendAndReceieve();
		Thread  t3=new Thread()
				{
			      public void run()
			      {
			    	  try
			    	  {
			    		  sr.sendMesaage();
			    	  }
			    	  catch(InterruptedException e)
			    	  {
			    		 System.out.println(e) ;
			    	  }
			    	
			      }
			
				};
		Thread t4=new Thread()
				{
			      public void run()
			      {
			    	  try
			    	  {
			    		  sr.receieveMessage();
			    		  
			    	  }
			    	  catch(InterruptedException e)
			    	  {
			    		System.out.println(e)  ;
			    	  }
			      }
			
				};
				t3.start();
				t4.start();
		
	}
}