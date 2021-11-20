package string;

public class DoubleEqualAndDotEqualsString {

	public static void main(String[] args) 
	{
	 String s1=new String("pratik");
	  String s2=new String("pratik");
	  System.out.println(s1==s2);       //only return true when both reference pointing to the same object
	  System.out.println(s1.equals(s2)); //it checks the object content{
		

	}

}
