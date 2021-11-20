package interfaceex;
interface Intref
{
	public default  int mo()
	{
		return 56;
	}

	public abstract void m1();
	void m2();
	// static and default methods are also allowed.
	public static void m4()
	{}



}
abstract class ServiceProvider implements Intref
{
	public void m1()
	{
		System.out.println("hi i am m1");
	}
}
class SubServiceProvider extends ServiceProvider
{
	public void m2()
	{
		System.out.println("hi i am m2");
	}
}
public class InterfaceEx1 
{

	public static void main(String[] args) 
	{
		SubServiceProvider sb=new SubServiceProvider();
		sb.m1();
		sb.m2();

	}

}
