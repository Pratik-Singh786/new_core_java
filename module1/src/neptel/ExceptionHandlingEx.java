package neptel;

public class ExceptionHandlingEx {
	static int  anyfunction(int x,int y)
	{
		try
		{
			int a=x/y;
			return a;
		}
		catch(Exception e)
		{
			System.out.println("Division by zero");
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		int a,b,result;
		a=0;
		b=0;
		try
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
		}
		catch(Exception e)
		{
			result=anyfunction(a,b);
			System.out.println("the result"+ result);
		}
	

	}

}
