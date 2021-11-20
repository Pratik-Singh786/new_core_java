package constructors;

public class ConstructorsWithoutThis {

	int roll;  //instance variable
	String name;//instance variable
	float salery;//instance variable
	
	ConstructorsWithoutThis(int roll,String name,float salery)
	{
		roll=roll;
		name=name;
		salery=salery;
	}
	void display()
	{
		System.out.print(roll+" "+name+" "+salery);
	}
	public static void main(String[] args)
	{
		ConstructorsWithoutThis cwt=new ConstructorsWithoutThis(1,"pratik",1500000);
		cwt.display();

	}

}
