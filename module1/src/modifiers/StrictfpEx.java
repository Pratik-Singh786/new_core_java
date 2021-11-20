package modifiers;

public  abstract strictfp class StrictfpEx  // it is completely valid 
{

	// abstract strictfp void m1();  not valid because strictfp talks about and implementation and abstract method never 
	abstract void m1();
	abstract void m2();  // abstract methods
	abstract void m3();
	//==================================
	public void mx()  // concrete methods
	{
		
	}
	public void my()  //concerte methods (methods having their implementation)
	{
		
	}
	
	
	public static void main(String[] args)
	{
		

	}

}
