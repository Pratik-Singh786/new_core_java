package ExceptionHandling;
class Parent4
{
	void msg4() throws Exception
	{
		System.out.println("parent ");
	}
}
public class EhWithOverriding4 extends Parent4
{
	void msg4() throws Exception // same  exception in parent and child
	{
		System.out.println("child");
	}
	public static void main(String[] args) 
	{
		 Parent4 p4=new  EhWithOverriding4  ();
		 try
		 {
		 p4.msg4();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	    

	}

}
