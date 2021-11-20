package oops;

public class OverloadingEx5 
{
 public void mymethod14(int i,float f) //case4
 {
	 System.out.println("int_float version");
 }
 public void mymethod14(float f,int i)
 {
	 System.out.println("float_int version");
 }
	public static void main(String[] args) 
	{
		OverloadingEx5 ol5=new OverloadingEx5 ();
		ol5.mymethod14(10,12.3f);
		ol5.mymethod14(12.4f,9);
	//	ol5.mymethod14(1,1);
	//	ol5.mymethod14(12.3f,3.4f);

	}

}
