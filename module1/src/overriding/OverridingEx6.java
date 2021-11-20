package overriding;
class Mountains
{
	public void range()                //we can override non abstract method as abstract
	{
		System.out.println("We can't define its range");
	}
}
abstract class Realrange extends Mountains
{
	abstract public  void range();
}
public class OverridingEx6 
{

	public static void main(String[] args)
	{
		Mountains mt=new Mountains();
				mt.range();

	}

}
