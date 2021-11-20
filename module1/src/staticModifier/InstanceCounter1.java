package staticModifier;

public class InstanceCounter1 
{
	static int count=0;
	InstanceCounter1 ()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		
		InstanceCounter1 ict=new InstanceCounter1 ();
		InstanceCounter1 ict1=new InstanceCounter1 ();
		InstanceCounter1 ict2=new InstanceCounter1 ();
		
		
	}

}
