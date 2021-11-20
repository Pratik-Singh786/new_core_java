package interfaceex;
interface left1
{
	public void m3();   // case 2 :overloading
	
}
interface right1
{
	public void m3(int i);
}
public class InterfaceMethodNamingConf1 
{
	public void m3()
	{
		System.out.println("hii");
		
	}
	public void m3(int i) 
	{
		System.out.println("hello");
		
	}
	public static void main(String[] args) 
	{
		InterfaceMethodNamingConf1  im=new InterfaceMethodNamingConf1();
		im.m3();
		im.m3(1);
		

	}

}
