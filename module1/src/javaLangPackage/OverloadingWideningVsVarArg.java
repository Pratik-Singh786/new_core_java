package javaLangPackage;

public class OverloadingWideningVsVarArg //case 2
{
  public static void m1(int...x)
  {
	  System.out.println("var-arg method");
  }
  public static void m1(long l)
  {
	  System.out.println("widening"); //widening dominates var-arg
  }
	public static void main(String[] args) 
	{
		int x=10;
		m1(x);

	}

}
