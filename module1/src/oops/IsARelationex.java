package oops;
class IsARelationex1
{
	public void m19()
	{
		System.out.println("hi from parent class"); // is a relationship means  inheritance
	}
	
}
class IsARealationex2 extends IsARelationex1
{
	public  void m22()
	{
		System.out.println("hi from child class");
	}
}
public class IsARelationex  
{

	public static void main(String[] args) 
	{
		
		IsARelationex1 ix1=new IsARelationex1();
		ix1.m19();//only can invoke parent method
		IsARealationex2 ix2=new IsARealationex2();
		ix2.m19(); //parent method
		ix2.m22();//child method
		IsARelationex1 x1=new IsARealationex2();
		x1.m19();//on parent refrence only can invoke parent method
	}

}
