package javaLangPackage;

public class AutoboxingEx1
{
	static Integer I=10;
	static Integer I1;
	public static void main(String[] args) 
	{
		int m=I;
		System.out.println(m);
		int n=I1;
		System.out.println(I1); //it will give null pointer exception because I1 is pointing to nothing.
		
		
		
	}

}
