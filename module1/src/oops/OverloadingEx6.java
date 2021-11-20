package oops;

public class OverloadingEx6 
{
	public void mymethod15(int y) //case5
	 {
		 System.out.println("generic version");
	 }
	 public void mymethod15(int...x) //var arg method
	 {
		 System.out.println("var arg version");
	 }
	public static void main(String[] args) 
	{
		OverloadingEx6  ol6=new OverloadingEx6();
		ol6.mymethod15(10);
		ol6.mymethod15();//because var arg always get less priority always
		ol6.mymethod15(2,3);
		

	}

}
