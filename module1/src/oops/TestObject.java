package oops;
class jungleeanimal
{
	public void tiger()
	{
		System.out.println("tiger");
	}
	public void deer()
	{
		System.out.println("deer");
	}
}
public class TestObject extends   jungleeanimal
{

	public static void main(String[] args)
	{
		TestObject to=new TestObject();
		to.deer();
		to.tiger();

	}

}
// 3 .places to initialize instance var 1:during declaration 2:in instance block 3: inside constructor
//initializing through reference variable, initializing means storing the data in the object
