package ExceptionHandling;

public class FinallyBlockEx2 {

	public static void main(String[] args) 
	{
		try
		{
			int data=50/0;
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block will always execute");
		}
		System.out.println("rest of the code ");
		

	}

}
