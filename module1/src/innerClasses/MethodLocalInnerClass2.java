package innerClasses;

public class MethodLocalInnerClass2 
{
	int x=10;
	static int y=30;
	public  static void m10()   // now the method is static so only only static members we can access
	{
		class Inner4
		{
			public void m11()
			{
				//System.out.println(x); can't access the instance  variable from static method
				System.out.println(y);
			}
			
		}
		Inner4 i= new Inner4();
		i.m11();
	}
	public static void main(String[] args) 
	{
		MethodLocalInnerClass2  mcl2=new MethodLocalInnerClass2 ();
		mcl2.m10();

	}

}
