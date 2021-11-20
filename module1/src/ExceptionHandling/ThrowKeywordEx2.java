package ExceptionHandling;

public class ThrowKeywordEx2 
{
     static ArithmeticException e;  // case1 
	public static void main(String[] args)
	{
		 throw e;   // if e refers null then we  will get null pointer exception.

	}

}
