package flowcontrol;

public class switchex2 {

	public static void main(String[] args)
	{
		int x=10;
		//int y=20;
		switch(x)
		{
		  case 10:
			  System.out.println(10);
			  break;
		//  case y: y should be a constant value
		//	  System.out.println(20);
		//	  break;
			
		}
		switch(x+1)
		{
		
		 case 11:
			 System.out.println(10);
			 break;
			 
		 case 10+20+30:
			 System.out.println(60);
		     break;
		     
		}

	}

}
