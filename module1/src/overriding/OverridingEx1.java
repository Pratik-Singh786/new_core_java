package overriding;
class Parent5
{
	public void mymethod16(int i)       //case1: same method name and same arguments
	
	{
		System.out.println("this is parent class");
	}
}
class Child5 extends  Parent5
{
	public void mymethod16(int i)
	{
		System.out.println("this is child class");
	}
}
public class OverridingEx1 {

	public static void main(String[] args)
	{
		Child5 c5=new Child5();
		c5.mymethod16(10);
		Parent5 p5=new Parent5();
		p5.mymethod16(10);
		Parent5 pc5=new Child5();  // Run time- polymorphism because after overriding we lost the previous method data
		pc5.mymethod16(100);
		
				

	}

}
