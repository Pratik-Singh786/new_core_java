package staticModifier;

public class StaticAndInstanceArea {

	int x=10;
	static int y=20;
	public void m1()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void m2()
	{
		//System.out.println(x); instance variable in static area is not allowed
		System.out.println(y);
		
	}
	
	public static void main(String[] args)
	{
	

	}

}
