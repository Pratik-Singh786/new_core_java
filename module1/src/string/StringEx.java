package string;

public class StringEx {

	public static void main(String[] args) 
	{
		String s =new String("pratik");
		s.concat("singh");              //because string is immutable so there is another object creation for pratiksingh but  
		                                //it wont be reflected to the reference
		System.out.println(s);
	}
 
}
