package oops;
class Employee
{
	int id;
	String name;
	float salery;
	Employee(int id,String name,float salery) //parameterized constructor
	{
		this.id=id;
		this.name=name;
		this.salery=salery;
	}
	void display()
	{
		System.out.print(id+" "+name+" "+salery);
	}
}
public class IntializingObjThroughCons {

	public static void main(String[] args) 
	{
		Employee el=new Employee(1,"pratik",120000);
		el.display();
		
		

	}

}
