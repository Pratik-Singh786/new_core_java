package constructors;

public class ConstructorCalling {

	ConstructorCalling()
	{
		this(10);
		System.out.println("no arg");
	}
	ConstructorCalling(int i)
	{
		this(10.5);
		System.out.println("int arg");
	}
	ConstructorCalling(double d)
	{
		System.out.println("double arg");
	}
	public static void main(String[] args) 
	{
		ConstructorCalling  cc=new ConstructorCalling ();
		ConstructorCalling  cc1=new ConstructorCalling (10);
		ConstructorCalling  cc2=new ConstructorCalling (10.5);

	}

}
