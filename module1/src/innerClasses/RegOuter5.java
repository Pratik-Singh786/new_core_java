package innerClasses;

import innerClasses.RegOuter4.RegInner4;

public class RegOuter5 
{ 
	int x=10;
	class RegInner5
	{
		int x=100;
		public void m6()
		{
			int x=1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(RegOuter5.this.x);
		}
	}

	public static void main(String[] args) 
	{
		new RegOuter5().new RegInner5().m6();

	}

}
