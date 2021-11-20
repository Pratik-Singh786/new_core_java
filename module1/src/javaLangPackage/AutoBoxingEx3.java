package javaLangPackage;

public class AutoBoxingEx3 {

	public static void main(String[] args) 
	{
		Integer x=new Integer(10);
		Integer y=new Integer(10);
		System.out.println(x==y);
		
		Integer x1=10;//internally Integer x1=Integer.valueOf(10)
		Integer y1=10;
		System.out.println(x1==y1);
		
		Integer x2=10;
		Integer y2=Integer.valueOf(10);
		System.out.println(x2==y2);
		
		
		
		

	}

}
