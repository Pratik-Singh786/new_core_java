package staticAndInstanceControlflow;

public class ComboOfStaticAndInstance
{
	{
		System.out.println("first instance block");
	}
	static
	{
		System.out.println("First static block");
	}
	ComboOfStaticAndInstance()
	{
		System.out.println("constructor");
	}
	

	public static void main(String[] args)
	{
		ComboOfStaticAndInstance csi=new ComboOfStaticAndInstance();
		System.out.println("main");
		
	}
	static
	{
		System.out.println("second static block");
	}
	{
		System.out.println("second instance block");
	}
	

}
