package oops;

public class ObjectTypeCasting3
{

	public static void main(String[] args) 
	{
		Object o=new String("durga");
		String s=new String("durga");
		Object o1=(Object)s;
		
		Integer i=new Integer(10);
		Number n=(Number)i;
		Object o2=(Object)n;
		
		Object o3=(Object)n;
		System.out.println(i==n);
		System.out.println(n==o2);
		
		

	}

}
