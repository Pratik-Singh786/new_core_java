package innerClasses;

public class MethodLocalInnerClass1
{ 
	int x=10;
	static int y=30;
	public  void m10()    // this is a instance method so we can access 
	                      //both static and instance variable of outer class from  instance method x  and y
	{
		class Inner3
		{
			public void m11()
			{
				System.out.println(x);
				System.out.println(y);
			}
			
		}
		Inner3 i= new Inner3();
		i.m11();
	}

	public static void main(String[] args)
	{
		MethodLocalInnerClass1 mli=new MethodLocalInnerClass1();
		mli.m10();

	}

}
