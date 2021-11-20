package abstractclass;
abstract class Bike1
{
	Bike1()
	{
		System.out.println("constructor");  //constructor
	}
	abstract void run();  //abstract method
	void changeGear()
	{
		System.out.println("instance method");  // non-abstract method
	}
}
public class AbstractClassEx4  extends Bike1
{
	void run()
	{
		System.out.println("running the bike");
	}

	public static void main(String[] args) 
	{
		
		AbstractClassEx4  ab=new AbstractClassEx4 ();
		ab.changeGear();
		ab.run();
    }

}
