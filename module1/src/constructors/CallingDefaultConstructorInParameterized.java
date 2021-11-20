package constructors;
class Myclass
{
	Myclass()
	{
		System.out.println("This is parameterized constructor");
	
	}
	Myclass(int x)
	{
		this();
		System.out.println(x);
	}
}
public class CallingDefaultConstructorInParameterized 
{

	public static void main(String[] args) 
	{
		Myclass ml=new Myclass(10);

	}

}
