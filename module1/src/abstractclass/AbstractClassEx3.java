package abstractclass;
abstract class Bank
{
	abstract int getRateOfInterest();
	
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class PNB extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
public class AbstractClassEx3 
{
	

	public static void main(String[] args)
	{
		Bank b=new SBI();
		System.out.println(b.getRateOfInterest());
		 SBI sb=new  SBI();
		System.out.println( sb.getRateOfInterest());
		
		

	}

}
