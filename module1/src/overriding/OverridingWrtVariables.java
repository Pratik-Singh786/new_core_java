package overriding;
class Varex
{
	int x=777;
}
class Varex1 extends Varex 
{
	int x=888;
}
public class OverridingWrtVariables {

	public static void main(String[] args) 
	{
		Varex1 ve=new Varex1();
		System.out.println(ve.x);
		Varex vx=new Varex1();
		System.out.println(vx.x); //because overriding is only applicable for meth.ods but not for variables

	}

}
