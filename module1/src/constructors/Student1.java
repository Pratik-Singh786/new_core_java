package constructors;
abstract class Person1
{
	String name;
	int age;
	Person1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
public class Student1  extends Person1
{
	int rollno;
	int marks;
	
	 Student1 (String name,int age,int rollno,int marks)
	 {
		 super(name,age);
		 this.rollno=rollno;
		 this.marks=marks;
	 }
	 void display()
	 {
		 System.out.println(name+ " "+ age+ " "+rollno+ " "+marks);
	 }
	public static void main(String[] args) 
	{
		Student1 s1=new Student1("pratik",20,1,100);
		s1.display();

	}

}
