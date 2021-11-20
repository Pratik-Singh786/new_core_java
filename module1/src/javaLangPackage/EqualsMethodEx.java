package javaLangPackage;
class Student2
{
	String name;
	int roll;
	Student2(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
}
public class EqualsMethodEx {

	public static void main(String[] args) 
	{
		Student2 s1=new Student2("pratik",1);
		Student2 s2=new Student2("rahul",2);  //it is my defined class so it equals() here for the content comparison because object class 
		Student2 s3=new Student2("durga",3);
		Student2 s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		

	}

}
