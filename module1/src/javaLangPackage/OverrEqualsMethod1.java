package javaLangPackage;
class Student4
{
	String name;
	int roll;
	Student4(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	public boolean equals(Object obj) 
	{
		try
		{
			Student4 s= (Student4)obj;
			
		
			
			if(name.equals(s.name)&& roll==s.roll)
			{
			
				return true;
			}
			
			else
			{
			
				return false;
			}
			
		}
		catch(ClassCastException |NullPointerException e)
		{
			return false;
		}
	
	}
}
public class OverrEqualsMethod1 {

	public static void main(String[] args) 
	{
		   Student5 s3=new  Student5("partik",101);
	       Student5 s4=new  Student5("durga ",102);
	       Student5 s5=new  Student5("partik",101);
	       Student5 s6=new  Student5("pratik",101);
	       System.out.println(s3.equals(s4));
	       System.out.println(s4.equals(s5));
	       System.out.println(s3.equals(s5));

	}

}
