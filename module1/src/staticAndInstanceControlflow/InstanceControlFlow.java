package staticAndInstanceControlflow;

public class InstanceControlFlow 
{
	int i=10;
	{
		m1();
		System.out.println("final Instance block");
	}
	InstanceControlFlow ()
	{
		System.out.println("constructor");
		
	}

	public static void main(String[] args) 
	{
		InstanceControlFlow  icf =new InstanceControlFlow ();
		System.out.println("main");



	}
	public void m1()
	{
		System.out.println(j);
	}

	int j=20;

}
