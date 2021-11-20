package overriding;
class Parent7
{
	private void mymethod18()       //case3:exact same method in child class but not overriding due to private
	
	{
		System.out.println("this is parent class");
	}
}


public class OverridingEx3 extends Parent7
{
    private void mymethod18()
    {
    	System.out.println("i am in overridingEx3");
    }
	public static void main(String[] args)
	{
		OverridingEx3 ox3=new OverridingEx3();
		ox3.mymethod18();
		

	}

}
