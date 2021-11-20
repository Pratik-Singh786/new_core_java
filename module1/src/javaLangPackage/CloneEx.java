package javaLangPackage;

public class CloneEx implements Cloneable
{
   int i=10;
   int j=20;
	public static void main(String[] args)  throws CloneNotSupportedException
 	{
		CloneEx c=new CloneEx();
		CloneEx c1=(CloneEx)c.clone();
		c1.i=888;
		c1.j=999;
		System.out.print(c1.i+"..."+c1.j);
		
		

	}

}
