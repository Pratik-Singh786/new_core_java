package innerClasses;

public class MethodLocalInnerClass   // method specific repeatedly required functionality
{
	public void m1()
	{
		class Inner
		{
			public void sum(int x,int y)
			{
				System.out.println((x+y));
			}
		}
		Inner i=new  Inner();
		i.sum(10,20);
		i.sum(100, 200);
		i.sum(1000, 3000);
	}

	public static void main(String[] args) 
	{
		MethodLocalInnerClass  mcl=new MethodLocalInnerClass ();
		mcl.m1();
	  

	}

}
