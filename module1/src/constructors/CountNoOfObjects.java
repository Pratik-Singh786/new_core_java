package constructors;

public class CountNoOfObjects 
{
	static int count=0;
	{
		count++;
	}
	CountNoOfObjects ()
	{
		
	}
	CountNoOfObjects (int i)
	{
		
	}
	CountNoOfObjects (double d)
	{
		
	}
	public static void main(String[] args) 
	{
		CountNoOfObjects  cn=new CountNoOfObjects ();
		CountNoOfObjects cn1=new CountNoOfObjects ();
		CountNoOfObjects cn2=new CountNoOfObjects ();
		System.out.println("the no of objects created: "+count);

	}

}
