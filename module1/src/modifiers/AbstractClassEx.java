package modifiers;
 
 abstract class  abc
{
	abstract void m1();
	abstract void m2();
	
}
 abstract class def extends abc
 {
	 void m1()
	 {
		 System.out.println("hi");
	 }
	abstract  void m2();
 }
 class G extends def
 {
	 void m2()
	 {
		 System.out.println("hello");
	 }
	 
 }
public class AbstractClassEx {

	public static void main(String[] args) 
	{
		// final abstract combination is illegal for methods and classes.

	}

}
