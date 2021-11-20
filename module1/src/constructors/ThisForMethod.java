package constructors;
class A
{
   void methodM()
   {
	   System.out.println("This is method m");
   }
   void methodN()
   {
	   methodM(); // this is same as this.methodM
   }
}
public class ThisForMethod {

	public static void main(String[] args) 
	{
		 A a=new  A();
		 a.methodN();

	}

}
