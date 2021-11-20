package javaLangPackage;

public class AutoboxingVsVarArg 
{
    public static void m1(int...x)
    {
    	System.out.println("var-arg methods");
    }
    public static void m1(Integer I)
    {
    	System.out.println("AutoBoxing");// autoboxing dominates var-arg (its like default of switch case it have the least priority.)
    }
	public static void main(String[] args) 
	{
		int x=10;
		m1(x);

	}
  
}
