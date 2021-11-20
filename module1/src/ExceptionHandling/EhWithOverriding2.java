package ExceptionHandling;
class Parent2
{
	void msg2() throws ArithmeticException
	{
		System.out.println("parent ");
	}
}
public class EhWithOverriding2  extends Parent2
{
   void msg2()  // throwing Exception is not allowed here because parent and child should throw same exception;
   {
	   System.out.println("child");
   }
	public static void main(String[] args) 
	{
		Parent2 p2=new EhWithOverriding2 ();
		p2.msg2();
		

	}

}
