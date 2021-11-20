package oops;

public class ObjectTypeCasting1 {

	public static void main(String[] args) 
	{
		Object o=new String("durga");
		//StringBuffer sb=(StringBuffer)o;
		String sb=(String)o;
		//==============================================
		Object o1=new String("pratik");
		String sb1=(String)o1;  // can't convert String to StringBuffer.
	//	String sb2=(String)o1;
		

	}

}
