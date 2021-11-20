package staticModifier;
class StudentEx
{
	int roll;
	String name;
	static String CollegeName="RRSDCE";

  StudentEx(int r,String n)
  {
	roll=r;
	name=n;
  	
	
  }
  void display()
  {
	  System.out.print(roll+ " "+name+ " "+CollegeName);
  }
}
public class StaticVariableEx 
{

	public static void main(String[] args)
	{
		StudentEx se=new StudentEx(1,"pratik");
	  se.display();
		
		

	}

}
