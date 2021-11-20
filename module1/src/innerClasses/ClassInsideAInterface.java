package innerClasses;
interface Vechile1    //case 4 class inside a interface to provide implementation.
{
	public int getNoOfWheels();
	class DefaultVechile implements Vechile1
	{
		public int getNoOfWheels()
		{
			return 4;
		}
		
	}
	
	class Bus1 implements Vechile1
	{
		public int getNoOfWheels()
		{
			return 6;
		}
		
	}
	
}
public class ClassInsideAInterface {

	public static void main(String[] args) 
	{
		Vechile1.DefaultVechile d=new Vechile1.DefaultVechile();
		System.out.println(d.getNoOfWheels());
		Vechile1.Bus1 b=new Vechile1.Bus1();
		System.out.println(b.getNoOfWheels());
	
		

	}

}
