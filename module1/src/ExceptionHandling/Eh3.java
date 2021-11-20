package ExceptionHandling;

public class Eh3 {

	public static void main(String[] args) 
	{
		try
		{
		int data=50/0;
		System.out.println("after first statement");//it wont be execute
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Exception handled");
		}
		

	}

}
