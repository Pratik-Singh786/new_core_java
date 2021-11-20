package ExceptionHandling;

public class MutipleCatchBlock1 {

	public static void main(String[] args)
	{
		try 
		{
			int a[]=new int[5];
			System.out.println(a[10]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithimetic Eception occurs");
			
		}
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.out.println("ArrayIndexOutOfBoundsException ");
			
		}
		catch(Exception e)
		{
			System.out.println("parent Exception occurs");
		}
		System.out.println("rest of the code");
		

	}

}
