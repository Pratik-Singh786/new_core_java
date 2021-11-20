package ExceptionHandling;
class Parent1
{
	void msg1()
	{
		System.out.println("parent ");
	}
}
public class EhwithOverriding1  extends Parent1
{
	void msg1() throws ArithmeticException   // we have'ent defined this unchecked exception in the parent but unchecked exceptions are allowed .
	{
		System.out.println("child");
	}

	public static void main(String[] args) 
	{
		Parent1 p1=new EhwithOverriding1 ();
		p1.msg1();
		
		

	}

}
