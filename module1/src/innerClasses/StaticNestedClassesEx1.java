package innerClasses;

public class StaticNestedClassesEx1 
{
	static class StaticNestedInnerClass    // static inner class can contain static and main methods while  regular and normal does not.
	{
		public static void main(String[] args)
		{
			System.out.println("Static nested inner class");  // if we run them individually we will get both main() execute individually
			
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("outer class main methods");

	}

}
