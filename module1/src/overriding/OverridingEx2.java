package overriding;
class Parent6
{
	public Object mymethod17()       //case2: covarient return type
	
	{
      return null;
	}
}
class Child6 extends  Parent6
{
	public String mymethod17()
	{
		return null;
	}
}

public class OverridingEx2 {

	public static void main(String[] args) 
	{
		Child6 c6=new Child6();
		System.out.println(c6.mymethod17());
	

	}

}
