package staticModifier;
 class Parent
 {
	 public static void main(String []args)
	 {
		 System.out.println("parent main");
	 }
 }
 class Child extends Parent 
 {
	 
 }
public class StaticModifierCase2 
{

	public static void main(String[] args)
	{
		Child c=new Child();
		
		c.main(args);
				

	}

}
