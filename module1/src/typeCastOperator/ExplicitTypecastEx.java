package typeCastOperator;

public class ExplicitTypecastEx {

	public static void main(String[] args)
	{
		int x=130;
		// byte b=x;  not possible
		byte b=(byte)x;
		System.out.println(x);
		
		 double d=130.456;
		 int y=(int)d;
		 System.out.println(x);
		 
		 byte c= (byte)d;
		 System.out.println(c);
		 
		

	}

}
