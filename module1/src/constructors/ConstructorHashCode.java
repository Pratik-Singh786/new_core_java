package constructors;
class Parent
{
	Parent()
	{
		System.out.println(this.hashCode()); //366712642 
	}
}
class Child extends Parent 
{
	Child()
	{
		System.out.println(this.hashCode());//366712642
	}
}
public class ConstructorHashCode 
{

	public static void main(String[] args) 
	{
		Child c=new Child();
		System.out.println(c.hashCode());//366712642 ,whenever we are creating child class object ,parent object won't be created just parent 
		                                 //class constructor will be executed for the child purpose only.
		

	}

}
