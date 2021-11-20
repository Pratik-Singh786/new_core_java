package abstractclass;
interface A
{
	void A();
	void B();
	void C();
	void D();
} 
abstract class  A1
{
	public void A()
	{
		System.out.println("A");
	}
}
public class AbstarctClassEx5  extends A1
{
 
	void B()
	{
		System.out.println("B");
	}
	void C()
	{
		System.out.println("C");
	}
	void D()
	{
		System.out.println("D");
	}
	public static void main(String[] args) 
	{
		
		AbstarctClassEx5  abc=new AbstarctClassEx5 ();
		abc.A();
		abc.B();
		abc.C();
		abc.D();
		
	}

}
