package overriding;
class Apple
{
	public void verynicefunctionality(int...i)
	{ 
		System.out.println("very nice functionality of apple");
	}
}
class Iphone extends Apple
{
	public void verynicefunctionality(int...i)
	{
		System.out.println("high performance");
	}
}
public class OverridigWrtVarArg {

	public static void main(String[] args) 
	{
		 Apple ae=new  Apple();
		 ae.verynicefunctionality(10);
		 
		 Apple ap=new Iphone();
		 ap.verynicefunctionality(5);
	}

}
