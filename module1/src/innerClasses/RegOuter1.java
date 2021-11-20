package innerClasses;

public class RegOuter1    // case2  accessing inner class method from outer class instance area
{
     class Inner1
    {
	 public void m2()
	  {
		 System.out.println("Inner class method");
	  }
    }
     void m3()
     {
    	 Inner1 in=new Inner1();
    	 in.m2();
     }
	public static void main(String[] args)
	{
		
		 RegOuter1  r1=new  RegOuter1 ();
		 r1.m3();
	}

}
