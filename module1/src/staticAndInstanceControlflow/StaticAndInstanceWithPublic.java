package staticAndInstanceControlflow;

public class StaticAndInstanceWithPublic
{
	private static String m4(String msg)
	{
		System.out.println(msg);
		return msg;
	}
	static String m=m4("1");
	{
		m=m4("2");
	}
	static
	{
		m=m4("3");
	}

	public static void main(String[] args) 
	{
		 StaticAndInstanceWithPublic sip=new  StaticAndInstanceWithPublic();
		 

	}

}
