package oops;
class Fruits    //parent
{
	void taste()
	{
		System.out.println("taste the fruits");
	}
}
class Grapes extends Fruits
{
	void tastegrapes()
	{
		System.out.println("taste the grapes");
	}
	
}
class Pineapple extends Fruits
{
	void tastepineapple()
	{
		System.out.println("taste the pineapples");
	}
}

public class IsAhierarchicalInheitance {

	public static void main(String[] args) 
	{
		Pineapple pe=new Pineapple();
		pe.taste();
		pe.tastepineapple();
		Grapes gp=new Grapes();
		gp.taste();
		gp.tastegrapes();
		Fruits ft=new Grapes(); //compile time polymorphism
		ft.taste();

	}

}
