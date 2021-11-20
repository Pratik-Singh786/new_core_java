package overriding;
class Parent8
{
	public final void mymethod19()       //case4:  can't override a final method in child class
	
	{
      System.out.println("this is the final method");
	}
}
class Child8 extends  Parent8
{
	//public void  mymethod19()             can't override a final method in child class
	{
		System.out.println("this is child class");
	}
}

public class OverridingEx4 {

	public static void main(String[] args)
	{
		

	}

}
