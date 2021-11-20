package oops;

public class OverloadingEx1 {
	public void  mymethod10()
	{
		System.out.println("no arg");          //same method but different argument type it is called overloading
		
		
	}
	public void mymethod10(int i)
	{
		System.out.println("int arg");
	}

	public void mymethod10(double d)
	{
		System.out.println("double arg");
	}
	public static void main(String[] args) 
	{
		
		OverloadingEx1 ole=new OverloadingEx1();
		ole.mymethod10();
		ole.mymethod10(100);
		ole.mymethod10(10.5);
	}

}
