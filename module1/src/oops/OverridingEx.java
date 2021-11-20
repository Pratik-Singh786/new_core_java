package oops;
class ParentDecision
{
	public void property()
	{
		System.out.println("cash"+"loan"+"gold");
	}
	public void marry()
	{
		System.out.println("subhalaxmi");
	}
}
class ChildDecision extends ParentDecision
{
	public void marry()
	{
		System.out.println("3sha"+"9tara"+"4mat");
	}
}
public class OverridingEx {

	public static void main(String[] args) 
	{
		ParentDecision pd=new ParentDecision();
		pd.marry();
		
		ChildDecision cd=new ChildDecision();
		cd.marry();
		ParentDecision pa=new ChildDecision();// run time polymorphism child method will be called.
		pa.marry();
	}

}
