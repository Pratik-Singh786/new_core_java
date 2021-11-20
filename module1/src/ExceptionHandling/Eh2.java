package ExceptionHandling;

public class Eh2 {

	public static void main(String[] args) 
	{
		try
		{
		int data=10/0;
		System.out.println("after first statement");//it wont be execute
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
	

	}

}
