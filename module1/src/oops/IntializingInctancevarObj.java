package oops;
class  Student1
{
	int id;                   //3 .places to initialize instance var 1:during declaration 2:in instance block 3: inside constructor
	String name;
	
}
public class IntializingInctancevarObj
{

	public static void main(String[] args) 
	{
		Student1 s1=new Student1(); //initializing  object through through reference variable variable
        s1.id=101;
        s1.name="pratik";
        System.out.println(s1.id+" "+s1.name);
	}

}
