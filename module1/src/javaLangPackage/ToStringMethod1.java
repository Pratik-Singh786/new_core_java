package javaLangPackage;
import java.util.*;
public class ToStringMethod1
{
   public String toString()
   {
	 return   "ToStringMethod1";
   }
	public static void main(String[] args) 
	{
		String s =new String("pratik");  // In all Wrapper classes  and all Collection classes String class,StringBuffer and String Builder
		System.out.println(s);             //classes toString() is already overridden for content comparison.
		
		Integer I=new Integer(10);
		System.out.println(I);
		
		ArrayList l=new ArrayList();
		System.out.println(l);
		
		ToStringMethod1 ts=new ToStringMethod1();
		System.out.println(ts);
		
				
		

	}

}
