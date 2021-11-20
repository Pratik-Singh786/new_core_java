package javaLangPackage;

public class OverloadingWideningVsAutoboxing  //case 1
{
	public static void m1(Integer I)
	{
		System.out.println("AutoBoxing");
	}
	public static void m1(long l) {
		System.out.println("widening");  //widening dominates auto-boxing because it is a old concept.
	}
	public static void main(String[] args) 
	{
		int x=10;
		m1(x);
		
		

	}

}
