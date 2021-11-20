package modifiers;

public class InstanceVariable 
{
    int x;
  //  final int y; we have to initialize it because jvm wont provide default values for final instance variable
	public static void main(String[] args) 
	{
		InstanceVariable  iv=new InstanceVariable ();
		System.out.println(iv.x);
	

	}

}
