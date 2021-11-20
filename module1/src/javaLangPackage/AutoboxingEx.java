package javaLangPackage;

public class AutoboxingEx
{
	static Integer I=10; //Auto-boxing 
	public static void main(String[] args) 
	{
		int i=I; //auto-unboxing
		m1(i);
		
		
	}
	public static void m1(Integer k) //Auto-boxing
	{
		int m=k; //Auto-unboxing
		System.out.println(m); 
	}

}
