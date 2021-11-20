package oops;

class Student2
{
	int id;
	String name;
	int contact;
	void insert(int i,String s,int c)
	{
		id=i;
		name=s;
		contact=c;
	}
	void display()
	{
		System.out.print(name+" "+id+" "+contact);
	}
	
}
public class IntializingObjThroughMethod {

	public static void main(String[] args) 
	{
		
		Student2 s2=new Student2();
		s2.insert(1, "pratik",7);
		s2.display();
	}

}
