package innerClasses;

public class MethodLocalInnerClass3 
{
	public void m1()
	{
		
		class Inner5
		{
			int x=10;
			public void m2()
			{
				System.out.println(x);
			}
		}
		Inner5 i5=new Inner5();
		i5.m2();
	}

	public static void main(String[] args) 
	{
		MethodLocalInnerClass3  m3=new MethodLocalInnerClass3 ();
		m3.m1();

	}

}
