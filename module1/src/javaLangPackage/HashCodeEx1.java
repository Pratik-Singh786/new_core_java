package javaLangPackage;

public class HashCodeEx1
{

	int i;
	 HashCodeEx1 (int i)
	 {
		 this.i=i;
	 }
	 public int hashCode()
	 {
		 return i;
	 }
	public static void main(String[] args) 
	{
		 HashCodeEx1  hc=new  HashCodeEx1 (10); // this will generate  classaName@hexCode(10)
		 HashCodeEx1  hc1=new  HashCodeEx1 (100);
		 System.out.println(hc);//object is going to  call toString() and toString() will call hashCode();
		 System.out.println(hc1);
		

	}

}
