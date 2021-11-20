package innerClasses;

public class AnonymousClass1 {

	public static void main(String[] args) 
	{
		 Thread t=new Thread()  // Thread anonymous class 
				 {
			       public void run()
			       {
			    	   for(int i=0;i<=10;i++)
			    	   {
			    		   System.out.println("child thread");
			    		   try
			    		   {
			    			   Thread.sleep(1000,100);
			    		   }
			    		   catch(Exception e)
			    		   {
			    			   
			    		   }
			    	   }
			       }
			 
				 };
				 t.start();
				 for(int i=0;i<=10;i++)
				 {
					 System.out.println("main thread");
				 }
		

	}

}
