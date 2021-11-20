package interfaceex;
interface Bank
{
	float getRateOfInterest();
}
class SBI implements Bank
{
	public float getRateOfInterest()
	{
	 	return 15.4f;
	}
}
class PNB implements Bank
{
	public float getRateOfInterest()
	{
	 	return 15.0f;
	}
}
public class InterfaceEx4 {

	public static void main(String[] args) 
	{
		Bank b1=new  SBI();
		System.out.println("ROI: "+ b1.getRateOfInterest());
		

	}

}
