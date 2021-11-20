package innerClasses;

public class RegOuter4 
{ 
	int x=10;
	static int y=30;
	class RegInner4
	{
		public void m6()
		{
			System.out.println(x); // case 4 we can access static and instance form instance  area but can't declare 
			System.out.println(y);
		}
	}

	public static void main(String[] args) 
	{
		new RegOuter4().new RegInner4().m6();

	}

}
