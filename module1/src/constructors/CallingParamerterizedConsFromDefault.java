package constructors;
class Myclass1
{
	Myclass1()
	{
		this(5);
		System.out.println("default constructor");
	
	}
	Myclass1(int x)
	{
		System.out.println(x);
	}
}
public class CallingParamerterizedConsFromDefault {

	public static void main(String[] args) 
	{
		Myclass1 mcl=new Myclass1();

	}

}
