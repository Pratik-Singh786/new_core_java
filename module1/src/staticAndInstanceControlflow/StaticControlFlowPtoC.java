package staticAndInstanceControlflow;
class Base
{
	static int i=10;
	static 
	{
		m1();
		System.out.println("base static block");
		
	}
	public static void main(String [] args)
	{
		m1();
		System.out.println("base main");
		
	}
	public static void m1()
	{
		System.out.println(j);
	}
	static int j=20;
}
class  StaticControlFlowPtoC extends Base
{
	static int x=100;
	static
	{
		m2();
		System.out.println("derived first static block");
	}
	public static void main(String [] args)
	{
		
		m2();
		System.out.println("derived main");
	}
	public static void m2()
	{
		System.out.println(y);
		
	}
	static 
	{
		System.out.println("Derived static 2nd block");
	}
	static int y=200;
}
