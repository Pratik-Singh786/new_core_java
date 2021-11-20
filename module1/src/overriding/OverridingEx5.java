package overriding;
abstract  class Rivers
{
	 abstract  int lengthofriver();         // case 5:abstract parent method allows  overriding because same name and same argument type
}                                           //abstract method can be override by non abstract method due to its implementation
class Ganga extends Rivers
{
	int lengthofriver()
	{
		return 100;
	}
}

public class OverridingEx5 {

	public static void main(String[] args) 
	{
		Ganga gg=new Ganga();
		System.out.println(gg.lengthofriver()); // native synchronized and strictfp is also allowed

	}

}
