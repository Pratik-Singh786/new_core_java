package modifiers;

public class AactualAndFormalParameters 
{
 public static void m1(final int x,int y)
 {
	// x=100;   x is final so can't be reassign
	 y=200;
	 System.out.print(x+ " "+y);
	 
 }
	public static void main(String[] args)
	{
		m1(10,20);

	}

}
