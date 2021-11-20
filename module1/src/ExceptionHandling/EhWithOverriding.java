package ExceptionHandling;
class Parent 
{
	void msg()
	{
		System.out.println("parent ");
	}
}
public class EhWithOverriding  extends Parent
{
	void msg() // throws IOException can't declare a checked exception not defined in parent class
	{
		System.out.println("testException child");
	}

	public static void main(String[] args) 
	{
		Parent p=new  EhWithOverriding();
		p.msg();
		

	}

}
