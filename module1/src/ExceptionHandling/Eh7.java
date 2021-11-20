package ExceptionHandling;

public class Eh7 {

	public static void main(String[] args) 
	{
		try
		{
			int data =30/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			
		}
		System.out.println("rest code"); // it wont get execute because catch block not containing the proper code for it;
		

	}

}
