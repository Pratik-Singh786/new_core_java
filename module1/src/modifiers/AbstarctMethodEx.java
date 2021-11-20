package modifiers;
 abstract class Vechiles
{
	 abstract public int  getNoOfWheels();
	 
	
}
 class Bus extends Vechiles
 {
	 public int getNoOfWheels()
	 {
		 return 7;
	 }
 }
class Auto extends Vechiles
{
	public int getNoOfWheels()
	{
		return 4;
	}
	
}
public class AbstarctMethodEx 
{

	public static void main(String[] args) 
	{
		Bus  b=new Bus ();
		System.out.println(b.getNoOfWheels());
		Auto a =new Auto();
		System.out.println(a.getNoOfWheels());
		

	}

}
