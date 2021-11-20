package string;

public class DoubleEqualAndDotEqualsStringBuffer {

	public static void main(String[] args) 
	{
		 StringBuffer sb1=new StringBuffer("pratik");
		 StringBuffer sb2=new StringBuffer("pratik");
		 System.out.println(sb1==sb2);       //only return true when both reference pointing to the same object
		 System.out.println(sb1.equals(sb2)); //in string it checks the object content but in StringBuffer it  checks  the 
		                                      //both reference pointing to same object or not
		

	}

}
