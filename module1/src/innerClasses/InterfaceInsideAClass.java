package innerClasses;
public class InterfaceInsideAClass  //case 2: inside a class if we required multiple implementation of an interface.

{
	interface Vechile
	{
		public int getNoOfWheels();
	}
	class Bus implements Vechile
	{
		public int getNoOfWheels()
		{
			return 6;
		}
	}
	class Auto implements Vechile
	{
		public int getNoOfWheels()
		{
			return 4;
		}
	}
	public static void main(String[] args)
	
	{
		//InterfaceInsideAClass.Bus b=new InterfaceInsideAClass.Bus();
	    new InterfaceInsideAClass().new Bus().getNoOfWheels();
		new InterfaceInsideAClass().new Auto().getNoOfWheels();
		
	}
}