package innerClasses;

class Outer2                      //Case 3: Accessing Inner class code from outside of outer class
{
	 class Inner2
	 {
		 public void m1()
		 {
			 System.out.println("Inner class method");
		 }
	 }
}
public class RegOuter2
{

	public static void main(String[] args) 
	{
		Outer2 o2=new Outer2();
		Outer2.Inner2 i2=o2.new Inner2();
		i2.m1();
		
		

	}

}
