package constructors;

public class ConstructorOverloading 
{ 
	int age;
	String name;
	
	ConstructorOverloading(int age)
	{
		this.age=age;
	}
	ConstructorOverloading(int age,String name) //same method with different arguments is  nothing but overloading
	{
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		ConstructorOverloading col=new ConstructorOverloading(20);
		ConstructorOverloading col1=new ConstructorOverloading(20,"pratik");
		

	}

}
