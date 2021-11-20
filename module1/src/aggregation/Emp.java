package aggregation;

public class Emp 
{

	int id;
	String name;
	Address address;
	public Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+ " "+name);
		System.out.println(address.city+ " "+address.state+ " "+address.country);
		
	}
	public static void main(String[] args) 
	{
		Address ad=new Address("gzp","UP","India");
		Address ad1=new Address("gno","UP","India");
		
		Emp e=new Emp(111,"varun",ad);
		Emp e1=new Emp(112,"arun",ad1);
		e.display();
		e1.display();
		

	}

}
