package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) 
	{
		try
		{
			try
			{
				System.out.println("going to divide");
				int  b=39/0;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception");
			}
			try
			{
				int a[]=new int [5];
				a[5]=4;
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.out.println("other statement");
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
		System.out.println("rest code");
		

	}

}
