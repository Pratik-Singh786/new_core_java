package modifiers;

public class ProtectedEx 
{

	protected int data1=50;  // anywher1e in the current package but in the child class in the outside package
	public static void main(String[] args) 
	{
		
		ProtectedEx  pex=new ProtectedEx();
		System.out.println(pex.data1);

	}

}
