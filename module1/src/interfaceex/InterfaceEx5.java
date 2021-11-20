package interfaceex;
interface Printable0
{
	void print();
	
}
interface Showable0
{
	void show();
	
}
public class InterfaceEx5 implements Printable0,Showable0
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
		
	 	InterfaceEx5 i5=new InterfaceEx5();
	 	i5.print();
	 	i5.show();
	}

}
