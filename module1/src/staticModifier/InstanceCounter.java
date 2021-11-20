package staticModifier;

public class InstanceCounter 
{
	int count=0;
	InstanceCounter ()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args)
	{
		
		InstanceCounter ic=new InstanceCounter ();
		InstanceCounter ic1=new InstanceCounter ();
		
		InstanceCounter ic2=new InstanceCounter ();
		
		
	}

}
