package oops;

public class OverloadingEx4   //case3
{
public void mymethod13(String s)
{
	System.out.println("String version");
}
public void mymethod13(StringBuffer sb)
{
	System.out.println("StringBuffer version");
}
	public static void main(String[] args) 
	{
		
		OverloadingEx4  ol4=new OverloadingEx4 ();
		ol4.mymethod13("pratik");
		ol4.mymethod13(new StringBuffer("pratik"));
		//ol4.mymethod13(null); because both are child of Object class at same level so there is ambiguity
	}

}
