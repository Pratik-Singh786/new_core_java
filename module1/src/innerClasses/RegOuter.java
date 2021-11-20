package innerClasses;

public class RegOuter   //case1 Accessing inner class code from static area of outer class
{
   class Inner
   {
	   public void m1()
	   {
		   System.out.println("Inner class method");
	   }
   }
	public static void main(String[] args) 
	{
		RegOuter o=new RegOuter();
		RegOuter.Inner i=o.new Inner();
		i.m1();
		

	}

}
