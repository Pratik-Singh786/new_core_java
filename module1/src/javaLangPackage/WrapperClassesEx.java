package javaLangPackage;

public class WrapperClassesEx  //1. To wrap primitives into object forms ,so that we can handle them like objects.
                               //2. Define several utility methods which are required for the primitives
{

	public static void main(String[] args) 
	{
		Integer I=new Integer(10);  //almost all the wrapper classes contains two constructors ,one can take corresponding primitive as argument
		Integer I1=new Integer("10");//other can take string as argument
		//Integer I2 =new Integer("ten"); number format exception
		System.out.println(I);
		System.out.println(I);
		
		Double d=new Double(10.5);
		Double d1= new Double("10.5");
		System.out.println(d);
		System.out.println(d1);
		
		Float f=new Float(10.5f);
		Float f1=new Float(12.5f);
		Float f2=new Float(20.0); //float can take float,double,and String as well
		Float f3=new Float("10.5");
		Float f4=new Float("10.4f");
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		Character ch=new Character('a'); 
		//Character ch1=new Character("a");
		
        Boolean b=new Boolean(true);
        Boolean b1=new Boolean(false);
       //Boolean b2=new Boolean(True);
       //Boolean b3=new Boolean(durga);
        Boolean b2=new Boolean("true");
        Boolean b3=new Boolean("True");
        Boolean b4=new Boolean("malika");
        Boolean b5=new Boolean("jareena");
        
        Boolean x=new Boolean("yes");
        Boolean y=new Boolean("no");
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.equals(y));
        
        Long l= new Long(10l);
        Long l1=new Long("100");
        
        Byte b6=new Byte("2");
       // Byte b7=new Byte(1);
        
        
		
		
		
		
		

	}

}
