package ExceptionHandling;

public class MultipleCatchBlock3 {

	public static void main(String[] args) 
	{ 
		int a[]=new int[5];        // now it will check the both occur  exception
		try  
		{
			
			a[5]=30/0;
		
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithimetic Eception occurs");
			
		}
		try
		{
			System.out.println(a[10]);
			
		}
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.out.println("ArrayIndexOutOfBoundsException ");
			
		}
		try
		{
			
		}
		catch(Exception e)
		{
			System.out.println("parent Exception occurs");
		}
		System.out.println("rest of the code");
		

	}

}
