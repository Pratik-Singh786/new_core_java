package javaLangPackage;

public class AutoBoxingEx2 {

	public static void main(String[] args) 
	{
		Integer x=10;
		Integer y=x;
		x++;
		//All Wrapper class objects are immutable in nature,if we perform some changes with those  a new object will be created
		System.out.println(x);// x=11 pointing to 11;
		System.out.println(y); // y =10 pointing to 10 in the memory
		System.out.println(x==y);// false both references have a different location in memory
		
		Integer x1=new Integer(10);
		Integer y1=new Integer(10);
		System.out.println(x==y);//false every-time we use new keyword a new object will be created.
		
		Integer x2=new Integer(10);
		Integer y2=10;
		System.out.println(x2==y2);//false
		
		Integer x3=10;
		Integer y3=10;
		System.out.println(x3==y3);//true
		
		Integer x4=1000;
		Integer y4=1000;
		System.out.println(x4==y4);// false internally a buffer of wrapper object will be created at the time of wrapper  class loading,first jvm
		                           //will check whether this object is present in the buffer or not if not jvm will create new object.
		                           //for Integer -128 to 127 same for short and long ,char 0 to 127, boolean and byte always ,no rules for float and double		
		
		Integer x5=127;
		Integer y5=127;
		System.out.println(x5==y5);
		
		Integer x6=128;
		Integer y6=128;
		System.out.println(x6==y6);
		 
		
		Boolean b=false;
		Boolean a=false;
		System.out.println(a==b);
		
		Double d1=10.0;
		Double d2=10.0;
		System.out.println(d1==d2);
		
		
		
		
	

	}

}
