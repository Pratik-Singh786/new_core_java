package ExceptionHandling;

class Parent6
{
	void msg6() throws Exception
	{
		System.out.println("parent ");
	}
}
public class EhWithOverriding6 extends Parent6
{
 void msg6() 
 {
	 System.out.println("child");
 }
	public static void main(String[] args) 
	{
		Parent6 p6=new EhWithOverriding6 ();
		try
		{
		p6.msg6();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
