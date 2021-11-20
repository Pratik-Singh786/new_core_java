package javaLangPackage;

public class OverWideningFollowedByAutoboxing 
{
	public static void m1(Long l) //case 4
	{
		System.out.println("long");
	}

	public static void main(String[] args) 
	{
		int x=10;
		//m1(x);
	}

}
