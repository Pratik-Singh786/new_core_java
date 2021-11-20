package javaLangPackage;

public class AutoUnboxingEx
{

	public static void main(String[] args) 
	{
		Integer I=new Integer(10);
		int i=I;// auto unboxing that means the automatic conversion of Wrapper object to primitive.
		//internally compiler converts int i=I.intValue(); i.e xxxValue()
		

	}

}
