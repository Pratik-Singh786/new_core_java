package overriding;
class Adder
{
   static int add()
  {
	return 6;
  }
}
class Adder1 extends Adder
{
	static int add()
   {
	    return 8;
   }
}
public class OverridingWrtStaticMethods {

	public static void main(String[] args) 
	{
		Adder ad1=new Adder();
		System.out.println(ad1.add());
		
		Adder1 a1=new Adder1();
		System.out.println(a1.add());
	
		Adder ad=new Adder1();
		System.out.println(ad.add()); //data hiding but not overriding so compile time polymorphism
		
	}

}
