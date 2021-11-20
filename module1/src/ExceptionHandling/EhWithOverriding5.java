package ExceptionHandling;
class Parent5
{
	void msg5() throws Exception
	{
		System.out.println("parent ");
	}
}
public class EhWithOverriding5  extends Parent5
{
 void msg5() throws  ArithmeticException  // relation between the exception should be either parent to child or child to parent 
 {
	 System.out.println("child");
 }
	public static void main(String[] args) 
	{
		Parent5 p5=new EhWithOverriding5 ();
		try
		{
		p5.msg5();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
