package javaLangPackage;

public class HashCodeEx3 
{
	int i;
	HashCodeEx3 (int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return i+ " ";
	}
	public int hashCode()
	{
		return i;
	}
	public static void main(String[] args) 
	{
		
		 HashCodeEx3  hc1=new  HashCodeEx3 (10);
		 HashCodeEx3  hc2=new  HashCodeEx3 (100);
		 System.out.println(hc1);
		 System.out.println(hc2);

	}

}
