package staticAndInstanceControlflow;

public class StaticControlFLow1 
{
	static int i=10;
	static 
	{
		m1();
		System.out.println(i);
	}
	public static void m1()
	{
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
		
		System.out.println("main method");

	}

}
