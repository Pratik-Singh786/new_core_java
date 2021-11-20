package flowcontrol;

public class SwitchFallThrough {

	public static void main(String[] args) 
	{
		int x=0;
		switch(x)
		{
		case 0:
			System.out.println(0);
		case 1:
			System.out.println(1);
		default:
			System.out.println("def");
		}
		

	}

}
