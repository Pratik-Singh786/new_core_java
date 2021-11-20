package javaLangPackage;
class Student1
{
	int roll;
	String name;
	Student1(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	public String toString()  //overriding toString() for the meaningful representation of String
	{
		return name+ "..."+roll;
	}
}
public class ToStringMethodOverr
{

	public static void main(String[] args)
	{
		Student1 s1=new Student1("pratik",101);
		Student1 s2=new Student1("rahul",102);
		System.out.println(s1);
		System.out.println(s2);

	}

}
