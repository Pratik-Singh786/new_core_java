package constructors;

public class InitialisingWithCons 
{
	int rollno;
	String name;
	float salery;
	InitialisingWithCons (int rollno,String name,float salery)
	{
		this.rollno=rollno;
		this.name=name;
		this.salery=salery;
	}
	void display()
	{
		System.out.print(rollno +" "+ name +" "+salery);
	}

	public static void main(String[] args)
	{
		InitialisingWithCons  iwc=new InitialisingWithCons (1,"pratik",150000);
		iwc.display();

	}

}
