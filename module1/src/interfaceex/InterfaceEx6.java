package interfaceex;
interface Printable1
{
	void print();
	
}
interface Showable1
{
	void print();
	
}
public class InterfaceEx6  implements Printable1,Showable1
{
    public void print()
    {
    	System.out.println("print the data");
    }
	public static void main(String[] args) 
	{
		
		InterfaceEx6 i6=new InterfaceEx6();
		i6.print();
	}

}
