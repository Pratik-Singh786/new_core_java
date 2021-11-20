package javaLangPackage;

public class UtilityMethodToString //primitive to wrapper to String 
{

	public static void main(String[] args) 
	{
		//form 1
		Integer i=new Integer(10);
		String s=i.toString();
		System.out.println(s);
		
		
		//form 2  every W.c including character class contains the following to convert primitive to String
		String s1= Integer.toString(100);
		System.out.println(s1);
		String s2=Boolean.toString(true);
		String s3=Character.toString('a');
		
		//form3 Integer and Long classes contain the following toString() to convert primitive to specified radix string
		String s4=Integer.toString(15,2 );
		
		//form 4 Integer 
		String s5=Integer.toBinaryString(10);
		System.out.println(s5);
		String s6=Integer.toOctalString(10);
		System.out.println(s6);
		String s7=Integer.toHexString(10);
		System.out.println(s7);
				
				
				
		
				
		

	}

}
