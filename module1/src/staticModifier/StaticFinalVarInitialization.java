package staticModifier;

public class StaticFinalVarInitialization 
{

	final static int  x=10;// 1.At the time of declaration
	final static  int y;
	static
	{
	  y=10;	// 2. inside static block
	}
	/*final static int z;
	public void m1()
	{
		z=10;          can assign the value to z
	}*/
	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(y);

	}

}
