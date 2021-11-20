package ExceptionHandling;

public class MultipleCatchBlock2 {

	public static void main(String[] args) 
	{
		try 
		{
			int a[]=new int[5];
			a[5]=30/0; // it will  catch the first  matching exception then command will go out of the try catch block;
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
