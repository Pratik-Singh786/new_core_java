package staticModifier;

public class StaticModifierCase3 
{

	public static void main(String[] args) 
	{
		System.out.println("parent main"); // output parent main

	}

}
class Child1 extends  StaticModifierCase3 
{
	public static void main(String [] args)
	{
		System.out.println("child main");// output child main, it looks like method overriding . it is method hiding
	}
}
