package oops;

public class OvreloadingEx2 
{
	public void mymethod11(int i )   //case1
	{
		System.out.println("int_args");
	}
	public void mymethod11(float f)
	{
		System.out.println("float_ args");
	}

	public static void main(String[] args) 
	{
		OvreloadingEx2 olx=new OvreloadingEx2();
		olx.mymethod11(10);
		olx.mymethod11(10.5f);
		olx.mymethod11('a');//lower level data type check its preceding data type in method
		olx.mymethod11(10l);
		olx.mymethod11(2);

	}

}
