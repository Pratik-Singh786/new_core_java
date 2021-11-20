package flowcontrol;

public class DoWhileEx2 {

	public static void main(String[] args) 
	{
		/*int a=10,b=20;
		do
		{
			System.out.println("hello");
		}
		while(a<b); // it will create a infinite loop because a is always less than b.
		
			System.out.println("hi");
		
		//=========================================================
		
		final int a=10,b=20;
		do
		{
			System.out.println("hello");
		}
		while(a<b);
	   // System.out.println("hi"); unreachable statement 
		
		//=========================================================
		 
		 */
		final int a=10,b=20;
		do
		{
			System.out.println("hello");
		}
		while(a>b);
	    System.out.println("hi"); //unreachable statement
		
		
			
	

	}

}
