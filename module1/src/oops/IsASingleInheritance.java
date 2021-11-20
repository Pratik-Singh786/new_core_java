package oops;
class Bigdog
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog  extends Bigdog
{
	void Barking()
	{
		System.out.println("barking");
	}
	
	
}
public class IsASingleInheritance 
{

	public static void main(String[] args)
	{
		
		Dog d=new Dog();
		d.Barking();
		d.eat();
	}

}
