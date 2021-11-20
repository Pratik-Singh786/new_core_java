package ExceptionHandling;

public class MutipleCatchBlock {

	public static void main(String[] args) 
	{
		try 
		{
			int a[]=new int[5];
			a[5]=30/0;
			
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
