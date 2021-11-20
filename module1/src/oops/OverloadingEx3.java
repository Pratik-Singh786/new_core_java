package oops;

public class OverloadingEx3
{
 public void mymethod12(String S) //case2 
 {
	 System.out.println("string version");
 }
 public void mymethod12(Object O)
 {
	 System.out.println("object version");
 }
	public static void main(String[] args) 
	{
		
		OverloadingEx3 ol3=new OverloadingEx3();
		ol3.mymethod12(new Object());
		ol3.mymethod12("pratik");
		ol3.mymethod12(null);
	}

}
