package modifiers;

public class InitializingFinalInstanceVariable 
{
	final int z;
	InitializingFinalInstanceVariable()
	{
		z=10;   //3.Inside the constructor
	}

	public static void main(String[] args) 
	{
		final int x=10;// 1.at the time of declaration 
		final int y;
		{
			y=10;    // 2.Inside instance block
		}
		
		
		

	}

}
