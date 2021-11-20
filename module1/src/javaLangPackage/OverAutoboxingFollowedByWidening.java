package javaLangPackage;

public class OverAutoboxingFollowedByWidening 
{
    public static void m1(Object o)
    {
    	System.out.println("object version");
    }
	public static void main(String[] args)  //case5
	{
		int x=10;
		m1(x);
		int i=10;
		Integer I=10; //A.B
		//int i1=10L; can't convert from long to int.
		Long l=10L;
		//Long l=10;   can't convert  int to Wrapper class Long 
		long l1=10;
		Object o=10;//A.b followed by widening
		double d=10;//widening
		//Double D=10;
		Number n=10;
		
		
		
		
				
		

	}

}
