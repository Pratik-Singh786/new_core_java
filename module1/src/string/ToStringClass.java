package string;

public class ToStringClass {

	public static void main(String[] args) 
	{
		String s1="pratik"; // it is string literal so created in scp
		String s2=s1.toString(); // it converts into strings
		String s3=s1.toLowerCase(); //it is same  as s1
		String s4=s1.toUpperCase(); // a new string created in heap area with all Upper case letters
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		

	}

}
