package string;

public class DoubleEqualsWithScp {

	public static void main(String[] args) 
	{
	  String s1=new String("you cant change me ");
	  String s2=new String("you cant change me");
	  System.out.println(s1==s2);
	  
	  String s3= "you cant change me";
	  System.out.println(s1==s3);
	  
	  String s4= "you cant change me";
	  System.out.println(s3==s4);
	  
	  String s5= "you cant"+" change me";
	  System.out.println(s5==s4);
	  
	  String s6="you cant"; //final ->true
	  String s7=s6+" change me";
	  
	  System.out.println(s4==s7);
	  final String s8="you cant";
	  
	  String s9=s8+" change me";
	  System.out.println(s4==s9);
	  

	}

}
