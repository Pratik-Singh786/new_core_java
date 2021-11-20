package interfaceex;
interface printable
{
	void print();
}
public class InterfaceEx2 implements printable
{
   public void print()
   {
	   System.out.println("hello");
   }
	public static void main(String[] args) 
	{
	
		InterfaceEx2 i2=new InterfaceEx2();
		i2.print();
	}

}
