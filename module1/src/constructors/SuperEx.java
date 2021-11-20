package constructors;
class SuperEx1
{
	String name="pratik";   //1. instance variable
	void display()
	{
		System.out.println("this is super method");
	}
	SuperEx1()
	{
		System.out.println("super class constructor");
	}
	
}
class SuperEx2 extends SuperEx1
{
	String name="ankit";
	SuperEx2()
	{
		super();  //2.parent class constructor
	} 
	
	void display1()
	{
		
		super.display();  //3.parent class method
		System.out.println("child class constructor");
		System.out.println(super.name);
	}
	
}
public class SuperEx  
{

	public static void main(String[] args)
	{
		 SuperEx2  se=new  SuperEx2 ();
		 se.display1();
		
		

	}

}
