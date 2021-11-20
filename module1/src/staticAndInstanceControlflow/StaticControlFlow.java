package staticAndInstanceControlflow;

public class StaticControlFlow {

	static int i=10;
	   static
	   {
		   mymethod1();
		   System.out.println("first static block");
	   }
		public static void main(String[] args) 
		{
			mymethod1();
			System.out.println("main method");

		}
		public static void mymethod1()
		{
			System.out.println(j);
		}
		static 
		{
			System.out.println("second static block");
		}
		static int j=20;


}
