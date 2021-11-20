package constructors;
class MyStudent
{
	int rollno;
	String name,course;
	float fee;
	MyStudent(int rollno,String name,String course)
	{
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	MyStudent(int rollno,String name,String course,float fee)
	{
		this(rollno,name,course);// reusing the constructor this should be the first line of the constructor always
		this.fee=fee;
	}
	void display()
	{
		System.out.print(rollno+ " "+name+ " "+course+ " "+fee);
	}
		
	}
public class ConstructorChanning {

	public static void main(String[] args) 
	{
		MyStudent ms=new MyStudent(1,"partik","advjava",10000);
		ms.display();

	}

}
