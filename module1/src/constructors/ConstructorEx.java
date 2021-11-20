package constructors;
 class Person
{
	String name;
	int age;
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		// suppose we have 100 fields like that
	}
}
class Student extends Person
{
	int rollno;
	Student(String name,int age,int rollno)
	{
		super(name,age);  // so we are using super we don't need to initialize with this everytime
		
			this.rollno=rollno;
		
	}
}
class Teacher extends Person
{
	String subject;
	Teacher(String name,int age,String subject)
	{
		super(name,age);
		this.subject=subject;
	}
}
public class ConstructorEx 
{

	public static void main(String[] args) 
	{
		Student s=new Student("pratik",20,1);
		Teacher t=new Teacher("pratik",20,"Computer Science");
		

	}

}
