package constructors;

public class ConstructorWithThis 
{
	int roll;  //instance variable
	String name;//instance variable
	float salery;//if all the instance variable are different then no need to use this keyword;
	ConstructorWithThis(int roll,String name,float salery)
	{
		this.roll=roll;
		this.name=name;
		this.salery=salery;
	}
	void display()
	{
		System.out.print(roll+" "+name+" "+salery);
	}

	public static void main(String[] args) 
	{
		ConstructorWithThis  ct=new ConstructorWithThis (1,"rahul",145555);
		ct.display();
		

	}

}
