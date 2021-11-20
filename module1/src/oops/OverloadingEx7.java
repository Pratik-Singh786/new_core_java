package oops;
class Animal
{
	public void mymethod16(Animal a)
	{
		System.out.println("Animal version");
	}
}
class Monkey extends Animal
{
	public void mymethod16(Monkey m)
	{
		System.out.println("Monkey version");
	}
}
public class OverloadingEx7 
{
   public static void main(String[] args) 
	{
		Animal a=new Animal();
		a.mymethod16(a);
		Monkey m1=new Monkey();
		m1.mymethod16(m1);
		m1.mymethod16(a);
		
		
		

	}

}
