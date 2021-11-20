package javaLangPackage;
class Student3
{
	String name;
	int roll;
	Student3(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	public boolean equals(Object obj) 
	{
		try
		{
			String name1=this.name; //current class name
			int roll1=this.roll;//current class roll
			Student3 s= (Student3)obj;
			
			String name2=s.name;
			int roll2=s.roll;
			
			if(name1.equals(name2)&& roll1==roll2)
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
public class OverrEqulasMethod {

	public static void main(String[] args)  throws Exception
	{
       Student3 s3=new  Student3("partik",101);
       Student3 s4=new  Student3("durga ",102);
       Student3 s5=new  Student3("partik",101);
       Student3 s6=new  Student3("pratik",101);
       System.out.println(s3.equals(s4));
       System.out.println(s4.equals(s5));
       System.out.println(s3.equals(s5));
       
       

	}

}
