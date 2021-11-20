package interfaceex;
interface Printable2   //interface inheritance
{
	void print();
	
}
interface Showable2 extends Printable2
{
	void show();
	
}
public class InterfaceEx7  implements Showable2
{
    public void print()
    {
    	System.out.println("print");
    }
    public void show()
    {
    	System.out.println("show");
    }
	public static void main(String[] args) 
	{
		InterfaceEx7  i7=new InterfaceEx7 ();
		i7.print();
		i7.show();

	}

}
