package overriding;
class A
{
	A get()
	{
		return this;
	}
}
public class CovarientRetrunTypeOver  extends A  
{
	CovarientRetrunTypeOver get()
	{
		return this;
	}
	void message()
	{
		System.out.println("co-varient  return type example");
	}
	
	public static void main(String[] args) 
	{
		
      new CovarientRetrunTypeOver().get().message();
	}

}
