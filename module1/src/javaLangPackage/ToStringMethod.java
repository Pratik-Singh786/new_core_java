package javaLangPackage;


class Student 
{
	String name;
	int roll;
	Student (String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
}
public class ToStringMethod  
{

	public static void main(String[] args) 
	{
		Student s1 =new Student("Durga",101);
		Student s2 =new Student("pratik",100);
		System.out.println(s1);// whenever we will try to print object reference internally toString() will be called.
		System.out.println(s2);
		System.out.println(s1.toString());
		
		
	

	}

}
