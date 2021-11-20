package javaLangPackage;

public class UtilityMethodXYZValue  // to get primitive for the given Wrapper object
{

	public static void main(String[] args)
	{
		Integer i=new Integer(130); //Every Number type Wrapper class(Byte,short,Integer,Long,float,double;
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
		
	// for Character and Boolean class
		Character ch=new Character('a');
		char c=ch.charValue();
		System.out.println(c);
		
		Boolean B=Boolean.valueOf("pratik");
		boolean b=B.booleanValue();
		System.out.println(b);
		

	}

}
