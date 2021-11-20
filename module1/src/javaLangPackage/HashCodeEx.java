package javaLangPackage;

public class HashCodeEx 
{
	int i;
	 HashCodeEx (int i)
	 {
		 this.i=i;
	 }
	public static void main(String[] args) 
	{
		 HashCodeEx  hc=new  HashCodeEx (10);
		 HashCodeEx  hc1=new  HashCodeEx (20);
		 System.out.println(hc);//object is going to  call toString() and toString() will call hashCode();
		 System.out.println(hc1);
		

	}

}
