package oops;
class Parent4
{
	static void mymethod15(int i)
	{
		System.out.println("parent");
	}
}
class Child4 extends Parent4
{
	static void mymethod15(int x)
	{
		System.out.println("child");
	}
}

public class Datahinding1 
{

	public static void main(String[] args)
	{
		Parent4 p4=new Parent4();
		p4.mymethod15(1);
		Child4 c4=new Child4();
		c4.mymethod15(3);
		Parent4 p5=new Child4();
		p5.mymethod15(5); //because method hiding follows compile time polymorphism which is based on the parent reference type

	}

}
