package interfaceex;
interface Left
{
	public void m1();   // case1 : same sig
}
interface Right
{
	public void m1();
}
public class InterfaceMethodNamingConf  implements Left,Right
{
    public void m1() 
    {
        System.out.println("hi");	
    }
	public static void main(String[] args) 
	{
		 InterfaceMethodNamingConf im= new  InterfaceMethodNamingConf();
		 im.m1();

	}

}
