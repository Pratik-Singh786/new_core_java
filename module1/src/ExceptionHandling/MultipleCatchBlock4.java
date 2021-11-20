package ExceptionHandling;

public class MultipleCatchBlock4 {

	public static void main(String[] args) 
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException r)
		{
			System.out.println(r);
		}
		catch(Exception e)
		{
			System.out.println("parent exception occurs ");
		}

	}

}
