package innerClasses;

public class AnonymousClass3 {

	public static void main(String[] args) 
	{
		new Thread (new Runnable()  // basically what we are doing here is creating  implementing runnable here
				{
			      public void run()
			      {
			    	  for (int i=0;i<10;i++)
			    	  {
			    		  System.out.println("child thread");
			    	  }
			      }
				}).start();
		  for(int i=0;i<10;i++)
		  {
			  System.out.println("main thread");
			  try
			  {
				  Thread.sleep(2000);
			  }
			  catch(Exception e)
			  {
				  
			  }
		  }
		
		

	}

}
