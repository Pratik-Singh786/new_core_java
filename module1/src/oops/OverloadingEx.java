package oops;


public class OverloadingEx {
	public void m19(int i)
	{
		System.out.println("int args");
	}
	public void m19(float f )
	{
		System.out.println("float args");
	}

	public static void main(String[] args) 
	{
		
		OverloadingEx ole =new OverloadingEx();
		ole.m19(10);
		ole.m19(12.5f);
		
		
	
	}

}
