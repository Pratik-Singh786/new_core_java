package interfaceex;
interface left3
{
	int x=888;
}
interface right3
{
	int x=999;
}
public class InterfaceVarNamingConf  implements left3,right3
{

	public static void main(String[] args) 
	{
		//System.out.println(x); field x is ambiguous
		
		System.out.println(left3.x);
		System.out.println(right3.x);

	}

}
