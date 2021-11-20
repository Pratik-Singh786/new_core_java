package ExceptionHandling;

class Parent3
{
	void msg3() throws ArithmeticException
	{
		System.out.println("parent ");
	}
}
public class EhWithOverriding3  extends Parent3
{
   void msg2()  throws ArithmeticException // throwing  A.E is allowed here because its same
   {
	   System.out.println("child");
   }
	public static void main(String[] args) 
	{
		Parent2 p2=new EhWithOverriding2 ();
		p2.msg2();
		

	}

}
