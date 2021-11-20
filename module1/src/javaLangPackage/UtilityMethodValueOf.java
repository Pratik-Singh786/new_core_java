package javaLangPackage;

public class UtilityMethodValueOf 
{

	public static void main(String[] args)   //to create Wrapper object for the given primitive or string..
	{
		//form 1 valueOf(String s) Every Wrapper class expect Character class
		Integer I=Integer.valueOf("10");
		Double d=Double.valueOf("10.5");
		 Boolean b=Boolean.valueOf("durga");
		 
		 //form 2  every integral type byte,integer,short,long contains this valueOf() to create wrapper object for the given specified radix string
		  Integer i=Integer.valueOf("100", 2); //100= 1*2^0+0*2^1+0*2^2
		  
		  Integer i1=Integer.valueOf("100",4);
		  
		//form 3: Every  W.C including Character class contains the method to create  Wrapper object of given primitive
		  Integer i2= Integer.valueOf(10);
		  Double d1=Double.valueOf(10.5);
		  Character ch=Character.valueOf('a');
		  Character ch1=Character.valueOf('c');
		  
		  
		  
		  
		
		

	}

}
